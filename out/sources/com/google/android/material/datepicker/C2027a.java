package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CalendarConstraints.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2027a implements Parcelable {
    public static final Parcelable.Creator<C2027a> CREATOR = new C0270a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f27032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f27033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f27034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f27035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27038h;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CalendarConstraints.java */
    public class C0270a implements Parcelable.Creator<C2027a> {
        @Override // android.os.Parcelable.Creator
        public final C2027a createFromParcel(Parcel parcel) {
            return new C2027a((u) parcel.readParcelable(u.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C2027a[] newArray(int i10) {
            return new C2027a[i10];
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$b */
    /* JADX INFO: compiled from: CalendarConstraints.java */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f27039c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f27040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f27041b;

        static {
            D.a(u.a(1900, 0).f27120g);
            D.a(u.a(2100, 11).f27120g);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$c */
    /* JADX INFO: compiled from: CalendarConstraints.java */
    public interface c extends Parcelable {
        boolean I(long j);
    }

    public C2027a(u uVar, u uVar2, c cVar, u uVar3, int i10) {
        Objects.requireNonNull(uVar, "start cannot be null");
        Objects.requireNonNull(uVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f27032b = uVar;
        this.f27033c = uVar2;
        this.f27035e = uVar3;
        this.f27036f = i10;
        this.f27034d = cVar;
        if (uVar3 != null && uVar.f27115b.compareTo(uVar3.f27115b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (uVar3 != null && uVar3.f27115b.compareTo(uVar2.f27115b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > D.e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f27038h = uVar.d(uVar2) + 1;
        this.f27037g = (uVar2.f27117d - uVar.f27117d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2027a)) {
            return false;
        }
        C2027a c2027a = (C2027a) obj;
        return this.f27032b.equals(c2027a.f27032b) && this.f27033c.equals(c2027a.f27033c) && Objects.equals(this.f27035e, c2027a.f27035e) && this.f27036f == c2027a.f27036f && this.f27034d.equals(c2027a.f27034d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27032b, this.f27033c, this.f27035e, Integer.valueOf(this.f27036f), this.f27034d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f27032b, 0);
        parcel.writeParcelable(this.f27033c, 0);
        parcel.writeParcelable(this.f27035e, 0);
        parcel.writeParcelable(this.f27034d, 0);
        parcel.writeInt(this.f27036f);
    }
}
