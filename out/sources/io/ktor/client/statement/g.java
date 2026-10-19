package io.ktor.client.statement;

import Ia.p;
import com.voltasit.obdeleven.domain.usecases.device.v;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.j;
import io.ktor.utils.io.ByteReadChannel;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.InterfaceC2707q;
import p293xa.r;

/* JADX INFO: compiled from: HttpStatement.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.client.request.a f40435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpClient f40436b;

    public g(io.ktor.client.request.a aVar, HttpClient client) {
        Set setKeySet;
        i.e(client, "client");
        this.f40435a = aVar;
        this.f40436b = client;
        Map map = (Map) aVar.f40415f.d(io.ktor.client.engine.c.f40284a);
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<io.ktor.client.plugins.i> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof io.ktor.client.plugins.i) {
                arrayList.add(obj);
            }
        }
        for (io.ktor.client.plugins.i iVar : arrayList) {
            if (j.b(this.f40436b, iVar) == null) {
                throw new IllegalArgumentException(("Consider installing " + iVar + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(c cVar, ContinuationImpl continuationImpl) {
        HttpStatement$cleanup$1 httpStatement$cleanup$1;
        if (continuationImpl instanceof HttpStatement$cleanup$1) {
            httpStatement$cleanup$1 = (HttpStatement$cleanup$1) continuationImpl;
            int i10 = httpStatement$cleanup$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpStatement$cleanup$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpStatement$cleanup$1 = new HttpStatement$cleanup$1(this, continuationImpl);
            }
        } else {
            httpStatement$cleanup$1 = new HttpStatement$cleanup$1(this, continuationImpl);
        }
        Object obj = httpStatement$cleanup$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpStatement$cleanup$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            kotlin.coroutines.e.a aVar = cVar.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
            i.b(aVar);
            InterfaceC2707q interfaceC2707q = (InterfaceC2707q) aVar;
            interfaceC2707q.b();
            try {
                ByteReadChannel byteReadChannelC = cVar.c();
                i.e(byteReadChannelC, "<this>");
                byteReadChannelC.o(null);
            } catch (Throwable unused) {
            }
            httpStatement$cleanup$1.L$0 = interfaceC2707q;
            httpStatement$cleanup$1.label = 1;
            if (interfaceC2707q.C(httpStatement$cleanup$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(p pVar, ContinuationImpl continuationImpl) throws Throwable {
        HttpStatement$execute$1 httpStatement$execute$1;
        g gVar;
        c cVar;
        c cVar2;
        if (continuationImpl instanceof HttpStatement$execute$1) {
            httpStatement$execute$1 = (HttpStatement$execute$1) continuationImpl;
            int i10 = httpStatement$execute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpStatement$execute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpStatement$execute$1 = new HttpStatement$execute$1(this, continuationImpl);
            }
        } else {
            httpStatement$execute$1 = new HttpStatement$execute$1(this, continuationImpl);
        }
        Object objD = httpStatement$execute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpStatement$execute$1.label;
        try {
            try {
                if (i11 == 0) {
                    kotlin.b.b(objD);
                    httpStatement$execute$1.L$0 = this;
                    httpStatement$execute$1.L$1 = pVar;
                    httpStatement$execute$1.label = 1;
                    objD = d(httpStatement$execute$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gVar = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                Object obj = httpStatement$execute$1.L$0;
                                kotlin.b.b(objD);
                                return obj;
                            }
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            th = (Throwable) httpStatement$execute$1.L$0;
                            kotlin.b.b(objD);
                            throw th;
                        }
                        cVar2 = (c) httpStatement$execute$1.L$1;
                        gVar = (g) httpStatement$execute$1.L$0;
                        try {
                            kotlin.b.b(objD);
                            httpStatement$execute$1.L$0 = objD;
                            httpStatement$execute$1.L$1 = null;
                            httpStatement$execute$1.label = 3;
                            if (gVar.a(cVar2, httpStatement$execute$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            return objD;
                        } catch (Throwable th) {
                            cVar = cVar2;
                            th = th;
                            httpStatement$execute$1.L$0 = th;
                            httpStatement$execute$1.L$1 = null;
                            httpStatement$execute$1.label = 4;
                            if (gVar.a(cVar, httpStatement$execute$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            throw th;
                        }
                    }
                    pVar = (p) httpStatement$execute$1.L$1;
                    gVar = (g) httpStatement$execute$1.L$0;
                    kotlin.b.b(objD);
                }
                httpStatement$execute$1.L$0 = gVar;
                httpStatement$execute$1.L$1 = cVar;
                httpStatement$execute$1.label = 2;
                Object objInvoke = pVar.invoke(cVar, httpStatement$execute$1);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objD = objInvoke;
                cVar2 = cVar;
                httpStatement$execute$1.L$0 = objD;
                httpStatement$execute$1.L$1 = null;
                httpStatement$execute$1.label = 3;
                if (gVar.a(cVar2, httpStatement$execute$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objD;
            } catch (Throwable th2) {
                th = th2;
                httpStatement$execute$1.L$0 = th;
                httpStatement$execute$1.L$1 = null;
                httpStatement$execute$1.label = 4;
                if (gVar.a(cVar, httpStatement$execute$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                throw th;
            }
            cVar = (c) objD;
        } catch (CancellationException e10) {
            throw v.i(e10);
        }
    }

    public final Object c(ContinuationImpl continuationImpl) {
        return b(new HttpStatement$execute$4(2, null), continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) throws Throwable {
        HttpStatement$executeUnsafe$1 httpStatement$executeUnsafe$1;
        if (continuationImpl instanceof HttpStatement$executeUnsafe$1) {
            httpStatement$executeUnsafe$1 = (HttpStatement$executeUnsafe$1) continuationImpl;
            int i10 = httpStatement$executeUnsafe$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpStatement$executeUnsafe$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpStatement$executeUnsafe$1 = new HttpStatement$executeUnsafe$1(this, continuationImpl);
            }
        } else {
            httpStatement$executeUnsafe$1 = new HttpStatement$executeUnsafe$1(this, continuationImpl);
        }
        Object objB = httpStatement$executeUnsafe$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpStatement$executeUnsafe$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objB);
                io.ktor.client.request.a aVar = new io.ktor.client.request.a();
                io.ktor.client.request.a aVar2 = this.f40435a;
                aVar.f40414e = aVar2.f40414e;
                aVar.e(aVar2);
                HttpClient httpClient = this.f40436b;
                httpStatement$executeUnsafe$1.label = 1;
                objB = httpClient.b(aVar, httpStatement$executeUnsafe$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objB);
            }
            return ((io.ktor.client.call.a) objB).d();
        } catch (CancellationException e10) {
            throw v.i(e10);
        }
    }

    public final String toString() {
        return "HttpStatement[" + this.f40435a.f40410a + ']';
    }
}
