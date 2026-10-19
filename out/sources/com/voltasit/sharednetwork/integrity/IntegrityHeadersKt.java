package com.voltasit.sharednetwork.integrity;

import A8.f;
import Aa.c;
import Ia.l;
import Ia.p;
import com.braze.support.BrazeLogger;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.b;
import io.ktor.client.plugins.api.d;
import kotlin.Result;
import kotlin.collections.AbstractC2670b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: IntegrityHeaders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntegrityHeadersKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f34467a;

    static {
        IntegrityHeadersKt$IntegrityHeaders$1 createConfiguration = IntegrityHeadersKt$IntegrityHeaders$1.f34468b;
        i.e(createConfiguration, "createConfiguration");
        IntegrityHeadersKt$IntegrityHeaders$2 body = new l<ClientPluginBuilder<IntegrityHeadersConfig>, r>() { // from class: com.voltasit.sharednetwork.integrity.IntegrityHeadersKt$IntegrityHeaders$2

            /* JADX INFO: renamed from: com.voltasit.sharednetwork.integrity.IntegrityHeadersKt$IntegrityHeaders$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: IntegrityHeaders.kt */
            @c(c = "com.voltasit.sharednetwork.integrity.IntegrityHeadersKt$IntegrityHeaders$2$1", f = "IntegrityHeaders.kt", l = {R.styleable.AppCompatTheme_actionOverflowButtonStyle}, m = "invokeSuspend")
            final class AnonymousClass1 extends SuspendLambda implements Ia.r<d, io.ktor.client.request.a, Object, kotlin.coroutines.c<? super r>, Object> {
                final /* synthetic */ boolean $failOnMissingToken;
                final /* synthetic */ p<byte[], kotlin.coroutines.c<? super a>, Object> $fetchToken;
                final /* synthetic */ l<Integer, byte[]> $nonceGenerator;
                final /* synthetic */ int $nonceSize;
                final /* synthetic */ l<Throwable, r> $onError;
                final /* synthetic */ l<io.ktor.client.request.a, Boolean> $shouldAttach;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(l<? super io.ktor.client.request.a, Boolean> lVar, l<? super Integer, byte[]> lVar2, int i10, p<? super byte[], ? super kotlin.coroutines.c<? super a>, ? extends Object> pVar, l<? super Throwable, r> lVar3, boolean z10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(4, cVar);
                    this.$shouldAttach = lVar;
                    this.$nonceGenerator = lVar2;
                    this.$nonceSize = i10;
                    this.$fetchToken = pVar;
                    this.$onError = lVar3;
                    this.$failOnMissingToken = z10;
                }

                @Override // Ia.r
                public final Object invoke(d dVar, io.ktor.client.request.a aVar, Object obj, kotlin.coroutines.c<? super r> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$shouldAttach, this.$nonceGenerator, this.$nonceSize, this.$fetchToken, this.$onError, this.$failOnMissingToken, cVar);
                    anonymousClass1.L$0 = dVar;
                    anonymousClass1.L$1 = aVar;
                    return anonymousClass1.invokeSuspend(r.f47939a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v1 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objA;
                    byte[] bArr;
                    int i10;
                    CharSequence charSequenceSubSequence;
                    io.ktor.client.request.a aVar;
                    Object objInvoke;
                    int i11 = 0;
                    int i12 = 2;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    int i13 = this.label;
                    try {
                        if (i13 == 0) {
                            kotlin.b.b(obj);
                            aVar = (io.ktor.client.request.a) this.L$1;
                            if (!this.$shouldAttach.invoke(aVar).booleanValue()) {
                                return r.f47939a;
                            }
                            byte[] bArrInvoke = this.$nonceGenerator.invoke(new Integer(this.$nonceSize));
                            p<byte[], kotlin.coroutines.c<? super a>, Object> pVar = this.$fetchToken;
                            this.L$0 = aVar;
                            this.L$1 = bArrInvoke;
                            this.label = 1;
                            objInvoke = pVar.invoke(bArrInvoke, this);
                            i13 = bArrInvoke;
                            if (objInvoke == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            byte[] bArr2 = (byte[]) this.L$1;
                            aVar = (io.ktor.client.request.a) this.L$0;
                            kotlin.b.b(obj);
                            objInvoke = obj;
                            i13 = bArr2;
                        }
                        objA = (a) objInvoke;
                        if (objA == null) {
                            throw new IntegrityTokenUnavailableException("Integrity token unavailable");
                        }
                        bArr = i13;
                    } catch (Throwable th) {
                        objA = kotlin.b.a(th);
                        bArr = i13;
                    }
                    l<Throwable, r> lVar = this.$onError;
                    boolean z10 = this.$failOnMissingToken;
                    Throwable thA = Result.a(objA);
                    if (thA != null) {
                        lVar.invoke(thA);
                        if (z10) {
                            throw thA;
                        }
                        return r.f47939a;
                    }
                    a aVar2 = (a) objA;
                    p241t7.b.u(aVar, "x-mobile-integrity-token", aVar2.f34470a);
                    p241t7.b.u(aVar, "x-mobile-integrity-token-type", aVar2.f34471b);
                    b bVar = IntegrityHeadersKt.f34467a;
                    Base64.f43045c.getClass();
                    Base64 base64 = Base64.f43047e;
                    int length = bArr.length;
                    base64.getClass();
                    AbstractC2670b.a.a(0, length, bArr.length);
                    int iA = base64.a(length);
                    byte[] bArr3 = new byte[iA];
                    AbstractC2670b.a.a(0, length, bArr.length);
                    int iA2 = base64.a(length);
                    if (iA < 0) {
                        throw new IndexOutOfBoundsException(J4.i.b(iA, "destination offset: 0, destination size: "));
                    }
                    if (iA2 < 0 || iA2 > iA) {
                        throw new IndexOutOfBoundsException(f.d(iA, iA2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
                    }
                    byte[] bArr4 = base64.f43048a ? Ga.a.f3590b : Ga.a.f3589a;
                    int i14 = base64.f43049b ? 19 : BrazeLogger.SUPPRESS;
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        i10 = i15 + 2;
                        if (i10 >= length) {
                            break;
                        }
                        int iMin = Math.min((length - i15) / 3, i14);
                        for (int i17 = i11; i17 < iMin; i17++) {
                            int i18 = bArr[i15] & 255;
                            int i19 = i15 + 2;
                            int i20 = bArr[i15 + 1] & 255;
                            i15 += 3;
                            int i21 = (i18 << 16) | (i20 << 8) | (bArr[i19] & 255);
                            bArr3[i16] = bArr4[i21 >>> 18];
                            bArr3[i16 + 1] = bArr4[(i21 >>> 12) & 63];
                            int i22 = i16 + 3;
                            bArr3[i16 + 2] = bArr4[(i21 >>> 6) & 63];
                            i16 += 4;
                            bArr3[i22] = bArr4[i21 & 63];
                        }
                        if (iMin != i14 || i15 == length) {
                            i12 = 2;
                        } else {
                            int i23 = i16 + 1;
                            byte[] bArr5 = Base64.f43046d;
                            bArr3[i16] = bArr5[0];
                            i12 = 2;
                            i16 += 2;
                            bArr3[i23] = bArr5[1];
                        }
                        i11 = 0;
                    }
                    int i24 = length - i15;
                    if (i24 == 1) {
                        int i25 = (bArr[i15] & 255) << 4;
                        bArr3[i16] = bArr4[i25 >>> 6];
                        bArr3[i16 + 1] = bArr4[i25 & 63];
                        Base64.PaddingOption[] paddingOptionArr = Base64.PaddingOption.f43050b;
                        bArr3[2 + i16] = 61;
                        bArr3[i16 + 3] = 61;
                        i15++;
                    } else if (i24 == i12) {
                        int i26 = ((bArr[i15 + 1] & 255) << i12) | ((bArr[i15] & 255) << 10);
                        bArr3[i16] = bArr4[i26 >>> 12];
                        bArr3[i16 + 1] = bArr4[(i26 >>> 6) & 63];
                        bArr3[i12 + i16] = bArr4[i26 & 63];
                        Base64.PaddingOption[] paddingOptionArr2 = Base64.PaddingOption.f43050b;
                        bArr3[i16 + 3] = 61;
                        i15 = i10;
                    }
                    if (i15 != length) {
                        throw new IllegalStateException("Check failed.");
                    }
                    String str = new String(bArr3, kotlin.text.a.f43122d);
                    char[] cArr = {'='};
                    int length2 = str.length() - 1;
                    if (length2 < 0) {
                        charSequenceSubSequence = "";
                        break;
                    }
                    while (true) {
                        int i27 = length2 - 1;
                        char cCharAt = str.charAt(length2);
                        int i28 = 0;
                        while (true) {
                            if (i28 >= 1) {
                                i28 = -1;
                                break;
                            }
                            if (cCharAt == cArr[i28]) {
                                break;
                            }
                            i28++;
                        }
                        if (i28 < 0) {
                            charSequenceSubSequence = str.subSequence(0, length2 + 1);
                            break;
                        }
                        if (i27 < 0) {
                            charSequenceSubSequence = "";
                            break;
                        }
                        length2 = i27;
                    }
                    p241t7.b.u(aVar, "x-mobile-integrity-nonce", charSequenceSubSequence.toString());
                    String str2 = aVar2.f34472c;
                    if (str2 != null) {
                        p241t7.b.u(aVar, "x-mobile-integrity-key-id", str2);
                    }
                    return r.f47939a;
                }
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r6v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
            @Override // Ia.l
            public final r invoke(ClientPluginBuilder<IntegrityHeadersConfig> clientPluginBuilder) {
                ClientPluginBuilder<IntegrityHeadersConfig> createClientPlugin = clientPluginBuilder;
                i.e(createClientPlugin, "$this$createClientPlugin");
                IntegrityHeadersConfig integrityHeadersConfig = createClientPlugin.f40337a;
                p<? super byte[], ? super kotlin.coroutines.c<? super a>, ? extends Object> pVar = integrityHeadersConfig.f34461a;
                if (pVar == null) {
                    throw new IllegalArgumentException("IntegrityHeaders plugin requires a fetchToken callback");
                }
                l<? super Integer, byte[]> lVar = integrityHeadersConfig.f34462b;
                if (lVar == null) {
                    throw new IllegalArgumentException("IntegrityHeaders plugin requires a CSPRNG-backed nonceGenerator callback");
                }
                createClientPlugin.f40338b.add(new io.ktor.client.plugins.api.c(new AnonymousClass1(integrityHeadersConfig.f34463c, lVar, 32, pVar, integrityHeadersConfig.f34464d, false, null)));
                return r.f47939a;
            }
        };
        i.e(body, "body");
        f34467a = new b(createConfiguration, body);
    }
}
