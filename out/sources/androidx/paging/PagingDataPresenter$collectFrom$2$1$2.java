package androidx.paging;

import com.google.android.gms.internal.measurement.M1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PagingDataPresenter.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", f = "PagingDataPresenter.kt", l = {141, 158, 170, 173, 225, 228}, m = "invokeSuspend")
final class PagingDataPresenter$collectFrom$2$1$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ PageEvent<Object> $event;
    final /* synthetic */ PagingData<Object> $pagingData;
    int label;
    final /* synthetic */ PagingDataPresenter<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$collectFrom$2$1$2(PageEvent<Object> pageEvent, PagingDataPresenter<Object> pagingDataPresenter, PagingData<Object> pagingData, kotlin.coroutines.c<? super PagingDataPresenter$collectFrom$2$1$2> cVar) {
        super(2, cVar);
        this.$event = pageEvent;
        this.this$0 = pagingDataPresenter;
        this.$pagingData = pagingData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PagingDataPresenter$collectFrom$2$1$2(this.$event, this.this$0, this.$pagingData, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PagingDataPresenter$collectFrom$2$1$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[LOOP:1: B:52:0x011e->B:103:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:58:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0163  */
    /* JADX WARN: Code duplicated, block: B:71:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0181  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fa A[LOOP:0: B:95:0x01f4->B:97:0x01fa, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PagingDataPresenter<Object> pagingDataPresenter;
        C1428d c1428d;
        n nVar;
        boolean z10;
        Iterable iterable;
        Iterator it;
        PagingDataPresenter<Object> pagingDataPresenter2;
        j jVar;
        int i10;
        PagingDataPresenter<Object> pagingDataPresenter3;
        int i11;
        PagingDataPresenter<Object> pagingDataPresenter4;
        u<Object> uVar;
        PagingDataPresenter<Object> pagingDataPresenter5;
        PageEvent<Object> pageEvent;
        Iterator<Ia.a<p293xa.r>> it2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        boolean z11 = true;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                PageEvent<Object> pageEvent2 = this.$event;
                if (pageEvent2 instanceof PageEvent.StaticList) {
                    PagingDataPresenter<Object> pagingDataPresenter6 = this.this$0;
                    List listK = M1.k(new F(0, ((PageEvent.StaticList) this.$event).f19266a));
                    PageEvent.StaticList staticList = (PageEvent.StaticList) this.$event;
                    staticList.getClass();
                    staticList.getClass();
                    staticList.getClass();
                    staticList.getClass();
                    j jVar2 = this.$pagingData.f19290c;
                    this.label = 1;
                    if (PagingDataPresenter.a(pagingDataPresenter6, listK, 0, 0, false, null, null, jVar2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    boolean z12 = pageEvent2 instanceof PageEvent.Insert;
                    if (z12) {
                        PageEvent.Insert insert = (PageEvent.Insert) pageEvent2;
                        if (insert.f19260a == LoadType.f19252b) {
                            PagingDataPresenter<Object> pagingDataPresenter7 = this.this$0;
                            List<F<T>> list = insert.f19261b;
                            int i12 = insert.f19262c;
                            int i13 = insert.f19263d;
                            n nVar2 = insert.f19264e;
                            n nVar3 = insert.f19265f;
                            j jVar3 = this.$pagingData.f19290c;
                            this.label = 2;
                            if (PagingDataPresenter.a(pagingDataPresenter7, list, i12, i13, true, nVar2, nVar3, jVar3, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if (z12) {
                            if (((Boolean) this.this$0.j.getValue()).booleanValue()) {
                                this.label = 3;
                                if (S4.o.r(this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            pagingDataPresenter = this.this$0;
                            pagingDataPresenter.f19296d.g(this.$event);
                            this.label = 4;
                            if (pagingDataPresenter.c() == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = this.this$0.f19297e;
                            PageEvent.Insert insert2 = (PageEvent.Insert) this.$event;
                            mutableCombinedLoadStateCollection.d(insert2.f19264e, insert2.f19265f);
                            c1428d = (C1428d) this.this$0.f19297e.f19258c.f43418b.getValue();
                            if (c1428d != null) {
                                nVar = c1428d.f19342d;
                            } else {
                                nVar = null;
                            }
                            if (nVar != null) {
                                throw new IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                            }
                            boolean z13 = nVar.f19377b.f19370a;
                            boolean z14 = nVar.f19378c.f19370a;
                            PageEvent.Insert insert3 = (PageEvent.Insert) this.$event;
                            LoadType loadType = insert3.f19260a;
                            z10 = (loadType == LoadType.f19253c || !z13) && !(loadType == LoadType.f19254d && z14);
                            iterable = insert3.f19261b;
                            if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    if (!((F) it.next()).f19232b.isEmpty()) {
                                        z11 = false;
                                    }
                                }
                            }
                            if (!z10) {
                                this.this$0.f19300h = false;
                            } else if (this.this$0.f19300h || z11) {
                                if (z11) {
                                    pagingDataPresenter2 = this.this$0;
                                    jVar = pagingDataPresenter2.f19294b;
                                    if (jVar != null) {
                                        jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                    }
                                } else {
                                    i10 = this.this$0.f19301i;
                                    pagingDataPresenter3 = this.this$0;
                                    if (i10 >= pagingDataPresenter3.f19296d.f19429c) {
                                        i11 = pagingDataPresenter3.f19301i;
                                        pagingDataPresenter4 = this.this$0;
                                        uVar = pagingDataPresenter4.f19296d;
                                        if (i11 > uVar.f19429c + uVar.f19428b) {
                                            pagingDataPresenter2 = this.this$0;
                                            jVar = pagingDataPresenter2.f19294b;
                                            if (jVar != null) {
                                                jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                            }
                                        } else {
                                            pagingDataPresenter4.f19300h = false;
                                        }
                                    } else {
                                        pagingDataPresenter2 = this.this$0;
                                        jVar = pagingDataPresenter2.f19294b;
                                        if (jVar != null) {
                                            jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                        }
                                    }
                                }
                            }
                        } else if (pageEvent2 instanceof PageEvent.a) {
                            if (((Boolean) this.this$0.j.getValue()).booleanValue()) {
                                this.label = 5;
                                if (S4.o.r(this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            pagingDataPresenter5 = this.this$0;
                            pagingDataPresenter5.f19296d.g(this.$event);
                            this.label = 6;
                            if (pagingDataPresenter5.c() == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            final MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection2 = this.this$0.f19297e;
                            final LoadType type = ((PageEvent.a) this.$event).f19267a;
                            mutableCombinedLoadStateCollection2.getClass();
                            kotlin.jvm.internal.i.e(type, "type");
                            mutableCombinedLoadStateCollection2.c(new Ia.l<C1428d, C1428d>() { // from class: androidx.paging.MutableCombinedLoadStateCollection$set$2
                                final /* synthetic */ boolean $remote;
                                final /* synthetic */ m $state;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                    m.c cVar = m.c.f19374c;
                                    this.$remote = false;
                                    this.$state = cVar;
                                }

                                @Override // Ia.l
                                public final C1428d invoke(C1428d c1428d2) {
                                    n nVarB;
                                    C1428d c1428d3 = c1428d2;
                                    if (c1428d3 == null || (nVarB = c1428d3.f19342d) == null) {
                                        nVarB = n.f19375d;
                                    }
                                    n nVarB2 = c1428d3 != null ? c1428d3.f19343e : null;
                                    if (this.$remote) {
                                        nVarB2 = n.f19375d.b(type, this.$state);
                                    } else {
                                        nVarB = nVarB.b(type, this.$state);
                                    }
                                    return MutableCombinedLoadStateCollection.a(mutableCombinedLoadStateCollection2, c1428d3, nVarB, nVarB2);
                                }
                            });
                            this.this$0.f19300h = false;
                        } else if (pageEvent2 instanceof PageEvent.b) {
                            PageEvent.b bVar = (PageEvent.b) pageEvent2;
                            this.this$0.f19297e.d(bVar.f19271a, bVar.f19272b);
                        }
                    } else if (z12) {
                        if (((Boolean) this.this$0.j.getValue()).booleanValue()) {
                            this.label = 3;
                            if (S4.o.r(this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        pagingDataPresenter = this.this$0;
                        pagingDataPresenter.f19296d.g(this.$event);
                        this.label = 4;
                        if (pagingDataPresenter.c() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection3 = this.this$0.f19297e;
                        PageEvent.Insert insert4 = (PageEvent.Insert) this.$event;
                        mutableCombinedLoadStateCollection3.d(insert4.f19264e, insert4.f19265f);
                        c1428d = (C1428d) this.this$0.f19297e.f19258c.f43418b.getValue();
                        if (c1428d != null) {
                            nVar = c1428d.f19342d;
                        } else {
                            nVar = null;
                        }
                        if (nVar != null) {
                            throw new IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                        }
                        boolean z15 = nVar.f19377b.f19370a;
                        boolean z16 = nVar.f19378c.f19370a;
                        PageEvent.Insert insert5 = (PageEvent.Insert) this.$event;
                        LoadType loadType2 = insert5.f19260a;
                        if (loadType2 == LoadType.f19253c) {
                        }
                        iterable = insert5.f19261b;
                        if (iterable instanceof Collection) {
                            it = iterable.iterator();
                            while (it.hasNext()) {
                                if (!((F) it.next()).f19232b.isEmpty()) {
                                    z11 = false;
                                }
                            }
                        } else {
                            it = iterable.iterator();
                            while (it.hasNext()) {
                                if (!((F) it.next()).f19232b.isEmpty()) {
                                    z11 = false;
                                }
                            }
                        }
                        if (!z10) {
                            this.this$0.f19300h = false;
                        } else if (this.this$0.f19300h) {
                            if (z11) {
                                i10 = this.this$0.f19301i;
                                pagingDataPresenter3 = this.this$0;
                                if (i10 >= pagingDataPresenter3.f19296d.f19429c) {
                                    i11 = pagingDataPresenter3.f19301i;
                                    pagingDataPresenter4 = this.this$0;
                                    uVar = pagingDataPresenter4.f19296d;
                                    if (i11 > uVar.f19429c + uVar.f19428b) {
                                        pagingDataPresenter2 = this.this$0;
                                        jVar = pagingDataPresenter2.f19294b;
                                        if (jVar != null) {
                                            jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                        }
                                    } else {
                                        pagingDataPresenter4.f19300h = false;
                                    }
                                } else {
                                    pagingDataPresenter2 = this.this$0;
                                    jVar = pagingDataPresenter2.f19294b;
                                    if (jVar != null) {
                                        jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                    }
                                }
                            } else {
                                pagingDataPresenter2 = this.this$0;
                                jVar = pagingDataPresenter2.f19294b;
                                if (jVar != null) {
                                    jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                }
                            }
                        } else if (z11) {
                            i10 = this.this$0.f19301i;
                            pagingDataPresenter3 = this.this$0;
                            if (i10 >= pagingDataPresenter3.f19296d.f19429c) {
                                i11 = pagingDataPresenter3.f19301i;
                                pagingDataPresenter4 = this.this$0;
                                uVar = pagingDataPresenter4.f19296d;
                                if (i11 > uVar.f19429c + uVar.f19428b) {
                                    pagingDataPresenter2 = this.this$0;
                                    jVar = pagingDataPresenter2.f19294b;
                                    if (jVar != null) {
                                        jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                    }
                                } else {
                                    pagingDataPresenter4.f19300h = false;
                                }
                            } else {
                                pagingDataPresenter2 = this.this$0;
                                jVar = pagingDataPresenter2.f19294b;
                                if (jVar != null) {
                                    jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                }
                            }
                        } else {
                            pagingDataPresenter2 = this.this$0;
                            jVar = pagingDataPresenter2.f19294b;
                            if (jVar != null) {
                                jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                            }
                        }
                    } else if (pageEvent2 instanceof PageEvent.a) {
                        if (((Boolean) this.this$0.j.getValue()).booleanValue()) {
                            this.label = 5;
                            if (S4.o.r(this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        pagingDataPresenter5 = this.this$0;
                        pagingDataPresenter5.f19296d.g(this.$event);
                        this.label = 6;
                        if (pagingDataPresenter5.c() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        final MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection4 = this.this$0.f19297e;
                        final LoadType type2 = ((PageEvent.a) this.$event).f19267a;
                        mutableCombinedLoadStateCollection4.getClass();
                        kotlin.jvm.internal.i.e(type2, "type");
                        mutableCombinedLoadStateCollection4.c(new Ia.l<C1428d, C1428d>() { // from class: androidx.paging.MutableCombinedLoadStateCollection$set$2
                            final /* synthetic */ boolean $remote;
                            final /* synthetic */ m $state;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                                m.c cVar = m.c.f19374c;
                                this.$remote = false;
                                this.$state = cVar;
                            }

                            @Override // Ia.l
                            public final C1428d invoke(C1428d c1428d2) {
                                n nVarB;
                                C1428d c1428d3 = c1428d2;
                                if (c1428d3 == null || (nVarB = c1428d3.f19342d) == null) {
                                    nVarB = n.f19375d;
                                }
                                n nVarB2 = c1428d3 != null ? c1428d3.f19343e : null;
                                if (this.$remote) {
                                    nVarB2 = n.f19375d.b(type2, this.$state);
                                } else {
                                    nVarB = nVarB.b(type2, this.$state);
                                }
                                return MutableCombinedLoadStateCollection.a(mutableCombinedLoadStateCollection4, c1428d3, nVarB, nVarB2);
                            }
                        });
                        this.this$0.f19300h = false;
                    } else if (pageEvent2 instanceof PageEvent.b) {
                        PageEvent.b bVar2 = (PageEvent.b) pageEvent2;
                        this.this$0.f19297e.d(bVar2.f19271a, bVar2.f19272b);
                    }
                }
                pageEvent = this.$event;
                if ((pageEvent instanceof PageEvent.Insert) || (pageEvent instanceof PageEvent.a) || (pageEvent instanceof PageEvent.StaticList)) {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                }
                return p293xa.r.f47939a;
            case 1:
            case 2:
                kotlin.b.b(obj);
                pageEvent = this.$event;
                if (pageEvent instanceof PageEvent.Insert) {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                } else {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                }
                return p293xa.r.f47939a;
            case 3:
                kotlin.b.b(obj);
                pagingDataPresenter = this.this$0;
                pagingDataPresenter.f19296d.g(this.$event);
                this.label = 4;
                if (pagingDataPresenter.c() == coroutineSingletons) {
                    return coroutineSingletons;
                }
                MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection5 = this.this$0.f19297e;
                PageEvent.Insert insert6 = (PageEvent.Insert) this.$event;
                mutableCombinedLoadStateCollection5.d(insert6.f19264e, insert6.f19265f);
                c1428d = (C1428d) this.this$0.f19297e.f19258c.f43418b.getValue();
                if (c1428d != null) {
                    nVar = c1428d.f19342d;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    throw new IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                }
                boolean z17 = nVar.f19377b.f19370a;
                boolean z18 = nVar.f19378c.f19370a;
                PageEvent.Insert insert7 = (PageEvent.Insert) this.$event;
                LoadType loadType3 = insert7.f19260a;
                if (loadType3 == LoadType.f19253c) {
                }
                iterable = insert7.f19261b;
                if (iterable instanceof Collection) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (!((F) it.next()).f19232b.isEmpty()) {
                            z11 = false;
                        }
                    }
                } else {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (!((F) it.next()).f19232b.isEmpty()) {
                            z11 = false;
                        }
                    }
                }
                if (!z10) {
                    this.this$0.f19300h = false;
                } else if (this.this$0.f19300h) {
                    if (z11) {
                        i10 = this.this$0.f19301i;
                        pagingDataPresenter3 = this.this$0;
                        if (i10 >= pagingDataPresenter3.f19296d.f19429c) {
                            i11 = pagingDataPresenter3.f19301i;
                            pagingDataPresenter4 = this.this$0;
                            uVar = pagingDataPresenter4.f19296d;
                            if (i11 > uVar.f19429c + uVar.f19428b) {
                                pagingDataPresenter2 = this.this$0;
                                jVar = pagingDataPresenter2.f19294b;
                                if (jVar != null) {
                                    jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                }
                            } else {
                                pagingDataPresenter4.f19300h = false;
                            }
                        } else {
                            pagingDataPresenter2 = this.this$0;
                            jVar = pagingDataPresenter2.f19294b;
                            if (jVar != null) {
                                jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                            }
                        }
                    } else {
                        pagingDataPresenter2 = this.this$0;
                        jVar = pagingDataPresenter2.f19294b;
                        if (jVar != null) {
                            jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                        }
                    }
                } else if (z11) {
                    i10 = this.this$0.f19301i;
                    pagingDataPresenter3 = this.this$0;
                    if (i10 >= pagingDataPresenter3.f19296d.f19429c) {
                        i11 = pagingDataPresenter3.f19301i;
                        pagingDataPresenter4 = this.this$0;
                        uVar = pagingDataPresenter4.f19296d;
                        if (i11 > uVar.f19429c + uVar.f19428b) {
                            pagingDataPresenter2 = this.this$0;
                            jVar = pagingDataPresenter2.f19294b;
                            if (jVar != null) {
                                jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                            }
                        } else {
                            pagingDataPresenter4.f19300h = false;
                        }
                    } else {
                        pagingDataPresenter2 = this.this$0;
                        jVar = pagingDataPresenter2.f19294b;
                        if (jVar != null) {
                            jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                        }
                    }
                } else {
                    pagingDataPresenter2 = this.this$0;
                    jVar = pagingDataPresenter2.f19294b;
                    if (jVar != null) {
                        jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                    }
                }
                pageEvent = this.$event;
                if (pageEvent instanceof PageEvent.Insert) {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                } else {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                }
                return p293xa.r.f47939a;
            case 4:
                kotlin.b.b(obj);
                MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection6 = this.this$0.f19297e;
                PageEvent.Insert insert8 = (PageEvent.Insert) this.$event;
                mutableCombinedLoadStateCollection6.d(insert8.f19264e, insert8.f19265f);
                c1428d = (C1428d) this.this$0.f19297e.f19258c.f43418b.getValue();
                if (c1428d != null) {
                    nVar = c1428d.f19342d;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    throw new IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                }
                boolean z19 = nVar.f19377b.f19370a;
                boolean z110 = nVar.f19378c.f19370a;
                PageEvent.Insert insert9 = (PageEvent.Insert) this.$event;
                LoadType loadType4 = insert9.f19260a;
                if (loadType4 == LoadType.f19253c) {
                }
                iterable = insert9.f19261b;
                if (iterable instanceof Collection) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (!((F) it.next()).f19232b.isEmpty()) {
                            z11 = false;
                        }
                    }
                } else {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (!((F) it.next()).f19232b.isEmpty()) {
                            z11 = false;
                        }
                    }
                }
                if (!z10) {
                    this.this$0.f19300h = false;
                } else if (this.this$0.f19300h) {
                    if (z11) {
                        i10 = this.this$0.f19301i;
                        pagingDataPresenter3 = this.this$0;
                        if (i10 >= pagingDataPresenter3.f19296d.f19429c) {
                            i11 = pagingDataPresenter3.f19301i;
                            pagingDataPresenter4 = this.this$0;
                            uVar = pagingDataPresenter4.f19296d;
                            if (i11 > uVar.f19429c + uVar.f19428b) {
                                pagingDataPresenter2 = this.this$0;
                                jVar = pagingDataPresenter2.f19294b;
                                if (jVar != null) {
                                    jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                                }
                            } else {
                                pagingDataPresenter4.f19300h = false;
                            }
                        } else {
                            pagingDataPresenter2 = this.this$0;
                            jVar = pagingDataPresenter2.f19294b;
                            if (jVar != null) {
                                jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                            }
                        }
                    } else {
                        pagingDataPresenter2 = this.this$0;
                        jVar = pagingDataPresenter2.f19294b;
                        if (jVar != null) {
                            jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                        }
                    }
                } else if (z11) {
                    i10 = this.this$0.f19301i;
                    pagingDataPresenter3 = this.this$0;
                    if (i10 >= pagingDataPresenter3.f19296d.f19429c) {
                        i11 = pagingDataPresenter3.f19301i;
                        pagingDataPresenter4 = this.this$0;
                        uVar = pagingDataPresenter4.f19296d;
                        if (i11 > uVar.f19429c + uVar.f19428b) {
                            pagingDataPresenter2 = this.this$0;
                            jVar = pagingDataPresenter2.f19294b;
                            if (jVar != null) {
                                jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                            }
                        } else {
                            pagingDataPresenter4.f19300h = false;
                        }
                    } else {
                        pagingDataPresenter2 = this.this$0;
                        jVar = pagingDataPresenter2.f19294b;
                        if (jVar != null) {
                            jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                        }
                    }
                } else {
                    pagingDataPresenter2 = this.this$0;
                    jVar = pagingDataPresenter2.f19294b;
                    if (jVar != null) {
                        jVar.a(pagingDataPresenter2.f19296d.d(pagingDataPresenter2.f19301i));
                    }
                }
                pageEvent = this.$event;
                if (pageEvent instanceof PageEvent.Insert) {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                } else {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                }
                return p293xa.r.f47939a;
            case 5:
                kotlin.b.b(obj);
                pagingDataPresenter5 = this.this$0;
                pagingDataPresenter5.f19296d.g(this.$event);
                this.label = 6;
                if (pagingDataPresenter5.c() == coroutineSingletons) {
                    return coroutineSingletons;
                }
                final MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection7 = this.this$0.f19297e;
                final LoadType type3 = ((PageEvent.a) this.$event).f19267a;
                mutableCombinedLoadStateCollection7.getClass();
                kotlin.jvm.internal.i.e(type3, "type");
                mutableCombinedLoadStateCollection7.c(new Ia.l<C1428d, C1428d>() { // from class: androidx.paging.MutableCombinedLoadStateCollection$set$2
                    final /* synthetic */ boolean $remote;
                    final /* synthetic */ m $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        m.c cVar = m.c.f19374c;
                        this.$remote = false;
                        this.$state = cVar;
                    }

                    @Override // Ia.l
                    public final C1428d invoke(C1428d c1428d2) {
                        n nVarB;
                        C1428d c1428d3 = c1428d2;
                        if (c1428d3 == null || (nVarB = c1428d3.f19342d) == null) {
                            nVarB = n.f19375d;
                        }
                        n nVarB2 = c1428d3 != null ? c1428d3.f19343e : null;
                        if (this.$remote) {
                            nVarB2 = n.f19375d.b(type3, this.$state);
                        } else {
                            nVarB = nVarB.b(type3, this.$state);
                        }
                        return MutableCombinedLoadStateCollection.a(mutableCombinedLoadStateCollection7, c1428d3, nVarB, nVarB2);
                    }
                });
                this.this$0.f19300h = false;
                pageEvent = this.$event;
                if (pageEvent instanceof PageEvent.Insert) {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                } else {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                }
                return p293xa.r.f47939a;
            case 6:
                kotlin.b.b(obj);
                final MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection8 = this.this$0.f19297e;
                final LoadType type4 = ((PageEvent.a) this.$event).f19267a;
                mutableCombinedLoadStateCollection8.getClass();
                kotlin.jvm.internal.i.e(type4, "type");
                mutableCombinedLoadStateCollection8.c(new Ia.l<C1428d, C1428d>() { // from class: androidx.paging.MutableCombinedLoadStateCollection$set$2
                    final /* synthetic */ boolean $remote;
                    final /* synthetic */ m $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        m.c cVar = m.c.f19374c;
                        this.$remote = false;
                        this.$state = cVar;
                    }

                    @Override // Ia.l
                    public final C1428d invoke(C1428d c1428d2) {
                        n nVarB;
                        C1428d c1428d3 = c1428d2;
                        if (c1428d3 == null || (nVarB = c1428d3.f19342d) == null) {
                            nVarB = n.f19375d;
                        }
                        n nVarB2 = c1428d3 != null ? c1428d3.f19343e : null;
                        if (this.$remote) {
                            nVarB2 = n.f19375d.b(type4, this.$state);
                        } else {
                            nVarB = nVarB.b(type4, this.$state);
                        }
                        return MutableCombinedLoadStateCollection.a(mutableCombinedLoadStateCollection8, c1428d3, nVarB, nVarB2);
                    }
                });
                this.this$0.f19300h = false;
                pageEvent = this.$event;
                if (pageEvent instanceof PageEvent.Insert) {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                } else {
                    it2 = this.this$0.f19298f.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                }
                return p293xa.r.f47939a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
