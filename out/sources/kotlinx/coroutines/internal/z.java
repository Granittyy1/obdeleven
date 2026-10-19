package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.V;
import kotlinx.coroutines.internal.A;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes2.dex */
public class z<T extends A & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43507b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f43508a;

    public final void a(V.c cVar) {
        cVar.a((V.d) this);
        T[] tArr = this.f43508a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f43507b;
        if (tArr == null) {
            tArr = (T[]) new A[4];
            this.f43508a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            tArr = (T[]) ((A[]) objArrCopyOf);
            this.f43508a = tArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        tArr[i10] = cVar;
        cVar.f43217c = i10;
        c(i10);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[LOOP:0: B:9:0x003c->B:21:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[EDGE_INSN: B:24:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final T b(int i10) {
        int i11;
        int i12;
        T[] tArr;
        int i13;
        T t8;
        T t10;
        T t11;
        T t12;
        T[] tArr2 = this.f43508a;
        kotlin.jvm.internal.i.b(tArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f43507b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            d(i10, atomicIntegerFieldUpdater.get(this));
            int i14 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t13 = tArr2[i10];
                kotlin.jvm.internal.i.b(t13);
                T t14 = tArr2[i14];
                kotlin.jvm.internal.i.b(t14);
                if (((Comparable) t13).compareTo(t14) < 0) {
                    d(i10, i14);
                    c(i14);
                } else {
                    while (true) {
                        i11 = i10 * 2;
                        i12 = i11 + 1;
                        if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        tArr = this.f43508a;
                        kotlin.jvm.internal.i.b(tArr);
                        i13 = i11 + 2;
                        if (i13 < atomicIntegerFieldUpdater.get(this)) {
                            t11 = tArr[i13];
                            kotlin.jvm.internal.i.b(t11);
                            t12 = tArr[i12];
                            kotlin.jvm.internal.i.b(t12);
                            if (((Comparable) t11).compareTo(t12) >= 0) {
                                i13 = i12;
                            }
                        } else {
                            i13 = i12;
                        }
                        t8 = tArr[i10];
                        kotlin.jvm.internal.i.b(t8);
                        t10 = tArr[i13];
                        kotlin.jvm.internal.i.b(t10);
                        if (((Comparable) t8).compareTo(t10) <= 0) {
                            break;
                        }
                        d(i10, i13);
                        i10 = i13;
                    }
                }
            } else {
                while (true) {
                    i11 = i10 * 2;
                    i12 = i11 + 1;
                    if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    tArr = this.f43508a;
                    kotlin.jvm.internal.i.b(tArr);
                    i13 = i11 + 2;
                    if (i13 < atomicIntegerFieldUpdater.get(this)) {
                        t11 = tArr[i13];
                        kotlin.jvm.internal.i.b(t11);
                        t12 = tArr[i12];
                        kotlin.jvm.internal.i.b(t12);
                        if (((Comparable) t11).compareTo(t12) >= 0) {
                            i13 = i12;
                        }
                    } else {
                        i13 = i12;
                    }
                    t8 = tArr[i10];
                    kotlin.jvm.internal.i.b(t8);
                    t10 = tArr[i13];
                    kotlin.jvm.internal.i.b(t10);
                    if (((Comparable) t8).compareTo(t10) <= 0) {
                        break;
                        break;
                    }
                    d(i10, i13);
                    i10 = i13;
                }
            }
        }
        T t15 = tArr2[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.i.b(t15);
        t15.a(null);
        t15.setIndex(-1);
        tArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return t15;
    }

    public final void c(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f43508a;
            kotlin.jvm.internal.i.b(tArr);
            int i11 = (i10 - 1) / 2;
            T t8 = tArr[i11];
            kotlin.jvm.internal.i.b(t8);
            T t10 = tArr[i10];
            kotlin.jvm.internal.i.b(t10);
            if (((Comparable) t8).compareTo(t10) <= 0) {
                return;
            }
            d(i10, i11);
            i10 = i11;
        }
    }

    public final void d(int i10, int i11) {
        T[] tArr = this.f43508a;
        kotlin.jvm.internal.i.b(tArr);
        T t8 = tArr[i11];
        kotlin.jvm.internal.i.b(t8);
        T t10 = tArr[i10];
        kotlin.jvm.internal.i.b(t10);
        tArr[i10] = t8;
        tArr[i11] = t10;
        t8.setIndex(i10);
        t10.setIndex(i11);
    }
}
