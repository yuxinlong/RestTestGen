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
import org.openapitools.client.model.AlbumObject;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2006;
import org.openapitools.client.model.InlineResponse401;
import org.openapitools.client.model.PagingSavedAlbumObject;
import org.openapitools.client.model.PagingSimplifiedAlbumObject;
import org.openapitools.client.model.PagingSimplifiedTrackObject;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AlbumsApi
 */
@Ignore
public class AlbumsApiTest {

    private final AlbumsApi api = new AlbumsApi();

    
    /**
     * Check User&#39;s Saved Albums 
     *
     * Check if one or more albums is already saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkUsersSavedAlbumsTest() throws ApiException {
        String ids = null;
        List<Boolean> response = api.checkUsersSavedAlbums(ids);

        // TODO: test validations
    }
    
    /**
     * Get Album 
     *
     * Get Spotify catalog information for a single album. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnAlbumTest() throws ApiException {
        String id = null;
        String market = null;
        AlbumObject response = api.getAnAlbum(id, market);

        // TODO: test validations
    }
    
    /**
     * Get Album Tracks 
     *
     * Get Spotify catalog information about an album’s tracks. Optional parameters can be used to limit the number of tracks returned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnAlbumsTracksTest() throws ApiException {
        String id = null;
        String market = null;
        Integer limit = null;
        Integer offset = null;
        PagingSimplifiedTrackObject response = api.getAnAlbumsTracks(id, market, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get Artist&#39;s Albums 
     *
     * Get Spotify catalog information about an artist&#39;s albums. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAnArtistsAlbumsTest() throws ApiException {
        String id = null;
        String includeGroups = null;
        String market = null;
        Integer limit = null;
        Integer offset = null;
        PagingSimplifiedAlbumObject response = api.getAnArtistsAlbums(id, includeGroups, market, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get Several Albums 
     *
     * Get Spotify catalog information for multiple albums identified by their Spotify IDs. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMultipleAlbumsTest() throws ApiException {
        String ids = null;
        String market = null;
        InlineResponse200 response = api.getMultipleAlbums(ids, market);

        // TODO: test validations
    }
    
    /**
     * Get New Releases 
     *
     * Get a list of new album releases featured in Spotify (shown, for example, on a Spotify player’s “Browse” tab). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNewReleasesTest() throws ApiException {
        String country = null;
        Integer limit = null;
        Integer offset = null;
        InlineResponse2006 response = api.getNewReleases(country, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get User&#39;s Saved Albums 
     *
     * Get a list of the albums saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersSavedAlbumsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String market = null;
        PagingSavedAlbumObject response = api.getUsersSavedAlbums(limit, offset, market);

        // TODO: test validations
    }
    
    /**
     * Remove Users&#39; Saved Albums 
     *
     * Remove one or more albums from the current user&#39;s &#39;Your Music&#39; library. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAlbumsUserTest() throws ApiException {
        String ids = null;
        Map<String, Object> requestBody = null;
        api.removeAlbumsUser(ids, requestBody);

        // TODO: test validations
    }
    
    /**
     * Save Albums for Current User 
     *
     * Save one or more albums to the current user&#39;s &#39;Your Music&#39; library. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveAlbumsUserTest() throws ApiException {
        String ids = null;
        Map<String, Object> requestBody = null;
        api.saveAlbumsUser(ids, requestBody);

        // TODO: test validations
    }
    
}