

# AudioAnalysisObjectTrack

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analysisChannels** | **Integer** | The number of channels used for analysis. If 1, all channels are summed together to mono before analysis. |  [optional]
**analysisSampleRate** | **Integer** | The sample rate used to decode and analyze this track. May differ from the actual sample rate of this track available on Spotify. |  [optional]
**codeVersion** | **BigDecimal** | A version number for the Echo Nest Musical Fingerprint format used in the codestring field. |  [optional]
**codestring** | **String** | An [Echo Nest Musical Fingerprint (ENMFP)](https://academiccommons.columbia.edu/doi/10.7916/D8Q248M4) codestring for this track. |  [optional]
**duration** | **BigDecimal** | Length of the track in seconds. |  [optional]
**echoprintVersion** | **BigDecimal** | A version number for the EchoPrint format used in the echoprintstring field. |  [optional]
**echoprintstring** | **String** | An [EchoPrint](https://github.com/spotify/echoprint-codegen) codestring for this track. |  [optional]
**endOfFadeIn** | **BigDecimal** | The time, in seconds, at which the track&#39;s fade-in period ends. If the track has no fade-in, this will be 0.0. |  [optional]
**key** | **Integer** | The key the track is in. Integers map to pitches using standard [Pitch Class notation](https://en.wikipedia.org/wiki/Pitch_class). E.g. 0 &#x3D; C, 1 &#x3D; C♯/D♭, 2 &#x3D; D, and so on. If no key was detected, the value is -1.  |  [optional]
**keyConfidence** | **BigDecimal** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;key&#x60;. |  [optional]
**loudness** | **Float** | The overall loudness of a track in decibels (dB). Loudness values are averaged across the entire track and are useful for comparing relative loudness of tracks. Loudness is the quality of a sound that is the primary psychological correlate of physical strength (amplitude). Values typically range between -60 and 0 db.  |  [optional]
**mode** | **Integer** | Mode indicates the modality (major or minor) of a track, the type of scale from which its melodic content is derived. Major is represented by 1 and minor is 0.  |  [optional]
**modeConfidence** | **BigDecimal** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;mode&#x60;. |  [optional]
**numSamples** | **Integer** | The exact number of audio samples analyzed from this track. See also &#x60;analysis_sample_rate&#x60;. |  [optional]
**offsetSeconds** | **Integer** | An offset to the start of the region of the track that was analyzed. (As the entire track is analyzed, this should always be 0.) |  [optional]
**rhythmVersion** | **BigDecimal** | A version number for the Rhythmstring used in the rhythmstring field. |  [optional]
**rhythmstring** | **String** | A Rhythmstring for this track. The format of this string is similar to the Synchstring. |  [optional]
**sampleMd5** | **String** | This field will always contain the empty string. |  [optional]
**startOfFadeOut** | **BigDecimal** | The time, in seconds, at which the track&#39;s fade-out period starts. If the track has no fade-out, this should match the track&#39;s length. |  [optional]
**synchVersion** | **BigDecimal** | A version number for the Synchstring used in the synchstring field. |  [optional]
**synchstring** | **String** | A [Synchstring](https://github.com/echonest/synchdata) for this track. |  [optional]
**tempo** | **Float** | The overall estimated tempo of a track in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration.  |  [optional]
**tempoConfidence** | **BigDecimal** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;tempo&#x60;. |  [optional]
**timeSignature** | **Integer** | An estimated time signature. The time signature (meter) is a notational convention to specify how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating time signatures of \&quot;3/4\&quot;, to \&quot;7/4\&quot;. |  [optional]
**timeSignatureConfidence** | **BigDecimal** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;time_signature&#x60;. |  [optional]
**windowSeconds** | **Integer** | The length of the region of the track was analyzed, if a subset of the track was analyzed. (As the entire track is analyzed, this should always be 0.) |  [optional]



