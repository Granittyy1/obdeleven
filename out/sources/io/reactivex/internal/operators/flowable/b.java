package io.reactivex.internal.operators.flowable;

import androidx.compose.ui.text.font.s;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: FlowableDoOnEach.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f40738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qa.a.c f40739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qa.a.b f40740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qa.a.b f40741g;

    /* JADX INFO: compiled from: FlowableDoOnEach.java */
    public static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final s f40742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final qa.a.c f40743h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final qa.a.b f40744i;
        public final qa.a.b j;

        public a(ra.a aVar, s sVar, qa.a.c cVar, qa.a.b bVar, qa.a.b bVar2) {
            super(aVar);
            this.f40742g = sVar;
            this.f40743h = cVar;
            this.f40744i = bVar;
            this.j = bVar2;
        }

        @Override // io.reactivex.internal.subscribers.a, bc.b
        public final void a() {
            if (this.f40959e) {
                return;
            }
            try {
                this.f40744i.getClass();
                this.f40959e = true;
                this.f40956b.a();
                try {
                    this.j.getClass();
                } catch (Throwable th) {
                    Fa.d.g(th);
                    p231sa.a.c(th);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // bc.b
        public final void c(T t8) {
            if (this.f40959e) {
                return;
            }
            int i10 = this.f40960f;
            ra.a<? super R> aVar = this.f40956b;
            if (i10 != 0) {
                aVar.c(null);
                return;
            }
            try {
                this.f40742g.a(t8);
                aVar.c((Object) t8);
            } catch (Throwable th) {
                b(th);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ra.a
        public final boolean f(T t8) {
            if (this.f40959e) {
                return false;
            }
            try {
                this.f40742g.a(t8);
                return this.f40956b.f((Object) t8);
            } catch (Throwable th) {
                b(th);
                return false;
            }
        }

        @Override // io.reactivex.internal.subscribers.a, bc.b
        public final void onError(Throwable th) {
            p123ja.g gVar = this.f40956b;
            if (this.f40959e) {
                p231sa.a.c(th);
                return;
            }
            this.f40959e = true;
            try {
                this.f40743h.getClass();
                gVar.onError(th);
            } catch (Throwable th2) {
                Fa.d.g(th2);
                gVar.onError(new CompositeException(th, th2));
            }
            try {
                this.j.getClass();
            } catch (Throwable th3) {
                Fa.d.g(th3);
                p231sa.a.c(th3);
            }
        }

        @Override // ra.j
        public final T poll() throws Exception {
            qa.a.c cVar = this.f40743h;
            try {
                T tPoll = this.f40958d.poll();
                qa.a.b bVar = this.j;
                if (tPoll != null) {
                    try {
                        this.f40742g.a(tPoll);
                        bVar.getClass();
                    } catch (Throwable th) {
                        try {
                            Fa.d.g(th);
                            try {
                                cVar.getClass();
                                Throwable th2 = ExceptionHelper.f40974a;
                                if (th instanceof Exception) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th3) {
                                throw new CompositeException(th, th3);
                            }
                        } catch (Throwable th4) {
                            bVar.getClass();
                            throw th4;
                        }
                    }
                } else if (this.f40960f == 1) {
                    this.f40744i.getClass();
                    bVar.getClass();
                }
                return tPoll;
            } catch (Throwable th5) {
                Fa.d.g(th5);
                try {
                    cVar.getClass();
                    Throwable th6 = ExceptionHelper.f40974a;
                    if (th5 instanceof Exception) {
                        throw th5;
                    }
                    throw th5;
                } catch (Throwable th7) {
                    throw new CompositeException(th5, th7);
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlowableDoOnEach.java */
    public static final class C0461b<T> extends io.reactivex.internal.subscribers.b<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final s f40745g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final qa.a.c f40746h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final qa.a.b f40747i;
        public final qa.a.b j;

        public C0461b(p123ja.g gVar, s sVar, qa.a.c cVar, qa.a.b bVar, qa.a.b bVar2) {
            super(gVar);
            this.f40745g = sVar;
            this.f40746h = cVar;
            this.f40747i = bVar;
            this.j = bVar2;
        }

        @Override // io.reactivex.internal.subscribers.b, bc.b
        public final void a() {
            if (this.f40964e) {
                return;
            }
            try {
                this.f40747i.getClass();
                this.f40964e = true;
                this.f40961b.a();
                try {
                    this.j.getClass();
                } catch (Throwable th) {
                    Fa.d.g(th);
                    p231sa.a.c(th);
                }
            } catch (Throwable th2) {
                Fa.d.g(th2);
                this.f40962c.cancel();
                onError(th2);
            }
        }

        @Override // bc.b
        public final void c(T t8) {
            if (this.f40964e) {
                return;
            }
            int i10 = this.f40965f;
            p123ja.g gVar = this.f40961b;
            if (i10 != 0) {
                gVar.c(null);
                return;
            }
            try {
                this.f40745g.a(t8);
                gVar.c(t8);
            } catch (Throwable th) {
                Fa.d.g(th);
                this.f40962c.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.b, bc.b
        public final void onError(Throwable th) {
            p123ja.g gVar = this.f40961b;
            if (this.f40964e) {
                p231sa.a.c(th);
                return;
            }
            this.f40964e = true;
            try {
                this.f40746h.getClass();
                gVar.onError(th);
            } catch (Throwable th2) {
                Fa.d.g(th2);
                gVar.onError(new CompositeException(th, th2));
            }
            try {
                this.j.getClass();
            } catch (Throwable th3) {
                Fa.d.g(th3);
                p231sa.a.c(th3);
            }
        }

        @Override // ra.j
        public final T poll() throws Exception {
            qa.a.c cVar = this.f40746h;
            try {
                T tPoll = this.f40963d.poll();
                qa.a.b bVar = this.j;
                if (tPoll != null) {
                    try {
                        this.f40745g.a(tPoll);
                        bVar.getClass();
                    } catch (Throwable th) {
                        try {
                            Fa.d.g(th);
                            try {
                                cVar.getClass();
                                Throwable th2 = ExceptionHelper.f40974a;
                                if (th instanceof Exception) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th3) {
                                throw new CompositeException(th, th3);
                            }
                        } catch (Throwable th4) {
                            bVar.getClass();
                            throw th4;
                        }
                    }
                } else if (this.f40965f == 1) {
                    this.f40747i.getClass();
                    bVar.getClass();
                }
                return tPoll;
            } catch (Throwable th5) {
                Fa.d.g(th5);
                try {
                    cVar.getClass();
                    Throwable th6 = ExceptionHelper.f40974a;
                    if (th5 instanceof Exception) {
                        throw th5;
                    }
                    throw th5;
                } catch (Throwable th7) {
                    throw new CompositeException(th5, th7);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p123ja.d dVar, s sVar) {
        super(dVar);
        qa.a.c cVar = qa.a.f46191d;
        qa.a.b bVar = qa.a.f46190c;
        this.f40738d = sVar;
        this.f40739e = cVar;
        this.f40740f = bVar;
        this.f40741g = bVar;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        boolean z10 = gVar instanceof ra.a;
        p123ja.d<T> dVar = this.f40737c;
        if (z10) {
            dVar.d(new a((ra.a) gVar, this.f40738d, this.f40739e, this.f40740f, this.f40741g));
        } else {
            dVar.d(new C0461b(gVar, this.f40738d, this.f40739e, this.f40740f, this.f40741g));
        }
    }
}
