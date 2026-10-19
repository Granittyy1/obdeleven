package io.ktor.util.pipeline;

import Ia.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.l;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import p293xa.r;

/* JADX INFO: compiled from: Pipeline.kt */
/* JADX INFO: loaded from: classes.dex */
public class b<TSubject, TContext> {
    private volatile /* synthetic */ Object _interceptors;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P3.b f40560d;

    public b(P3.b... bVarArr) {
        new io.ktor.util.f();
        this.f40557a = l.t(Arrays.copyOf(bVarArr, bVarArr.length));
        this._interceptors = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[LOOP:2: B:33:0x007d->B:34:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[LOOP:1: B:26:0x005b->B:36:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x008e A[EDGE_INSN: B:48:0x008e->B:37:0x008e BREAK  A[LOOP:1: B:26:0x005b->B:36:0x008b], SYNTHETIC] */
    public final Object a(Object context, Object subject, ContinuationImpl continuationImpl) {
        ArrayList arrayList;
        int iR;
        int i10;
        Object obj;
        a aVar;
        List<q<c<TSubject, Call>, TSubject, kotlin.coroutines.c<? super r>, Object>> list;
        int size;
        int i11;
        int iR2;
        kotlin.coroutines.e coroutineContext = continuationImpl.getContext();
        if (((List) this._interceptors) == null) {
            int i12 = this.f40558b;
            if (i12 == 0) {
                this._interceptors = EmptyList.f42983b;
                this.f40559c = false;
                this.f40560d = null;
            } else {
                ArrayList arrayList2 = this.f40557a;
                if (i12 != 1 || (iR2 = l.r(arrayList2)) < 0) {
                    arrayList = new ArrayList();
                    iR = l.r(arrayList2);
                    if (iR >= 0) {
                        i10 = 0;
                        while (true) {
                            obj = arrayList2.get(i10);
                            if (obj instanceof a) {
                                aVar = (a) obj;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                list = aVar.f40555c;
                                arrayList.ensureCapacity(list.size() + arrayList.size());
                                size = list.size();
                                for (i11 = 0; i11 < size; i11++) {
                                    arrayList.add(list.get(i11));
                                }
                            }
                            if (i10 != iR) {
                                break;
                            }
                            i10++;
                        }
                    }
                    this._interceptors = arrayList;
                    this.f40559c = false;
                    this.f40560d = null;
                } else {
                    int i13 = 0;
                    while (true) {
                        Object obj2 = arrayList2.get(i13);
                        a aVar2 = obj2 instanceof a ? (a) obj2 : null;
                        if (aVar2 != null && !aVar2.f40555c.isEmpty()) {
                            Collection collection = aVar2.f40555c;
                            aVar2.f40556d = true;
                            this._interceptors = collection;
                            this.f40559c = false;
                            this.f40560d = aVar2.f40553a;
                        } else if (i13 != iR2) {
                            i13++;
                        } else {
                            arrayList = new ArrayList();
                            iR = l.r(arrayList2);
                            if (iR >= 0) {
                                i10 = 0;
                                while (true) {
                                    obj = arrayList2.get(i10);
                                    if (obj instanceof a) {
                                        aVar = (a) obj;
                                    } else {
                                        aVar = null;
                                    }
                                    if (aVar != null) {
                                        list = aVar.f40555c;
                                        arrayList.ensureCapacity(list.size() + arrayList.size());
                                        size = list.size();
                                        while (i11 < size) {
                                            arrayList.add(list.get(i11));
                                        }
                                    }
                                    if (i10 != iR) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            this._interceptors = arrayList;
                            this.f40559c = false;
                            this.f40560d = null;
                        }
                    }
                }
            }
        }
        this.f40559c = true;
        List list2 = (List) this._interceptors;
        i.b(list2);
        boolean zD = d();
        i.e(context, "context");
        i.e(subject, "subject");
        i.e(coroutineContext, "coroutineContext");
        return ((d.f40562a || zD) ? new DebugPipelineContext(context, list2, subject, coroutineContext) : new h(subject, context, list2)).a(subject, continuationImpl);
    }

    public final a<TSubject, TContext> b(P3.b bVar) {
        ArrayList arrayList = this.f40557a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == bVar) {
                a<TSubject, TContext> aVar = new a<>(bVar, e.c.f40564a);
                arrayList.set(i10, aVar);
                return aVar;
            }
            if (obj instanceof a) {
                a<TSubject, TContext> aVar2 = (a) obj;
                if (aVar2.f40553a == bVar) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final int c(P3.b bVar) {
        ArrayList arrayList = this.f40557a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == bVar || ((obj instanceof a) && ((a) obj).f40553a == bVar)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean d() {
        return false;
    }

    public final boolean e(P3.b bVar) {
        ArrayList arrayList = this.f40557a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == bVar) {
                return true;
            }
            if ((obj instanceof a) && ((a) obj).f40553a == bVar) {
                return true;
            }
        }
        return false;
    }

    public final void f(P3.b phase, q<? super c<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.c<? super r>, ? extends Object> qVar) {
        i.e(phase, "phase");
        a<TSubject, TContext> aVarB = b(phase);
        if (aVarB == null) {
            throw new InvalidPhaseException("Phase " + phase + " was not registered for this pipeline");
        }
        o.d(3, qVar);
        List list = (List) this._interceptors;
        if (!this.f40557a.isEmpty() && list != null && !this.f40559c && (list instanceof List) && (!(list instanceof Ja.a) || (list instanceof Ja.c))) {
            if (i.a(this.f40560d, phase)) {
                list.add(qVar);
            } else if (phase.equals(kotlin.collections.q.V(this.f40557a)) || c(phase) == l.r(this.f40557a)) {
                a<TSubject, TContext> aVarB2 = b(phase);
                i.b(aVarB2);
                aVarB2.a(qVar);
                list.add(qVar);
            }
            this.f40558b++;
            return;
        }
        aVarB.a(qVar);
        this.f40558b++;
        this._interceptors = null;
        this.f40559c = false;
        this.f40560d = null;
    }
}
