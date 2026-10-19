package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle, R.styleable.AppCompatTheme_borderlessButtonStyle, R.styleable.AppCompatTheme_checkedTextViewStyle, R.styleable.AppCompatTheme_colorControlNormal, R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invokeSuspend")
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Ia.p<kotlin.sequences.i<? super List<Object>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Iterator<Object> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i10, int i11, Iterator<Object> it, boolean z10, boolean z11, kotlin.coroutines.c<? super SlidingWindowKt$windowedIterator$1> cVar) {
        super(2, cVar);
        this.$size = i10;
        this.$step = i11;
        this.$iterator = it;
        this.$reuseBuffer = z10;
        this.$partialWindows = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, cVar);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlin.sequences.i<? super List<Object>> iVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SlidingWindowKt$windowedIterator$1) create(iVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x0161  */
    /* JADX WARN: Code duplicated, block: B:76:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0167  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0180  */
    /* JADX WARN: Code duplicated, block: B:86:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0091 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.sequences.i iVar;
        A a10;
        Iterator<Object> it;
        ArrayList arrayList;
        Iterator<Object> it2;
        kotlin.sequences.i iVar2;
        int i10;
        int i11;
        Object next;
        A a11;
        kotlin.sequences.i iVar3;
        Object next2;
        int iE;
        int i12;
        Object[] objArr;
        int i13;
        int i14;
        Object arrayList2;
        int i15;
        Object[] array;
        Object arrayList3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i16 = this.label;
        if (i16 == 0) {
            kotlin.b.b(obj);
            iVar = (kotlin.sequences.i) this.L$0;
            int i17 = this.$size;
            int i18 = i17 <= 1024 ? i17 : 1024;
            int i19 = this.$step - i17;
            if (i19 >= 0) {
                arrayList = new ArrayList(i18);
                it2 = this.$iterator;
                iVar2 = iVar;
                i10 = i19;
                i11 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i11 > 0) {
                        i11--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == this.$size) {
                            this.L$0 = iVar2;
                            this.L$1 = arrayList;
                            this.L$2 = it2;
                            this.I$0 = i10;
                            this.label = 1;
                            iVar2.a(arrayList, this);
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f43038b;
                            return coroutineSingletons;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    iVar2.a(arrayList, this);
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.f43038b;
                    return coroutineSingletons;
                }
            } else {
                a10 = new A(0, new Object[i18]);
                it = this.$iterator;
                while (it.hasNext()) {
                    next2 = it.next();
                    iE = a10.e();
                    i12 = a10.f42977c;
                    if (iE != i12) {
                        throw new IllegalStateException("ring buffer is full");
                    }
                    int i20 = a10.f42978d;
                    int i21 = a10.f42979e;
                    objArr = a10.f42976b;
                    objArr[(i20 + i21) % i12] = next2;
                    a10.f42979e = i21 + 1;
                    if (a10.e() == i12) {
                        i13 = a10.f42979e;
                        i14 = this.$size;
                        if (i13 < i14) {
                            if (this.$reuseBuffer) {
                                arrayList2 = a10;
                            } else {
                                arrayList2 = new ArrayList(a10);
                            }
                            this.L$0 = iVar;
                            this.L$1 = a10;
                            this.L$2 = it;
                            this.label = 3;
                            iVar.a(arrayList2, this);
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.f43038b;
                            return coroutineSingletons;
                        }
                        i15 = i12 + (i12 >> 1) + 1;
                        if (i15 <= i14) {
                            i14 = i15;
                        }
                        if (a10.f42978d == 0) {
                            array = Arrays.copyOf(objArr, i14);
                            kotlin.jvm.internal.i.d(array, "copyOf(...)");
                        } else {
                            array = a10.toArray(new Object[i14]);
                        }
                        a10 = new A(a10.f42979e, array);
                    }
                }
                if (this.$partialWindows) {
                    a11 = a10;
                    iVar3 = iVar;
                    if (a11.f42979e > this.$step) {
                        if (this.$reuseBuffer) {
                            arrayList3 = a11;
                        } else {
                            arrayList3 = new ArrayList(a11);
                        }
                        this.L$0 = iVar3;
                        this.L$1 = a11;
                        this.L$2 = null;
                        this.label = 4;
                        iVar3.a(arrayList3, this);
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.f43038b;
                        return coroutineSingletons;
                    }
                    if (!a11.isEmpty()) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        iVar3.a(a11, this);
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.f43038b;
                        return coroutineSingletons;
                    }
                }
            }
        } else if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    Iterator<Object> it3 = (Iterator) this.L$2;
                    A a12 = (A) this.L$1;
                    kotlin.sequences.i iVar4 = (kotlin.sequences.i) this.L$0;
                    kotlin.b.b(obj);
                    a12.k(this.$step);
                    iVar = iVar4;
                    it = it3;
                    a10 = a12;
                    while (it.hasNext()) {
                        next2 = it.next();
                        iE = a10.e();
                        i12 = a10.f42977c;
                        if (iE != i12) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i22 = a10.f42978d;
                        int i23 = a10.f42979e;
                        objArr = a10.f42976b;
                        objArr[(i22 + i23) % i12] = next2;
                        a10.f42979e = i23 + 1;
                        if (a10.e() == i12) {
                            i13 = a10.f42979e;
                            i14 = this.$size;
                            if (i13 < i14) {
                                if (this.$reuseBuffer) {
                                    arrayList2 = a10;
                                } else {
                                    arrayList2 = new ArrayList(a10);
                                }
                                this.L$0 = iVar;
                                this.L$1 = a10;
                                this.L$2 = it;
                                this.label = 3;
                                iVar.a(arrayList2, this);
                                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.f43038b;
                                return coroutineSingletons;
                            }
                            i15 = i12 + (i12 >> 1) + 1;
                            if (i15 <= i14) {
                                i14 = i15;
                            }
                            if (a10.f42978d == 0) {
                                array = Arrays.copyOf(objArr, i14);
                                kotlin.jvm.internal.i.d(array, "copyOf(...)");
                            } else {
                                array = a10.toArray(new Object[i14]);
                            }
                            a10 = new A(a10.f42979e, array);
                        }
                    }
                    if (this.$partialWindows) {
                        a11 = a10;
                        iVar3 = iVar;
                    }
                } else if (i16 == 4) {
                    a11 = (A) this.L$1;
                    iVar3 = (kotlin.sequences.i) this.L$0;
                    kotlin.b.b(obj);
                    a11.k(this.$step);
                } else if (i16 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (a11.f42979e > this.$step) {
                    if (this.$reuseBuffer) {
                        arrayList3 = a11;
                    } else {
                        arrayList3 = new ArrayList(a11);
                    }
                    this.L$0 = iVar3;
                    this.L$1 = a11;
                    this.L$2 = null;
                    this.label = 4;
                    iVar3.a(arrayList3, this);
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.f43038b;
                    return coroutineSingletons;
                }
                if (!a11.isEmpty()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    iVar3.a(a11, this);
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.f43038b;
                    return coroutineSingletons;
                }
            }
            kotlin.b.b(obj);
        } else {
            i11 = this.I$0;
            it2 = (Iterator) this.L$2;
            arrayList = (ArrayList) this.L$1;
            iVar2 = (kotlin.sequences.i) this.L$0;
            kotlin.b.b(obj);
            if (this.$reuseBuffer) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(this.$size);
            }
            i10 = i11;
            while (it2.hasNext()) {
                next = it2.next();
                if (i11 > 0) {
                    i11--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == this.$size) {
                        this.L$0 = iVar2;
                        this.L$1 = arrayList;
                        this.L$2 = it2;
                        this.I$0 = i10;
                        this.label = 1;
                        iVar2.a(arrayList, this);
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.f43038b;
                        return coroutineSingletons;
                    }
                }
            }
            if (!arrayList.isEmpty() && (this.$partialWindows || arrayList.size() == this.$size)) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                iVar2.a(arrayList, this);
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.f43038b;
                return coroutineSingletons;
            }
        }
        return p293xa.r.f47939a;
    }
}
