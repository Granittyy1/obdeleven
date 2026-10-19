package io.ktor.client.plugins;

import io.ktor.client.HttpClientConfig;
import io.ktor.utils.io.charsets.MalformedInputException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DefaultResponseValidation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultResponseValidationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.ktor.util.a<p293xa.r> f40304a = new io.ktor.util.a<>("ValidateMark");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f40305b = p144l6.b.a("io.ktor.client.plugins.DefaultResponseValidation");

    public static final void a(final HttpClientConfig<?> httpClientConfig) {
        Ia.l<f.b, p293xa.r> lVar = new Ia.l<f.b, p293xa.r>() { // from class: io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1

            /* JADX INFO: renamed from: io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: DefaultResponseValidation.kt */
            @Aa.c(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", l = {R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R.styleable.AppCompatTheme_checkboxStyle}, m = "invokeSuspend")
            final class AnonymousClass1 extends SuspendLambda implements Ia.p<io.ktor.client.statement.c, kotlin.coroutines.c<? super p293xa.r>, Object> {
                int I$0;
                /* synthetic */ Object L$0;
                Object L$1;
                int label;

                public AnonymousClass1() {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // Ia.p
                public final Object invoke(io.ktor.client.statement.c cVar, kotlin.coroutines.c<? super p293xa.r> cVar2) {
                    return ((AnonymousClass1) create(cVar, cVar2)).invokeSuspend(p293xa.r.f47939a);
                }

                /* JADX WARN: Code duplicated, block: B:39:0x00df  */
                /* JADX WARN: Code duplicated, block: B:41:0x00e3 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:44:0x00ec A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
                /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i10;
                    io.ktor.client.statement.c cVar;
                    io.ktor.client.statement.c cVarD;
                    int i11;
                    io.ktor.client.statement.c cVar2;
                    io.ktor.client.statement.c cVar3;
                    String str;
                    Throwable responseException;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    int i12 = this.label;
                    try {
                        if (i12 == 0) {
                            kotlin.b.b(obj);
                            io.ktor.client.statement.c cVar4 = (io.ktor.client.statement.c) this.L$0;
                            if (!((Boolean) cVar4.b().c().getAttributes().c(h.f40367b)).booleanValue()) {
                                DefaultResponseValidationKt.f40305b.b("Skipping default response validation for " + cVar4.b().c().k());
                                return p293xa.r.f47939a;
                            }
                            i10 = cVar4.f().f40511b;
                            io.ktor.client.call.a aVarB = cVar4.b();
                            if (i10 < 300 || aVarB.c().getAttributes().b(DefaultResponseValidationKt.f40304a)) {
                                return p293xa.r.f47939a;
                            }
                            this.L$0 = cVar4;
                            this.I$0 = i10;
                            this.label = 1;
                            Object objA = io.ktor.client.call.b.a(aVarB, this);
                            if (objA == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            cVar = cVar4;
                            obj = objA;
                        } else {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i11 = this.I$0;
                                cVar3 = (io.ktor.client.statement.c) this.L$1;
                                cVar2 = (io.ktor.client.statement.c) this.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    str = (String) obj;
                                } catch (MalformedInputException unused) {
                                    str = "<body failed decoding>";
                                }
                                if (300 > i11 && i11 < 400) {
                                    responseException = new RedirectResponseException(cVar3, str);
                                } else if (400 > i11 && i11 < 500) {
                                    responseException = new ClientRequestException(cVar3, str);
                                } else if (500 <= i11 || i11 >= 600) {
                                    responseException = new ResponseException(cVar3, str);
                                } else {
                                    responseException = new ServerResponseException(cVar3, str);
                                }
                                DefaultResponseValidationKt.f40305b.b("Default response validation for " + cVar2.b().c().k() + " failed with " + responseException);
                                throw responseException;
                            }
                            i10 = this.I$0;
                            cVar = (io.ktor.client.statement.c) this.L$0;
                            kotlin.b.b(obj);
                        }
                        this.L$0 = cVar;
                        this.L$1 = cVarD;
                        this.I$0 = i10;
                        this.label = 2;
                        Object objA2 = io.ktor.client.statement.e.a(cVarD, kotlin.text.a.f43120b, this);
                        if (objA2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i11 = i10;
                        cVar3 = cVarD;
                        obj = objA2;
                        cVar2 = cVar;
                        str = (String) obj;
                        if (300 > i11) {
                            if (400 > i11) {
                                if (500 <= i11) {
                                    responseException = new ResponseException(cVar3, str);
                                } else {
                                    responseException = new ResponseException(cVar3, str);
                                }
                            } else if (500 <= i11) {
                                responseException = new ResponseException(cVar3, str);
                            } else {
                                responseException = new ResponseException(cVar3, str);
                            }
                        } else if (400 > i11) {
                            if (500 <= i11) {
                                responseException = new ResponseException(cVar3, str);
                            } else {
                                responseException = new ResponseException(cVar3, str);
                            }
                        } else if (500 <= i11) {
                            responseException = new ResponseException(cVar3, str);
                        } else {
                            responseException = new ResponseException(cVar3, str);
                        }
                        DefaultResponseValidationKt.f40305b.b("Default response validation for " + cVar2.b().c().k() + " failed with " + responseException);
                        throw responseException;
                    } catch (MalformedInputException unused2) {
                        i11 = i10;
                        cVar2 = cVar;
                        cVar3 = cVarD;
                        str = "<body failed decoding>";
                    }
                    io.ktor.client.call.a aVar = (io.ktor.client.call.a) obj;
                    aVar.c().getAttributes().f(DefaultResponseValidationKt.f40304a, p293xa.r.f47939a);
                    cVarD = aVar.d();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(f.b bVar) {
                f.b HttpResponseValidator = bVar;
                kotlin.jvm.internal.i.e(HttpResponseValidator, "$this$HttpResponseValidator");
                httpClientConfig.getClass();
                HttpResponseValidator.f40361c = false;
                HttpResponseValidator.f40359a.add(new AnonymousClass1(2, null));
                return p293xa.r.f47939a;
            }
        };
        cc.b bVar = h.f40366a;
        httpClientConfig.b(f.f40354d, lVar);
    }
}
