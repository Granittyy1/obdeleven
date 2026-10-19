package com.facebook;

import Z3.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.i;
import p165n4.f;
import p165n4.j;

/* JADX INFO: compiled from: FacebookRequestError.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f24765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f24766i;
    public final FacebookException j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f24758k = new b();
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: FacebookRequestError.kt */
    public static final class Category {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Category f24767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Category f24768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Category f24769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Category[] f24770e;

        static {
            Category category = new Category("LOGIN_RECOVERABLE", 0);
            f24767b = category;
            Category category2 = new Category("OTHER", 1);
            f24768c = category2;
            Category category3 = new Category("TRANSIENT", 2);
            f24769d = category3;
            f24770e = new Category[]{category, category2, category3};
        }

        public Category() {
            throw null;
        }

        public static Category valueOf(String value) {
            i.e(value, "value");
            return (Category) Enum.valueOf(Category.class, value);
        }

        public static Category[] values() {
            return (Category[]) Arrays.copyOf(f24770e, 3);
        }
    }

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    public static final class a implements Parcelable.Creator<FacebookRequestError> {
        @Override // android.os.Parcelable.Creator
        public final FacebookRequestError createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
        }

        @Override // android.os.Parcelable.Creator
        public final FacebookRequestError[] newArray(int i10) {
            return new FacebookRequestError[i10];
        }
    }

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    public static final class b {
        public final synchronized f a() {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
            j jVarB = FetchedAppSettingsManager.b(q.b());
            if (jVarB == null) {
                return f.f44880d.a();
            }
            return jVarB.f44899e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    public FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z10) {
        Set set;
        Set set2;
        Set set3;
        this.f24759b = i10;
        this.f24760c = i11;
        this.f24761d = i12;
        this.f24762e = str;
        this.f24763f = str3;
        this.f24764g = str4;
        this.f24765h = obj;
        this.f24766i = str2;
        b bVar = f24758k;
        Category category = Category.f24768c;
        if (facebookException != null) {
            this.j = facebookException;
        } else {
            this.j = new FacebookServiceException(this, a());
            f fVarA = bVar.a();
            Category category2 = Category.f24769d;
            if (z10) {
                category = category2;
            } else {
                HashMap map = fVarA.f44882a;
                if (map == null || !map.containsKey(Integer.valueOf(i11)) || ((set3 = (Set) map.get(Integer.valueOf(i11))) != null && !set3.contains(Integer.valueOf(i12)))) {
                    HashMap map2 = fVarA.f44884c;
                    if (map2 != null && map2.containsKey(Integer.valueOf(i11)) && ((set2 = (Set) map2.get(Integer.valueOf(i11))) == null || set2.contains(Integer.valueOf(i12)))) {
                        category = Category.f24767b;
                    } else {
                        HashMap map3 = fVarA.f44883b;
                        if (map3 != null && map3.containsKey(Integer.valueOf(i11)) && ((set = (Set) map3.get(Integer.valueOf(i11))) == null || set.contains(Integer.valueOf(i12)))) {
                            category = category2;
                        }
                    }
                }
            }
        }
        bVar.a();
        int i13 = f.b.f44885a[category.ordinal()];
    }

    public final String a() {
        String str = this.f24766i;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.j;
        if (facebookException == null) {
            return null;
        }
        return facebookException.getLocalizedMessage();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f24759b + ", errorCode: " + this.f24760c + ", subErrorCode: " + this.f24761d + ", errorType: " + this.f24762e + ", errorMessage: " + a() + "}";
        i.d(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        i.e(out, "out");
        out.writeInt(this.f24759b);
        out.writeInt(this.f24760c);
        out.writeInt(this.f24761d);
        out.writeString(this.f24762e);
        out.writeString(a());
        out.writeString(this.f24763f);
        out.writeString(this.f24764g);
    }

    public FacebookRequestError(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, false);
    }
}
