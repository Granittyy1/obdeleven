package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f8132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f8133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f8134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bitmap f8135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f8136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f8137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f8138i;
    public MediaDescription j;

    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            Bundle bundle;
            Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
            if (objCreateFromParcel == null) {
                return null;
            }
            MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
            String strG = b.g(mediaDescription);
            CharSequence charSequenceI = b.i(mediaDescription);
            CharSequence charSequenceH = b.h(mediaDescription);
            CharSequence charSequenceC = b.c(mediaDescription);
            Bitmap bitmapE = b.e(mediaDescription);
            Uri uriF = b.f(mediaDescription);
            Bundle bundleD = b.d(mediaDescription);
            if (bundleD != null) {
                bundleD = MediaSessionCompat.a(bundleD);
            }
            Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
            if (uriA == null) {
                bundle = bundleD;
            } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                bundle = null;
            } else {
                bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                bundle = bundleD;
            }
            if (uriA == null) {
                uriA = c.a(mediaDescription);
            }
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
            mediaDescriptionCompat.j = mediaDescription;
            return mediaDescriptionCompat;
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f8131b = str;
        this.f8132c = charSequence;
        this.f8133d = charSequence2;
        this.f8134e = charSequence3;
        this.f8135f = bitmap;
        this.f8136g = uri;
        this.f8137h = bundle;
        this.f8138i = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f8132c) + ", " + ((Object) this.f8133d) + ", " + ((Object) this.f8134e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescriptionA = this.j;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = b.b();
            b.n(builderB, this.f8131b);
            b.p(builderB, this.f8132c);
            b.o(builderB, this.f8133d);
            b.j(builderB, this.f8134e);
            b.l(builderB, this.f8135f);
            b.m(builderB, this.f8136g);
            b.k(builderB, this.f8137h);
            c.b(builderB, this.f8138i);
            mediaDescriptionA = b.a(builderB);
            this.j = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i10);
    }
}
