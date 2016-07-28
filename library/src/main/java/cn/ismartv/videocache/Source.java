package cn.ismartv.videocache;

/**
 * Source for proxy.
 *
 * @author Alexey Danilov (danikula@gmail.com).
 */
public interface Source {

    /**
     * Opens source. Source should be open before using {@link #read(byte[])}
     *
     * @param offset offset in bytes for source.
     * @throws ProxyCacheException if error occur while opening source.
     */
    void open(int offset) throws ProxyCacheException;

    /**
     * Returns length bytes or <b>negative value</b> if length is unknown.
     *
     * @return bytes length
     * @throws ProxyCacheException if error occur while fetching source data.
     */
    int length() throws ProxyCacheException;

    /**
     * Read data to byte buffer from source with current offset.
     *
     * @param buffer a buffer to be used for reading data.
     * @throws ProxyCacheException if error occur while reading source.
     */
    int read(byte[] buffer) throws ProxyCacheException;

    /**
     * Closes source and release resources. Every opened source should be closed.
     *
     * @throws ProxyCacheException if error occur while closing source.
     */
    void close() throws ProxyCacheException;
}
