/*
 * Spotify Web API with fixes and improvements from sonallux
 * You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 
 *
 * The version of the OpenAPI document: 2023.2.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ImageObject;
import org.openapitools.client.model.InlineObject2;
import org.openapitools.client.model.InlineResponse20011;
import org.openapitools.client.model.InlineResponse401;
import org.openapitools.client.model.PagingFeaturedPlaylistObject;
import org.openapitools.client.model.PagingPlaylistObject;
import org.openapitools.client.model.PagingPlaylistTrackObject;
import org.openapitools.client.model.PlaylistObject;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlaylistsApi
 */
@Ignore
public class PlaylistsApiTest {

    private final PlaylistsApi api = new PlaylistsApi();

    
    /**
     * Add Items to Playlist 
     *
     * Add one or more items to a user&#39;s playlist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTracksToPlaylistTest() throws ApiException {
        String playlistId = null;
        Integer position = null;
        String uris = null;
        Map<String, Object> requestBody = null;
        InlineResponse20011 response = api.addTracksToPlaylist(playlistId, position, uris, requestBody);

        // TODO: test validations
    }
    
    /**
     * Change Playlist Details 
     *
     * Change a playlist&#39;s name and public/private state. (The user must, of course, own the playlist.) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changePlaylistDetailsTest() throws ApiException {
        String playlistId = null;
        Map<String, Object> requestBody = null;
        api.changePlaylistDetails(playlistId, requestBody);

        // TODO: test validations
    }
    
    /**
     * Check if Users Follow Playlist 
     *
     * Check to see if one or more Spotify users are following a specified playlist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkIfUserFollowsPlaylistTest() throws ApiException {
        String playlistId = null;
        String ids = null;
        List<Boolean> response = api.checkIfUserFollowsPlaylist(playlistId, ids);

        // TODO: test validations
    }
    
    /**
     * Create Playlist 
     *
     * Create a playlist for a Spotify user. (The playlist will be empty until you [add tracks](/documentation/web-api/reference/#/operations/add-tracks-to-playlist).) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPlaylistTest() throws ApiException {
        String userId = null;
        Map<String, Object> requestBody = null;
        PlaylistObject response = api.createPlaylist(userId, requestBody);

        // TODO: test validations
    }
    
    /**
     * Follow Playlist 
     *
     * Add the current user as a follower of a playlist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void followPlaylistTest() throws ApiException {
        String playlistId = null;
        Map<String, Object> requestBody = null;
        api.followPlaylist(playlistId, requestBody);

        // TODO: test validations
    }
    
    /**
     * Get Category&#39;s Playlists 
     *
     * Get a list of Spotify playlists tagged with a particular category. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getACategoriesPlaylistsTest() throws ApiException {
        String categoryId = null;
        String country = null;
        Integer limit = null;
        Integer offset = null;
        PagingFeaturedPlaylistObject response = api.getACategoriesPlaylists(categoryId, country, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get Current User&#39;s Playlists 
     *
     * Get a list of the playlists owned or followed by the current Spotify user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAListOfCurrentUsersPlaylistsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        PagingPlaylistObject response = api.getAListOfCurrentUsersPlaylists(limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get Featured Playlists 
     *
     * Get a list of Spotify featured playlists (shown, for example, on a Spotify player&#39;s &#39;Browse&#39; tab). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeaturedPlaylistsTest() throws ApiException {
        String country = null;
        String locale = null;
        String timestamp = null;
        Integer limit = null;
        Integer offset = null;
        PagingFeaturedPlaylistObject response = api.getFeaturedPlaylists(country, locale, timestamp, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get User&#39;s Playlists 
     *
     * Get a list of the playlists owned or followed by a Spotify user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListUsersPlaylistsTest() throws ApiException {
        String userId = null;
        Integer limit = null;
        Integer offset = null;
        PagingPlaylistObject response = api.getListUsersPlaylists(userId, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get Playlist 
     *
     * Get a playlist owned by a Spotify user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlaylistTest() throws ApiException {
        String playlistId = null;
        String market = null;
        String fields = null;
        String additionalTypes = null;
        PlaylistObject response = api.getPlaylist(playlistId, market, fields, additionalTypes);

        // TODO: test validations
    }
    
    /**
     * Get Playlist Cover Image 
     *
     * Get the current image associated with a specific playlist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlaylistCoverTest() throws ApiException {
        String playlistId = null;
        List<ImageObject> response = api.getPlaylistCover(playlistId);

        // TODO: test validations
    }
    
    /**
     * Get Playlist Items 
     *
     * Get full details of the items of a playlist owned by a Spotify user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlaylistsTracksTest() throws ApiException {
        String playlistId = null;
        String market = null;
        String fields = null;
        Integer limit = null;
        Integer offset = null;
        String additionalTypes = null;
        PagingPlaylistTrackObject response = api.getPlaylistsTracks(playlistId, market, fields, limit, offset, additionalTypes);

        // TODO: test validations
    }
    
    /**
     * Remove Playlist Items 
     *
     * Remove one or more items from a user&#39;s playlist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeTracksPlaylistTest() throws ApiException {
        String playlistId = null;
        InlineObject2 inlineObject2 = null;
        InlineResponse20011 response = api.removeTracksPlaylist(playlistId, inlineObject2);

        // TODO: test validations
    }
    
    /**
     * Update Playlist Items 
     *
     * Either reorder or replace items in a playlist depending on the request&#39;s parameters. To reorder items, include &#x60;range_start&#x60;, &#x60;insert_before&#x60;, &#x60;range_length&#x60; and &#x60;snapshot_id&#x60; in the request&#39;s body. To replace items, include &#x60;uris&#x60; as either a query parameter or in the request&#39;s body. Replacing items in a playlist will overwrite its existing items. This operation can be used for replacing or clearing items in a playlist. &lt;br/&gt; **Note**: Replace and reorder are mutually exclusive operations which share the same endpoint, but have different parameters. These operations can&#39;t be applied together in a single request. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reorderOrReplacePlaylistsTracksTest() throws ApiException {
        String playlistId = null;
        String uris = null;
        Map<String, Object> requestBody = null;
        InlineResponse20011 response = api.reorderOrReplacePlaylistsTracks(playlistId, uris, requestBody);

        // TODO: test validations
    }
    
    /**
     * Unfollow Playlist 
     *
     * Remove the current user as a follower of a playlist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unfollowPlaylistTest() throws ApiException {
        String playlistId = null;
        api.unfollowPlaylist(playlistId);

        // TODO: test validations
    }
    
    /**
     * Add Custom Playlist Cover Image 
     *
     * Replace the image used to represent a specific playlist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadCustomPlaylistCoverTest() throws ApiException {
        String playlistId = null;
        String body = null;
        api.uploadCustomPlaylistCover(playlistId, body);

        // TODO: test validations
    }
    
}
