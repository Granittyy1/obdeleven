package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class SafeParcelReader {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb2.append(str);
            sb2.append(" Parcel: pos=");
            sb2.append(iDataPosition);
            sb2.append(" size=");
            sb2.append(iDataSize);
            super(sb2.toString());
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int iK = k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iK);
        return bundle;
    }

    public static <T extends Parcelable> T b(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iK = k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iK);
        return tCreateFromParcel;
    }

    public static String c(Parcel parcel, int i10) {
        int iK = k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iK);
        return string;
    }

    public static <T> T[] d(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iK = k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iK);
        return tArr;
    }

    public static <T> ArrayList<T> e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iK = k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iK);
        return arrayListCreateTypedArrayList;
    }

    public static void f(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new ParseException(sb2.toString(), parcel);
    }

    public static boolean g(Parcel parcel, int i10) {
        n(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder h(Parcel parcel, int i10) {
        int iK = k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iK);
        return strongBinder;
    }

    public static int i(Parcel parcel, int i10) {
        n(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long j(Parcel parcel, int i10) {
        n(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int k(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void l(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + k(parcel, i10));
    }

    public static int m(Parcel parcel) {
        int i10 = parcel.readInt();
        int iK = k(parcel, i10);
        char c10 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iK + iDataPosition;
        if (i11 >= iDataPosition && i11 <= parcel.dataSize()) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i11).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i11);
        throw new ParseException(sb2.toString(), parcel);
    }

    public static void n(Parcel parcel, int i10, int i11) {
        int iK = k(parcel, i10);
        if (iK == i11) {
            return;
        }
        String hexString = Integer.toHexString(iK);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iK).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(iK);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new ParseException(sb2.toString(), parcel);
    }

    public static void o(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(i10);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i10).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(i10);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new ParseException(sb2.toString(), parcel);
    }
}
