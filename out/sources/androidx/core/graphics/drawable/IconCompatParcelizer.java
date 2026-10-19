package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f16834a = versionedParcel.j(iconCompat.f16834a, 1);
        byte[] bArrF = iconCompat.f16836c;
        if (versionedParcel.h(2)) {
            bArrF = versionedParcel.f();
        }
        iconCompat.f16836c = bArrF;
        Parcelable parcelableK = iconCompat.f16837d;
        if (versionedParcel.h(3)) {
            parcelableK = versionedParcel.k();
        }
        iconCompat.f16837d = parcelableK;
        iconCompat.f16838e = versionedParcel.j(iconCompat.f16838e, 4);
        iconCompat.f16839f = versionedParcel.j(iconCompat.f16839f, 5);
        Parcelable parcelableK2 = iconCompat.f16840g;
        if (versionedParcel.h(6)) {
            parcelableK2 = versionedParcel.k();
        }
        iconCompat.f16840g = (ColorStateList) parcelableK2;
        String strL = iconCompat.f16842i;
        if (versionedParcel.h(7)) {
            strL = versionedParcel.l();
        }
        iconCompat.f16842i = strL;
        String strL2 = iconCompat.j;
        if (versionedParcel.h(8)) {
            strL2 = versionedParcel.l();
        }
        iconCompat.j = strL2;
        iconCompat.f16841h = PorterDuff.Mode.valueOf(iconCompat.f16842i);
        switch (iconCompat.f16834a) {
            case -1:
                Parcelable parcelable = iconCompat.f16837d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f16835b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f16837d;
                if (parcelable2 != null) {
                    iconCompat.f16835b = parcelable2;
                } else {
                    byte[] bArr = iconCompat.f16836c;
                    iconCompat.f16835b = bArr;
                    iconCompat.f16834a = 3;
                    iconCompat.f16838e = 0;
                    iconCompat.f16839f = bArr.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f16836c, Charset.forName("UTF-16"));
                iconCompat.f16835b = str;
                if (iconCompat.f16834a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f16835b = iconCompat.f16836c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        iconCompat.f16842i = iconCompat.f16841h.name();
        switch (iconCompat.f16834a) {
            case -1:
                iconCompat.f16837d = (Parcelable) iconCompat.f16835b;
                break;
            case 1:
            case 5:
                iconCompat.f16837d = (Parcelable) iconCompat.f16835b;
                break;
            case 2:
                iconCompat.f16836c = ((String) iconCompat.f16835b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f16836c = (byte[]) iconCompat.f16835b;
                break;
            case 4:
            case 6:
                iconCompat.f16836c = iconCompat.f16835b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f16834a;
        if (-1 != i10) {
            versionedParcel.s(i10, 1);
        }
        byte[] bArr = iconCompat.f16836c;
        if (bArr != null) {
            versionedParcel.n(2);
            versionedParcel.p(bArr);
        }
        Parcelable parcelable = iconCompat.f16837d;
        if (parcelable != null) {
            versionedParcel.n(3);
            versionedParcel.t(parcelable);
        }
        int i11 = iconCompat.f16838e;
        if (i11 != 0) {
            versionedParcel.s(i11, 4);
        }
        int i12 = iconCompat.f16839f;
        if (i12 != 0) {
            versionedParcel.s(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f16840g;
        if (colorStateList != null) {
            versionedParcel.n(6);
            versionedParcel.t(colorStateList);
        }
        String str = iconCompat.f16842i;
        if (str != null) {
            versionedParcel.n(7);
            versionedParcel.u(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            versionedParcel.n(8);
            versionedParcel.u(str2);
        }
    }
}
