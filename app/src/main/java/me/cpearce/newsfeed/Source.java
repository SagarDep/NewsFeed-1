package me.cpearce.newsfeed;

import java.util.List;

/**
 * Created by Christopher on 11/8/2017.
 */

public class Source {
    private String mId;
    private String mName;
    private String mDescription;
    private String mUrl;
    private String mCategory;
    private String mLanguage;
    private String mCountry;
    private List<String> mSortBysAvailable;


    /**
     * Constructs a new {@link Source} object.
     * object used for soucres endpoint at https://newsapi.org/#apiSources
     *
     * @param id               The unique identifier for the news source. This is needed when querying
     *                         the /articles endpoint to retrieve article metadata.
     *
     * @param name             The display-friendly name of the news source.
     *
     * @param description      A brief description of the news source and what area they specialize in.
     *
     * @param url              The base URL or homepage of the source.
     *
     * @param category         The topic category that the source focuses on.
     *                         Possible options: business, entertainment, gaming, general, music,
     *                         politics, science-and-nature, sport, technology
     *
     * @param language         The 2-letter ISO-639-1 code for the language that the source is
     *                         written in. Possible options: en, de, fr
     *
     * @param country          The 2-letter ISO 3166-1 code of the country that the source mainly
     *                         focuses on.
     *
     * @param sortBysAvailable The available headline lists for the news source. The possible
     *                         options are top, latest and popular.
     */
    public Source(String id, String name, String description, String url, String category,
                  String language, String country, List<String> sortBysAvailable) {
        mId = id;
        mName = name;
        mDescription = description;
        mUrl = url;
        mCategory = category;
        mLanguage = language;
        mCountry = country;
        mSortBysAvailable = sortBysAvailable;
    }

    public String getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmLanguage() {
        return mLanguage;
    }

    public String getmCountry() {
        return mCountry;
    }

}