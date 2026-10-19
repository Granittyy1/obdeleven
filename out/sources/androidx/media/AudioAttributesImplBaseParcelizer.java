package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f17860a = versionedParcel.j(audioAttributesImplBase.f17860a, 1);
        audioAttributesImplBase.f17861b = versionedParcel.j(audioAttributesImplBase.f17861b, 2);
        audioAttributesImplBase.f17862c = versionedParcel.j(audioAttributesImplBase.f17862c, 3);
        audioAttributesImplBase.f17863d = versionedParcel.j(audioAttributesImplBase.f17863d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.s(audioAttributesImplBase.f17860a, 1);
        versionedParcel.s(audioAttributesImplBase.f17861b, 2);
        versionedParcel.s(audioAttributesImplBase.f17862c, 3);
        versionedParcel.s(audioAttributesImplBase.f17863d, 4);
    }
}
