package io.ktor.client.engine;

import Ia.q;
import io.ktor.client.HttpClient;
import io.ktor.http.B;
import io.ktor.http.UnsafeHeaderException;
import io.ktor.http.k;
import io.ktor.http.o;
import io.ktor.utils.io.ByteReadChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.TypeReference;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HttpClientEngine.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {R.styleable.AppCompatTheme_editTextStyle, R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend")
final class HttpClientEngine$install$1 extends SuspendLambda implements q<io.ktor.util.pipeline.c<Object, io.ktor.client.request.a>, Object, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ HttpClient $client;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngine$install$1(HttpClient httpClient, a aVar, kotlin.coroutines.c<? super HttpClientEngine$install$1> cVar) {
        super(3, cVar);
        this.$client = httpClient;
        this.this$0 = aVar;
    }

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<Object, io.ktor.client.request.a> cVar, Object obj, kotlin.coroutines.c<? super r> cVar2) {
        HttpClientEngine$install$1 httpClientEngine$install$1 = new HttpClientEngine$install$1(this.$client, this.this$0, cVar2);
        httpClientEngine$install$1.L$0 = cVar;
        httpClientEngine$install$1.L$1 = obj;
        return httpClientEngine$install$1.invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        io.ktor.util.pipeline.c cVar;
        V9.c requestData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                requestData = (V9.c) this.L$1;
                io.ktor.util.pipeline.c cVar2 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                cVar = cVar2;
                objA = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        io.ktor.util.pipeline.c cVar3 = (io.ktor.util.pipeline.c) this.L$0;
        Object obj2 = this.L$1;
        io.ktor.client.request.a aVar = new io.ktor.client.request.a();
        io.ktor.client.request.a builder = (io.ktor.client.request.a) cVar3.f40561b;
        i.e(builder, "builder");
        aVar.f40414e = builder.f40414e;
        aVar.e(builder);
        if (obj2 == null) {
            aVar.f40413d = X9.a.f7430a;
            TypeReference typeReferenceB = l.b(Object.class);
            aVar.b(new p023ba.a(l.a(Object.class), kotlin.reflect.a.e(typeReferenceB), typeReferenceB));
        } else if (obj2 instanceof X9.b) {
            aVar.f40413d = obj2;
            aVar.b(null);
        } else {
            aVar.f40413d = obj2;
            TypeReference typeReferenceB2 = l.b(Object.class);
            aVar.b(new p023ba.a(l.a(Object.class), kotlin.reflect.a.e(typeReferenceB2), typeReferenceB2));
        }
        this.$client.f40247k.a(io.ktor.client.utils.b.f40438b);
        B b10 = aVar.f40410a.b();
        o oVar = aVar.f40411b;
        io.ktor.http.i iVar = new io.ktor.http.i(aVar.f40412c.f40530a);
        Object obj3 = aVar.f40413d;
        X9.b bVar = obj3 instanceof X9.b ? (X9.b) obj3 : null;
        if (bVar == null) {
            throw new IllegalStateException(("No request transformation found: " + aVar.f40413d).toString());
        }
        B0 b11 = aVar.f40414e;
        io.ktor.util.f fVar = aVar.f40415f;
        V9.c cVar4 = new V9.c(b10, oVar, iVar, bVar, b11, fVar);
        fVar.f(e.f40287b, this.$client.f40248l);
        Set<String> setKeySet = iVar.f40547c.keySet();
        i.e(setKeySet, "<this>");
        Set setUnmodifiableSet = Collections.unmodifiableSet(setKeySet);
        i.d(setUnmodifiableSet, "unmodifiableSet(this)");
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : setUnmodifiableSet) {
            if (k.f40481a.contains((String) obj4)) {
                arrayList.add(obj4);
            }
        }
        if (!arrayList.isEmpty()) {
            String header = arrayList.toString();
            i.e(header, "header");
            throw new UnsafeHeaderException("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
        }
        a aVar2 = this.this$0;
        for (b<?> bVar2 : cVar4.f6855g) {
            if (!aVar2.I().contains(bVar2)) {
                throw new IllegalArgumentException(("Engine doesn't support " + bVar2).toString());
            }
        }
        a aVar3 = this.this$0;
        this.L$0 = cVar3;
        this.L$1 = cVar4;
        this.label = 1;
        objA = a.C0455a.a(aVar3, cVar4, this);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        cVar = cVar3;
        requestData = cVar4;
        V9.e responseData = (V9.e) objA;
        HttpClient client = this.$client;
        i.e(client, "client");
        i.e(requestData, "requestData");
        i.e(responseData, "responseData");
        io.ktor.client.call.a aVar4 = new io.ktor.client.call.a(client);
        aVar4.f40263c = new V9.a(aVar4, requestData);
        aVar4.f40264d = new io.ktor.client.statement.a(aVar4, responseData);
        Object obj5 = responseData.f6865e;
        if (!(obj5 instanceof ByteReadChannel)) {
            aVar4.c().getAttributes().f(io.ktor.client.call.a.f40261f, obj5);
        }
        final io.ktor.client.statement.c cVarD = aVar4.d();
        this.$client.f40247k.a(io.ktor.client.utils.b.f40439c);
        InterfaceC2694i0 interfaceC2694i0F = C2702l0.f(cVarD.getCoroutineContext());
        final HttpClient httpClient = this.$client;
        interfaceC2694i0F.B(new Ia.l<Throwable, r>() { // from class: io.ktor.client.engine.HttpClientEngine$install$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                if (th != null) {
                    httpClient.f40247k.a(io.ktor.client.utils.b.f40441e);
                }
                return r.f47939a;
            }
        });
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (cVar.d(aVar4, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
    }
}
