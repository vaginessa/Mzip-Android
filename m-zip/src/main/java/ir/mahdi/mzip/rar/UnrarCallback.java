package ir.mahdi.mzip.rar;


public interface UnrarCallback {

    boolean isNextVolumeReady(Volume nextVolume);

    void volumeProgressChanged(long current, long total);
}
