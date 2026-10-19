package androidx.paging;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Key f19397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PagingSource<Key, Value> f19398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f19399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConflatedEventBus$special$$inlined$mapNotNull$1 f19400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B<Key, Value> f19401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y<Key, Value> f19402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ia.a<p293xa.r> f19403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1433i f19404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f19405i;
    public final BufferedChannel j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t.a<Key, Value> f19406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2700k0 f19407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 f19408m;

    /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19409a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19409a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(Object obj, PagingSource pagingSource, w wVar, ConflatedEventBus$special$$inlined$mapNotNull$1 retryFlow, B b10, y yVar, Ia.a aVar) {
        kotlin.jvm.internal.i.e(pagingSource, "pagingSource");
        kotlin.jvm.internal.i.e(retryFlow, "retryFlow");
        this.f19397a = obj;
        this.f19398b = pagingSource;
        this.f19399c = wVar;
        this.f19400d = retryFlow;
        this.f19401e = b10;
        this.f19402f = yVar;
        this.f19403g = aVar;
        if (wVar.f19436e != Integer.MIN_VALUE && !pagingSource.getJumpingSupported()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.f19404h = new C1433i();
        this.f19405i = new AtomicBoolean(false);
        this.j = kotlinx.coroutines.channels.g.a(-2, 6, null);
        this.f19406k = new t.a<>(wVar);
        C2700k0 c2700k0A = C2702l0.a();
        this.f19407l = c2700k0A;
        this.f19408m = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new PageFetcherSnapshot$pageEventFlow$2(this, null), SimpleChannelFlowKt.a(new CancelableChannelFlowKt$cancelableChannelFlow$1(c2700k0A, new PageFetcherSnapshot$pageEventFlow$1(this, null), null)));
    }

    public static final Object a(r rVar, FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, LoadType loadType, SuspendLambda suspendLambda) {
        rVar.getClass();
        InterfaceC2686c interfaceC2686cA = FlowExtKt.a(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, rVar, loadType));
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, null);
        kotlin.jvm.internal.i.e(interfaceC2686cA, "<this>");
        Object objCollect = C2688e.c(new kotlinx.coroutines.flow.t(new FlowExtKt$simpleRunningReduce$1(interfaceC2686cA, pageFetcherSnapshot$collectAsGenerationalViewportHints$3, null)), -1).collect(new s(rVar, loadType), suspendLambda);
        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:106:0x0404  */
    /* JADX WARN: Code duplicated, block: B:108:0x040b  */
    /* JADX WARN: Code duplicated, block: B:110:0x040e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0414  */
    /* JADX WARN: Code duplicated, block: B:113:0x041a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0427  */
    /* JADX WARN: Code duplicated, block: B:128:0x048e  */
    /* JADX WARN: Code duplicated, block: B:132:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:134:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:137:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:139:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:142:0x04d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:147:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:160:0x050c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0517  */
    /* JADX WARN: Code duplicated, block: B:164:0x051b  */
    /* JADX WARN: Code duplicated, block: B:170:0x054c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0574  */
    /* JADX WARN: Code duplicated, block: B:182:0x0591  */
    /* JADX WARN: Code duplicated, block: B:185:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:186:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:190:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:193:0x05ea A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:191:0x05de, B:193:0x05ea, B:197:0x061c, B:201:0x062b, B:203:0x063e, B:205:0x0642, B:207:0x064a, B:209:0x064e, B:211:0x0653, B:210:0x0651, B:212:0x0656, B:216:0x068c), top: B:266:0x05de }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0612  */
    /* JADX WARN: Code duplicated, block: B:196:0x0614  */
    /* JADX WARN: Code duplicated, block: B:200:0x0628  */
    /* JADX WARN: Code duplicated, block: B:205:0x0642 A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:191:0x05de, B:193:0x05ea, B:197:0x061c, B:201:0x062b, B:203:0x063e, B:205:0x0642, B:207:0x064a, B:209:0x064e, B:211:0x0653, B:210:0x0651, B:212:0x0656, B:216:0x068c), top: B:266:0x05de }] */
    /* JADX WARN: Code duplicated, block: B:209:0x064e A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:191:0x05de, B:193:0x05ea, B:197:0x061c, B:201:0x062b, B:203:0x063e, B:205:0x0642, B:207:0x064a, B:209:0x064e, B:211:0x0653, B:210:0x0651, B:212:0x0656, B:216:0x068c), top: B:266:0x05de }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0651 A[Catch: all -> 0x0624, TryCatch #1 {all -> 0x0624, blocks: (B:191:0x05de, B:193:0x05ea, B:197:0x061c, B:201:0x062b, B:203:0x063e, B:205:0x0642, B:207:0x064a, B:209:0x064e, B:211:0x0653, B:210:0x0651, B:212:0x0656, B:216:0x068c), top: B:266:0x05de }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0680  */
    /* JADX WARN: Code duplicated, block: B:215:0x0682  */
    /* JADX WARN: Code duplicated, block: B:219:0x0696  */
    /* JADX WARN: Code duplicated, block: B:222:0x069f  */
    /* JADX WARN: Code duplicated, block: B:225:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:228:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:231:0x06b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x039b  */
    /* JADX WARN: Code duplicated, block: B:93:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:96:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:99:0x03b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v74, types: [androidx.paging.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77, types: [androidx.paging.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83, types: [androidx.paging.LoadType] */
    /* JADX WARN: Type inference failed for: r0v86, types: [androidx.paging.LoadType, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v21, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v51, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v61 */
    /* JADX WARN: Type inference failed for: r14v62 */
    /* JADX WARN: Type inference failed for: r14v63 */
    /* JADX WARN: Type inference failed for: r15v16, types: [androidx.paging.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v47, types: [androidx.paging.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33, types: [T] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v44, types: [androidx.paging.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v61, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.paging.LoadType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.paging.I] */
    /* JADX WARN: Type inference failed for: r7v19, types: [androidx.paging.p] */
    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.paging.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [androidx.paging.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v23, types: [androidx.paging.r] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.paging.r] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.paging.I] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x06e1 -> B:264:0x06ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:250:0x0727 -> B:89:0x0397). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(androidx.paging.r r22, androidx.paging.LoadType r23, androidx.paging.C1432h r24, kotlin.coroutines.c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.r.b(androidx.paging.r, androidx.paging.LoadType, androidx.paging.h, kotlin.coroutines.c):java.lang.Object");
    }

    public static final Object c(r rVar, final LoadType loadType, final I i10, kotlin.coroutines.c cVar) throws Throwable {
        rVar.getClass();
        if (a.f19409a[loadType.ordinal()] == 1) {
            Object objF = rVar.f((ContinuationImpl) cVar);
            return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
        }
        if (i10 == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        C1433i c1433i = rVar.f19404h;
        c1433i.getClass();
        if (loadType == LoadType.f19253c || loadType == LoadType.f19254d) {
            c1433i.f19355a.a(null, new Ia.p<C1433i.a, C1433i.a, p293xa.r>() { // from class: androidx.paging.HintHandler$forceSetHint$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(C1433i.a aVar, C1433i.a aVar2) {
                    C1433i.a prependHint = aVar;
                    C1433i.a appendHint = aVar2;
                    kotlin.jvm.internal.i.e(prependHint, "prependHint");
                    kotlin.jvm.internal.i.e(appendHint, "appendHint");
                    if (loadType == LoadType.f19253c) {
                        I i11 = i10;
                        prependHint.f19356a = i11;
                        if (i11 != null) {
                            prependHint.f19357b.f(i11);
                        }
                    } else {
                        I i12 = i10;
                        appendHint.f19356a = i12;
                        if (i12 != null) {
                            appendHint.f19357b.f(i12);
                        }
                    }
                    return p293xa.r.f47939a;
                }
            });
            return p293xa.r.f47939a;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
    }

    public static final void d(r rVar, kotlinx.coroutines.A a10) {
        if (rVar.f19399c.f19436e != Integer.MIN_VALUE) {
            C2680e.c(a10, null, null, new PageFetcherSnapshot$startConsumingHints$1(rVar, null), 3);
        }
        C2680e.c(a10, null, null, new PageFetcherSnapshot$startConsumingHints$2(rVar, null), 3);
        C2680e.c(a10, null, null, new PageFetcherSnapshot$startConsumingHints$3(rVar, null), 3);
    }

    public static String h(LoadType loadType, Object obj, PagingSource.b bVar) {
        if (bVar == null) {
            return "End " + loadType + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + obj + ". Returned " + bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) {
        PageFetcherSnapshot$currentPagingState$1 pageFetcherSnapshot$currentPagingState$1;
        t.a<Key, Value> aVar;
        r<Key, Value> rVar;
        kotlinx.coroutines.sync.a aVar2;
        if (continuationImpl instanceof PageFetcherSnapshot$currentPagingState$1) {
            pageFetcherSnapshot$currentPagingState$1 = (PageFetcherSnapshot$currentPagingState$1) continuationImpl;
            int i10 = pageFetcherSnapshot$currentPagingState$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pageFetcherSnapshot$currentPagingState$1.label = i10 - Integer.MIN_VALUE;
            } else {
                pageFetcherSnapshot$currentPagingState$1 = new PageFetcherSnapshot$currentPagingState$1(this, continuationImpl);
            }
        } else {
            pageFetcherSnapshot$currentPagingState$1 = new PageFetcherSnapshot$currentPagingState$1(this, continuationImpl);
        }
        Object obj = pageFetcherSnapshot$currentPagingState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = pageFetcherSnapshot$currentPagingState$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            aVar = this.f19406k;
            MutexImpl mutexImpl = aVar.f19423a;
            pageFetcherSnapshot$currentPagingState$1.L$0 = this;
            pageFetcherSnapshot$currentPagingState$1.L$1 = aVar;
            pageFetcherSnapshot$currentPagingState$1.L$2 = mutexImpl;
            pageFetcherSnapshot$currentPagingState$1.label = 1;
            if (mutexImpl.f(null, pageFetcherSnapshot$currentPagingState$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            rVar = this;
            aVar2 = mutexImpl;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$currentPagingState$1.L$2;
            aVar = (t.a) pageFetcherSnapshot$currentPagingState$1.L$1;
            rVar = (r) pageFetcherSnapshot$currentPagingState$1.L$0;
            kotlin.b.b(obj);
        }
        try {
            return aVar.f19424b.a(rVar.f19404h.f19355a.f19360c);
        } finally {
            aVar2.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0226 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:106:0x0227  */
    /* JADX WARN: Code duplicated, block: B:110:0x0240  */
    /* JADX WARN: Code duplicated, block: B:113:0x0247  */
    /* JADX WARN: Code duplicated, block: B:119:0x0255  */
    /* JADX WARN: Code duplicated, block: B:121:0x0259  */
    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0283 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:129:0x0284  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0162  */
    /* JADX WARN: Code duplicated, block: B:66:0x0182 A[Catch: all -> 0x0186, TRY_ENTER, TryCatch #4 {all -> 0x0186, blocks: (B:61:0x0168, B:63:0x0174, B:66:0x0182, B:69:0x0189, B:71:0x0190), top: B:153:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0190 A[Catch: all -> 0x0186, TRY_LEAVE, TryCatch #4 {all -> 0x0186, blocks: (B:61:0x0168, B:63:0x0174, B:66:0x0182, B:69:0x0189, B:71:0x0190), top: B:153:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:99:0x0206  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x011d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r4v31, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlinx.coroutines.sync.a] */
    public final Object f(ContinuationImpl continuationImpl) throws Throwable {
        PageFetcherSnapshot$doInitialLoad$1 pageFetcherSnapshot$doInitialLoad$1;
        t.a<Key, Value> aVar;
        kotlinx.coroutines.sync.a aVar2;
        r<Key, Value> rVar;
        t<Key, Value> tVar;
        r<Key, Value> rVar2;
        boolean z10;
        PagingSource<Key, Value> pagingSource;
        r<Key, Value> rVar3;
        PagingSource.b bVar;
        t.a<Key, Value> aVar3;
        MutexImpl mutexImpl;
        r<Key, Value> rVar4;
        kotlinx.coroutines.sync.a aVar4;
        PagingSource.b bVar2;
        t.a<Key, Value> aVar5;
        MutexImpl mutexImpl2;
        PagingSource.b bVar3;
        r<Key, Value> rVar5;
        kotlinx.coroutines.sync.a aVar6;
        boolean zE;
        p pVar;
        Long l10;
        m.c cVar;
        r<Key, Value> rVar6;
        PagingSource.b bVar4;
        t.a<Key, Value> aVar7;
        MutexImpl mutexImpl3;
        kotlinx.coroutines.sync.a aVar8;
        BufferedChannel bufferedChannel;
        PageEvent.Insert insertF;
        PagingSource.b.C0195b c0195b;
        t.a<Key, Value> aVar9;
        MutexImpl mutexImpl4;
        kotlinx.coroutines.sync.a aVar10;
        r<Key, Value> rVar7;
        y<Key, Value> yVarA;
        PagingSource.b.C0195b c0195b2;
        Long l11;
        B<Key, Value> b10;
        kotlinx.coroutines.sync.a aVar11;
        t<Key, Value> tVar2;
        m.a aVar12;
        if (continuationImpl instanceof PageFetcherSnapshot$doInitialLoad$1) {
            pageFetcherSnapshot$doInitialLoad$1 = (PageFetcherSnapshot$doInitialLoad$1) continuationImpl;
            int i10 = pageFetcherSnapshot$doInitialLoad$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pageFetcherSnapshot$doInitialLoad$1.label = i10 - Integer.MIN_VALUE;
            } else {
                pageFetcherSnapshot$doInitialLoad$1 = new PageFetcherSnapshot$doInitialLoad$1(this, continuationImpl);
            }
        } else {
            pageFetcherSnapshot$doInitialLoad$1 = new PageFetcherSnapshot$doInitialLoad$1(this, continuationImpl);
        }
        Object objLoad = pageFetcherSnapshot$doInitialLoad$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        ?? r10 = pageFetcherSnapshot$doInitialLoad$1.label;
        LoadType loadType = LoadType.f19254d;
        LoadType loadType2 = LoadType.f19253c;
        LoadType loadType3 = LoadType.f19252b;
        try {
            try {
                switch (r10) {
                    case 0:
                        kotlin.b.b(objLoad);
                        aVar = this.f19406k;
                        MutexImpl mutexImpl5 = aVar.f19423a;
                        pageFetcherSnapshot$doInitialLoad$1.L$0 = this;
                        pageFetcherSnapshot$doInitialLoad$1.L$1 = aVar;
                        pageFetcherSnapshot$doInitialLoad$1.L$2 = mutexImpl5;
                        pageFetcherSnapshot$doInitialLoad$1.label = 1;
                        if (mutexImpl5.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar2 = mutexImpl5;
                        rVar = this;
                        tVar = aVar.f19424b;
                        pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar;
                        pageFetcherSnapshot$doInitialLoad$1.L$1 = aVar2;
                        pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                        pageFetcherSnapshot$doInitialLoad$1.label = 2;
                        if (rVar.k(tVar, loadType3, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        rVar2 = rVar;
                        r10 = aVar2;
                        p293xa.r rVar8 = p293xa.r.f47939a;
                        r10.g(null);
                        PagingSource.a<Key> aVarG = rVar2.g(loadType3, rVar2.f19397a);
                        z10 = Build.ID == null && Log.isLoggable("Paging", 3);
                        pagingSource = rVar2.f19398b;
                        if (z10) {
                            String message = "Start REFRESH with loadKey " + rVar2.f19397a + " on " + pagingSource;
                            kotlin.jvm.internal.i.e(message, "message");
                        }
                        pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar2;
                        pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                        pageFetcherSnapshot$doInitialLoad$1.label = 3;
                        objLoad = pagingSource.load(aVarG, pageFetcherSnapshot$doInitialLoad$1);
                        if (objLoad == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        rVar3 = rVar2;
                        bVar = (PagingSource.b) objLoad;
                        if (bVar instanceof PagingSource.b.C0195b) {
                            aVar5 = rVar3.f19406k;
                            mutexImpl2 = aVar5.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar5;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl2;
                            pageFetcherSnapshot$doInitialLoad$1.label = 4;
                            if (mutexImpl2.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bVar3 = bVar;
                            rVar5 = rVar3;
                            aVar6 = mutexImpl2;
                            try {
                                t<Key, Value> tVar3 = aVar5.f19424b;
                                zE = tVar3.e(0, loadType3, (PagingSource.b.C0195b) bVar3);
                                pVar = tVar3.f19422l;
                                pVar.c(loadType3, m.c.f19374c);
                                l10 = ((PagingSource.b.C0195b) bVar3).f19317c;
                                cVar = m.c.f19373b;
                                if (l10 == null) {
                                    pVar.c(loadType2, cVar);
                                }
                                if (((PagingSource.b.C0195b) bVar3).f19318d == null) {
                                    pVar.c(loadType, cVar);
                                }
                                aVar6.g(null);
                                if (zE) {
                                    if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                        String message2 = h(loadType3, rVar5.f19397a, bVar3);
                                        kotlin.jvm.internal.i.e(message2, "message");
                                    }
                                    aVar7 = rVar5.f19406k;
                                    mutexImpl3 = aVar7.f19423a;
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                                    pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar7;
                                    pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl3;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 5;
                                    if (mutexImpl3.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    aVar8 = mutexImpl3;
                                    t<Key, Value> tVar4 = aVar7.f19424b;
                                    bufferedChannel = rVar5.j;
                                    insertF = tVar4.f((PagingSource.b.C0195b) bVar3, loadType3);
                                    pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                                    pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                                    pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar8;
                                    pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                    pageFetcherSnapshot$doInitialLoad$1.label = 6;
                                    if (bufferedChannel.t(insertF, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    rVar6 = rVar5;
                                    bVar4 = bVar3;
                                    r10 = aVar8;
                                    p293xa.r rVar9 = p293xa.r.f47939a;
                                    r10.g(null);
                                } else {
                                    if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                        String message3 = h(loadType3, rVar5.f19397a, null);
                                        kotlin.jvm.internal.i.e(message3, "message");
                                    }
                                    rVar6 = rVar5;
                                    bVar4 = bVar3;
                                }
                                if (rVar6.f19401e != null) {
                                    c0195b = (PagingSource.b.C0195b) bVar4;
                                    if (c0195b.f19317c != null || c0195b.f19318d == null) {
                                        aVar9 = rVar6.f19406k;
                                        mutexImpl4 = aVar9.f19423a;
                                        pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar6;
                                        pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar4;
                                        pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar9;
                                        pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl4;
                                        pageFetcherSnapshot$doInitialLoad$1.label = 7;
                                        if (mutexImpl4.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        aVar10 = mutexImpl4;
                                        rVar7 = rVar6;
                                        try {
                                            yVarA = aVar9.f19424b.a(rVar7.f19404h.f19355a.f19360c);
                                            aVar10.g(null);
                                            c0195b2 = (PagingSource.b.C0195b) bVar4;
                                            l11 = c0195b2.f19317c;
                                            b10 = rVar7.f19401e;
                                            if (l11 == null) {
                                                b10.c(loadType2, yVarA);
                                            }
                                            if (c0195b2.f19318d == null) {
                                                b10.c(loadType, yVarA);
                                            }
                                        } catch (Throwable th) {
                                            aVar10.g(null);
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                aVar6.g(null);
                                throw th2;
                            }
                            break;
                        } else if (bVar instanceof PagingSource.b.a) {
                            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                String message4 = h(loadType3, rVar3.f19397a, bVar);
                                kotlin.jvm.internal.i.e(message4, "message");
                            }
                            aVar3 = rVar3.f19406k;
                            mutexImpl = aVar3.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl;
                            pageFetcherSnapshot$doInitialLoad$1.label = 8;
                            if (mutexImpl.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            rVar4 = rVar3;
                            aVar4 = mutexImpl;
                            bVar2 = bVar;
                            try {
                                tVar2 = aVar3.f19424b;
                                aVar12 = new m.a(((PagingSource.b.a) bVar2).f19315b);
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = aVar4;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 9;
                                if (rVar4.j(tVar2, loadType3, aVar12, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                aVar11 = aVar4;
                                p293xa.r rVar10 = p293xa.r.f47939a;
                                aVar11.g(null);
                                return p293xa.r.f47939a;
                            } catch (Throwable th3) {
                                th = th3;
                                aVar11 = aVar4;
                                aVar11.g(null);
                                throw th;
                            }
                        }
                        return p293xa.r.f47939a;
                    case 1:
                        kotlinx.coroutines.sync.a aVar13 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$doInitialLoad$1.L$2;
                        aVar = (t.a) pageFetcherSnapshot$doInitialLoad$1.L$1;
                        rVar = (r) pageFetcherSnapshot$doInitialLoad$1.L$0;
                        kotlin.b.b(objLoad);
                        aVar2 = aVar13;
                        tVar = aVar.f19424b;
                        pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar;
                        pageFetcherSnapshot$doInitialLoad$1.L$1 = aVar2;
                        pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                        pageFetcherSnapshot$doInitialLoad$1.label = 2;
                        if (rVar.k(tVar, loadType3, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        rVar2 = rVar;
                        r10 = aVar2;
                        p293xa.r rVar11 = p293xa.r.f47939a;
                        r10.g(null);
                        PagingSource.a<Key> aVarG2 = rVar2.g(loadType3, rVar2.f19397a);
                        if (Build.ID == null) {
                        }
                        pagingSource = rVar2.f19398b;
                        if (z10) {
                            String message5 = "Start REFRESH with loadKey " + rVar2.f19397a + " on " + pagingSource;
                            kotlin.jvm.internal.i.e(message5, "message");
                        }
                        pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar2;
                        pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                        pageFetcherSnapshot$doInitialLoad$1.label = 3;
                        objLoad = pagingSource.load(aVarG2, pageFetcherSnapshot$doInitialLoad$1);
                        if (objLoad == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        rVar3 = rVar2;
                        bVar = (PagingSource.b) objLoad;
                        if (bVar instanceof PagingSource.b.C0195b) {
                            aVar5 = rVar3.f19406k;
                            mutexImpl2 = aVar5.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar5;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl2;
                            pageFetcherSnapshot$doInitialLoad$1.label = 4;
                            if (mutexImpl2.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bVar3 = bVar;
                            rVar5 = rVar3;
                            aVar6 = mutexImpl2;
                            t<Key, Value> tVar5 = aVar5.f19424b;
                            zE = tVar5.e(0, loadType3, (PagingSource.b.C0195b) bVar3);
                            pVar = tVar5.f19422l;
                            pVar.c(loadType3, m.c.f19374c);
                            l10 = ((PagingSource.b.C0195b) bVar3).f19317c;
                            cVar = m.c.f19373b;
                            if (l10 == null) {
                                pVar.c(loadType2, cVar);
                            }
                            if (((PagingSource.b.C0195b) bVar3).f19318d == null) {
                                pVar.c(loadType, cVar);
                            }
                            aVar6.g(null);
                            if (zE) {
                                if (Build.ID != null) {
                                    String message6 = h(loadType3, rVar5.f19397a, bVar3);
                                    kotlin.jvm.internal.i.e(message6, "message");
                                }
                                aVar7 = rVar5.f19406k;
                                mutexImpl3 = aVar7.f19423a;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar7;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl3;
                                pageFetcherSnapshot$doInitialLoad$1.label = 5;
                                if (mutexImpl3.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                aVar8 = mutexImpl3;
                                t<Key, Value> tVar6 = aVar7.f19424b;
                                bufferedChannel = rVar5.j;
                                insertF = tVar6.f((PagingSource.b.C0195b) bVar3, loadType3);
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar8;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 6;
                                if (bufferedChannel.t(insertF, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                rVar6 = rVar5;
                                bVar4 = bVar3;
                                r10 = aVar8;
                                p293xa.r rVar12 = p293xa.r.f47939a;
                                r10.g(null);
                            } else {
                                if (Build.ID != null) {
                                    String message7 = h(loadType3, rVar5.f19397a, null);
                                    kotlin.jvm.internal.i.e(message7, "message");
                                }
                                rVar6 = rVar5;
                                bVar4 = bVar3;
                            }
                            if (rVar6.f19401e != null) {
                                c0195b = (PagingSource.b.C0195b) bVar4;
                                if (c0195b.f19317c != null) {
                                }
                                aVar9 = rVar6.f19406k;
                                mutexImpl4 = aVar9.f19423a;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar6;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar4;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar9;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl4;
                                pageFetcherSnapshot$doInitialLoad$1.label = 7;
                                if (mutexImpl4.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                aVar10 = mutexImpl4;
                                rVar7 = rVar6;
                                yVarA = aVar9.f19424b.a(rVar7.f19404h.f19355a.f19360c);
                                aVar10.g(null);
                                c0195b2 = (PagingSource.b.C0195b) bVar4;
                                l11 = c0195b2.f19317c;
                                b10 = rVar7.f19401e;
                                if (l11 == null) {
                                    b10.c(loadType2, yVarA);
                                }
                                if (c0195b2.f19318d == null) {
                                    b10.c(loadType, yVarA);
                                }
                            }
                            break;
                        } else if (bVar instanceof PagingSource.b.a) {
                            if (Build.ID != null) {
                                String message8 = h(loadType3, rVar3.f19397a, bVar);
                                kotlin.jvm.internal.i.e(message8, "message");
                            }
                            aVar3 = rVar3.f19406k;
                            mutexImpl = aVar3.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl;
                            pageFetcherSnapshot$doInitialLoad$1.label = 8;
                            if (mutexImpl.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            rVar4 = rVar3;
                            aVar4 = mutexImpl;
                            bVar2 = bVar;
                            tVar2 = aVar3.f19424b;
                            aVar12 = new m.a(((PagingSource.b.a) bVar2).f19315b);
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = aVar4;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                            pageFetcherSnapshot$doInitialLoad$1.label = 9;
                            if (rVar4.j(tVar2, loadType3, aVar12, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            aVar11 = aVar4;
                            p293xa.r rVar13 = p293xa.r.f47939a;
                            aVar11.g(null);
                            return p293xa.r.f47939a;
                        }
                        return p293xa.r.f47939a;
                    case 2:
                        kotlinx.coroutines.sync.a aVar14 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$doInitialLoad$1.L$1;
                        rVar2 = (r) pageFetcherSnapshot$doInitialLoad$1.L$0;
                        kotlin.b.b(objLoad);
                        r10 = aVar14;
                        p293xa.r rVar14 = p293xa.r.f47939a;
                        r10.g(null);
                        PagingSource.a<Key> aVarG3 = rVar2.g(loadType3, rVar2.f19397a);
                        if (Build.ID == null) {
                        }
                        pagingSource = rVar2.f19398b;
                        if (z10) {
                            String message9 = "Start REFRESH with loadKey " + rVar2.f19397a + " on " + pagingSource;
                            kotlin.jvm.internal.i.e(message9, "message");
                        }
                        pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar2;
                        pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                        pageFetcherSnapshot$doInitialLoad$1.label = 3;
                        objLoad = pagingSource.load(aVarG3, pageFetcherSnapshot$doInitialLoad$1);
                        if (objLoad == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        rVar3 = rVar2;
                        bVar = (PagingSource.b) objLoad;
                        if (bVar instanceof PagingSource.b.C0195b) {
                            aVar5 = rVar3.f19406k;
                            mutexImpl2 = aVar5.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar5;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl2;
                            pageFetcherSnapshot$doInitialLoad$1.label = 4;
                            if (mutexImpl2.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bVar3 = bVar;
                            rVar5 = rVar3;
                            aVar6 = mutexImpl2;
                            t<Key, Value> tVar7 = aVar5.f19424b;
                            zE = tVar7.e(0, loadType3, (PagingSource.b.C0195b) bVar3);
                            pVar = tVar7.f19422l;
                            pVar.c(loadType3, m.c.f19374c);
                            l10 = ((PagingSource.b.C0195b) bVar3).f19317c;
                            cVar = m.c.f19373b;
                            if (l10 == null) {
                                pVar.c(loadType2, cVar);
                            }
                            if (((PagingSource.b.C0195b) bVar3).f19318d == null) {
                                pVar.c(loadType, cVar);
                            }
                            aVar6.g(null);
                            if (zE) {
                                if (Build.ID != null) {
                                    String message10 = h(loadType3, rVar5.f19397a, bVar3);
                                    kotlin.jvm.internal.i.e(message10, "message");
                                }
                                aVar7 = rVar5.f19406k;
                                mutexImpl3 = aVar7.f19423a;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar7;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl3;
                                pageFetcherSnapshot$doInitialLoad$1.label = 5;
                                if (mutexImpl3.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                aVar8 = mutexImpl3;
                                t<Key, Value> tVar8 = aVar7.f19424b;
                                bufferedChannel = rVar5.j;
                                insertF = tVar8.f((PagingSource.b.C0195b) bVar3, loadType3);
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar8;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 6;
                                if (bufferedChannel.t(insertF, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                rVar6 = rVar5;
                                bVar4 = bVar3;
                                r10 = aVar8;
                                p293xa.r rVar15 = p293xa.r.f47939a;
                                r10.g(null);
                            } else {
                                if (Build.ID != null) {
                                    String message11 = h(loadType3, rVar5.f19397a, null);
                                    kotlin.jvm.internal.i.e(message11, "message");
                                }
                                rVar6 = rVar5;
                                bVar4 = bVar3;
                            }
                            if (rVar6.f19401e != null) {
                                c0195b = (PagingSource.b.C0195b) bVar4;
                                if (c0195b.f19317c != null) {
                                }
                                aVar9 = rVar6.f19406k;
                                mutexImpl4 = aVar9.f19423a;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar6;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar4;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar9;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl4;
                                pageFetcherSnapshot$doInitialLoad$1.label = 7;
                                if (mutexImpl4.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                aVar10 = mutexImpl4;
                                rVar7 = rVar6;
                                yVarA = aVar9.f19424b.a(rVar7.f19404h.f19355a.f19360c);
                                aVar10.g(null);
                                c0195b2 = (PagingSource.b.C0195b) bVar4;
                                l11 = c0195b2.f19317c;
                                b10 = rVar7.f19401e;
                                if (l11 == null) {
                                    b10.c(loadType2, yVarA);
                                }
                                if (c0195b2.f19318d == null) {
                                    b10.c(loadType, yVarA);
                                }
                            }
                            break;
                        } else if (bVar instanceof PagingSource.b.a) {
                            if (Build.ID != null) {
                                String message12 = h(loadType3, rVar3.f19397a, bVar);
                                kotlin.jvm.internal.i.e(message12, "message");
                            }
                            aVar3 = rVar3.f19406k;
                            mutexImpl = aVar3.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl;
                            pageFetcherSnapshot$doInitialLoad$1.label = 8;
                            if (mutexImpl.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            rVar4 = rVar3;
                            aVar4 = mutexImpl;
                            bVar2 = bVar;
                            tVar2 = aVar3.f19424b;
                            aVar12 = new m.a(((PagingSource.b.a) bVar2).f19315b);
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = aVar4;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                            pageFetcherSnapshot$doInitialLoad$1.label = 9;
                            if (rVar4.j(tVar2, loadType3, aVar12, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            aVar11 = aVar4;
                            p293xa.r rVar16 = p293xa.r.f47939a;
                            aVar11.g(null);
                            return p293xa.r.f47939a;
                        }
                        return p293xa.r.f47939a;
                    case 3:
                        rVar3 = (r) pageFetcherSnapshot$doInitialLoad$1.L$0;
                        kotlin.b.b(objLoad);
                        bVar = (PagingSource.b) objLoad;
                        if (bVar instanceof PagingSource.b.C0195b) {
                            aVar5 = rVar3.f19406k;
                            mutexImpl2 = aVar5.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar5;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl2;
                            pageFetcherSnapshot$doInitialLoad$1.label = 4;
                            if (mutexImpl2.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bVar3 = bVar;
                            rVar5 = rVar3;
                            aVar6 = mutexImpl2;
                            t<Key, Value> tVar9 = aVar5.f19424b;
                            zE = tVar9.e(0, loadType3, (PagingSource.b.C0195b) bVar3);
                            pVar = tVar9.f19422l;
                            pVar.c(loadType3, m.c.f19374c);
                            l10 = ((PagingSource.b.C0195b) bVar3).f19317c;
                            cVar = m.c.f19373b;
                            if (l10 == null) {
                                pVar.c(loadType2, cVar);
                            }
                            if (((PagingSource.b.C0195b) bVar3).f19318d == null) {
                                pVar.c(loadType, cVar);
                            }
                            aVar6.g(null);
                            if (zE) {
                                if (Build.ID != null) {
                                    String message13 = h(loadType3, rVar5.f19397a, bVar3);
                                    kotlin.jvm.internal.i.e(message13, "message");
                                }
                                aVar7 = rVar5.f19406k;
                                mutexImpl3 = aVar7.f19423a;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar7;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl3;
                                pageFetcherSnapshot$doInitialLoad$1.label = 5;
                                if (mutexImpl3.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                aVar8 = mutexImpl3;
                                t<Key, Value> tVar10 = aVar7.f19424b;
                                bufferedChannel = rVar5.j;
                                insertF = tVar10.f((PagingSource.b.C0195b) bVar3, loadType3);
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar8;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 6;
                                if (bufferedChannel.t(insertF, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                rVar6 = rVar5;
                                bVar4 = bVar3;
                                r10 = aVar8;
                                p293xa.r rVar17 = p293xa.r.f47939a;
                                r10.g(null);
                            } else {
                                if (Build.ID != null) {
                                    String message14 = h(loadType3, rVar5.f19397a, null);
                                    kotlin.jvm.internal.i.e(message14, "message");
                                }
                                rVar6 = rVar5;
                                bVar4 = bVar3;
                            }
                            if (rVar6.f19401e != null) {
                                c0195b = (PagingSource.b.C0195b) bVar4;
                                if (c0195b.f19317c != null) {
                                }
                                aVar9 = rVar6.f19406k;
                                mutexImpl4 = aVar9.f19423a;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar6;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar4;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar9;
                                pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl4;
                                pageFetcherSnapshot$doInitialLoad$1.label = 7;
                                if (mutexImpl4.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                aVar10 = mutexImpl4;
                                rVar7 = rVar6;
                                yVarA = aVar9.f19424b.a(rVar7.f19404h.f19355a.f19360c);
                                aVar10.g(null);
                                c0195b2 = (PagingSource.b.C0195b) bVar4;
                                l11 = c0195b2.f19317c;
                                b10 = rVar7.f19401e;
                                if (l11 == null) {
                                    b10.c(loadType2, yVarA);
                                }
                                if (c0195b2.f19318d == null) {
                                    b10.c(loadType, yVarA);
                                }
                            }
                            break;
                        } else if (bVar instanceof PagingSource.b.a) {
                            if (Build.ID != null) {
                                String message15 = h(loadType3, rVar3.f19397a, bVar);
                                kotlin.jvm.internal.i.e(message15, "message");
                            }
                            aVar3 = rVar3.f19406k;
                            mutexImpl = aVar3.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl;
                            pageFetcherSnapshot$doInitialLoad$1.label = 8;
                            if (mutexImpl.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            rVar4 = rVar3;
                            aVar4 = mutexImpl;
                            bVar2 = bVar;
                            tVar2 = aVar3.f19424b;
                            aVar12 = new m.a(((PagingSource.b.a) bVar2).f19315b);
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = aVar4;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                            pageFetcherSnapshot$doInitialLoad$1.label = 9;
                            if (rVar4.j(tVar2, loadType3, aVar12, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            aVar11 = aVar4;
                            p293xa.r rVar18 = p293xa.r.f47939a;
                            aVar11.g(null);
                            return p293xa.r.f47939a;
                        }
                        return p293xa.r.f47939a;
                    case 4:
                        aVar6 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$doInitialLoad$1.L$3;
                        aVar5 = (t.a) pageFetcherSnapshot$doInitialLoad$1.L$2;
                        bVar3 = (PagingSource.b) pageFetcherSnapshot$doInitialLoad$1.L$1;
                        rVar5 = (r) pageFetcherSnapshot$doInitialLoad$1.L$0;
                        kotlin.b.b(objLoad);
                        t<Key, Value> tVar11 = aVar5.f19424b;
                        zE = tVar11.e(0, loadType3, (PagingSource.b.C0195b) bVar3);
                        pVar = tVar11.f19422l;
                        pVar.c(loadType3, m.c.f19374c);
                        l10 = ((PagingSource.b.C0195b) bVar3).f19317c;
                        cVar = m.c.f19373b;
                        if (l10 == null) {
                            pVar.c(loadType2, cVar);
                        }
                        if (((PagingSource.b.C0195b) bVar3).f19318d == null) {
                            pVar.c(loadType, cVar);
                            break;
                        }
                        aVar6.g(null);
                        if (zE) {
                            if (Build.ID != null) {
                                String message16 = h(loadType3, rVar5.f19397a, bVar3);
                                kotlin.jvm.internal.i.e(message16, "message");
                            }
                            aVar7 = rVar5.f19406k;
                            mutexImpl3 = aVar7.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar7;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl3;
                            pageFetcherSnapshot$doInitialLoad$1.label = 5;
                            if (mutexImpl3.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            aVar8 = mutexImpl3;
                            t<Key, Value> tVar12 = aVar7.f19424b;
                            bufferedChannel = rVar5.j;
                            insertF = tVar12.f((PagingSource.b.C0195b) bVar3, loadType3);
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar8;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                            pageFetcherSnapshot$doInitialLoad$1.label = 6;
                            if (bufferedChannel.t(insertF, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            rVar6 = rVar5;
                            bVar4 = bVar3;
                            r10 = aVar8;
                            p293xa.r rVar19 = p293xa.r.f47939a;
                            r10.g(null);
                        } else {
                            if (Build.ID != null) {
                                String message17 = h(loadType3, rVar5.f19397a, null);
                                kotlin.jvm.internal.i.e(message17, "message");
                            }
                            rVar6 = rVar5;
                            bVar4 = bVar3;
                        }
                        if (rVar6.f19401e != null) {
                            c0195b = (PagingSource.b.C0195b) bVar4;
                            if (c0195b.f19317c != null) {
                            }
                            aVar9 = rVar6.f19406k;
                            mutexImpl4 = aVar9.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar6;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar4;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar9;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl4;
                            pageFetcherSnapshot$doInitialLoad$1.label = 7;
                            if (mutexImpl4.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            aVar10 = mutexImpl4;
                            rVar7 = rVar6;
                            yVarA = aVar9.f19424b.a(rVar7.f19404h.f19355a.f19360c);
                            aVar10.g(null);
                            c0195b2 = (PagingSource.b.C0195b) bVar4;
                            l11 = c0195b2.f19317c;
                            b10 = rVar7.f19401e;
                            if (l11 == null) {
                                b10.c(loadType2, yVarA);
                            }
                            if (c0195b2.f19318d == null) {
                                b10.c(loadType, yVarA);
                            }
                            break;
                        }
                        return p293xa.r.f47939a;
                    case 5:
                        kotlinx.coroutines.sync.a aVar15 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$doInitialLoad$1.L$3;
                        aVar7 = (t.a) pageFetcherSnapshot$doInitialLoad$1.L$2;
                        PagingSource.b bVar5 = (PagingSource.b) pageFetcherSnapshot$doInitialLoad$1.L$1;
                        rVar5 = (r) pageFetcherSnapshot$doInitialLoad$1.L$0;
                        kotlin.b.b(objLoad);
                        bVar3 = bVar5;
                        aVar8 = aVar15;
                        t<Key, Value> tVar13 = aVar7.f19424b;
                        bufferedChannel = rVar5.j;
                        insertF = tVar13.f((PagingSource.b.C0195b) bVar3, loadType3);
                        pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar5;
                        pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar3;
                        pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar8;
                        pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                        pageFetcherSnapshot$doInitialLoad$1.label = 6;
                        if (bufferedChannel.t(insertF, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        rVar6 = rVar5;
                        bVar4 = bVar3;
                        r10 = aVar8;
                        p293xa.r rVar110 = p293xa.r.f47939a;
                        r10.g(null);
                        if (rVar6.f19401e != null) {
                            c0195b = (PagingSource.b.C0195b) bVar4;
                            if (c0195b.f19317c != null) {
                            }
                            aVar9 = rVar6.f19406k;
                            mutexImpl4 = aVar9.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar6;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar4;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar9;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl4;
                            pageFetcherSnapshot$doInitialLoad$1.label = 7;
                            if (mutexImpl4.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            aVar10 = mutexImpl4;
                            rVar7 = rVar6;
                            yVarA = aVar9.f19424b.a(rVar7.f19404h.f19355a.f19360c);
                            aVar10.g(null);
                            c0195b2 = (PagingSource.b.C0195b) bVar4;
                            l11 = c0195b2.f19317c;
                            b10 = rVar7.f19401e;
                            if (l11 == null) {
                                b10.c(loadType2, yVarA);
                            }
                            if (c0195b2.f19318d == null) {
                                b10.c(loadType, yVarA);
                            }
                            break;
                        }
                        return p293xa.r.f47939a;
                    case 6:
                        kotlinx.coroutines.sync.a aVar16 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$doInitialLoad$1.L$2;
                        bVar4 = (PagingSource.b) pageFetcherSnapshot$doInitialLoad$1.L$1;
                        rVar6 = (r) pageFetcherSnapshot$doInitialLoad$1.L$0;
                        kotlin.b.b(objLoad);
                        r10 = aVar16;
                        p293xa.r rVar111 = p293xa.r.f47939a;
                        r10.g(null);
                        if (rVar6.f19401e != null) {
                            c0195b = (PagingSource.b.C0195b) bVar4;
                            if (c0195b.f19317c != null) {
                            }
                            aVar9 = rVar6.f19406k;
                            mutexImpl4 = aVar9.f19423a;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = rVar6;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = bVar4;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = aVar9;
                            pageFetcherSnapshot$doInitialLoad$1.L$3 = mutexImpl4;
                            pageFetcherSnapshot$doInitialLoad$1.label = 7;
                            if (mutexImpl4.f(null, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            aVar10 = mutexImpl4;
                            rVar7 = rVar6;
                            yVarA = aVar9.f19424b.a(rVar7.f19404h.f19355a.f19360c);
                            aVar10.g(null);
                            c0195b2 = (PagingSource.b.C0195b) bVar4;
                            l11 = c0195b2.f19317c;
                            b10 = rVar7.f19401e;
                            if (l11 == null) {
                                b10.c(loadType2, yVarA);
                            }
                            if (c0195b2.f19318d == null) {
                                b10.c(loadType, yVarA);
                            }
                            break;
                        }
                        return p293xa.r.f47939a;
                    case 7:
                        aVar10 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$doInitialLoad$1.L$3;
                        aVar9 = (t.a) pageFetcherSnapshot$doInitialLoad$1.L$2;
                        bVar4 = (PagingSource.b) pageFetcherSnapshot$doInitialLoad$1.L$1;
                        rVar7 = (r) pageFetcherSnapshot$doInitialLoad$1.L$0;
                        kotlin.b.b(objLoad);
                        yVarA = aVar9.f19424b.a(rVar7.f19404h.f19355a.f19360c);
                        aVar10.g(null);
                        c0195b2 = (PagingSource.b.C0195b) bVar4;
                        l11 = c0195b2.f19317c;
                        b10 = rVar7.f19401e;
                        if (l11 == null) {
                            b10.c(loadType2, yVarA);
                        }
                        if (c0195b2.f19318d == null) {
                            b10.c(loadType, yVarA);
                        }
                        return p293xa.r.f47939a;
                    case 8:
                        aVar4 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$doInitialLoad$1.L$3;
                        aVar3 = (t.a) pageFetcherSnapshot$doInitialLoad$1.L$2;
                        bVar2 = (PagingSource.b) pageFetcherSnapshot$doInitialLoad$1.L$1;
                        rVar4 = (r) pageFetcherSnapshot$doInitialLoad$1.L$0;
                        kotlin.b.b(objLoad);
                        tVar2 = aVar3.f19424b;
                        aVar12 = new m.a(((PagingSource.b.a) bVar2).f19315b);
                        pageFetcherSnapshot$doInitialLoad$1.L$0 = aVar4;
                        pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                        pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                        pageFetcherSnapshot$doInitialLoad$1.L$3 = null;
                        pageFetcherSnapshot$doInitialLoad$1.label = 9;
                        if (rVar4.j(tVar2, loadType3, aVar12, pageFetcherSnapshot$doInitialLoad$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar11 = aVar4;
                        p293xa.r rVar112 = p293xa.r.f47939a;
                        aVar11.g(null);
                        return p293xa.r.f47939a;
                    case 9:
                        aVar11 = (kotlinx.coroutines.sync.a) pageFetcherSnapshot$doInitialLoad$1.L$0;
                        try {
                            kotlin.b.b(objLoad);
                            p293xa.r rVar113 = p293xa.r.f47939a;
                            aVar11.g(null);
                            return p293xa.r.f47939a;
                        } catch (Throwable th4) {
                            th = th4;
                            aVar11.g(null);
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th5) {
                r10.g(null);
                throw th5;
            }
        } catch (Throwable th6) {
            r10.g(null);
            throw th6;
        }
    }

    public final PagingSource.a<Key> g(LoadType loadType, Key key) {
        kotlin.jvm.internal.i.e(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            return new PagingSource.a.c(key);
        }
        if (iOrdinal == 1) {
            if (key != null) {
                return new PagingSource.a.b(key);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (key != null) {
            return new PagingSource.a.C0194a(key);
        }
        throw new IllegalArgumentException("key cannot be null for append");
    }

    public final Key i(t<Key, Value> tVar, LoadType loadType, int i10, int i11) {
        int i12;
        tVar.getClass();
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            i12 = tVar.f19418g;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = tVar.f19419h;
        }
        if (i10 != i12 || (tVar.f19422l.a(loadType) instanceof m.a) || i11 >= this.f19399c.f19433b) {
            return null;
        }
        LoadType loadType2 = LoadType.f19253c;
        ArrayList arrayList = tVar.f19414c;
        return loadType == loadType2 ? (Key) ((PagingSource.b.C0195b) kotlin.collections.q.O(arrayList)).f19317c : (Key) ((PagingSource.b.C0195b) kotlin.collections.q.V(arrayList)).f19318d;
    }

    public final Object j(t tVar, LoadType loadType, m.a aVar, ContinuationImpl continuationImpl) {
        if (kotlin.jvm.internal.i.a(tVar.f19422l.a(loadType), aVar)) {
            return p293xa.r.f47939a;
        }
        p pVar = tVar.f19422l;
        pVar.c(loadType, aVar);
        Object objT = this.j.t(new PageEvent.b(pVar.d(), null), continuationImpl);
        return objT == CoroutineSingletons.f43038b ? objT : p293xa.r.f47939a;
    }

    public final Object k(t tVar, LoadType loadType, ContinuationImpl continuationImpl) {
        m mVarA = tVar.f19422l.a(loadType);
        m.b bVar = m.b.f19372b;
        if (kotlin.jvm.internal.i.a(mVarA, bVar)) {
            return p293xa.r.f47939a;
        }
        p pVar = tVar.f19422l;
        pVar.c(loadType, bVar);
        Object objT = this.j.t(new PageEvent.b(pVar.d(), null), continuationImpl);
        return objT == CoroutineSingletons.f43038b ? objT : p293xa.r.f47939a;
    }
}
