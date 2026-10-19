package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10313a = 0;

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class a extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f10314b = 0;

        static {
            new a();
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i10, LayoutDirection layoutDirection) {
            return i10 / 2;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class b extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f10315b = 0;

        static {
            new b();
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i10, LayoutDirection layoutDirection) {
            if (layoutDirection == LayoutDirection.f15717b) {
                return i10;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class c extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.compose.ui.d.b f10316b;

        public c(androidx.compose.ui.d.b bVar) {
            this.f10316b = bVar;
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i10, LayoutDirection layoutDirection) {
            return this.f10316b.a(0, i10, layoutDirection);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.i.a(this.f10316b, ((c) obj).f10316b);
        }

        public final int hashCode() {
            return this.f10316b.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f10316b + ')';
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class d extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f10317b = 0;

        static {
            new d();
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i10, LayoutDirection layoutDirection) {
            if (layoutDirection == LayoutDirection.f15717b) {
                return 0;
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class e extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.compose.ui.d.c f10318b;

        public e(androidx.compose.ui.d.c cVar) {
            this.f10318b = cVar;
        }

        @Override // androidx.compose.foundation.layout.r
        public final int a(int i10, LayoutDirection layoutDirection) {
            return this.f10318b.a(0, i10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.i.a(this.f10318b, ((e) obj).f10318b);
        }

        public final int hashCode() {
            return this.f10318b.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f10318b + ')';
        }
    }

    static {
        int i10 = a.f10314b;
        int i11 = d.f10317b;
        int i12 = b.f10315b;
    }

    public abstract int a(int i10, LayoutDirection layoutDirection);
}
