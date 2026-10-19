package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p050db.C2185b;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f44012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44015d;

    public u(p050db.f fVar, z zVar) {
        this.f44012a = zVar;
        this.f44013b = fVar.f34669c;
        this.f44014c = fVar.f34679n;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(u uVar, p293xa.b bVar, BaseContinuationImpl baseContinuationImpl) {
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$2;
        byte bF;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        u uVar2;
        byte bE;
        z zVar;
        uVar.getClass();
        if (baseContinuationImpl instanceof JsonTreeReader$readObject$2) {
            jsonTreeReader$readObject$2 = (JsonTreeReader$readObject$2) baseContinuationImpl;
            int i10 = jsonTreeReader$readObject$2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jsonTreeReader$readObject$2.label = i10 - Integer.MIN_VALUE;
            } else {
                jsonTreeReader$readObject$2 = new JsonTreeReader$readObject$2(uVar, baseContinuationImpl);
            }
        } else {
            jsonTreeReader$readObject$2 = new JsonTreeReader$readObject$2(uVar, baseContinuationImpl);
        }
        Object obj = jsonTreeReader$readObject$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = jsonTreeReader$readObject$2.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) jsonTreeReader$readObject$2.L$3;
            linkedHashMap2 = (LinkedHashMap) jsonTreeReader$readObject$2.L$2;
            uVar2 = (u) jsonTreeReader$readObject$2.L$1;
            p293xa.b bVar2 = (p293xa.b) jsonTreeReader$readObject$2.L$0;
            kotlin.b.b(obj);
            linkedHashMap2.put(str, (p050db.h) obj);
            bE = uVar2.f44012a.e();
            if (bE == 4) {
                linkedHashMap = linkedHashMap2;
                bVar = bVar2;
                bF = bE;
                uVar = uVar2;
            } else if (bE != 7) {
                z.n(uVar2.f44012a, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            zVar = uVar2.f44012a;
            if (bE == 6) {
                zVar.f((byte) 7);
            } else if (bE == 4) {
                if (uVar2.f44014c) {
                    O.e.v(zVar);
                    throw null;
                }
                zVar.f((byte) 7);
            }
            return new p050db.z(linkedHashMap2);
        }
        kotlin.b.b(obj);
        z zVar2 = uVar.f44012a;
        bF = zVar2.f((byte) 6);
        if (zVar2.s() == 4) {
            z.n(zVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        z zVar3 = uVar.f44012a;
        if (zVar3.b()) {
            String strJ = uVar.f44013b ? zVar3.j() : zVar3.i();
            zVar3.f((byte) 5);
            p293xa.r rVar = p293xa.r.f47939a;
            jsonTreeReader$readObject$2.L$0 = bVar;
            jsonTreeReader$readObject$2.L$1 = uVar;
            jsonTreeReader$readObject$2.L$2 = linkedHashMap;
            jsonTreeReader$readObject$2.L$3 = strJ;
            jsonTreeReader$readObject$2.label = 1;
            bVar.a(rVar, jsonTreeReader$readObject$2);
            return coroutineSingletons;
        }
        linkedHashMap2 = linkedHashMap;
        byte b10 = bF;
        uVar2 = uVar;
        bE = b10;
        zVar = uVar2.f44012a;
        if (bE == 6) {
            zVar.f((byte) 7);
        } else if (bE == 4) {
            if (uVar2.f44014c) {
                O.e.v(zVar);
                throw null;
            }
            zVar.f((byte) 7);
        }
        return new p050db.z(linkedHashMap2);
    }

    public final p050db.h b() {
        p050db.h zVar;
        Object obj;
        Object objInvoke;
        z zVar2 = this.f44012a;
        byte bS = zVar2.s();
        if (bS == 1) {
            return d(true);
        }
        if (bS == 0) {
            return d(false);
        }
        if (bS != 6) {
            if (bS == 8) {
                return c();
            }
            z.n(zVar2, "Cannot read Json element because of unexpected ".concat(C.e.p(bS)), 0, null, 6);
            throw null;
        }
        int i10 = this.f44015d + 1;
        this.f44015d = i10;
        if (i10 == 200) {
            JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
            p293xa.r rVar = p293xa.r.f47939a;
            CoroutineSingletons coroutineSingletons = p293xa.a.f47915a;
            p293xa.c cVar = new p293xa.c();
            cVar.f47916b = jsonTreeReader$readDeepRecursive$1;
            cVar.f47917c = rVar;
            cVar.f47918d = cVar;
            CoroutineSingletons coroutineSingletons2 = p293xa.a.f47915a;
            cVar.f47919e = coroutineSingletons2;
            while (true) {
                obj = cVar.f47919e;
                kotlin.coroutines.c<? super p050db.h> cVar2 = cVar.f47918d;
                if (cVar2 == null) {
                    break;
                }
                if (kotlin.jvm.internal.i.a(coroutineSingletons2, obj)) {
                    try {
                        Ia.q<? super p293xa.b<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar = cVar.f47916b;
                        p293xa.r rVar2 = cVar.f47917c;
                        if (qVar instanceof BaseContinuationImpl) {
                            kotlin.jvm.internal.o.d(3, qVar);
                            objInvoke = ((JsonTreeReader$readDeepRecursive$1) qVar).invoke(cVar, rVar2, cVar2);
                        } else {
                            kotlin.jvm.internal.i.e(qVar, "<this>");
                            kotlin.coroutines.e context = cVar2.getContext();
                            kotlin.coroutines.c<? super p050db.h> intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.f43032b ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(cVar2) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(cVar2, context);
                            kotlin.jvm.internal.o.d(3, qVar);
                            objInvoke = ((JsonTreeReader$readDeepRecursive$1) qVar).invoke(cVar, rVar2, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                        }
                        if (objInvoke != CoroutineSingletons.f43038b) {
                            cVar2.resumeWith(objInvoke);
                        }
                    } catch (Throwable th) {
                        cVar2.resumeWith(kotlin.b.a(th));
                    }
                } else {
                    cVar.f47919e = coroutineSingletons2;
                    cVar2.resumeWith(obj);
                }
            }
            kotlin.b.b(obj);
            zVar = (p050db.h) obj;
        } else {
            byte bF = zVar2.f((byte) 6);
            if (zVar2.s() == 4) {
                z.n(zVar2, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (zVar2.b()) {
                String strJ = this.f44013b ? zVar2.j() : zVar2.i();
                zVar2.f((byte) 5);
                linkedHashMap.put(strJ, b());
                bF = zVar2.e();
                if (bF != 4) {
                    if (bF == 7) {
                        break;
                    }
                    z.n(zVar2, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bF == 6) {
                zVar2.f((byte) 7);
            } else if (bF == 4) {
                if (!this.f44014c) {
                    O.e.v(zVar2);
                    throw null;
                }
                zVar2.f((byte) 7);
            }
            zVar = new p050db.z(linkedHashMap);
        }
        this.f44015d--;
        return zVar;
    }

    public final C2185b c() {
        z zVar = this.f44012a;
        byte bE = zVar.e();
        if (zVar.s() == 4) {
            z.n(zVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (zVar.b()) {
            arrayList.add(b());
            bE = zVar.e();
            if (bE != 4) {
                boolean z10 = bE == 9;
                int i10 = zVar.f44034a;
                if (!z10) {
                    z.n(zVar, "Expected end of the array or comma", i10, null, 4);
                    throw null;
                }
            }
        }
        if (bE == 8) {
            zVar.f((byte) 9);
        } else if (bE == 4) {
            if (!this.f44014c) {
                O.e.u(zVar, "array");
                throw null;
            }
            zVar.f((byte) 9);
        }
        return new C2185b(arrayList);
    }

    public final p050db.B d(boolean z10) {
        z zVar = this.f44012a;
        String strJ = (this.f44013b || !z10) ? zVar.j() : zVar.i();
        return (z10 || !kotlin.jvm.internal.i.a(strJ, "null")) ? new p050db.t(strJ, z10) : p050db.w.INSTANCE;
    }
}
