package androidx.compose.ui.graphics.vector;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import p005a4.p;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j implements Iterable<j>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f13965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f13966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f13967i;
    public final List<e> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<j> f13968k;

    /* JADX INFO: compiled from: ImageVector.kt */
    public static final class a implements Iterator<j>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<j> f13969b;

        public a(h hVar) {
            this.f13969b = hVar.f13968k.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f13969b.hasNext();
        }

        @Override // java.util.Iterator
        public final j next() {
            return this.f13969b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends e> list, List<? extends j> list2) {
        this.f13960b = str;
        this.f13961c = f10;
        this.f13962d = f11;
        this.f13963e = f12;
        this.f13964f = f13;
        this.f13965g = f14;
        this.f13966h = f15;
        this.f13967i = f16;
        this.j = list;
        this.f13968k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            return kotlin.jvm.internal.i.a(this.f13960b, hVar.f13960b) && this.f13961c == hVar.f13961c && this.f13962d == hVar.f13962d && this.f13963e == hVar.f13963e && this.f13964f == hVar.f13964f && this.f13965g == hVar.f13965g && this.f13966h == hVar.f13966h && this.f13967i == hVar.f13967i && kotlin.jvm.internal.i.a(this.j, hVar.j) && kotlin.jvm.internal.i.a(this.f13968k, hVar.f13968k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13968k.hashCode() + p.d(O.a.d(this.f13967i, O.a.d(this.f13966h, O.a.d(this.f13965g, O.a.d(this.f13964f, O.a.d(this.f13963e, O.a.d(this.f13962d, O.a.d(this.f13961c, this.f13960b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.j);
    }

    @Override // java.lang.Iterable
    public final Iterator<j> iterator() {
        return new a(this);
    }

    public h() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, i.f13970a, EmptyList.f42983b);
    }
}
