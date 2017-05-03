package pl.chebad.bond.dam.musicstructureapp;


/**
 * Created by Damian on 03/05/2017.
 *
 */

public class List {
    /**
     * Song tittle.
     */
    private String mSongTittle = "a";

    /**
     * Album name.
     */
    private String mAlbumTittle;
    /**
     * Image description of song or album.
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Constructor witch 2 parameters.
     *
     * @param mAlbumTittle Album name.
     * @param mSongTittle Song name.
     */
    public List(String mSongTittle,String mAlbumTittle) {
        this.mAlbumTittle = mAlbumTittle;
        this.mSongTittle = mSongTittle;
    }

    /**
     * Constructor with 2 parameters.
     *
     * @param mAlbumTittle    Album tittle.
     * @param imageResourceId Image description of album.
     */
    public List(String mAlbumTittle, int imageResourceId) {
        this.mImageResourceId = imageResourceId;
        this.mAlbumTittle = mAlbumTittle;
    }

    /**
     * Constructor with 2 parameters.
     *
     * @param songTittle      Song tittle.
     * @param albumTittle     Album tittle.
     * @param imageResourceId Image description of album.
     */

    public List(String songTittle, String albumTittle, int imageResourceId) {

        mSongTittle = songTittle;
        mAlbumTittle = albumTittle;
        mImageResourceId = imageResourceId;

    }

    /**
     * Method is getting the song tittle.
     *
     * @return Return the song tittle.
     */
    public String getSongTittle() {
        return mSongTittle;
    }

    /**
     * Method is getting the album tittle.
     *
     * @return Return the album tittle.
     */
    public String getAlbumTittle() {
        return mAlbumTittle;
    }

    /**
     * Method is getting image id resource.
     *
     * @return Return a image id resource.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Method return a true if image view has a resource or return false if there isn't a
     * resource image.
     *
     * @return Return true or false depends of image resource id.
     */

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "List{" +
                " songTittle='" + mSongTittle + '\'' +
                ", albumTittle='" + mAlbumTittle + '\'' +
                ", imageResourceId=" + mImageResourceId +
                '}';
    }
}
