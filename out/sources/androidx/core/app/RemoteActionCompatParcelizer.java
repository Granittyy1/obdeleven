package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        F2.b bVarM = remoteActionCompat.f16710a;
        if (versionedParcel.h(1)) {
            bVarM = versionedParcel.m();
        }
        remoteActionCompat.f16710a = (IconCompat) bVarM;
        CharSequence charSequenceG = remoteActionCompat.f16711b;
        if (versionedParcel.h(2)) {
            charSequenceG = versionedParcel.g();
        }
        remoteActionCompat.f16711b = charSequenceG;
        CharSequence charSequenceG2 = remoteActionCompat.f16712c;
        if (versionedParcel.h(3)) {
            charSequenceG2 = versionedParcel.g();
        }
        remoteActionCompat.f16712c = charSequenceG2;
        Parcelable parcelableK = remoteActionCompat.f16713d;
        if (versionedParcel.h(4)) {
            parcelableK = versionedParcel.k();
        }
        remoteActionCompat.f16713d = (PendingIntent) parcelableK;
        boolean zE = remoteActionCompat.f16714e;
        if (versionedParcel.h(5)) {
            zE = versionedParcel.e();
        }
        remoteActionCompat.f16714e = zE;
        boolean zE2 = remoteActionCompat.f16715f;
        if (versionedParcel.h(6)) {
            zE2 = versionedParcel.e();
        }
        remoteActionCompat.f16715f = zE2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        IconCompat iconCompat = remoteActionCompat.f16710a;
        versionedParcel.n(1);
        versionedParcel.v(iconCompat);
        CharSequence charSequence = remoteActionCompat.f16711b;
        versionedParcel.n(2);
        versionedParcel.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f16712c;
        versionedParcel.n(3);
        versionedParcel.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f16713d;
        versionedParcel.n(4);
        versionedParcel.t(pendingIntent);
        boolean z10 = remoteActionCompat.f16714e;
        versionedParcel.n(5);
        versionedParcel.o(z10);
        boolean z11 = remoteActionCompat.f16715f;
        versionedParcel.n(6);
        versionedParcel.o(z11);
    }
}
