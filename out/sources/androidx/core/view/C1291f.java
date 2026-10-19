package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.core.view.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ContentInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1291f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f16919a;

    /* JADX INFO: renamed from: androidx.core.view.f$a */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f16920a;

        public a(ClipData clipData, int i10) {
            this.f16920a = C1289d.a(clipData, i10);
        }

        @Override // androidx.core.view.C1291f.b
        public final C1291f a() {
            return new C1291f(new d(this.f16920a.build()));
        }

        @Override // androidx.core.view.C1291f.b
        public final void b(Uri uri) {
            this.f16920a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C1291f.b
        public final void c(int i10) {
            this.f16920a.setFlags(i10);
        }

        @Override // androidx.core.view.C1291f.b
        public final void setExtras(Bundle bundle) {
            this.f16920a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$b */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public interface b {
        C1291f a();

        void b(Uri uri);

        void c(int i10);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.f$c */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f16921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f16924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f16925e;

        @Override // androidx.core.view.C1291f.b
        public final C1291f a() {
            return new C1291f(new C0176f(this));
        }

        @Override // androidx.core.view.C1291f.b
        public final void b(Uri uri) {
            this.f16924d = uri;
        }

        @Override // androidx.core.view.C1291f.b
        public final void c(int i10) {
            this.f16923c = i10;
        }

        @Override // androidx.core.view.C1291f.b
        public final void setExtras(Bundle bundle) {
            this.f16925e = bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$d */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f16926a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f16926a = androidx.compose.ui.contentcapture.h.a(contentInfo);
        }

        @Override // androidx.core.view.C1291f.e
        public final ClipData a() {
            return this.f16926a.getClip();
        }

        @Override // androidx.core.view.C1291f.e
        public final int b() {
            return this.f16926a.getFlags();
        }

        @Override // androidx.core.view.C1291f.e
        public final ContentInfo c() {
            return this.f16926a;
        }

        @Override // androidx.core.view.C1291f.e
        public final int getSource() {
            return this.f16926a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f16926a + "}";
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$e */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int getSource();
    }

    /* JADX INFO: renamed from: androidx.core.view.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class C0176f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f16927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f16930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f16931e;

        public C0176f(c cVar) {
            ClipData clipData = cVar.f16921a;
            clipData.getClass();
            this.f16927a = clipData;
            int i10 = cVar.f16922b;
            if (i10 < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
            }
            if (i10 > 5) {
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
            }
            this.f16928b = i10;
            int i11 = cVar.f16923c;
            if ((i11 & 1) == i11) {
                this.f16929c = i11;
                this.f16930d = cVar.f16924d;
                this.f16931e = cVar.f16925e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // androidx.core.view.C1291f.e
        public final ClipData a() {
            return this.f16927a;
        }

        @Override // androidx.core.view.C1291f.e
        public final int b() {
            return this.f16929c;
        }

        @Override // androidx.core.view.C1291f.e
        public final ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.C1291f.e
        public final int getSource() {
            return this.f16928b;
        }

        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f16927a.getDescription());
            sb2.append(", source=");
            int i10 = this.f16928b;
            if (i10 == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i10 == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i10 == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i10 == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i10 != 4) {
                strValueOf = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb2.append(strValueOf);
            sb2.append(", flags=");
            int i11 = this.f16929c;
            sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
            Uri uri = this.f16930d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str);
            return Q8.d.a(sb2, this.f16931e != null ? ", hasExtras" : "", "}");
        }
    }

    public C1291f(e eVar) {
        this.f16919a = eVar;
    }

    public final String toString() {
        return this.f16919a.toString();
    }
}
