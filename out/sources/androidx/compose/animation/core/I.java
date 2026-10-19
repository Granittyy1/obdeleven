package androidx.compose.animation.core;

import androidx.collection.AbstractC0883k;
import java.util.Arrays;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class I<T> implements InterfaceC0920u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<T> f9364a;

    /* JADX INFO: compiled from: AnimationSpec.kt */
    public static final class a<T> extends H {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9365d;

        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(aVar.f9362b, this.f9362b) && kotlin.jvm.internal.i.a((InterfaceC0921v) aVar.f9363c, (InterfaceC0921v) this.f9363c) && aVar.f9365d == this.f9365d;
        }

        public final int hashCode() {
            Object obj = this.f9362b;
            return ((InterfaceC0921v) this.f9363c).hashCode() + p005a4.q.b(this.f9365d, (obj != null ? obj.hashCode() : 0) * 31, 31);
        }
    }

    /* JADX INFO: compiled from: AnimationSpec.kt */
    public static final class b<T> extends J<T, a<T>> {
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final a a(int i10, Object obj) {
            a aVar = new a(obj, C0922w.f9638d);
            aVar.f9365d = 0;
            this.f9380b.h(i10, aVar);
            return aVar;
        }
    }

    public I(b<T> bVar) {
        this.f9364a = bVar;
    }

    @Override // androidx.compose.animation.core.InterfaceC0923x
    public final /* bridge */ /* synthetic */ j0 b() {
        return a(VectorConvertersKt.f9477a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.animation.core.InterfaceC0920u, androidx.compose.animation.core.InterfaceC0906f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final <V extends AbstractC0913m> o0<V> a(d0<T, V> d0Var) {
        int[] iArr;
        Object[] objArr;
        int i10;
        b<T> bVar = this.f9364a;
        AbstractC0883k abstractC0883k = bVar.f9380b;
        androidx.collection.A a10 = new androidx.collection.A(abstractC0883k.f9190e + 2);
        androidx.collection.B b10 = new androidx.collection.B(abstractC0883k.f9190e);
        int[] iArr2 = abstractC0883k.f9187b;
        Object[] objArr2 = abstractC0883k.f9188c;
        long[] jArr = abstractC0883k.f9186a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr2[i15];
                            a aVar = (a) objArr2[i15];
                            a10.c(i16);
                            b10.h(i16, new n0((AbstractC0913m) d0Var.a().invoke(aVar.f9362b), (InterfaceC0921v) aVar.f9363c, aVar.f9365d));
                            i10 = 8;
                        } else {
                            i10 = i12;
                        }
                        j >>= i10;
                        i14++;
                        i12 = i10;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!abstractC0883k.a(0)) {
            int i17 = a10.f9184b;
            if (i17 < 0) {
                D9.o.r("Index must be between 0 and size");
                throw null;
            }
            a10.d(i17 + 1);
            int[] iArr3 = a10.f9183a;
            int i18 = a10.f9184b;
            if (i18 != 0) {
                Q3.d.m(1, 0, i18, iArr3, iArr3);
            }
            iArr3[0] = 0;
            a10.f9184b++;
        }
        if (!abstractC0883k.a(bVar.f9379a)) {
            a10.c(bVar.f9379a);
        }
        int i19 = a10.f9184b;
        if (i19 != 0) {
            int[] iArr4 = a10.f9183a;
            kotlin.jvm.internal.i.e(iArr4, "<this>");
            Arrays.sort(iArr4, 0, i19);
        }
        return new o0<>(a10, b10, bVar.f9379a, C0922w.f9638d);
    }
}
