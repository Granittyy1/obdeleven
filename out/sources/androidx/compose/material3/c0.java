package androidx.compose.material3;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p270w.a f12429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p270w.a f12430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p270w.a f12431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p270w.a f12432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p270w.a f12433e;

    public c0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.i.a(this.f12429a, c0Var.f12429a) && kotlin.jvm.internal.i.a(this.f12430b, c0Var.f12430b) && kotlin.jvm.internal.i.a(this.f12431c, c0Var.f12431c) && kotlin.jvm.internal.i.a(this.f12432d, c0Var.f12432d) && kotlin.jvm.internal.i.a(this.f12433e, c0Var.f12433e);
    }

    public final int hashCode() {
        return this.f12433e.hashCode() + ((this.f12432d.hashCode() + ((this.f12431c.hashCode() + ((this.f12430b.hashCode() + (this.f12429a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f12429a + ", small=" + this.f12430b + ", medium=" + this.f12431c + ", large=" + this.f12432d + ", extraLarge=" + this.f12433e + ')';
    }

    public c0(int i10) {
        p270w.f fVar = b0.f12424a;
        p270w.f fVar2 = b0.f12425b;
        p270w.f fVar3 = b0.f12426c;
        p270w.f fVar4 = b0.f12427d;
        p270w.f fVar5 = b0.f12428e;
        this.f12429a = fVar;
        this.f12430b = fVar2;
        this.f12431c = fVar3;
        this.f12432d = fVar4;
        this.f12433e = fVar5;
    }
}
