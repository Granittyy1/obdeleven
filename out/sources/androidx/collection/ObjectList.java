package androidx.collection;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectList<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f9108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9109b;

    public final E a() {
        if (!d()) {
            return (E) this.f9108a[0];
        }
        D9.o.s("ObjectList is empty.");
        throw null;
    }

    public final E b(int i10) {
        if (i10 >= 0 && i10 < this.f9109b) {
            return (E) this.f9108a[i10];
        }
        f(i10);
        throw null;
    }

    public final int c(E e10) {
        int i10 = 0;
        if (e10 == null) {
            Object[] objArr = this.f9108a;
            int i11 = this.f9109b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f9108a;
        int i12 = this.f9109b;
        while (i10 < i12) {
            if (e10.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean d() {
        return this.f9109b == 0;
    }

    public final boolean e() {
        return this.f9109b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i10 = objectList.f9109b;
            int i11 = this.f9109b;
            if (i10 == i11) {
                Object[] objArr = this.f9108a;
                Object[] objArr2 = objectList.f9108a;
                Na.i iVarJ = Na.l.J(0, i11);
                int i12 = iVarJ.f4687b;
                int i13 = iVarJ.f4688c;
                if (i12 > i13) {
                    return true;
                }
                while (kotlin.jvm.internal.i.a(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i10) {
        StringBuilder sbE = A8.f.e(i10, "Index ", " must be in 0..");
        sbE.append(this.f9109b - 1);
        D9.o.r(sbE.toString());
        throw null;
    }

    public final int hashCode() {
        Object[] objArr = this.f9108a;
        int i10 = this.f9109b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        Ia.l<E, CharSequence> lVar = new Ia.l<E, CharSequence>(this) { // from class: androidx.collection.ObjectList.toString.1
            final /* synthetic */ ObjectList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final CharSequence invoke(Object obj) {
                return obj == this.this$0 ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f9108a;
        int i10 = this.f9109b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.i.d(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) lVar.invoke(obj));
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        kotlin.jvm.internal.i.d(string2, "toString(...)");
        return string2;
    }
}
