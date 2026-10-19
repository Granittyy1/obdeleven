package io.ktor.client.plugins;

import com.braze.support.BrazeLogger;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.core.internal.MalformedUTF8InputException;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DefaultTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", l = {R.styleable.AppCompatTheme_editTextBackground, R.styleable.AppCompatTheme_imageButtonStyle, R.styleable.AppCompatTheme_imageButtonStyle, R.styleable.AppCompatTheme_listPopupWindowStyle, R.styleable.AppCompatTheme_listPopupWindowStyle, R.styleable.AppCompatTheme_listPreferredItemPaddingEnd, R.styleable.AppCompatTheme_popupWindowStyle, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowFixedHeightMinor}, m = "invokeSuspend")
public final class DefaultTransformKt$defaultTransformers$2 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a>, io.ktor.client.statement.d, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a> cVar, io.ktor.client.statement.d dVar, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        DefaultTransformKt$defaultTransformers$2 defaultTransformKt$defaultTransformers$2 = new DefaultTransformKt$defaultTransformers$2(3, cVar2);
        defaultTransformKt$defaultTransformers$2.L$0 = cVar;
        defaultTransformKt$defaultTransformers$2.L$1 = dVar;
        return defaultTransformKt$defaultTransformers$2.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0339 A[LOOP:0: B:386:0x020c->B:132:0x0339, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0346  */
    /* JADX WARN: Code duplicated, block: B:138:0x0355  */
    /* JADX WARN: Code duplicated, block: B:139:0x035d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0364  */
    /* JADX WARN: Code duplicated, block: B:142:0x0368  */
    /* JADX WARN: Code duplicated, block: B:148:0x0380 A[Catch: all -> 0x0399, TryCatch #6 {all -> 0x0399, blocks: (B:146:0x0373, B:148:0x0380, B:154:0x0392, B:151:0x0389, B:157:0x039e), top: B:382:0x0373 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0386  */
    /* JADX WARN: Code duplicated, block: B:151:0x0389 A[Catch: all -> 0x0399, TryCatch #6 {all -> 0x0399, blocks: (B:146:0x0373, B:148:0x0380, B:154:0x0392, B:151:0x0389, B:157:0x039e), top: B:382:0x0373 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0392 A[Catch: all -> 0x0399, LOOP:5: B:145:0x0371->B:154:0x0392, LOOP_END, TryCatch #6 {all -> 0x0399, blocks: (B:146:0x0373, B:148:0x0380, B:154:0x0392, B:151:0x0389, B:157:0x039e), top: B:382:0x0373 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:164:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:176:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:177:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:183:0x0407 A[Catch: all -> 0x0436, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x041b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x041d A[Catch: all -> 0x0436, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0420  */
    /* JADX WARN: Code duplicated, block: B:189:0x0422 A[Catch: all -> 0x0436, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0459 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x045b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0461 A[Catch: all -> 0x0436, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0479  */
    /* JADX WARN: Code duplicated, block: B:210:0x047f A[Catch: all -> 0x0436, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x048b A[Catch: all -> 0x0436, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x048f A[Catch: all -> 0x0436, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0492  */
    /* JADX WARN: Code duplicated, block: B:217:0x0495 A[Catch: all -> 0x0436, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:223:0x04ab A[Catch: all -> 0x0436, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:226:0x04b7 A[Catch: all -> 0x0436, TRY_LEAVE, TryCatch #4 {all -> 0x0436, blocks: (B:181:0x03f7, B:183:0x0407, B:186:0x041d, B:191:0x042a, B:189:0x0422, B:198:0x0442, B:199:0x0458, B:203:0x0461, B:205:0x0465, B:206:0x046d, B:208:0x0474, B:210:0x047f, B:212:0x048b, B:214:0x048f, B:219:0x049d, B:217:0x0495, B:223:0x04ab, B:241:0x04e3, B:226:0x04b7, B:242:0x04e7, B:243:0x04eb), top: B:379:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:231:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:250:0x050d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0510 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0513  */
    /* JADX WARN: Code duplicated, block: B:260:0x0524  */
    /* JADX WARN: Code duplicated, block: B:265:0x053f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0541 A[Catch: all -> 0x053c, TryCatch #10 {all -> 0x053c, blocks: (B:262:0x0537, B:266:0x0541, B:270:0x054d), top: B:389:0x0537 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x054d A[Catch: all -> 0x053c, TRY_LEAVE, TryCatch #10 {all -> 0x053c, blocks: (B:262:0x0537, B:266:0x0541, B:270:0x054d), top: B:389:0x0537 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x0559 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:276:0x0560  */
    /* JADX WARN: Code duplicated, block: B:279:0x0566  */
    /* JADX WARN: Code duplicated, block: B:281:0x0574 A[LOOP:1: B:375:0x03ed->B:281:0x0574, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:285:0x058a  */
    /* JADX WARN: Code duplicated, block: B:287:0x058e  */
    /* JADX WARN: Code duplicated, block: B:292:0x05cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:293:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:295:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:297:0x05e3 A[LOOP:4: B:391:0x036a->B:297:0x05e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:303:0x0605  */
    /* JADX WARN: Code duplicated, block: B:316:0x0654 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:317:0x0655  */
    /* JADX WARN: Code duplicated, block: B:328:0x0692  */
    /* JADX WARN: Code duplicated, block: B:329:0x069b  */
    /* JADX WARN: Code duplicated, block: B:332:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:333:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:342:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:343:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:346:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:350:0x0711 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0142  */
    /* JADX WARN: Code duplicated, block: B:368:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:36:0x014e  */
    /* JADX WARN: Code duplicated, block: B:379:0x03f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x03c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0373 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x04cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0537 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x03be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:346:0x06dd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:368:0x07a2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        io.ktor.util.pipeline.c cVar;
        p023ba.a aVar;
        boolean z10;
        io.ktor.client.statement.d dVar;
        Object objD;
        io.ktor.util.pipeline.c cVar2;
        p023ba.a aVar2;
        Object objD2;
        Object objA;
        io.ktor.util.pipeline.c cVar3;
        io.ktor.client.statement.c cVar4;
        Object objT;
        io.ktor.util.pipeline.c cVar5;
        io.ktor.util.pipeline.c cVar6;
        p023ba.a aVar3;
        Object objT2;
        io.ktor.util.pipeline.c cVar7;
        io.ktor.util.pipeline.c cVar8;
        p023ba.a aVar4;
        Object objD3;
        p061ea.f fVar;
        String string;
        io.ktor.util.pipeline.c cVar9;
        CoroutineSingletons coroutineSingletons;
        long j;
        StringBuilder sb2;
        p074fa.a aVarB;
        int i10;
        boolean z11;
        boolean z12;
        ByteBuffer byteBuffer;
        int i11;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        p074fa.a aVarC;
        byte b10;
        int i14;
        char c10;
        int i15;
        boolean z16;
        String str;
        String str2;
        p023ba.a aVar5;
        int i16;
        int i17;
        p074fa.a aVarB2;
        p074fa.a aVar6;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        ByteBuffer byteBuffer2;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        String str3;
        String str4;
        int i31;
        byte b11;
        ByteBuffer byteBuffer3;
        int i32;
        int i33;
        char c11;
        boolean z17;
        int i34;
        char c12;
        boolean z18;
        char c13;
        boolean z19;
        int i35;
        int i36;
        int i37;
        int i38;
        char c14;
        boolean z20;
        p074fa.a aVarC2;
        int i39;
        int iPosition;
        boolean z21;
        boolean z22;
        boolean z23;
        int i40;
        p074fa.a aVarC3;
        p074fa.a aVar7;
        boolean z24;
        boolean z25;
        io.ktor.util.pipeline.c cVar10;
        p023ba.a aVar8;
        Object objD4;
        CoroutineSingletons coroutineSingletons2;
        io.ktor.util.pipeline.c cVar11;
        Object objD5;
        byte[] bArr;
        String str5;
        Long lValueOf;
        boolean z26;
        Object objD6;
        boolean z27;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.f43038b;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                cVar = (io.ktor.util.pipeline.c) this.L$0;
                io.ktor.client.statement.d dVar2 = (io.ktor.client.statement.d) this.L$1;
                aVar = dVar2.f40428a;
                Object obj2 = dVar2.f40429b;
                if (!(obj2 instanceof ByteReadChannel)) {
                    return p293xa.r.f47939a;
                }
                io.ktor.client.statement.c cVarD = ((io.ktor.client.call.a) cVar.f40561b).d();
                kotlin.jvm.internal.c cVar12 = aVar.f20638a;
                if (cVar12.equals(kotlin.jvm.internal.l.a(p293xa.r.class))) {
                    ByteReadChannel byteReadChannel = (ByteReadChannel) obj2;
                    kotlin.jvm.internal.i.e(byteReadChannel, "<this>");
                    byteReadChannel.o(null);
                    io.ktor.client.statement.d dVar3 = new io.ktor.client.statement.d(aVar, p293xa.r.f47939a);
                    this.L$0 = cVar;
                    this.L$1 = aVar;
                    this.label = 1;
                    objD3 = cVar.d(dVar3, this);
                    if (objD3 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    cVar2 = cVar;
                    aVar2 = aVar;
                    dVar = (io.ktor.client.statement.d) objD3;
                    aVar = aVar2;
                    cVar = cVar2;
                } else if (cVar12.equals(kotlin.jvm.internal.l.a(Integer.TYPE))) {
                    this.L$0 = cVar;
                    this.L$1 = aVar;
                    this.L$2 = cVar;
                    this.L$3 = aVar;
                    this.label = 2;
                    objT2 = ((ByteReadChannel) obj2).t(Long.MAX_VALUE, this);
                    if (objT2 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    cVar7 = cVar;
                    cVar8 = cVar7;
                    aVar4 = aVar;
                    fVar = (p061ea.f) objT2;
                    string = "";
                    if (fVar.p()) {
                        aVar4 = aVar4;
                        cVar9 = cVar7;
                        coroutineSingletons = coroutineSingletons3;
                        aVar5 = aVar;
                        cVar8 = cVar8;
                    } else {
                        cVar9 = cVar7;
                        coroutineSingletons = coroutineSingletons3;
                        j = ((long) (fVar.f34869f - fVar.f34868e)) + fVar.f34870g;
                        if (j > 0 || BrazeLogger.SUPPRESS < j) {
                            cVar8 = cVar8;
                            sb2 = new StringBuilder(16);
                            if (fVar.p()) {
                                aVar4 = aVar4;
                                cVar9 = cVar9;
                                aVar5 = aVar;
                            } else {
                                aVarB = p074fa.b.b(fVar, 1);
                                if (aVarB == null) {
                                    i10 = 0;
                                    z11 = false;
                                } else {
                                    i10 = 0;
                                    z11 = false;
                                    while (true) {
                                        try {
                                            byteBuffer = aVarB.f34855a;
                                            i11 = aVarB.f34856b;
                                            i12 = aVarB.f34857c;
                                            i13 = i11;
                                            while (true) {
                                                if (i13 < i12) {
                                                    try {
                                                        b10 = byteBuffer.get(i13);
                                                        i14 = b10 & 255;
                                                        z13 = z11;
                                                        if ((b10 & 128) != 128) {
                                                            c10 = (char) i14;
                                                            if (i10 == Integer.MAX_VALUE) {
                                                                i15 = 1;
                                                                z16 = false;
                                                            } else {
                                                                sb2.append(c10);
                                                                i15 = 1;
                                                                i10++;
                                                                z16 = true;
                                                            }
                                                            if (z16) {
                                                                i13 += i15;
                                                                z11 = z13;
                                                            }
                                                        }
                                                        aVarB.c(i13 - i11);
                                                        z14 = false;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        z12 = true;
                                                        if (z12) {
                                                            p074fa.b.a(fVar, aVarB);
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    z13 = z11;
                                                    aVarB.c(i12 - i11);
                                                    z14 = true;
                                                }
                                                if (z14) {
                                                    z11 = z13;
                                                    z15 = true;
                                                } else if (i10 == Integer.MAX_VALUE) {
                                                    z11 = z13;
                                                    z15 = false;
                                                } else {
                                                    z15 = false;
                                                    z11 = true;
                                                }
                                                if (z15) {
                                                    try {
                                                        aVarC = p074fa.b.c(fVar, aVarB);
                                                        if (aVarC != null) {
                                                            aVar = aVar;
                                                            aVarB = aVarC;
                                                            aVar4 = aVar4;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        z12 = false;
                                                        if (z12) {
                                                            p074fa.b.a(fVar, aVarB);
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    p074fa.b.a(fVar, aVarB);
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z12 = true;
                                        }
                                    }
                                }
                                str = " chars but had only ";
                                str2 = "Premature end of stream: expected at least ";
                                if (z11) {
                                    i16 = 0 - i10;
                                    i17 = BrazeLogger.SUPPRESS - i10;
                                    aVarB2 = p074fa.b.b(fVar, 1);
                                    if (aVarB2 == null) {
                                        aVar4 = aVar4;
                                        cVar9 = cVar9;
                                        str3 = " chars but had only ";
                                        str4 = "Premature end of stream: expected at least ";
                                        aVar5 = aVar;
                                        i26 = 0;
                                    } else {
                                        aVar6 = aVarB2;
                                        i18 = 1;
                                        i19 = 0;
                                        while (true) {
                                            try {
                                                i22 = aVar6.f34857c;
                                                i23 = aVar6.f34856b;
                                                i24 = i19;
                                                i25 = i22 - i23;
                                                if (i25 >= i18) {
                                                    try {
                                                        byteBuffer2 = aVar6.f34855a;
                                                        i26 = i24;
                                                        i27 = 0;
                                                        i28 = 0;
                                                        i29 = 0;
                                                        i30 = i23;
                                                        while (true) {
                                                            if (i30 < i22) {
                                                                aVar5 = aVar;
                                                                b11 = byteBuffer2.get(i30);
                                                                byteBuffer3 = byteBuffer2;
                                                                i32 = b11 & 255;
                                                                str3 = str;
                                                                str4 = str2;
                                                                if ((b11 & 128) == 0) {
                                                                    if (i27 != 0) {
                                                                        throw new MalformedUTF8InputException("Expected " + i27 + " more character bytes");
                                                                    }
                                                                    c14 = (char) i32;
                                                                    if (i26 == i17) {
                                                                        z20 = false;
                                                                    } else {
                                                                        sb2.append(c14);
                                                                        i26++;
                                                                        z20 = true;
                                                                    }
                                                                    if (!z20) {
                                                                        aVar6.c(i30 - i23);
                                                                        i31 = -1;
                                                                        i20 = 1;
                                                                    }
                                                                    i30++;
                                                                    str2 = str4;
                                                                    aVar = aVar5;
                                                                    byteBuffer2 = byteBuffer3;
                                                                    str = str3;
                                                                } else if (i27 == 0) {
                                                                    i35 = 128;
                                                                    i31 = i27;
                                                                    i37 = 1;
                                                                    for (i36 = 7; i37 < i36 && (i32 & i35) != 0; i36 = 7) {
                                                                        i32 &= ~i35;
                                                                        i35 >>= 1;
                                                                        i31++;
                                                                        i37++;
                                                                    }
                                                                    i38 = i31 - 1;
                                                                    if (i31 > i22 - i30) {
                                                                        aVar6.c(i30 - i23);
                                                                        i20 = 1;
                                                                    } else {
                                                                        i29 = i31;
                                                                        i28 = i32;
                                                                        i27 = i38;
                                                                        i30++;
                                                                        str2 = str4;
                                                                        aVar = aVar5;
                                                                        byteBuffer2 = byteBuffer3;
                                                                        str = str3;
                                                                    }
                                                                } else {
                                                                    i33 = (b11 & 127) | (i28 << 6);
                                                                    i27--;
                                                                    if (i27 != 0) {
                                                                        i28 = i33;
                                                                    } else if ((i33 >>> 16) == 0) {
                                                                        c13 = (char) i33;
                                                                        if (i26 == i17) {
                                                                            i34 = 1;
                                                                            z19 = false;
                                                                        } else {
                                                                            sb2.append(c13);
                                                                            i34 = 1;
                                                                            i26++;
                                                                            z19 = true;
                                                                        }
                                                                        if (!z19) {
                                                                            aVar6.c(((i30 - i23) - i29) + i34);
                                                                            i31 = -1;
                                                                            i20 = 1;
                                                                        }
                                                                        i28 = 0;
                                                                    } else {
                                                                        if (i33 > 1114111) {
                                                                            Lb.a.j(i33);
                                                                            throw null;
                                                                        }
                                                                        c11 = (char) ((i33 >>> 10) + 55232);
                                                                        if (i26 == i17) {
                                                                            z17 = false;
                                                                        } else {
                                                                            sb2.append(c11);
                                                                            i26++;
                                                                            z17 = true;
                                                                        }
                                                                        if (z17) {
                                                                            c12 = (char) ((i33 & 1023) + 56320);
                                                                            if (i26 == i17) {
                                                                                i34 = 1;
                                                                                z18 = false;
                                                                            } else {
                                                                                try {
                                                                                    sb2.append(c12);
                                                                                    i34 = 1;
                                                                                    i26++;
                                                                                    z18 = true;
                                                                                } catch (Throwable th4) {
                                                                                    throw th4;
                                                                                }
                                                                            }
                                                                            if (!z18) {
                                                                            }
                                                                            i28 = 0;
                                                                        } else {
                                                                            i34 = 1;
                                                                        }
                                                                        aVar6.c(((i30 - i23) - i29) + i34);
                                                                        i31 = -1;
                                                                        i20 = 1;
                                                                    }
                                                                    i30++;
                                                                    str2 = str4;
                                                                    aVar = aVar5;
                                                                    byteBuffer2 = byteBuffer3;
                                                                    str = str3;
                                                                }
                                                            } else {
                                                                str3 = str;
                                                                str4 = str2;
                                                                aVar5 = aVar;
                                                                i20 = 1;
                                                                try {
                                                                    aVar6.c(i25);
                                                                    i31 = 0;
                                                                } catch (Throwable th5) {
                                                                    throw th5;
                                                                }
                                                            }
                                                            if (i31 == 0) {
                                                                i31 = i20;
                                                            } else if (i31 <= 0) {
                                                                i31 = 0;
                                                            }
                                                            try {
                                                                i25 = aVar6.f34857c - aVar6.f34856b;
                                                                i18 = i31;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                i21 = i20;
                                                                if (i21 != 0) {
                                                                    p074fa.b.a(fVar, aVar6);
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th7) {
                                                        throw th7;
                                                    }
                                                } else {
                                                    str3 = str;
                                                    str4 = str2;
                                                    aVar5 = aVar;
                                                    i20 = 1;
                                                    i26 = i24;
                                                }
                                                if (i25 == 0) {
                                                    try {
                                                        aVarC2 = p074fa.b.c(fVar, aVar6);
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        i21 = 0;
                                                        if (i21 != 0) {
                                                            p074fa.b.a(fVar, aVar6);
                                                        }
                                                        throw th;
                                                    }
                                                    break;
                                                } else if (i25 >= i18 || aVar6.f34860f - aVar6.f34859e < 8) {
                                                    p074fa.b.a(fVar, aVar6);
                                                    aVarC2 = p074fa.b.b(fVar, i18);
                                                } else {
                                                    aVarC2 = aVar6;
                                                }
                                                if (aVarC2 == null) {
                                                    i39 = 0;
                                                } else if (i18 <= 0) {
                                                    aVar6 = aVarC2;
                                                    i39 = i20;
                                                } else {
                                                    i19 = i26;
                                                    aVar6 = aVarC2;
                                                    str2 = str4;
                                                    aVar4 = aVar4;
                                                    cVar9 = cVar9;
                                                    aVar = aVar5;
                                                    str = str3;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                i20 = 1;
                                            }
                                        }
                                        if (i39 != 0) {
                                            p074fa.b.a(fVar, aVar6);
                                        }
                                    }
                                    if (i26 < i16) {
                                        throw new MalformedUTF8InputException(A8.f.d(i16, i26, str4, str3));
                                    }
                                } else {
                                    aVar4 = aVar4;
                                    cVar9 = cVar9;
                                    aVar5 = aVar;
                                    if (i10 < 0) {
                                        throw new MalformedUTF8InputException(A8.f.d(0, i10, "Premature end of stream: expected at least ", " chars but had only "));
                                    }
                                }
                            }
                            string = sb2.toString();
                            kotlin.jvm.internal.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
                        } else {
                            int i41 = (int) j;
                            Charset charset = kotlin.text.a.f43120b;
                            kotlin.jvm.internal.i.e(charset, "charset");
                            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
                            kotlin.jvm.internal.i.d(charsetDecoderNewDecoder, "charset.newDecoder()");
                            CharBuffer charBuffer = p049da.a.f34632a;
                            if (i41 == 0) {
                                cVar8 = cVar8;
                            } else if (fVar.f34869f - fVar.f34868e >= i41) {
                                if (fVar.f34867d.hasArray()) {
                                    ByteBuffer byteBuffer4 = fVar.f34867d;
                                    byte[] bArrArray = byteBuffer4.array();
                                    kotlin.jvm.internal.i.d(bArrArray, "bb.array()");
                                    int iPosition2 = byteBuffer4.position() + byteBuffer4.arrayOffset() + fVar.s().f34856b;
                                    Charset charset2 = charsetDecoderNewDecoder.charset();
                                    kotlin.jvm.internal.i.d(charset2, "charset()");
                                    String str6 = new String(bArrArray, iPosition2, i41, charset2);
                                    fVar.b(i41);
                                    string = str6;
                                } else {
                                    CharBuffer charBufferAllocate = CharBuffer.allocate(i41);
                                    ByteBuffer byteBuffer5 = fVar.f34867d;
                                    int i42 = fVar.s().f34856b;
                                    ByteBuffer byteBuffer6 = p036ca.b.f22529a;
                                    ByteBuffer byteBufferJ = kotlin.jvm.internal.n.j(byteBuffer5, i42, i41);
                                    CoderResult coderResultDecode = charsetDecoderNewDecoder.decode(byteBufferJ, charBufferAllocate, true);
                                    if (coderResultDecode.isMalformed() || coderResultDecode.isUnmappable()) {
                                        p049da.a.d(coderResultDecode);
                                    }
                                    charBufferAllocate.flip();
                                    fVar.b(byteBufferJ.position());
                                    string = charBufferAllocate.toString();
                                    kotlin.jvm.internal.i.d(string, "cb.toString()");
                                }
                                cVar8 = cVar8;
                            } else {
                                CharBuffer charBufferAllocate2 = CharBuffer.allocate(i41);
                                p074fa.a aVarB3 = p074fa.b.b(fVar, 1);
                                if (aVarB3 == null) {
                                    iPosition = i41;
                                    cVar8 = cVar8;
                                    z25 = false;
                                } else {
                                    iPosition = i41;
                                    p074fa.a aVar9 = aVarB3;
                                    int i43 = 1;
                                    int i44 = 1;
                                    boolean z28 = false;
                                    while (true) {
                                        try {
                                            z22 = z28;
                                            int i45 = aVar9.f34857c - aVar9.f34856b;
                                            if (i45 >= i43) {
                                                try {
                                                    if (!charBufferAllocate2.hasRemaining() || iPosition == 0) {
                                                        z23 = z22;
                                                        i40 = 0;
                                                    } else {
                                                        ByteBuffer byteBuffer7 = aVar9.f34855a;
                                                        int i46 = aVar9.f34856b;
                                                        int i47 = aVar9.f34857c - i46;
                                                        ByteBuffer byteBuffer8 = p036ca.b.f22529a;
                                                        ByteBuffer byteBufferJ2 = kotlin.jvm.internal.n.j(byteBuffer7, i46, i47);
                                                        int iLimit = byteBufferJ2.limit();
                                                        int iPosition3 = byteBufferJ2.position();
                                                        boolean z29 = iLimit - iPosition3 >= iPosition;
                                                        if (z29) {
                                                            byteBufferJ2.limit(iPosition3 + iPosition);
                                                        }
                                                        CoderResult coderResultDecode2 = charsetDecoderNewDecoder.decode(byteBufferJ2, charBufferAllocate2, z29);
                                                        if (coderResultDecode2.isMalformed() || coderResultDecode2.isUnmappable()) {
                                                            p049da.a.d(coderResultDecode2);
                                                        }
                                                        i44 = (coderResultDecode2.isUnderflow() && byteBufferJ2.hasRemaining()) ? i44 + 1 : 1;
                                                        byteBufferJ2.limit(iLimit);
                                                        iPosition -= byteBufferJ2.position() - iPosition3;
                                                        if (byteBufferJ2.limit() != i47) {
                                                            throw new IllegalStateException("Buffer's limit change is not allowed");
                                                        }
                                                        aVar9.c(byteBufferJ2.position());
                                                        i40 = i44;
                                                        z23 = z29;
                                                    }
                                                    z22 = z23;
                                                    i45 = aVar9.f34857c - aVar9.f34856b;
                                                    i43 = i40;
                                                } catch (Throwable th10) {
                                                    throw th10;
                                                }
                                            } else {
                                                cVar8 = cVar8;
                                            }
                                            if (i45 == 0) {
                                                try {
                                                    aVarC3 = p074fa.b.c(fVar, aVar9);
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    z21 = false;
                                                    if (z21) {
                                                        p074fa.b.a(fVar, aVar9);
                                                    }
                                                    throw th;
                                                }
                                                break;
                                            } else {
                                                if (i45 < i43 || aVar9.f34860f - aVar9.f34859e < 8) {
                                                    p074fa.b.a(fVar, aVar9);
                                                    aVarC3 = p074fa.b.b(fVar, i43);
                                                } else {
                                                    aVar7 = aVar9;
                                                }
                                                if (aVar7 == null) {
                                                    aVar7 = aVar9;
                                                    z24 = false;
                                                } else if (i43 <= 0) {
                                                    z24 = true;
                                                } else {
                                                    aVar9 = aVar7;
                                                    z28 = z22;
                                                    cVar8 = cVar8;
                                                }
                                            }
                                            aVar7 = aVarC3;
                                            if (aVar7 == null) {
                                                aVar7 = aVar9;
                                                z24 = false;
                                            } else if (i43 <= 0) {
                                                z24 = true;
                                            } else {
                                                aVar9 = aVar7;
                                                z28 = z22;
                                                cVar8 = cVar8;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            z21 = true;
                                        }
                                    }
                                    if (z24) {
                                        p074fa.b.a(fVar, aVar7);
                                    }
                                    z25 = z22;
                                }
                                if (charBufferAllocate2.hasRemaining() && !z25) {
                                    CoderResult coderResultDecode3 = charsetDecoderNewDecoder.decode(p049da.a.f34633b, charBufferAllocate2, true);
                                    if (coderResultDecode3.isMalformed() || coderResultDecode3.isUnmappable()) {
                                        p049da.a.d(coderResultDecode3);
                                    }
                                }
                                if (iPosition > 0) {
                                    throw new EOFException("Not enough bytes available: had only " + (i41 - iPosition) + " instead of " + i41);
                                }
                                if (iPosition < 0) {
                                    throw new AssertionError("remainingInputBytes < 0");
                                }
                                charBufferAllocate2.flip();
                                string = charBufferAllocate2.toString();
                                kotlin.jvm.internal.i.d(string, "cb.toString()");
                            }
                            aVar4 = aVar4;
                            cVar9 = cVar9;
                            aVar5 = aVar;
                        }
                    }
                    io.ktor.client.statement.d dVar4 = new io.ktor.client.statement.d(aVar5, new Integer(Integer.parseInt(string)));
                    cVar10 = cVar9;
                    this.L$0 = cVar10;
                    aVar8 = aVar4;
                    this.L$1 = aVar8;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    objD4 = cVar8.d(dVar4, this);
                    coroutineSingletons2 = coroutineSingletons;
                    if (objD4 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    cVar11 = cVar10;
                    dVar = (io.ktor.client.statement.d) objD4;
                    cVar = cVar11;
                    aVar = aVar8;
                } else {
                    z10 = true;
                    if (cVar12.equals(kotlin.jvm.internal.l.a(p061ea.d.class)) ? true : cVar12.equals(kotlin.jvm.internal.l.a(p061ea.f.class))) {
                        this.L$0 = cVar;
                        this.L$1 = aVar;
                        this.L$2 = cVar;
                        this.L$3 = aVar;
                        this.label = 4;
                        objT = ((ByteReadChannel) obj2).t(Long.MAX_VALUE, this);
                        if (objT == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        cVar5 = cVar;
                        cVar6 = cVar5;
                        aVar3 = aVar;
                        io.ktor.client.statement.d dVar5 = new io.ktor.client.statement.d(aVar3, objT);
                        this.L$0 = cVar6;
                        this.L$1 = aVar;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        objD5 = cVar5.d(dVar5, this);
                        if (objD5 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        cVar3 = cVar6;
                        dVar = (io.ktor.client.statement.d) objD5;
                        cVar = cVar3;
                    } else if (cVar12.equals(kotlin.jvm.internal.l.a(byte[].class))) {
                        this.L$0 = cVar;
                        this.L$1 = aVar;
                        this.L$2 = cVarD;
                        this.label = 6;
                        objA = io.ktor.util.c.a((ByteReadChannel) obj2, this);
                        if (objA == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        cVar3 = cVar;
                        cVar4 = cVarD;
                        bArr = (byte[]) objA;
                        kotlin.jvm.internal.i.e(cVar4, "<this>");
                        io.ktor.http.g gVarA = cVar4.a();
                        List<String> list = io.ktor.http.k.f40481a;
                        str5 = gVarA.get("Content-Length");
                        if (str5 != null) {
                            lValueOf = Long.valueOf(Long.parseLong(str5));
                        } else {
                            lValueOf = null;
                        }
                        boolean z30 = io.ktor.util.j.f40546a;
                        if (cVar4.a().get("Content-Encoding") == null) {
                            z26 = z10;
                        } else {
                            z26 = false;
                        }
                        boolean zA = kotlin.jvm.internal.i.a(((io.ktor.client.call.a) cVar3.f40561b).c().getMethod(), io.ktor.http.o.f40486f);
                        if (z26 && !zA && lValueOf != null && lValueOf.longValue() > 0) {
                            if (bArr.length == ((int) lValueOf.longValue())) {
                                z27 = z10;
                            } else {
                                z27 = false;
                            }
                            if (!z27) {
                                throw new IllegalStateException(("Expected " + lValueOf + ", actual " + bArr.length).toString());
                            }
                        }
                        io.ktor.client.statement.d dVar6 = new io.ktor.client.statement.d(aVar, bArr);
                        this.L$0 = cVar3;
                        this.L$1 = aVar;
                        this.L$2 = null;
                        this.label = 7;
                        objD6 = cVar3.d(dVar6, this);
                        if (objD6 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        dVar = (io.ktor.client.statement.d) objD6;
                        cVar = cVar3;
                    } else if (cVar12.equals(kotlin.jvm.internal.l.a(ByteReadChannel.class))) {
                        final C2700k0 c2700k0 = new C2700k0((InterfaceC2694i0) cVarD.getCoroutineContext().get(InterfaceC2694i0.b.f43449b));
                        io.ktor.utils.io.e eVarA = io.ktor.utils.io.i.a(cVar, cVarD.getCoroutineContext(), false, new DefaultTransformKt$defaultTransformers$2$result$channel$1(obj2, cVarD, null));
                        eVarA.f40596b.B(new Ia.l<Throwable, p293xa.r>() { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(Throwable th13) {
                                c2700k0.b();
                                return p293xa.r.f47939a;
                            }
                        });
                        io.ktor.client.statement.d dVar7 = new io.ktor.client.statement.d(aVar, eVarA.f40597c);
                        this.L$0 = cVar;
                        this.L$1 = aVar;
                        this.label = 8;
                        objD2 = cVar.d(dVar7, this);
                        if (objD2 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        cVar2 = cVar;
                        aVar2 = aVar;
                        dVar = (io.ktor.client.statement.d) objD2;
                        aVar = aVar2;
                        cVar = cVar2;
                    } else if (cVar12.equals(kotlin.jvm.internal.l.a(io.ktor.http.q.class))) {
                        ByteReadChannel byteReadChannel2 = (ByteReadChannel) obj2;
                        kotlin.jvm.internal.i.e(byteReadChannel2, "<this>");
                        byteReadChannel2.o(null);
                        io.ktor.client.statement.d dVar8 = new io.ktor.client.statement.d(aVar, cVarD.f());
                        this.L$0 = cVar;
                        this.L$1 = aVar;
                        this.label = 9;
                        objD = cVar.d(dVar8, this);
                        if (objD == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        cVar2 = cVar;
                        aVar2 = aVar;
                        dVar = (io.ktor.client.statement.d) objD;
                        aVar = aVar2;
                        cVar = cVar2;
                    } else {
                        dVar = null;
                    }
                }
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            case 1:
                aVar2 = (p023ba.a) this.L$1;
                io.ktor.util.pipeline.c cVar13 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                cVar2 = cVar13;
                objD3 = obj;
                dVar = (io.ktor.client.statement.d) objD3;
                aVar = aVar2;
                cVar = cVar2;
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            case 2:
                aVar = (p023ba.a) this.L$3;
                cVar8 = (io.ktor.util.pipeline.c) this.L$2;
                aVar4 = (p023ba.a) this.L$1;
                cVar7 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                objT2 = obj;
                fVar = (p061ea.f) objT2;
                string = "";
                if (fVar.p()) {
                    aVar4 = aVar4;
                    cVar9 = cVar7;
                    coroutineSingletons = coroutineSingletons3;
                    aVar5 = aVar;
                    cVar8 = cVar8;
                } else {
                    cVar9 = cVar7;
                    coroutineSingletons = coroutineSingletons3;
                    j = ((long) (fVar.f34869f - fVar.f34868e)) + fVar.f34870g;
                    if (j > 0) {
                        cVar8 = cVar8;
                        sb2 = new StringBuilder(16);
                        if (fVar.p()) {
                            aVar4 = aVar4;
                            cVar9 = cVar9;
                            aVar5 = aVar;
                        } else {
                            aVarB = p074fa.b.b(fVar, 1);
                            if (aVarB == null) {
                                i10 = 0;
                                z11 = false;
                            } else {
                                i10 = 0;
                                z11 = false;
                                while (true) {
                                    byteBuffer = aVarB.f34855a;
                                    i11 = aVarB.f34856b;
                                    i12 = aVarB.f34857c;
                                    i13 = i11;
                                    while (true) {
                                        if (i13 < i12) {
                                            b10 = byteBuffer.get(i13);
                                            i14 = b10 & 255;
                                            z13 = z11;
                                            if ((b10 & 128) != 128) {
                                                c10 = (char) i14;
                                                if (i10 == Integer.MAX_VALUE) {
                                                    i15 = 1;
                                                    z16 = false;
                                                } else {
                                                    sb2.append(c10);
                                                    i15 = 1;
                                                    i10++;
                                                    z16 = true;
                                                }
                                                if (z16) {
                                                    i13 += i15;
                                                    z11 = z13;
                                                }
                                            }
                                            aVarB.c(i13 - i11);
                                            z14 = false;
                                        } else {
                                            z13 = z11;
                                            aVarB.c(i12 - i11);
                                            z14 = true;
                                        }
                                        if (z14) {
                                            z11 = z13;
                                            z15 = true;
                                        } else if (i10 == Integer.MAX_VALUE) {
                                            z11 = z13;
                                            z15 = false;
                                        } else {
                                            z15 = false;
                                            z11 = true;
                                        }
                                        if (z15) {
                                            p074fa.b.a(fVar, aVarB);
                                        } else {
                                            aVarC = p074fa.b.c(fVar, aVarB);
                                            if (aVarC != null) {
                                                aVar = aVar;
                                                aVarB = aVarC;
                                                aVar4 = aVar4;
                                            }
                                        }
                                    }
                                }
                            }
                            str = " chars but had only ";
                            str2 = "Premature end of stream: expected at least ";
                            if (z11) {
                                i16 = 0 - i10;
                                i17 = BrazeLogger.SUPPRESS - i10;
                                aVarB2 = p074fa.b.b(fVar, 1);
                                if (aVarB2 == null) {
                                    aVar4 = aVar4;
                                    cVar9 = cVar9;
                                    str3 = " chars but had only ";
                                    str4 = "Premature end of stream: expected at least ";
                                    aVar5 = aVar;
                                    i26 = 0;
                                } else {
                                    aVar6 = aVarB2;
                                    i18 = 1;
                                    i19 = 0;
                                    while (true) {
                                        i22 = aVar6.f34857c;
                                        i23 = aVar6.f34856b;
                                        i24 = i19;
                                        i25 = i22 - i23;
                                        if (i25 >= i18) {
                                            byteBuffer2 = aVar6.f34855a;
                                            i26 = i24;
                                            i27 = 0;
                                            i28 = 0;
                                            i29 = 0;
                                            i30 = i23;
                                            while (true) {
                                                if (i30 < i22) {
                                                    aVar5 = aVar;
                                                    b11 = byteBuffer2.get(i30);
                                                    byteBuffer3 = byteBuffer2;
                                                    i32 = b11 & 255;
                                                    str3 = str;
                                                    str4 = str2;
                                                    if ((b11 & 128) == 0) {
                                                        if (i27 != 0) {
                                                            throw new MalformedUTF8InputException("Expected " + i27 + " more character bytes");
                                                        }
                                                        c14 = (char) i32;
                                                        if (i26 == i17) {
                                                            z20 = false;
                                                        } else {
                                                            sb2.append(c14);
                                                            i26++;
                                                            z20 = true;
                                                        }
                                                        if (!z20) {
                                                            aVar6.c(i30 - i23);
                                                            i31 = -1;
                                                            i20 = 1;
                                                        }
                                                        i30++;
                                                        str2 = str4;
                                                        aVar = aVar5;
                                                        byteBuffer2 = byteBuffer3;
                                                        str = str3;
                                                    } else if (i27 == 0) {
                                                        i35 = 128;
                                                        i31 = i27;
                                                        i37 = 1;
                                                        while (i37 < i36) {
                                                            i32 &= ~i35;
                                                            i35 >>= 1;
                                                            i31++;
                                                            i37++;
                                                        }
                                                        i38 = i31 - 1;
                                                        if (i31 > i22 - i30) {
                                                            aVar6.c(i30 - i23);
                                                            i20 = 1;
                                                        } else {
                                                            i29 = i31;
                                                            i28 = i32;
                                                            i27 = i38;
                                                            i30++;
                                                            str2 = str4;
                                                            aVar = aVar5;
                                                            byteBuffer2 = byteBuffer3;
                                                            str = str3;
                                                        }
                                                    } else {
                                                        i33 = (b11 & 127) | (i28 << 6);
                                                        i27--;
                                                        if (i27 != 0) {
                                                            i28 = i33;
                                                        } else if ((i33 >>> 16) == 0) {
                                                            c13 = (char) i33;
                                                            if (i26 == i17) {
                                                                i34 = 1;
                                                                z19 = false;
                                                            } else {
                                                                sb2.append(c13);
                                                                i34 = 1;
                                                                i26++;
                                                                z19 = true;
                                                            }
                                                            if (!z19) {
                                                                aVar6.c(((i30 - i23) - i29) + i34);
                                                                i31 = -1;
                                                                i20 = 1;
                                                            }
                                                            i28 = 0;
                                                        } else {
                                                            if (i33 > 1114111) {
                                                                Lb.a.j(i33);
                                                                throw null;
                                                            }
                                                            c11 = (char) ((i33 >>> 10) + 55232);
                                                            if (i26 == i17) {
                                                                z17 = false;
                                                            } else {
                                                                sb2.append(c11);
                                                                i26++;
                                                                z17 = true;
                                                            }
                                                            if (z17) {
                                                                c12 = (char) ((i33 & 1023) + 56320);
                                                                if (i26 == i17) {
                                                                    i34 = 1;
                                                                    z18 = false;
                                                                } else {
                                                                    sb2.append(c12);
                                                                    i34 = 1;
                                                                    i26++;
                                                                    z18 = true;
                                                                }
                                                                if (!z18) {
                                                                }
                                                                i28 = 0;
                                                            } else {
                                                                i34 = 1;
                                                            }
                                                            aVar6.c(((i30 - i23) - i29) + i34);
                                                            i31 = -1;
                                                            i20 = 1;
                                                        }
                                                        i30++;
                                                        str2 = str4;
                                                        aVar = aVar5;
                                                        byteBuffer2 = byteBuffer3;
                                                        str = str3;
                                                    }
                                                } else {
                                                    str3 = str;
                                                    str4 = str2;
                                                    aVar5 = aVar;
                                                    i20 = 1;
                                                    aVar6.c(i25);
                                                    i31 = 0;
                                                }
                                                if (i31 == 0) {
                                                    i31 = i20;
                                                } else if (i31 <= 0) {
                                                    i31 = 0;
                                                }
                                                i25 = aVar6.f34857c - aVar6.f34856b;
                                                i18 = i31;
                                            }
                                        } else {
                                            str3 = str;
                                            str4 = str2;
                                            aVar5 = aVar;
                                            i20 = 1;
                                            i26 = i24;
                                        }
                                        if (i25 == 0) {
                                            aVarC2 = p074fa.b.c(fVar, aVar6);
                                            break;
                                        } else if (i25 >= i18) {
                                            p074fa.b.a(fVar, aVar6);
                                            aVarC2 = p074fa.b.b(fVar, i18);
                                        } else {
                                            p074fa.b.a(fVar, aVar6);
                                            aVarC2 = p074fa.b.b(fVar, i18);
                                        }
                                        if (aVarC2 == null) {
                                            i39 = 0;
                                        } else if (i18 <= 0) {
                                            aVar6 = aVarC2;
                                            i39 = i20;
                                        } else {
                                            i19 = i26;
                                            aVar6 = aVarC2;
                                            str2 = str4;
                                            aVar4 = aVar4;
                                            cVar9 = cVar9;
                                            aVar = aVar5;
                                            str = str3;
                                        }
                                    }
                                    if (i39 != 0) {
                                        p074fa.b.a(fVar, aVar6);
                                    }
                                }
                                if (i26 < i16) {
                                    throw new MalformedUTF8InputException(A8.f.d(i16, i26, str4, str3));
                                }
                            } else {
                                aVar4 = aVar4;
                                cVar9 = cVar9;
                                aVar5 = aVar;
                                if (i10 < 0) {
                                    throw new MalformedUTF8InputException(A8.f.d(0, i10, "Premature end of stream: expected at least ", " chars but had only "));
                                }
                            }
                        }
                        string = sb2.toString();
                        kotlin.jvm.internal.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
                    } else {
                        cVar8 = cVar8;
                        sb2 = new StringBuilder(16);
                        if (fVar.p()) {
                            aVar4 = aVar4;
                            cVar9 = cVar9;
                            aVar5 = aVar;
                        } else {
                            aVarB = p074fa.b.b(fVar, 1);
                            if (aVarB == null) {
                                i10 = 0;
                                z11 = false;
                            } else {
                                i10 = 0;
                                z11 = false;
                                while (true) {
                                    byteBuffer = aVarB.f34855a;
                                    i11 = aVarB.f34856b;
                                    i12 = aVarB.f34857c;
                                    i13 = i11;
                                    while (true) {
                                        if (i13 < i12) {
                                            b10 = byteBuffer.get(i13);
                                            i14 = b10 & 255;
                                            z13 = z11;
                                            if ((b10 & 128) != 128) {
                                                c10 = (char) i14;
                                                if (i10 == Integer.MAX_VALUE) {
                                                    i15 = 1;
                                                    z16 = false;
                                                } else {
                                                    sb2.append(c10);
                                                    i15 = 1;
                                                    i10++;
                                                    z16 = true;
                                                }
                                                if (z16) {
                                                    i13 += i15;
                                                    z11 = z13;
                                                }
                                            }
                                            aVarB.c(i13 - i11);
                                            z14 = false;
                                        } else {
                                            z13 = z11;
                                            aVarB.c(i12 - i11);
                                            z14 = true;
                                        }
                                        if (z14) {
                                            z11 = z13;
                                            z15 = true;
                                        } else if (i10 == Integer.MAX_VALUE) {
                                            z11 = z13;
                                            z15 = false;
                                        } else {
                                            z15 = false;
                                            z11 = true;
                                        }
                                        if (z15) {
                                            p074fa.b.a(fVar, aVarB);
                                        } else {
                                            aVarC = p074fa.b.c(fVar, aVarB);
                                            if (aVarC != null) {
                                                aVar = aVar;
                                                aVarB = aVarC;
                                                aVar4 = aVar4;
                                            }
                                        }
                                    }
                                }
                            }
                            str = " chars but had only ";
                            str2 = "Premature end of stream: expected at least ";
                            if (z11) {
                                i16 = 0 - i10;
                                i17 = BrazeLogger.SUPPRESS - i10;
                                aVarB2 = p074fa.b.b(fVar, 1);
                                if (aVarB2 == null) {
                                    aVar4 = aVar4;
                                    cVar9 = cVar9;
                                    str3 = " chars but had only ";
                                    str4 = "Premature end of stream: expected at least ";
                                    aVar5 = aVar;
                                    i26 = 0;
                                } else {
                                    aVar6 = aVarB2;
                                    i18 = 1;
                                    i19 = 0;
                                    while (true) {
                                        i22 = aVar6.f34857c;
                                        i23 = aVar6.f34856b;
                                        i24 = i19;
                                        i25 = i22 - i23;
                                        if (i25 >= i18) {
                                            byteBuffer2 = aVar6.f34855a;
                                            i26 = i24;
                                            i27 = 0;
                                            i28 = 0;
                                            i29 = 0;
                                            i30 = i23;
                                            while (true) {
                                                if (i30 < i22) {
                                                    aVar5 = aVar;
                                                    b11 = byteBuffer2.get(i30);
                                                    byteBuffer3 = byteBuffer2;
                                                    i32 = b11 & 255;
                                                    str3 = str;
                                                    str4 = str2;
                                                    if ((b11 & 128) == 0) {
                                                        if (i27 != 0) {
                                                            throw new MalformedUTF8InputException("Expected " + i27 + " more character bytes");
                                                        }
                                                        c14 = (char) i32;
                                                        if (i26 == i17) {
                                                            z20 = false;
                                                        } else {
                                                            sb2.append(c14);
                                                            i26++;
                                                            z20 = true;
                                                        }
                                                        if (!z20) {
                                                            aVar6.c(i30 - i23);
                                                            i31 = -1;
                                                            i20 = 1;
                                                        }
                                                        i30++;
                                                        str2 = str4;
                                                        aVar = aVar5;
                                                        byteBuffer2 = byteBuffer3;
                                                        str = str3;
                                                    } else if (i27 == 0) {
                                                        i35 = 128;
                                                        i31 = i27;
                                                        i37 = 1;
                                                        while (i37 < i36) {
                                                            i32 &= ~i35;
                                                            i35 >>= 1;
                                                            i31++;
                                                            i37++;
                                                        }
                                                        i38 = i31 - 1;
                                                        if (i31 > i22 - i30) {
                                                            aVar6.c(i30 - i23);
                                                            i20 = 1;
                                                        } else {
                                                            i29 = i31;
                                                            i28 = i32;
                                                            i27 = i38;
                                                            i30++;
                                                            str2 = str4;
                                                            aVar = aVar5;
                                                            byteBuffer2 = byteBuffer3;
                                                            str = str3;
                                                        }
                                                    } else {
                                                        i33 = (b11 & 127) | (i28 << 6);
                                                        i27--;
                                                        if (i27 != 0) {
                                                            i28 = i33;
                                                        } else if ((i33 >>> 16) == 0) {
                                                            c13 = (char) i33;
                                                            if (i26 == i17) {
                                                                i34 = 1;
                                                                z19 = false;
                                                            } else {
                                                                sb2.append(c13);
                                                                i34 = 1;
                                                                i26++;
                                                                z19 = true;
                                                            }
                                                            if (!z19) {
                                                                aVar6.c(((i30 - i23) - i29) + i34);
                                                                i31 = -1;
                                                                i20 = 1;
                                                            }
                                                            i28 = 0;
                                                        } else {
                                                            if (i33 > 1114111) {
                                                                Lb.a.j(i33);
                                                                throw null;
                                                            }
                                                            c11 = (char) ((i33 >>> 10) + 55232);
                                                            if (i26 == i17) {
                                                                z17 = false;
                                                            } else {
                                                                sb2.append(c11);
                                                                i26++;
                                                                z17 = true;
                                                            }
                                                            if (z17) {
                                                                c12 = (char) ((i33 & 1023) + 56320);
                                                                if (i26 == i17) {
                                                                    i34 = 1;
                                                                    z18 = false;
                                                                } else {
                                                                    sb2.append(c12);
                                                                    i34 = 1;
                                                                    i26++;
                                                                    z18 = true;
                                                                }
                                                                if (!z18) {
                                                                }
                                                                i28 = 0;
                                                            } else {
                                                                i34 = 1;
                                                            }
                                                            aVar6.c(((i30 - i23) - i29) + i34);
                                                            i31 = -1;
                                                            i20 = 1;
                                                        }
                                                        i30++;
                                                        str2 = str4;
                                                        aVar = aVar5;
                                                        byteBuffer2 = byteBuffer3;
                                                        str = str3;
                                                    }
                                                } else {
                                                    str3 = str;
                                                    str4 = str2;
                                                    aVar5 = aVar;
                                                    i20 = 1;
                                                    aVar6.c(i25);
                                                    i31 = 0;
                                                }
                                                if (i31 == 0) {
                                                    i31 = i20;
                                                } else if (i31 <= 0) {
                                                    i31 = 0;
                                                }
                                                i25 = aVar6.f34857c - aVar6.f34856b;
                                                i18 = i31;
                                            }
                                        } else {
                                            str3 = str;
                                            str4 = str2;
                                            aVar5 = aVar;
                                            i20 = 1;
                                            i26 = i24;
                                        }
                                        if (i25 == 0) {
                                            aVarC2 = p074fa.b.c(fVar, aVar6);
                                            break;
                                        } else if (i25 >= i18) {
                                            p074fa.b.a(fVar, aVar6);
                                            aVarC2 = p074fa.b.b(fVar, i18);
                                        } else {
                                            p074fa.b.a(fVar, aVar6);
                                            aVarC2 = p074fa.b.b(fVar, i18);
                                        }
                                        if (aVarC2 == null) {
                                            i39 = 0;
                                        } else if (i18 <= 0) {
                                            aVar6 = aVarC2;
                                            i39 = i20;
                                        } else {
                                            i19 = i26;
                                            aVar6 = aVarC2;
                                            str2 = str4;
                                            aVar4 = aVar4;
                                            cVar9 = cVar9;
                                            aVar = aVar5;
                                            str = str3;
                                        }
                                    }
                                    if (i39 != 0) {
                                        p074fa.b.a(fVar, aVar6);
                                    }
                                }
                                if (i26 < i16) {
                                    throw new MalformedUTF8InputException(A8.f.d(i16, i26, str4, str3));
                                }
                            } else {
                                aVar4 = aVar4;
                                cVar9 = cVar9;
                                aVar5 = aVar;
                                if (i10 < 0) {
                                    throw new MalformedUTF8InputException(A8.f.d(0, i10, "Premature end of stream: expected at least ", " chars but had only "));
                                }
                            }
                        }
                        string = sb2.toString();
                        kotlin.jvm.internal.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
                    }
                }
                io.ktor.client.statement.d dVar9 = new io.ktor.client.statement.d(aVar5, new Integer(Integer.parseInt(string)));
                cVar10 = cVar9;
                this.L$0 = cVar10;
                aVar8 = aVar4;
                this.L$1 = aVar8;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                objD4 = cVar8.d(dVar9, this);
                coroutineSingletons2 = coroutineSingletons;
                if (objD4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                cVar11 = cVar10;
                dVar = (io.ktor.client.statement.d) objD4;
                cVar = cVar11;
                aVar = aVar8;
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            case 3:
                p023ba.a aVar10 = (p023ba.a) this.L$1;
                cVar11 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                aVar8 = aVar10;
                objD4 = obj;
                dVar = (io.ktor.client.statement.d) objD4;
                cVar = cVar11;
                aVar = aVar8;
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            case 4:
                aVar3 = (p023ba.a) this.L$3;
                io.ktor.util.pipeline.c cVar14 = (io.ktor.util.pipeline.c) this.L$2;
                p023ba.a aVar11 = (p023ba.a) this.L$1;
                cVar6 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar11;
                cVar5 = cVar14;
                objT = obj;
                io.ktor.client.statement.d dVar10 = new io.ktor.client.statement.d(aVar3, objT);
                this.L$0 = cVar6;
                this.L$1 = aVar;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                objD5 = cVar5.d(dVar10, this);
                if (objD5 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                cVar3 = cVar6;
                dVar = (io.ktor.client.statement.d) objD5;
                cVar = cVar3;
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            case 5:
                p023ba.a aVar12 = (p023ba.a) this.L$1;
                cVar3 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar12;
                objD5 = obj;
                dVar = (io.ktor.client.statement.d) objD5;
                cVar = cVar3;
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            case 6:
                cVar4 = (io.ktor.client.statement.c) this.L$2;
                p023ba.a aVar13 = (p023ba.a) this.L$1;
                io.ktor.util.pipeline.c cVar15 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar13;
                cVar3 = cVar15;
                z10 = true;
                objA = obj;
                bArr = (byte[]) objA;
                kotlin.jvm.internal.i.e(cVar4, "<this>");
                io.ktor.http.g gVarA2 = cVar4.a();
                List<String> list2 = io.ktor.http.k.f40481a;
                str5 = gVarA2.get("Content-Length");
                if (str5 != null) {
                    lValueOf = Long.valueOf(Long.parseLong(str5));
                } else {
                    lValueOf = null;
                }
                boolean z31 = io.ktor.util.j.f40546a;
                if (cVar4.a().get("Content-Encoding") == null) {
                    z26 = z10;
                } else {
                    z26 = false;
                }
                boolean zA2 = kotlin.jvm.internal.i.a(((io.ktor.client.call.a) cVar3.f40561b).c().getMethod(), io.ktor.http.o.f40486f);
                if (z26) {
                    if (bArr.length == ((int) lValueOf.longValue())) {
                        z27 = z10;
                    } else {
                        z27 = false;
                    }
                    if (!z27) {
                        throw new IllegalStateException(("Expected " + lValueOf + ", actual " + bArr.length).toString());
                    }
                }
                io.ktor.client.statement.d dVar11 = new io.ktor.client.statement.d(aVar, bArr);
                this.L$0 = cVar3;
                this.L$1 = aVar;
                this.L$2 = null;
                this.label = 7;
                objD6 = cVar3.d(dVar11, this);
                if (objD6 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                dVar = (io.ktor.client.statement.d) objD6;
                cVar = cVar3;
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            case 7:
                p023ba.a aVar14 = (p023ba.a) this.L$1;
                cVar3 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar14;
                objD6 = obj;
                dVar = (io.ktor.client.statement.d) objD6;
                cVar = cVar3;
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            case 8:
                aVar2 = (p023ba.a) this.L$1;
                io.ktor.util.pipeline.c cVar16 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                cVar2 = cVar16;
                objD2 = obj;
                dVar = (io.ktor.client.statement.d) objD2;
                aVar = aVar2;
                cVar = cVar2;
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            case 9:
                aVar2 = (p023ba.a) this.L$1;
                io.ktor.util.pipeline.c cVar17 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                cVar2 = cVar17;
                objD = obj;
                dVar = (io.ktor.client.statement.d) objD;
                aVar = aVar2;
                cVar = cVar2;
                if (dVar != null) {
                    DefaultTransformKt.f40306a.b("Transformed with default transformers response body for " + ((io.ktor.client.call.a) cVar.f40561b).c().k() + " to " + aVar.f20638a);
                }
                return p293xa.r.f47939a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
