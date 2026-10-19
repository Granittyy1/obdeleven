package p053e1;

import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import java.io.PrintWriter;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p014b1.f;

/* JADX INFO: compiled from: LoaderManagerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p053e1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0359b f34711b;

    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    public static class a<D> extends C<D> {
        @Override // androidx.lifecycle.AbstractC1382z
        public final void g() {
            throw null;
        }

        @Override // androidx.lifecycle.AbstractC1382z
        public final void h() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #0 : ");
            sb2.append("null");
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: e1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    public static class C0359b extends Y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34712b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.collection.Y<a> f34713a = new androidx.collection.Y<>();

        /* JADX INFO: renamed from: e1.b$b$a */
        /* JADX INFO: compiled from: LoaderManagerImpl.java */
        public static class a implements a0.c {
            @Override // androidx.lifecycle.a0.c
            public final <T extends Y> T create(Class<T> cls) {
                return new C0359b();
            }
        }

        @Override // androidx.lifecycle.Y
        public final void onCleared() {
            super.onCleared();
            androidx.collection.Y<a> y10 = this.f34713a;
            if (y10.f() > 0) {
                y10.g(0).getClass();
                throw null;
            }
            int i10 = y10.f9143e;
            Object[] objArr = y10.f9142d;
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = null;
            }
            y10.f9143e = 0;
            y10.f9140b = false;
        }
    }

    public b(InterfaceC1376t interfaceC1376t, b0 store) {
        this.f34710a = interfaceC1376t;
        C0359b.a aVar = C0359b.f34712b;
        i.e(store, "store");
        p014b1.a.C0207a defaultCreationExtras = p014b1.a.C0207a.f20498b;
        i.e(defaultCreationExtras, "defaultCreationExtras");
        f fVar = new f(store, aVar, defaultCreationExtras);
        c cVarA = l.a(C0359b.class);
        String strI = cVarA.i();
        if (strI == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f34711b = (C0359b) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        androidx.collection.Y<a> y10 = this.f34711b.f34713a;
        if (y10.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (y10.f() <= 0) {
                return;
            }
            a aVarG = y10.g(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(y10.d(0));
            printWriter.print(": ");
            printWriter.println(aVarG.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Object obj = this.f34710a;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}}");
        return sb2.toString();
    }
}
