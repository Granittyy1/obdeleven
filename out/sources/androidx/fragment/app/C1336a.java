package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackStackRecord.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1336a extends I implements y.k, y.q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f17569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17571t;

    public C1336a(y yVar) {
        yVar.J();
        AbstractC1352q<?> abstractC1352q = yVar.f17696x;
        if (abstractC1352q != null) {
            abstractC1352q.f17632c.getClassLoader();
        }
        this.f17484a = new ArrayList<>();
        this.f17491h = true;
        this.f17498p = false;
        this.f17571t = -1;
        this.f17569r = yVar;
    }

    @Override // androidx.fragment.app.y.q
    public final boolean a(ArrayList<C1336a> arrayList, ArrayList<Boolean> arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f17490g) {
            return true;
        }
        this.f17569r.f17677d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.I
    public final void d(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        b(new I.a(fragment, i11));
        fragment.mFragmentManager = this.f17569r;
    }

    @Override // androidx.fragment.app.I
    public final C1336a f(Fragment fragment, Lifecycle.State state) {
        y yVar = fragment.mFragmentManager;
        y yVar2 = this.f17569r;
        if (yVar != yVar2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + yVar2);
        }
        if (state == Lifecycle.State.f17750c && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state == Lifecycle.State.f17749b) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        I.a aVar = new I.a();
        aVar.f17500a = 10;
        aVar.f17501b = fragment;
        aVar.f17502c = false;
        aVar.f17507h = fragment.mMaxState;
        aVar.f17508i = state;
        b(aVar);
        return this;
    }

    public final void g(int i10) {
        if (this.f17490g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList<I.a> arrayList = this.f17484a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                I.a aVar = arrayList.get(i11);
                Fragment fragment = aVar.f17501b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(aVar.f17501b);
                        int i12 = aVar.f17501b.mBackStackNesting;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.y.k
    public final String getName() {
        return this.f17492i;
    }

    public final void h() {
        ArrayList<I.a> arrayList = this.f17484a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            I.a aVar = arrayList.get(size);
            if (aVar.f17502c) {
                if (aVar.f17500a == 8) {
                    aVar.f17502c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f17501b.mContainerId;
                    aVar.f17500a = 2;
                    aVar.f17502c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        I.a aVar2 = arrayList.get(i11);
                        if (aVar2.f17502c && aVar2.f17501b.mContainerId == i10) {
                            arrayList.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int i() {
        return j(false, true);
    }

    public final int j(boolean z10, boolean z11) {
        if (this.f17570s) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new T());
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.f17570s = true;
        boolean z12 = this.f17490g;
        y yVar = this.f17569r;
        if (z12) {
            this.f17571t = yVar.f17683k.getAndIncrement();
        } else {
            this.f17571t = -1;
        }
        if (z11) {
            yVar.x(this, z10);
        }
        return this.f17571t;
    }

    public final void k(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f17492i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f17571t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f17570s);
            if (this.f17489f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f17489f));
            }
            if (this.f17485b != 0 || this.f17486c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f17485b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f17486c));
            }
            if (this.f17487d != 0 || this.f17488e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f17487d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f17488e));
            }
            if (this.j != 0 || this.f17493k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f17493k);
            }
            if (this.f17494l != 0 || this.f17495m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f17494l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f17495m);
            }
        }
        ArrayList<I.a> arrayList = this.f17484a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            I.a aVar = arrayList.get(i10);
            switch (aVar.f17500a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f17500a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f17501b);
            if (z10) {
                if (aVar.f17503d != 0 || aVar.f17504e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f17503d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f17504e));
                }
                if (aVar.f17505f != 0 || aVar.f17506g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f17505f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f17506g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f17571t >= 0) {
            sb2.append(" #");
            sb2.append(this.f17571t);
        }
        if (this.f17492i != null) {
            sb2.append(" ");
            sb2.append(this.f17492i);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
