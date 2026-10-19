package androidx.media;

import F2.b;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        b bVarM = audioAttributesCompat.f17857a;
        if (versionedParcel.h(1)) {
            bVarM = versionedParcel.m();
        }
        audioAttributesCompat.f17857a = (AudioAttributesImpl) bVarM;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f17857a;
        versionedParcel.n(1);
        versionedParcel.v(audioAttributesImpl);
    }
}
