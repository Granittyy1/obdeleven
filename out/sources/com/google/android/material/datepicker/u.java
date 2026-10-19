package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: compiled from: Month.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements Comparable<u>, Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f27115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f27120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27121h;

    /* JADX INFO: compiled from: Month.java */
    public class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            return u.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i10) {
            return new u[i10];
        }
    }

    public u(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = D.c(calendar);
        this.f27115b = calendarC;
        this.f27116c = calendarC.get(2);
        this.f27117d = calendarC.get(1);
        this.f27118e = calendarC.getMaximum(7);
        this.f27119f = calendarC.getActualMaximum(5);
        this.f27120g = calendarC.getTimeInMillis();
    }

    public static u a(int i10, int i11) {
        Calendar calendarE = D.e(null);
        calendarE.set(1, i10);
        calendarE.set(2, i11);
        return new u(calendarE);
    }

    public static u b(long j) {
        Calendar calendarE = D.e(null);
        calendarE.setTimeInMillis(j);
        return new u(calendarE);
    }

    public final String c() {
        if (this.f27121h == null) {
            this.f27121h = D.b("yMMMM", Locale.getDefault()).format(new Date(this.f27115b.getTimeInMillis()));
        }
        return this.f27121h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(u uVar) {
        return this.f27115b.compareTo(uVar.f27115b);
    }

    public final int d(u uVar) {
        if (!(this.f27115b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (uVar.f27116c - this.f27116c) + ((uVar.f27117d - this.f27117d) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f27116c == uVar.f27116c && this.f27117d == uVar.f27117d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27116c), Integer.valueOf(this.f27117d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27117d);
        parcel.writeInt(this.f27116c);
    }
}
