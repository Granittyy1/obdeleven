package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        Parcelable parcelableK = audioAttributesImplApi26.f17858a;
        if (versionedParcel.h(1)) {
            parcelableK = versionedParcel.k();
        }
        audioAttributesImplApi26.f17858a = (AudioAttributes) parcelableK;
        audioAttributesImplApi26.f17859b = versionedParcel.j(audioAttributesImplApi26.f17859b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f17858a;
        versionedParcel.n(1);
        versionedParcel.t(audioAttributes);
        versionedParcel.s(audioAttributesImplApi26.f17859b, 2);
    }
}
