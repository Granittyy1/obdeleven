package U;

import A1.C0575j;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: VectorResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<C0082b, WeakReference<a>> f6058a = new HashMap<>();

    /* JADX INFO: compiled from: VectorResources.android.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.compose.ui.graphics.vector.c f6059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6060b;

        public a(androidx.compose.ui.graphics.vector.c cVar, int i10) {
            this.f6059a = cVar;
            this.f6060b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f6059a, aVar.f6059a) && this.f6060b == aVar.f6060b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6060b) + (this.f6059a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
            sb2.append(this.f6059a);
            sb2.append(", configFlags=");
            return C0575j.b(sb2, this.f6060b, ')');
        }
    }

    /* JADX INFO: renamed from: U.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VectorResources.android.kt */
    public static final class C0082b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources.Theme f6061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6062b;

        public C0082b(Resources.Theme theme, int i10) {
            this.f6061a = theme;
            this.f6062b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0082b)) {
                return false;
            }
            C0082b c0082b = (C0082b) obj;
            return i.a(this.f6061a, c0082b.f6061a) && this.f6062b == c0082b.f6062b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6062b) + (this.f6061a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Key(theme=");
            sb2.append(this.f6061a);
            sb2.append(", id=");
            return C0575j.b(sb2, this.f6062b, ')');
        }
    }
}
