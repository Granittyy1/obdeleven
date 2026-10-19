package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.InterfaceC0987w;
import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.Y;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import kotlin.collections.y;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    public static final int a(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i11 < i13) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    public static int b(int[] iArr) {
        int length = iArr.length;
        int i10 = -1;
        int i11 = BrazeLogger.SUPPRESS;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (-2147483647 <= i13 && i13 < i11) {
                i10 = i12;
                i11 = i13;
            }
        }
        return i10;
    }

    public static final int c(int[] iArr, long j) {
        int i10 = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i11 = (int) (j >> 32); i11 < i10; i11++) {
            iMax = Math.max(iMax, iArr[i11]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x054e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0561  */
    /* JADX WARN: Code duplicated, block: B:268:0x0570 A[LOOP:21: B:267:0x056e->B:268:0x0570, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x057c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0581  */
    /* JADX WARN: Code duplicated, block: B:275:0x058e  */
    /* JADX WARN: Code duplicated, block: B:277:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:278:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:288:0x05db  */
    /* JADX WARN: Code duplicated, block: B:291:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:292:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:294:0x0603  */
    /* JADX WARN: Code duplicated, block: B:295:0x060d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0615  */
    /* JADX WARN: Code duplicated, block: B:299:0x0617  */
    /* JADX WARN: Code duplicated, block: B:302:0x0634  */
    /* JADX WARN: Code duplicated, block: B:314:0x0668  */
    /* JADX WARN: Code duplicated, block: B:316:0x066b  */
    /* JADX WARN: Code duplicated, block: B:318:0x0675  */
    /* JADX WARN: Code duplicated, block: B:319:0x0678  */
    /* JADX WARN: Code duplicated, block: B:321:0x067b  */
    /* JADX WARN: Code duplicated, block: B:322:0x067d  */
    /* JADX WARN: Code duplicated, block: B:325:0x0681 A[LOOP:41: B:315:0x0669->B:325:0x0681, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:328:0x0687  */
    /* JADX WARN: Code duplicated, block: B:330:0x0692  */
    /* JADX WARN: Code duplicated, block: B:332:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:335:0x06b5 A[LOOP:24: B:303:0x063a->B:335:0x06b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:336:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:338:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:341:0x06d5 A[LOOP:25: B:340:0x06d3->B:341:0x06d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:350:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:352:0x0705  */
    /* JADX WARN: Code duplicated, block: B:353:0x0708  */
    /* JADX WARN: Code duplicated, block: B:355:0x070c  */
    /* JADX WARN: Code duplicated, block: B:362:0x074e  */
    /* JADX WARN: Code duplicated, block: B:364:0x0752  */
    /* JADX WARN: Code duplicated, block: B:366:0x075d  */
    /* JADX WARN: Code duplicated, block: B:369:0x076c A[LOOP:29: B:368:0x076a->B:369:0x076c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:371:0x0782 A[LOOP:27: B:344:0x06e3->B:371:0x0782, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:374:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:375:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:415:0x0845 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:416:0x0847  */
    /* JADX WARN: Code duplicated, block: B:419:0x085a  */
    /* JADX WARN: Code duplicated, block: B:421:0x086a  */
    /* JADX WARN: Code duplicated, block: B:422:0x086c  */
    /* JADX WARN: Code duplicated, block: B:425:0x0870 A[LOOP:33: B:418:0x0858->B:425:0x0870, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:429:0x087d  */
    /* JADX WARN: Code duplicated, block: B:430:0x0882  */
    /* JADX WARN: Code duplicated, block: B:433:0x0895  */
    /* JADX WARN: Code duplicated, block: B:434:0x0898  */
    /* JADX WARN: Code duplicated, block: B:436:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:438:0x08a5 A[LOOP:31: B:398:0x0812->B:438:0x08a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:439:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:442:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:444:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:447:0x08d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:448:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:450:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:452:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:453:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:457:0x08f6 A[LOOP:35: B:449:0x08de->B:457:0x08f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:460:0x0901  */
    /* JADX WARN: Code duplicated, block: B:462:0x0905  */
    /* JADX WARN: Code duplicated, block: B:465:0x090b  */
    /* JADX WARN: Code duplicated, block: B:467:0x0913 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:472:0x091f  */
    /* JADX WARN: Code duplicated, block: B:474:0x0925  */
    /* JADX WARN: Code duplicated, block: B:476:0x092b  */
    /* JADX WARN: Code duplicated, block: B:477:0x092d  */
    /* JADX WARN: Code duplicated, block: B:480:0x0931 A[LOOP:36: B:473:0x0923->B:480:0x0931, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:484:0x093d  */
    /* JADX WARN: Code duplicated, block: B:486:0x0944  */
    /* JADX WARN: Code duplicated, block: B:491:0x0969  */
    /* JADX WARN: Code duplicated, block: B:494:0x097c  */
    /* JADX WARN: Code duplicated, block: B:497:0x099c  */
    /* JADX WARN: Code duplicated, block: B:499:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:502:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:504:0x09ad A[LOOP:37: B:500:0x09a6->B:504:0x09ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:506:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:509:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:511:0x09f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:512:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:514:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:517:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:518:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:520:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a2f A[LOOP:38: B:521:0x0a2d->B:522:0x0a2f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:524:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:527:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:530:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a58 A[LOOP:39: B:526:0x0a49->B:533:0x0a58, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:536:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:541:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a71 A[LOOP:40: B:537:0x0a62->B:544:0x0a71, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:548:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:549:0x0a7a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0acf  */
    /* JADX WARN: Code duplicated, block: B:593:0x0c2d  */
    /* JADX WARN: Code duplicated, block: B:658:0x05c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x06cd A[EDGE_INSN: B:659:0x06cd->B:337:0x06cd BREAK  A[LOOP:24: B:303:0x063a->B:335:0x06b5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x0726 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x0792 A[EDGE_INSN: B:662:0x0792->B:372:0x0792 BREAK  A[LOOP:26: B:343:0x06e2->B:664:0x06e2, LOOP_LABEL: LOOP:26: B:343:0x06e2->B:664:0x06e2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0721 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x070e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x08b0 A[EDGE_INSN: B:677:0x08b0->B:440:0x08b0 BREAK  A[LOOP:31: B:398:0x0812->B:438:0x08a5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x0875 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0879 A[EDGE_INSN: B:681:0x0879->B:427:0x0879 BREAK  A[LOOP:33: B:418:0x0858->B:425:0x0870], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x095b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x08fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x08f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0936 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x08d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x09b0 A[EDGE_INSN: B:689:0x09b0->B:505:0x09b0 BREAK  A[LOOP:37: B:500:0x09a6->B:504:0x09ad], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0a56 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0a5d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0a74 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0a6f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x0666 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x0664 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final n d(l lVar, int i10, int[] iArr, int[] iArr2, boolean z10) {
        long j;
        int i11;
        long j10;
        boolean z11;
        InterfaceC0988x interfaceC0988x;
        int i12;
        kotlin.collections.i[] iVarArr;
        int i13;
        boolean z12;
        int i14;
        int iA;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int[] iArr3;
        int[] iArr4;
        int i22;
        final l lVar2;
        int i23;
        int[] iArr5;
        int i24;
        int i25;
        int[] iArr6;
        boolean z13;
        boolean z14;
        LazyStaggeredGridState lazyStaggeredGridState;
        float fFloatValue;
        float f10;
        float f11;
        int[] iArrCopyOf;
        int length;
        int i26;
        float f12;
        LazyStaggeredGridState lazyStaggeredGridState2;
        float f13;
        int i27;
        int i28;
        boolean z15;
        long j11;
        int iG;
        int iG2;
        int[] iArr7;
        int i29;
        int iMin;
        int i30;
        List<Integer> listA;
        int size;
        int i31;
        long j12;
        f fVar;
        List arrayList;
        int i32;
        int i33;
        ArrayList arrayList2;
        int i34;
        u uVar;
        int i35;
        int[] iArr8;
        int i36;
        int i37;
        int i38;
        int i39;
        p pVar;
        int i40;
        int i41;
        ArrayList arrayList3;
        List<Integer> listA2;
        int size2;
        int i42;
        List arrayList4;
        int[] iArr9;
        final ArrayList arrayList5;
        LazyStaggeredGridState lazyStaggeredGridState3;
        LazyLayoutItemAnimator<p> lazyLayoutItemAnimator;
        float f14;
        int i43;
        InterfaceC0987w interfaceC0987wA;
        boolean zS0;
        int i44;
        int length2;
        int i45;
        int iF;
        int i46;
        int i47;
        int i48;
        boolean z16;
        boolean z17;
        int length3;
        int i49;
        boolean z18;
        boolean z19;
        int i50;
        boolean z20;
        long jB;
        int i51;
        int iG3;
        int i52;
        int size3;
        int i53;
        int i54;
        int i55;
        int i56;
        int iIntValue;
        int i57;
        List<Integer> list;
        boolean z21;
        int iF2;
        int[] iArr10;
        int length4;
        int i58;
        int i59;
        boolean z22;
        boolean z23;
        int size4;
        int i60;
        boolean z24;
        boolean z25;
        n nVar;
        p pVar2;
        int index;
        int iMin2;
        boolean z26;
        n nVar2;
        List<p> listF;
        int size5;
        int i61;
        p pVar3;
        p pVar4;
        int iD;
        int[] iArr11;
        int i62;
        boolean z27;
        boolean z28;
        int i63;
        int i64;
        int i65;
        p pVar5;
        int i66;
        int iC;
        int i67;
        int i68;
        int i69;
        int i70;
        int i71;
        p pVar6;
        int i72;
        int i73;
        int i74;
        int iIntValue2;
        List<Integer> list2;
        int iF3;
        int i75;
        p pVar7;
        int i76;
        boolean z29;
        boolean z30;
        int i77;
        kotlin.collections.i iVar;
        int iE;
        int i78;
        LazyStaggeredGridState lazyStaggeredGridState4;
        int i79;
        int[] iArrE;
        int i80;
        int i81;
        int i82;
        int[] iArrE2;
        int i83;
        lVar = lVar;
        int i84 = i10;
        f fVar2 = lVar.f10825c;
        int iB = fVar2.b();
        LazyStaggeredGridState lazyStaggeredGridState5 = lVar.f10823a;
        int i85 = lVar.f10830h;
        k kVar = lVar.f10839r;
        long j13 = lVar.f10827e;
        InterfaceC0988x interfaceC0988x2 = lVar.f10829g;
        LazyStaggeredGridState lazyStaggeredGridState6 = lazyStaggeredGridState5;
        if (iB <= 0 || (i11 = lVar.f10841t) == 0) {
            int iJ = p013b0.a.j(j13);
            int i86 = p013b0.a.i(j13);
            lazyStaggeredGridState6.f10807t.d(0, iJ, i86, new ArrayList(), kVar.f10843b.a(), lVar.f10839r, lVar.f10828f, interfaceC0988x2.S0(), lVar.f10841t, lVar.f10836o, 0, 0, lVar.f10835n, lVar.f10838q);
            if (interfaceC0988x2.S0()) {
                j = j13;
            } else {
                long jB2 = lazyStaggeredGridState6.f10807t.b();
                if (p013b0.l.b(jB2, 0L)) {
                    j = j13;
                } else {
                    j = j13;
                    iJ = p013b0.b.g((int) (jB2 >> 32), j);
                    i86 = p013b0.b.f((int) (jB2 & 4294967295L), j);
                }
            }
            F fY1 = interfaceC0988x2.y1(iJ, i86, y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                @Override // Ia.l
                public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar) {
                    return p293xa.r.f47939a;
                }
            });
            EmptyList emptyList = EmptyList.f42983b;
            int iJ2 = p013b0.a.j(j);
            int i87 = p013b0.a.i(j);
            int i88 = lVar.j;
            int i89 = lVar.f10832k;
            return new n(iArr, iArr2, 0.0f, fY1, 0.0f, false, lVar.f10828f, false, lVar.f10826d, fVar2.g(), interfaceC0988x2, iB, emptyList, (((long) iJ2) << 32) | (((long) i87) & 4294967295L), -i88, i89 + i85, i88, i89, lVar.f10834m, lVar.f10835n);
        }
        int[] iArrCopyOf2 = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.i.d(iArrCopyOf2, "copyOf(...)");
        int[] iArrCopyOf3 = Arrays.copyOf(iArr2, iArr2.length);
        kotlin.jvm.internal.i.d(iArrCopyOf3, "copyOf(...)");
        int length5 = iArrCopyOf2.length - 1;
        LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar.f10840s;
        if (length5 >= 0) {
            while (true) {
                int i90 = length5 - 1;
                while (true) {
                    int i91 = iArrCopyOf2[length5];
                    if (i91 < iB && lazyStaggeredGridLaneInfo.a(i91, length5)) {
                        break;
                    }
                    long j14 = j13;
                    iArrCopyOf2[length5] = lazyStaggeredGridLaneInfo.d(iArrCopyOf2[length5], length5);
                    j13 = j14;
                }
                int i92 = iArrCopyOf2[length5];
                j10 = j13;
                if (i92 >= 0) {
                    fVar2.g().f(i92);
                    lazyStaggeredGridLaneInfo.h(iArrCopyOf2[length5], length5);
                }
                if (i90 < 0) {
                    break;
                }
                length5 = i90;
                j13 = j10;
            }
        } else {
            j10 = j13;
        }
        f(iArrCopyOf3, -i84);
        kotlin.collections.i[] iVarArr2 = new kotlin.collections.i[i11];
        for (int i93 = 0; i93 < i11; i93++) {
            iVarArr2[i93] = new kotlin.collections.i(16);
        }
        int i94 = lVar.j;
        f(iArrCopyOf3, -i94);
        boolean z31 = false;
        while (true) {
            int length6 = iArrCopyOf2.length;
            z11 = z31;
            interfaceC0988x = interfaceC0988x2;
            int i95 = 0;
            while (true) {
                i12 = lVar.f10834m;
                if (i95 >= length6) {
                    iVarArr = iVarArr2;
                    i13 = iB;
                    z12 = false;
                    break;
                }
                int i96 = iArrCopyOf2[i95];
                int i97 = length6;
                i13 = iB;
                iVarArr = iVarArr2;
                if (iArrCopyOf3[i95] < Math.max(-i12, 0) && i96 > 0) {
                    z12 = true;
                    break;
                }
                i95++;
                length6 = i97;
                iB = i13;
                iVarArr2 = iVarArr;
            }
            if (!z12) {
                i14 = i11;
                iA = -1;
                break;
            }
            iA = a(iArrCopyOf2);
            int i98 = iArrCopyOf2[iA];
            int length7 = iArrCopyOf3.length;
            int i99 = 0;
            while (i99 < length7) {
                int i100 = length7;
                int i101 = i11;
                if (iArrCopyOf2[i99] != iArrCopyOf2[iA]) {
                    int i102 = iArrCopyOf3[i99];
                    int i103 = iArrCopyOf3[iA];
                    if (i102 < i103) {
                        iArrCopyOf3[i99] = i103;
                    }
                }
                i99++;
                length7 = i100;
                i11 = i101;
            }
            i14 = i11;
            int iD2 = lazyStaggeredGridLaneInfo.d(i98, iA);
            if (iD2 < 0) {
                break;
            }
            long jB3 = lVar.b(fVar2, iD2, iA);
            f fVar3 = fVar2;
            int i104 = (int) (jB3 & 4294967295L);
            int i105 = (int) (jB3 >> 32);
            int i106 = i104 - i105;
            lazyStaggeredGridLaneInfo.h(iD2, i106 != 1 ? -2 : i105);
            p pVarC = kVar.c(iD2, jB3);
            int iC2 = c(iArrCopyOf3, jB3);
            int[] iArrE3 = i106 != 1 ? lazyStaggeredGridLaneInfo.e(iD2) : null;
            boolean z32 = z11;
            while (i105 < i104) {
                iArrCopyOf2[i105] = iD2;
                int i107 = pVarC.f10880n + iC2 + (iArrE3 == null ? 0 : iArrE3[i105]);
                iArrCopyOf3[i105] = i107;
                if (i107 + i85 <= 0) {
                    z32 = true;
                }
                i105++;
                i104 = i104;
            }
            z31 = z32;
            interfaceC0988x2 = interfaceC0988x;
            iB = i13;
            iVarArr2 = iVarArr;
            i11 = i14;
            fVar2 = fVar3;
        }
        int i108 = -i94;
        int i109 = iArrCopyOf3[0];
        if (i109 < i108) {
            int i110 = i108 - i109;
            f(iArrCopyOf3, i110);
            i84 -= i110;
        }
        f(iArrCopyOf3, i94);
        int i111 = -1;
        if (iA == -1) {
            int length8 = iArrCopyOf2.length;
            int i112 = 0;
            while (true) {
                if (i112 >= length8) {
                    i112 = -1;
                    break;
                }
                if (iArrCopyOf2[i112] == 0) {
                    break;
                }
                i112++;
            }
            iA = i112;
            i111 = -1;
        }
        if (iA != i111 && e(iArrCopyOf2, lVar, iArrCopyOf3, iA) && z10) {
            lazyStaggeredGridLaneInfo.g();
            int length9 = iArrCopyOf2.length;
            int[] iArr12 = new int[length9];
            int i113 = 0;
            while (i113 < length9) {
                iArr12[i113] = i111;
                i113++;
                i111 = -1;
            }
            int length10 = iArrCopyOf3.length;
            int[] iArr13 = new int[length10];
            for (int i114 = 0; i114 < length10; i114++) {
                iArr13[i114] = iArrCopyOf3[iA];
            }
            return d(lVar, i84, iArr12, iArr13, false);
        }
        int[] iArrCopyOf4 = Arrays.copyOf(iArrCopyOf2, iArrCopyOf2.length);
        kotlin.jvm.internal.i.d(iArrCopyOf4, "copyOf(...)");
        int length11 = iArrCopyOf3.length;
        int[] iArr14 = new int[length11];
        for (int i115 = 0; i115 < length11; i115++) {
            iArr14[i115] = -iArrCopyOf3[i115];
        }
        int i116 = i12 + i108;
        int i117 = lVar.f10832k;
        int i118 = i117 + i85;
        int i119 = i108;
        int i120 = i118 < 0 ? 0 : i118;
        String str = "copyOf(...)";
        int iB2 = b(iArrCopyOf4);
        int i121 = 0;
        boolean z33 = z11;
        while (true) {
            i84 = i84;
            if (iB2 == -1) {
                i15 = i14;
                break;
            }
            int i122 = i14;
            if (i121 >= i122) {
                i15 = i122;
                break;
            }
            i94 = i94;
            int i123 = iArrCopyOf4[iB2];
            i85 = i85;
            int length12 = iArrCopyOf4.length;
            iArrCopyOf2 = iArrCopyOf2;
            i12 = i12;
            int i124 = Integer.MAX_VALUE;
            int i125 = 0;
            iB2 = -1;
            while (i125 < length12) {
                int i126 = length12;
                int i127 = i123 + 1;
                int[] iArr15 = iArrCopyOf3;
                int i128 = iArrCopyOf4[i125];
                if (i127 <= i128 && i128 < i124) {
                    i124 = i128;
                    iB2 = i125;
                }
                i125++;
                length12 = i126;
                iArrCopyOf3 = iArr15;
            }
            iArrCopyOf3 = iArrCopyOf3;
            i121++;
            if (i123 >= 0) {
                fVar2 = fVar2;
                long jB4 = lVar.b(fVar2, i123, iB2);
                p pVarC2 = kVar.c(i123, jB4);
                int i129 = (int) (jB4 & 4294967295L);
                i120 = i120;
                int i130 = (int) (jB4 >> 32);
                int i131 = i129 - i130;
                lazyStaggeredGridLaneInfo.h(i123, i131 != 1 ? -2 : i130);
                int iC3 = c(iArr14, jB4);
                for (int i132 = i130; i132 < i129; i132++) {
                    iArr14[i132] = pVarC2.f10880n + iC3;
                    iArrCopyOf4[i132] = i123;
                    iVarArr[i132].addLast(pVarC2);
                }
                if (iC3 >= i116 || iArr14[i130] > i116) {
                    i83 = 1;
                } else {
                    pVarC2.f10878l = false;
                    i83 = 1;
                    z33 = true;
                }
                if (i131 != i83) {
                    i121 = i122;
                    i14 = i121;
                } else {
                    i121 = i121;
                    i14 = i122;
                }
            } else {
                lVar = lVar;
                iArrCopyOf3 = iArrCopyOf3;
                i94 = i94;
                iB2 = iB2;
                i85 = i85;
                i14 = i122;
                i84 = i84;
            }
        }
        loop14: while (true) {
            int i133 = 0;
            while (true) {
                if (i133 >= length11) {
                    i16 = i120;
                    i17 = i15;
                    for (int i134 = 0; i134 < i17; i134++) {
                        if (!iVarArr[i134].isEmpty()) {
                            i18 = i13;
                            i19 = 1;
                            break loop14;
                        }
                    }
                    break;
                }
                int i135 = iArr14[i133];
                i16 = i120;
                if (i135 < i16 || i135 <= 0) {
                    i17 = i15;
                    break;
                }
                i133++;
                i120 = i16;
            }
            int iB3 = b(iArr14);
            i19 = 1;
            int iW = kotlin.collections.k.W(iArrCopyOf4) + 1;
            i18 = i13;
            if (iW >= i18) {
                break;
            }
            int[] iArr16 = iArrCopyOf3;
            int i136 = i17;
            int[] iArr17 = iArrCopyOf4;
            f fVar4 = fVar2;
            int[] iArr18 = iArr14;
            int i137 = i119;
            String str2 = str;
            int i138 = i84;
            int i139 = i85;
            int i140 = i12;
            int i141 = length11;
            int i142 = i94;
            InterfaceC0988x interfaceC0988x3 = interfaceC0988x;
            int i143 = i16;
            LazyStaggeredGridState lazyStaggeredGridState7 = lazyStaggeredGridState6;
            int[] iArr19 = iArrCopyOf2;
            long jB5 = lVar.b(fVar4, iW, iB3);
            int i144 = (int) (jB5 & 4294967295L);
            int i145 = i116;
            int i146 = (int) (jB5 >> 32);
            int i147 = i144 - i146;
            lazyStaggeredGridLaneInfo.h(iW, i147 != 1 ? -2 : i146);
            p pVarC3 = kVar.c(iW, jB5);
            int iC4 = c(iArr18, jB5);
            if (i147 != 1) {
                iArrE2 = lazyStaggeredGridLaneInfo.e(iW);
                if (iArrE2 == null) {
                    iArrE2 = new int[i136];
                }
            } else {
                iArrE2 = null;
            }
            int i148 = i146;
            while (i148 < i144) {
                if (iArrE2 != null) {
                    iArrE2[i148] = iC4 - iArr18[i148];
                }
                iArr17[i148] = iW;
                iArr18[i148] = pVarC3.f10880n + iC4;
                iVarArr[i148].addLast(pVarC3);
                i148++;
                iArr17 = iArr17;
            }
            int[] iArr20 = iArr17;
            final Integer numValueOf = Integer.valueOf(iW);
            kotlin.collections.i<LazyStaggeredGridLaneInfo.a> iVar2 = lazyStaggeredGridLaneInfo.f10784c;
            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo2 = lazyStaggeredGridLaneInfo;
            int iO = kotlin.collections.l.o(0, iVar2.e(), new Ia.l<LazyStaggeredGridLaneInfo.a, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Integer invoke(LazyStaggeredGridLaneInfo.a aVar) {
                    return Integer.valueOf(Cb.a.e(Integer.valueOf(aVar.f10785a), numValueOf));
                }
            }, iVar2);
            if (iO < 0) {
                if (iArrE2 != null) {
                    iVar2.add(-(iO + 1), new LazyStaggeredGridLaneInfo.a(iArrE2, iW));
                }
            } else if (iArrE2 == null) {
                iVar2.k(iO);
            } else {
                iVar2.get(iO).f10786b = iArrE2;
            }
            if (iC4 < i145 && iArr18[i146] <= i145) {
                pVarC3.f10878l = false;
            }
            i116 = i145;
            iArr14 = iArr18;
            str = str2;
            i15 = i136;
            iArrCopyOf3 = iArr16;
            i120 = i143;
            interfaceC0988x = interfaceC0988x3;
            i94 = i142;
            length11 = i141;
            fVar2 = fVar4;
            i84 = i138;
            iArrCopyOf4 = iArr20;
            lazyStaggeredGridLaneInfo = lazyStaggeredGridLaneInfo2;
            iArrCopyOf2 = iArr19;
            i85 = i139;
            i12 = i140;
            lazyStaggeredGridState6 = lazyStaggeredGridState7;
            i119 = i137;
            i13 = i18;
        }
        int i149 = 0;
        while (i149 < i17) {
            kotlin.collections.i iVar3 = iVarArr[i149];
            while (iVar3.e() > i19 && !((p) iVar3.first()).f10878l) {
                p pVar8 = (p) iVar3.removeFirst();
                int[] iArrE4 = pVar8.f10873f != 1 ? lazyStaggeredGridLaneInfo.e(pVar8.f10868a) : null;
                iArrCopyOf3[i149] = iArrCopyOf3[i149] - (pVar8.f10880n + (iArrE4 == null ? 0 : iArrE4[i149]));
                i19 = 1;
            }
            p pVar9 = (p) iVar3.A();
            iArrCopyOf2[i149] = pVar9 != null ? pVar9.f10868a : -1;
            i149++;
            i19 = 1;
        }
        int length13 = iArrCopyOf4.length;
        int i150 = 0;
        while (true) {
            if (i150 >= length13) {
                i20 = i12;
                break;
            }
            if (iArrCopyOf4[i150] == i18 - 1) {
                i20 = i12;
                f(iArr14, -i20);
                break;
            }
            i150++;
        }
        int i151 = 0;
        while (true) {
            if (i151 >= length11) {
                i21 = i85;
                int i152 = i21 - iArr14[a(iArr14)];
                iArr3 = iArrCopyOf3;
                f(iArr3, -i152);
                f(iArr14, i152);
                boolean z34 = false;
                loop42: while (true) {
                    int length14 = iArr3.length;
                    int i153 = 0;
                    while (true) {
                        if (i153 >= length14) {
                            iArr4 = iArrCopyOf4;
                            i22 = i94;
                            lVar2 = lVar;
                            i23 = length11;
                            iArr5 = iArrCopyOf2;
                            i24 = i84;
                            break loop42;
                        }
                        z13 = z34;
                        int i154 = length14;
                        i22 = i94;
                        if (iArr3[i153] < i22) {
                            break;
                        }
                        i153++;
                        z34 = z13;
                        iArr14 = iArr14;
                        iArrCopyOf2 = iArrCopyOf2;
                        length11 = length11;
                        i94 = i22;
                        length14 = i154;
                        i84 = i84;
                        i18 = i18;
                    }
                    int iB4 = b(iArr3);
                    int iA2 = a(iArrCopyOf2);
                    if (iB4 != iA2) {
                        i23 = length11;
                        if (iArr3[iB4] == iArr3[iA2]) {
                            z14 = z13;
                            iB4 = iA2;
                        } else {
                            iB4 = iB4;
                            z14 = true;
                        }
                    } else {
                        i23 = length11;
                        z14 = z13;
                    }
                    int i155 = iArrCopyOf2[iB4];
                    iArr4 = iArrCopyOf4;
                    if (i155 == -1) {
                        i155 = i18;
                    }
                    int iD3 = lazyStaggeredGridLaneInfo.d(i155, iB4);
                    if (iD3 < 0) {
                        int[] iArr21 = iArrCopyOf2;
                        if ((!z14 && !e(iArr21, lVar, iArr3, iB4)) || !z10) {
                            i24 = i84;
                            z34 = z14;
                            lVar2 = lVar;
                            iArr5 = iArr21;
                            break;
                        }
                        lazyStaggeredGridLaneInfo.g();
                        int length15 = iArr21.length;
                        int[] iArr22 = new int[length15];
                        for (int i156 = 0; i156 < length15; i156++) {
                            iArr22[i156] = -1;
                        }
                        int length16 = iArr3.length;
                        int[] iArr23 = new int[length16];
                        for (int i157 = 0; i157 < length16; i157++) {
                            iArr23[i157] = iArr3[iB4];
                        }
                        return d(lVar, i84, iArr22, iArr23, false);
                    }
                    int i158 = i17;
                    boolean z35 = z14;
                    int[] iArr24 = iArrCopyOf2;
                    int i159 = i84;
                    int i160 = i18;
                    long jB6 = lVar.b(fVar2, iD3, iB4);
                    f fVar5 = fVar2;
                    int i161 = i20;
                    int i162 = (int) (jB6 & 4294967295L);
                    int[] iArr25 = iArr14;
                    int i163 = (int) (jB6 >> 32);
                    int i164 = i162 - i163;
                    lazyStaggeredGridLaneInfo.h(iD3, i164 != 1 ? -2 : i163);
                    p pVarC4 = kVar.c(iD3, jB6);
                    int iC5 = c(iArr3, jB6);
                    int[] iArrE5 = i164 != 1 ? lazyStaggeredGridLaneInfo.e(iD3) : null;
                    int i165 = i163;
                    boolean z36 = z35;
                    while (i165 < i162) {
                        int i166 = i162;
                        if (iArr3[i165] != iC5) {
                            z36 = true;
                        }
                        iVarArr[i165].addFirst(pVarC4);
                        iArr24[i165] = iD3;
                        iArr3[i165] = pVarC4.f10880n + iC5 + (iArrE5 == null ? 0 : iArrE5[i165]);
                        i165++;
                        iArrE5 = iArrE5;
                        i162 = i166;
                    }
                    z34 = z36;
                    iArr14 = iArr25;
                    iArrCopyOf4 = iArr4;
                    i17 = i158;
                    fVar2 = fVar5;
                    i20 = i161;
                    iArrCopyOf2 = iArr24;
                    length11 = i23;
                    i94 = i22;
                    i84 = i159;
                    i18 = i160;
                }
                if (!z34 || !z10) {
                    i25 = i152 + i24;
                    int i167 = iArr3[b(iArr3)];
                    if (i167 >= 0) {
                        iArr6 = iArr14;
                        break;
                    }
                    i25 += i167;
                    iArr6 = iArr14;
                    f(iArr6, i167);
                    f(iArr3, -i167);
                    break;
                }
                lazyStaggeredGridLaneInfo.g();
                return d(lVar2, i24, iArr5, iArr3, false);
            }
            i21 = i85;
            if (iArr14[i151] >= i21) {
                iArr3 = iArrCopyOf3;
                i17 = i17;
                iArr4 = iArrCopyOf4;
                fVar2 = fVar2;
                iArr6 = iArr14;
                i22 = i94;
                i25 = i84;
                lVar2 = lVar;
                i23 = length11;
                iArr5 = iArrCopyOf2;
                i20 = i20;
                i18 = i18;
                i24 = i25;
                break;
            }
            i151++;
            i85 = i21;
        }
        if (!interfaceC0988x.S0()) {
            lazyStaggeredGridState = lazyStaggeredGridState6;
            if (lazyStaggeredGridState.f10789a) {
                fFloatValue = ((Number) lazyStaggeredGridState.f10810w.f10646a.f9544c.getValue()).floatValue();
            }
            if (Integer.signum(Math.round(fFloatValue)) == Integer.signum(i25) || Math.abs(Math.round(fFloatValue)) < Math.abs(i25)) {
                f10 = fFloatValue;
            } else {
                f10 = i25;
            }
            float f15 = fFloatValue - f10;
            if (interfaceC0988x.S0() || i25 <= i24 || f15 > 0.0f) {
                f11 = 0.0f;
            } else {
                f11 = (i25 - i24) + f15;
            }
            iArrCopyOf = Arrays.copyOf(iArr3, iArr3.length);
            kotlin.jvm.internal.i.d(iArrCopyOf, str);
            length = iArrCopyOf.length;
            for (i26 = 0; i26 < length; i26++) {
                iArrCopyOf[i26] = -iArrCopyOf[i26];
            }
            if (i22 > i20) {
                i27 = i17;
                i77 = 0;
                while (i77 < i27) {
                    iVar = iVarArr[i77];
                    float f16 = f11;
                    iE = iVar.e();
                    float f17 = f10;
                    i78 = 0;
                    while (true) {
                        if (i78 < iE) {
                            lazyStaggeredGridState4 = lazyStaggeredGridState;
                            break;
                        }
                        i79 = iE;
                        p pVar10 = (p) iVar.get(i78);
                        lazyStaggeredGridState4 = lazyStaggeredGridState;
                        iArrE = lazyStaggeredGridLaneInfo.e(pVar10.f10868a);
                        if (iArrE == null) {
                            i80 = 0;
                        } else {
                            i80 = iArrE[i77];
                        }
                        i81 = pVar10.f10880n + i80;
                        if (i78 == kotlin.collections.l.r(iVar) || (i82 = iArr3[i77]) == 0 || i82 < i81) {
                            break;
                        }
                        iArr3[i77] = i82 - i81;
                        i78++;
                        iArr5[i77] = ((p) iVar.get(i78)).f10868a;
                        lazyStaggeredGridState = lazyStaggeredGridState4;
                        iE = i79;
                    }
                    i77++;
                    f11 = f16;
                    f10 = f17;
                    lazyStaggeredGridState = lazyStaggeredGridState4;
                }
                f12 = f11;
                lazyStaggeredGridState2 = lazyStaggeredGridState;
                f13 = f10;
            } else {
                f12 = f11;
                lazyStaggeredGridState2 = lazyStaggeredGridState;
                f13 = f10;
                i27 = i17;
            }
            i28 = i117 + i22;
            z15 = lVar2.f10828f;
            if (z15) {
                iG = p013b0.a.h(j10);
                j11 = j10;
            } else {
                j11 = j10;
                iG = p013b0.b.g(kotlin.collections.k.W(iArr6) + i28, j11);
            }
            if (z15) {
                iG2 = p013b0.b.f(kotlin.collections.k.W(iArr6) + i28, j11);
            } else {
                iG2 = p013b0.a.g(j11);
            }
            iArr7 = iArr5;
            if (z15) {
                i29 = iG2;
            } else {
                i29 = iG;
            }
            iMin = i117 + (Math.min(i29, i21) - i22);
            i30 = iArrCopyOf[0];
            listA = lVar.a();
            size = listA.size() - 1;
            if (size >= 0) {
                i73 = size;
                arrayList = null;
                while (true) {
                    i74 = i73 - 1;
                    iIntValue2 = listA.get(i73).intValue();
                    list2 = listA;
                    iF3 = lazyStaggeredGridLaneInfo.f(iIntValue2);
                    j12 = j11;
                    if (iF3 != -2 || iF3 == -1) {
                        i75 = 0;
                        while (true) {
                            if (i75 < i27) {
                                pVar7 = (p) iVarArr[i75].A();
                                if (pVar7 != null) {
                                    i76 = pVar7.f10868a;
                                } else {
                                    i76 = -1;
                                }
                                if (i76 > iIntValue2) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                if (z29) {
                                    i75++;
                                }
                            }
                        }
                    } else {
                        p pVar11 = (p) iVarArr[iF3].A();
                        z30 = (pVar11 != null ? pVar11.f10868a : -1) > iIntValue2;
                    }
                    i31 = i28;
                    if (z30) {
                        fVar = fVar2;
                        long jB7 = lVar2.b(fVar, iIntValue2, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        List list3 = arrayList;
                        p pVarC5 = kVar.c(iIntValue2, jB7);
                        int i168 = i30 - pVarC5.f10880n;
                        pVarC5.p(i168, 0, iMin);
                        list3.add(pVarC5);
                        i30 = i168;
                        arrayList = list3;
                    } else {
                        fVar = fVar2;
                    }
                    if (i74 < 0) {
                        break;
                    }
                    i28 = i31;
                    i73 = i74;
                    z15 = z15;
                    listA = list2;
                    fVar2 = fVar;
                    j11 = j12;
                }
            } else {
                i31 = i28;
                j12 = j11;
                fVar = fVar2;
                z15 = z15;
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = EmptyList.f42983b;
            }
            i33 = 0;
            for (i32 = 0; i32 < i27; i32++) {
                i33 += iVarArr[i32].f43019d;
            }
            arrayList2 = new ArrayList(i33);
            loop26: while (true) {
                i34 = 0;
                while (true) {
                    uVar = lVar2.f10826d;
                    if (i34 < i27) {
                        break loop26;
                    }
                    if (!iVarArr[i34].isEmpty()) {
                        break;
                    }
                    i34++;
                }
                iG2 = iG2;
                i63 = Integer.MAX_VALUE;
                i64 = 0;
                i65 = -1;
                while (i64 < i27) {
                    int i169 = i27;
                    pVar6 = (p) iVarArr[i64].A();
                    if (pVar6 != null) {
                        i72 = pVar6.f10868a;
                    } else {
                        i72 = Integer.MAX_VALUE;
                    }
                    if (i63 > i72) {
                        i65 = i64;
                        i63 = i72;
                    }
                    i64++;
                    i27 = i169;
                }
                i27 = i27;
                pVar5 = (p) iVarArr[i65].removeFirst();
                i66 = pVar5.f10872e;
                if (i66 != i65) {
                    int i170 = i31;
                    int i171 = iG;
                    int[] iArr26 = iArr3;
                    long j15 = (((long) (pVar5.f10873f + i66)) & 4294967295L) | (((long) i66) << 32);
                    iC = c(iArrCopyOf, j15);
                    i67 = ((int[]) uVar.f10900b)[i65];
                    i68 = i119;
                    if (pVar5.f10879m + iC >= i68) {
                        i69 = i16;
                        if (iC <= i69) {
                            pVar5.p(iC, i67, iMin);
                            arrayList2.add(pVar5);
                        }
                    } else {
                        i69 = i16;
                    }
                    i119 = i68;
                    i71 = (int) (j15 & 4294967295L);
                    for (i70 = (int) (j15 >> 32); i70 < i71; i70++) {
                        iArrCopyOf[i70] = pVar5.f10880n + iC;
                    }
                    i31 = i170;
                    iArr3 = iArr26;
                    i16 = i69;
                    iG = i171;
                }
            }
            i35 = iG;
            iArr8 = iArr3;
            i36 = i31;
            i37 = iG2;
            i38 = i16;
            i39 = iArrCopyOf[0];
            pVar = (p) kotlin.collections.q.W(arrayList2);
            if (pVar != null) {
                i40 = pVar.f10868a;
            } else {
                i40 = -1;
            }
            if (interfaceC0988x.S0() || (nVar = lVar2.f10837p) == null || nVar.f().isEmpty()) {
                i41 = i38;
                arrayList3 = null;
            } else {
                List<p> listF2 = nVar.f();
                int size6 = listF2.size() - 1;
                while (true) {
                    if (-1 >= size6) {
                        pVar2 = null;
                        break;
                    }
                    if (listF2.get(size6).getIndex() > i40 && (size6 == 0 || listF2.get(size6 - 1).getIndex() <= i40)) {
                        pVar2 = listF2.get(size6);
                        break;
                    }
                    size6--;
                }
                e eVar = (e) kotlin.collections.q.V(nVar.f());
                if (pVar2 != null && (index = pVar2.getIndex()) <= (iMin2 = Math.min(eVar.getIndex(), i18 - 1))) {
                    arrayList3 = null;
                    while (true) {
                        if (arrayList3 != null) {
                            int size7 = arrayList3.size();
                            int i172 = 0;
                            while (true) {
                                if (i172 >= size7) {
                                    i41 = i38;
                                    z28 = false;
                                    break;
                                }
                                i41 = i38;
                                if (((p) arrayList3.get(i172)).f10868a == index) {
                                    z28 = true;
                                    break;
                                }
                                i172++;
                                i38 = i41;
                            }
                            z26 = z28;
                            if (z26) {
                                nVar2 = nVar;
                            } else {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                listF = nVar.f();
                                size5 = listF.size();
                                i61 = 0;
                                while (true) {
                                    if (i61 < size5) {
                                        nVar2 = nVar;
                                        pVar3 = null;
                                        break;
                                    }
                                    pVar3 = listF.get(i61);
                                    nVar2 = nVar;
                                    if (pVar3.getIndex() == index) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    if (z27) {
                                        break;
                                    }
                                    i61++;
                                    nVar = nVar2;
                                }
                                pVar4 = pVar3;
                                if (pVar4 != null) {
                                    iD = pVar4.d();
                                } else {
                                    iD = 0;
                                }
                                p pVarC6 = kVar.c(index, lVar2.b(fVar, index, iD));
                                arrayList3.add(pVarC6);
                                iArr11 = (int[]) uVar.f10900b;
                                if (iArr11.length > iD) {
                                    i62 = iArr11[iD];
                                } else {
                                    i62 = 0;
                                }
                                pVarC6.p(i39, i62, iMin);
                                i39 = pVarC6.f10880n + i39;
                            }
                            if (index != iMin2) {
                                break;
                            }
                            index++;
                            i38 = i41;
                            nVar = nVar2;
                        } else {
                            i41 = i38;
                        }
                        if (z26) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            listF = nVar.f();
                            size5 = listF.size();
                            i61 = 0;
                            while (true) {
                                if (i61 < size5) {
                                    nVar2 = nVar;
                                    pVar3 = null;
                                    break;
                                }
                                pVar3 = listF.get(i61);
                                nVar2 = nVar;
                                if (pVar3.getIndex() == index) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                if (z27) {
                                    break;
                                    break;
                                }
                                i61++;
                                nVar = nVar2;
                            }
                            pVar4 = pVar3;
                            if (pVar4 != null) {
                                iD = pVar4.d();
                            } else {
                                iD = 0;
                            }
                            p pVarC7 = kVar.c(index, lVar2.b(fVar, index, iD));
                            arrayList3.add(pVarC7);
                            iArr11 = (int[]) uVar.f10900b;
                            if (iArr11.length > iD) {
                                i62 = iArr11[iD];
                            } else {
                                i62 = 0;
                            }
                            pVarC7.p(i39, i62, iMin);
                            i39 = pVarC7.f10880n + i39;
                        } else {
                            nVar2 = nVar;
                        }
                        if (index != iMin2) {
                            break;
                            break;
                        }
                        index++;
                        i38 = i41;
                        nVar = nVar2;
                    }
                } else {
                    i41 = i38;
                    arrayList3 = null;
                }
            }
            listA2 = lVar.a();
            size2 = listA2.size();
            i42 = 0;
            arrayList4 = null;
            while (i42 < size2) {
                iIntValue = listA2.get(i42).intValue();
                i57 = i18;
                if (iIntValue >= i57) {
                    list = listA2;
                } else {
                    if (arrayList3 != null) {
                        size4 = arrayList3.size();
                        i60 = 0;
                        while (true) {
                            if (i60 < size4) {
                                list = listA2;
                                z24 = false;
                                break;
                            }
                            list = listA2;
                            if (((p) arrayList3.get(i60)).f10868a == iIntValue) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if (z25) {
                                z24 = true;
                                break;
                            }
                            i60++;
                            listA2 = list;
                        }
                        z21 = z24;
                        if (!z21) {
                            iF2 = lazyStaggeredGridLaneInfo.f(iIntValue);
                            if (iF2 != -2 || iF2 == -1) {
                                iArr10 = iArr4;
                                length4 = iArr10.length;
                                i58 = 0;
                                while (true) {
                                    if (i58 < length4) {
                                        i59 = size2;
                                        if (iArr10[i58] < iIntValue) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        if (z22) {
                                            i58++;
                                            size2 = i59;
                                        } else {
                                            z23 = false;
                                        }
                                    } else {
                                        i59 = size2;
                                    }
                                }
                            } else if (iArr4[iF2] < iIntValue) {
                                i59 = size2;
                                iArr10 = iArr4;
                            }
                            z23 = true;
                        }
                        i18 = i57;
                        if (z23) {
                            long jB8 = lVar2.b(fVar, iIntValue, 0);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            List list4 = arrayList4;
                            p pVarC8 = kVar.c(iIntValue, jB8);
                            pVarC8.p(i39, 0, iMin);
                            int i173 = pVarC8.f10880n + i39;
                            list4.add(pVarC8);
                            i39 = i173;
                            arrayList4 = list4;
                        }
                        i42++;
                        iArr4 = iArr10;
                        size2 = i59;
                        listA2 = list;
                    } else {
                        list = listA2;
                    }
                    if (!z21) {
                        iF2 = lazyStaggeredGridLaneInfo.f(iIntValue);
                        if (iF2 != -2) {
                            iArr10 = iArr4;
                            length4 = iArr10.length;
                            i58 = 0;
                            while (true) {
                                if (i58 < length4) {
                                    i59 = size2;
                                    if (iArr10[i58] < iIntValue) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (z22) {
                                        z23 = false;
                                    } else {
                                        i58++;
                                        size2 = i59;
                                    }
                                } else {
                                    i59 = size2;
                                    z23 = true;
                                }
                            }
                        } else {
                            iArr10 = iArr4;
                            length4 = iArr10.length;
                            i58 = 0;
                            while (true) {
                                if (i58 < length4) {
                                    i59 = size2;
                                    if (iArr10[i58] < iIntValue) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (z22) {
                                        z23 = false;
                                    } else {
                                        i58++;
                                        size2 = i59;
                                    }
                                } else {
                                    i59 = size2;
                                    z23 = true;
                                }
                            }
                        }
                    }
                    i18 = i57;
                    if (z23) {
                        long jB9 = lVar2.b(fVar, iIntValue, 0);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        List list5 = arrayList4;
                        p pVarC9 = kVar.c(iIntValue, jB9);
                        pVarC9.p(i39, 0, iMin);
                        int i174 = pVarC9.f10880n + i39;
                        list5.add(pVarC9);
                        i39 = i174;
                        arrayList4 = list5;
                    }
                    i42++;
                    iArr4 = iArr10;
                    size2 = i59;
                    listA2 = list;
                }
                i59 = size2;
                iArr10 = iArr4;
                z23 = false;
                i18 = i57;
                if (z23) {
                    long jB10 = lVar2.b(fVar, iIntValue, 0);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    List list6 = arrayList4;
                    p pVarC10 = kVar.c(iIntValue, jB10);
                    pVarC10.p(i39, 0, iMin);
                    int i175 = pVarC10.f10880n + i39;
                    list6.add(pVarC10);
                    i39 = i175;
                    arrayList4 = list6;
                }
                i42++;
                iArr4 = iArr10;
                size2 = i59;
                listA2 = list;
            }
            iArr9 = iArr4;
            if (arrayList4 == null) {
                arrayList4 = EmptyList.f42983b;
            }
            arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList);
            arrayList5.addAll(arrayList2);
            if (arrayList3 != null) {
                arrayList5.addAll(arrayList3);
            }
            arrayList5.addAll(arrayList4);
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            lazyLayoutItemAnimator = lazyStaggeredGridState3.f10807t;
            f14 = f13;
            i43 = (int) f14;
            interfaceC0987wA = kVar.f10843b.a();
            zS0 = interfaceC0988x.S0();
            if (iArr8.length != 0) {
                throw new NoSuchElementException();
            }
            i44 = iArr8[0];
            length2 = iArr8.length - 1;
            if (1 <= length2) {
                i54 = i44;
                i55 = 1;
                while (true) {
                    i56 = iArr8[i55];
                    if (i54 > i56) {
                        i54 = i56;
                    }
                    if (i55 != length2) {
                        break;
                    }
                    i55++;
                }
                i45 = i54;
            } else {
                i45 = i44;
            }
            lazyLayoutItemAnimator.d(i43, i35, i37, arrayList5, interfaceC0987wA, lVar2.f10839r, lVar2.f10828f, zS0, lVar2.f10841t, lVar2.f10836o, i45, kotlin.collections.k.W(iArr6) + i36, lVar2.f10835n, lVar2.f10838q);
            if (interfaceC0988x.S0()) {
                iF = i37;
                i46 = i35;
            } else {
                jB = lazyStaggeredGridState3.f10807t.b();
                if (p013b0.l.b(jB, 0L)) {
                    iF = i37;
                    i46 = i35;
                } else {
                    if (z15) {
                        i51 = i37;
                    } else {
                        i51 = i35;
                    }
                    long j16 = j12;
                    iG3 = p013b0.b.g(Math.max(i35, (int) (jB >> 32)), j16);
                    iF = p013b0.b.f(Math.max(i37, (int) (jB & 4294967295L)), j16);
                    if (z15) {
                        i52 = iF;
                    } else {
                        i52 = iG3;
                    }
                    if (i52 != i51) {
                        size3 = arrayList5.size();
                        for (i53 = 0; i53 < size3; i53++) {
                            p pVar12 = (p) arrayList5.get(i53);
                            pVar12.f10881o = i52;
                            pVar12.f10883q = pVar12.f10875h + i52;
                        }
                    }
                    i46 = iG3;
                }
            }
            i47 = i23;
            i48 = 0;
            while (true) {
                if (i48 >= i47) {
                    z16 = false;
                    break;
                }
                i50 = i21;
                if (iArr6[i48] > i50) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if (z20) {
                    z16 = true;
                    break;
                }
                i48++;
                i21 = i50;
            }
            if (z16) {
                z17 = true;
            } else {
                length3 = iArr9.length;
                i49 = 0;
                while (true) {
                    if (i49 < length3) {
                        z18 = true;
                        break;
                    }
                    if (iArr9[i49] < i18 - 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (!z19) {
                        z18 = false;
                        break;
                    }
                    i49++;
                }
                if (z18) {
                    z17 = true;
                } else {
                    z17 = false;
                }
            }
            final InterfaceC0988x interfaceC0988x4 = interfaceC0988x;
            return new n(iArr7, iArr8, f14, interfaceC0988x4.y1(i46, iF, y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Y.a aVar) {
                    Y.a aVar2 = aVar;
                    final List<p> list7 = arrayList5;
                    final l lVar3 = lVar2;
                    final InterfaceC0988x interfaceC0988x5 = interfaceC0988x4;
                    Ia.l<Y.a, p293xa.r> lVar4 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.l
                        public final p293xa.r invoke(Y.a aVar3) {
                            List<Y> list8;
                            androidx.compose.ui.graphics.layer.b bVar;
                            Y.a aVar4;
                            Y.a aVar5 = aVar3;
                            List<p> list9 = list7;
                            l lVar5 = lVar3;
                            InterfaceC0988x interfaceC0988x6 = interfaceC0988x5;
                            int size8 = list9.size();
                            for (int i176 = 0; i176 < size8; i176++) {
                                p pVar13 = list9.get(i176);
                                boolean zS1 = interfaceC0988x6.S0();
                                if (pVar13.f10881o == -1) {
                                    p245u.c.a("position() should be called first");
                                }
                                List<Y> list10 = pVar13.f10870c;
                                int size9 = list10.size();
                                int i177 = 0;
                                while (i177 < size9) {
                                    Y y10 = list10.get(i177);
                                    int i178 = pVar13.f10882p;
                                    boolean z37 = pVar13.f10871d;
                                    int i179 = i178 - (z37 ? y10.f14221c : y10.f14220b);
                                    int i180 = pVar13.f10883q;
                                    InterfaceC0988x interfaceC0988x7 = interfaceC0988x6;
                                    int i181 = size8;
                                    long j17 = pVar13.f10886t;
                                    List<p> list11 = list9;
                                    LazyLayoutItemAnimation lazyLayoutItemAnimationA = pVar13.j.a(i177, pVar13.f10869b);
                                    if (lazyLayoutItemAnimationA != null) {
                                        if (zS1) {
                                            lazyLayoutItemAnimationA.f10625q = j17;
                                            list8 = list10;
                                        } else {
                                            list8 = list10;
                                            long jD = p013b0.j.d(!p013b0.j.b(lazyLayoutItemAnimationA.f10625q, LazyLayoutItemAnimation.f10608r) ? lazyLayoutItemAnimationA.f10625q : j17, ((p013b0.j) lazyLayoutItemAnimationA.f10624p.getValue()).f20484a);
                                            if ((pVar13.k(j17) <= i179 && pVar13.k(jD) <= i179) || (pVar13.k(j17) >= i180 && pVar13.k(jD) >= i180)) {
                                                lazyLayoutItemAnimationA.b();
                                            }
                                            j17 = jD;
                                        }
                                        bVar = lazyLayoutItemAnimationA.f10621m;
                                    } else {
                                        aVar5 = aVar5;
                                        list8 = list10;
                                        size9 = size9;
                                        bVar = null;
                                    }
                                    if (lVar5.f10833l) {
                                        int i182 = z37 ? (int) (j17 >> 32) : (pVar13.f10881o - ((int) (j17 >> 32))) - (z37 ? y10.f14221c : y10.f14220b);
                                        j17 = (((long) (z37 ? (pVar13.f10881o - ((int) (j17 & 4294967295L))) - (z37 ? y10.f14221c : y10.f14220b) : (int) (j17 & 4294967295L))) & 4294967295L) | (((long) i182) << 32);
                                    }
                                    long jD2 = p013b0.j.d(j17, lVar5.f10831i);
                                    if (!zS1 && lazyLayoutItemAnimationA != null) {
                                        lazyLayoutItemAnimationA.f10620l = jD2;
                                    }
                                    if (bVar != null) {
                                        aVar4 = aVar5;
                                        Y.a.j(aVar4, y10, jD2, bVar);
                                    } else {
                                        aVar4 = aVar5;
                                        Y.a.i(aVar4, y10, jD2);
                                    }
                                    i177++;
                                    aVar5 = aVar4;
                                    interfaceC0988x6 = interfaceC0988x7;
                                    size8 = i181;
                                    list9 = list11;
                                    size9 = size9;
                                    list10 = list8;
                                }
                            }
                            return p293xa.r.f47939a;
                        }
                    };
                    aVar2.f14225a = true;
                    lVar4.invoke(aVar2);
                    aVar2.f14225a = false;
                    lVar2.f10823a.f10808u.getValue();
                    return p293xa.r.f47939a;
                }
            }), f12, z17, lVar2.f10828f, z33, lVar2.f10826d, fVar.g(), interfaceC0988x4, i18, arrayList2, (((long) i46) << 32) | (((long) iF) & 4294967295L), i119, i41, lVar2.j, lVar2.f10832k, lVar2.f10834m, lVar2.f10835n);
        }
        lazyStaggeredGridState = lazyStaggeredGridState6;
        fFloatValue = lazyStaggeredGridState.f10802o;
        if (Integer.signum(Math.round(fFloatValue)) == Integer.signum(i25)) {
            f10 = fFloatValue;
        } else {
            f10 = fFloatValue;
        }
        float f18 = fFloatValue - f10;
        if (interfaceC0988x.S0()) {
            f11 = 0.0f;
        } else {
            f11 = 0.0f;
        }
        iArrCopyOf = Arrays.copyOf(iArr3, iArr3.length);
        kotlin.jvm.internal.i.d(iArrCopyOf, str);
        length = iArrCopyOf.length;
        while (i26 < length) {
            iArrCopyOf[i26] = -iArrCopyOf[i26];
        }
        if (i22 > i20) {
            i27 = i17;
            i77 = 0;
            while (i77 < i27) {
                iVar = iVarArr[i77];
                float f19 = f11;
                iE = iVar.e();
                float f110 = f10;
                i78 = 0;
                while (true) {
                    if (i78 < iE) {
                        lazyStaggeredGridState4 = lazyStaggeredGridState;
                        break;
                        break;
                    }
                    i79 = iE;
                    p pVar13 = (p) iVar.get(i78);
                    lazyStaggeredGridState4 = lazyStaggeredGridState;
                    iArrE = lazyStaggeredGridLaneInfo.e(pVar13.f10868a);
                    if (iArrE == null) {
                        i80 = 0;
                    } else {
                        i80 = iArrE[i77];
                    }
                    i81 = pVar13.f10880n + i80;
                    if (i78 == kotlin.collections.l.r(iVar)) {
                        break;
                    }
                    break;
                    iArr3[i77] = i82 - i81;
                    i78++;
                    iArr5[i77] = ((p) iVar.get(i78)).f10868a;
                    lazyStaggeredGridState = lazyStaggeredGridState4;
                    iE = i79;
                }
                i77++;
                f11 = f19;
                f10 = f110;
                lazyStaggeredGridState = lazyStaggeredGridState4;
            }
            f12 = f11;
            lazyStaggeredGridState2 = lazyStaggeredGridState;
            f13 = f10;
        } else {
            f12 = f11;
            lazyStaggeredGridState2 = lazyStaggeredGridState;
            f13 = f10;
            i27 = i17;
        }
        i28 = i117 + i22;
        z15 = lVar2.f10828f;
        if (z15) {
            iG = p013b0.a.h(j10);
            j11 = j10;
        } else {
            j11 = j10;
            iG = p013b0.b.g(kotlin.collections.k.W(iArr6) + i28, j11);
        }
        if (z15) {
            iG2 = p013b0.b.f(kotlin.collections.k.W(iArr6) + i28, j11);
        } else {
            iG2 = p013b0.a.g(j11);
        }
        iArr7 = iArr5;
        if (z15) {
            i29 = iG2;
        } else {
            i29 = iG;
        }
        iMin = i117 + (Math.min(i29, i21) - i22);
        i30 = iArrCopyOf[0];
        listA = lVar.a();
        size = listA.size() - 1;
        if (size >= 0) {
            i73 = size;
            arrayList = null;
            while (true) {
                i74 = i73 - 1;
                iIntValue2 = listA.get(i73).intValue();
                list2 = listA;
                iF3 = lazyStaggeredGridLaneInfo.f(iIntValue2);
                j12 = j11;
                if (iF3 != -2) {
                    i75 = 0;
                    while (true) {
                        if (i75 < i27) {
                            i31 = i28;
                            if (z30) {
                                fVar = fVar2;
                                long jB11 = lVar2.b(fVar, iIntValue2, 0);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                List list7 = arrayList;
                                p pVarC11 = kVar.c(iIntValue2, jB11);
                                int i1610 = i30 - pVarC11.f10880n;
                                pVarC11.p(i1610, 0, iMin);
                                list7.add(pVarC11);
                                i30 = i1610;
                                arrayList = list7;
                            } else {
                                fVar = fVar2;
                            }
                            if (i74 < 0) {
                                break;
                                break;
                            }
                            i28 = i31;
                            i73 = i74;
                            z15 = z15;
                            listA = list2;
                            fVar2 = fVar;
                            j11 = j12;
                        } else {
                            pVar7 = (p) iVarArr[i75].A();
                            if (pVar7 != null) {
                                i76 = pVar7.f10868a;
                            } else {
                                i76 = -1;
                            }
                            if (i76 > iIntValue2) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (z29) {
                                i31 = i28;
                                if (z30) {
                                    fVar = fVar2;
                                    long jB12 = lVar2.b(fVar, iIntValue2, 0);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    List list8 = arrayList;
                                    p pVarC12 = kVar.c(iIntValue2, jB12);
                                    int i1611 = i30 - pVarC12.f10880n;
                                    pVarC12.p(i1611, 0, iMin);
                                    list8.add(pVarC12);
                                    i30 = i1611;
                                    arrayList = list8;
                                } else {
                                    fVar = fVar2;
                                }
                                if (i74 < 0) {
                                    break;
                                    break;
                                }
                                i28 = i31;
                                i73 = i74;
                                z15 = z15;
                                listA = list2;
                                fVar2 = fVar;
                                j11 = j12;
                            } else {
                                i75++;
                            }
                        }
                    }
                } else {
                    i75 = 0;
                    while (true) {
                        if (i75 < i27) {
                            i31 = i28;
                            if (z30) {
                                fVar = fVar2;
                                long jB13 = lVar2.b(fVar, iIntValue2, 0);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                List list9 = arrayList;
                                p pVarC13 = kVar.c(iIntValue2, jB13);
                                int i1612 = i30 - pVarC13.f10880n;
                                pVarC13.p(i1612, 0, iMin);
                                list9.add(pVarC13);
                                i30 = i1612;
                                arrayList = list9;
                            } else {
                                fVar = fVar2;
                            }
                            if (i74 < 0) {
                                break;
                                break;
                            }
                            i28 = i31;
                            i73 = i74;
                            z15 = z15;
                            listA = list2;
                            fVar2 = fVar;
                            j11 = j12;
                        } else {
                            pVar7 = (p) iVarArr[i75].A();
                            if (pVar7 != null) {
                                i76 = pVar7.f10868a;
                            } else {
                                i76 = -1;
                            }
                            if (i76 > iIntValue2) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (z29) {
                                i31 = i28;
                                if (z30) {
                                    fVar = fVar2;
                                    long jB14 = lVar2.b(fVar, iIntValue2, 0);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    List list10 = arrayList;
                                    p pVarC14 = kVar.c(iIntValue2, jB14);
                                    int i1613 = i30 - pVarC14.f10880n;
                                    pVarC14.p(i1613, 0, iMin);
                                    list10.add(pVarC14);
                                    i30 = i1613;
                                    arrayList = list10;
                                } else {
                                    fVar = fVar2;
                                }
                                if (i74 < 0) {
                                    break;
                                    break;
                                }
                                i28 = i31;
                                i73 = i74;
                                z15 = z15;
                                listA = list2;
                                fVar2 = fVar;
                                j11 = j12;
                            } else {
                                i75++;
                            }
                        }
                    }
                }
            }
        } else {
            i31 = i28;
            j12 = j11;
            fVar = fVar2;
            z15 = z15;
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = EmptyList.f42983b;
        }
        i33 = 0;
        while (i32 < i27) {
            i33 += iVarArr[i32].f43019d;
        }
        arrayList2 = new ArrayList(i33);
        loop26: while (true) {
            i34 = 0;
            while (true) {
                uVar = lVar2.f10826d;
                if (i34 < i27) {
                    break loop26;
                    break loop26;
                }
                if (!iVarArr[i34].isEmpty()) {
                    break;
                }
                i34++;
            }
            iG2 = iG2;
            i63 = Integer.MAX_VALUE;
            i64 = 0;
            i65 = -1;
            while (i64 < i27) {
                int i1614 = i27;
                pVar6 = (p) iVarArr[i64].A();
                if (pVar6 != null) {
                    i72 = pVar6.f10868a;
                } else {
                    i72 = Integer.MAX_VALUE;
                }
                if (i63 > i72) {
                    i65 = i64;
                    i63 = i72;
                }
                i64++;
                i27 = i1614;
            }
            i27 = i27;
            pVar5 = (p) iVarArr[i65].removeFirst();
            i66 = pVar5.f10872e;
            if (i66 != i65) {
                int i176 = i31;
                int i177 = iG;
                int[] iArr27 = iArr3;
                long j17 = (((long) (pVar5.f10873f + i66)) & 4294967295L) | (((long) i66) << 32);
                iC = c(iArrCopyOf, j17);
                i67 = ((int[]) uVar.f10900b)[i65];
                i68 = i119;
                if (pVar5.f10879m + iC >= i68) {
                    i69 = i16;
                    if (iC <= i69) {
                        pVar5.p(iC, i67, iMin);
                        arrayList2.add(pVar5);
                    }
                } else {
                    i69 = i16;
                }
                i119 = i68;
                i71 = (int) (j17 & 4294967295L);
                while (i70 < i71) {
                    iArrCopyOf[i70] = pVar5.f10880n + iC;
                }
                i31 = i176;
                iArr3 = iArr27;
                i16 = i69;
                iG = i177;
            }
        }
        i35 = iG;
        iArr8 = iArr3;
        i36 = i31;
        i37 = iG2;
        i38 = i16;
        i39 = iArrCopyOf[0];
        pVar = (p) kotlin.collections.q.W(arrayList2);
        if (pVar != null) {
            i40 = pVar.f10868a;
        } else {
            i40 = -1;
        }
        if (interfaceC0988x.S0()) {
            i41 = i38;
            arrayList3 = null;
        } else {
            i41 = i38;
            arrayList3 = null;
        }
        listA2 = lVar.a();
        size2 = listA2.size();
        i42 = 0;
        arrayList4 = null;
        while (i42 < size2) {
            iIntValue = listA2.get(i42).intValue();
            i57 = i18;
            if (iIntValue >= i57) {
                list = listA2;
            } else {
                if (arrayList3 != null) {
                    size4 = arrayList3.size();
                    i60 = 0;
                    while (true) {
                        if (i60 < size4) {
                            list = listA2;
                            z24 = false;
                            break;
                        }
                        list = listA2;
                        if (((p) arrayList3.get(i60)).f10868a == iIntValue) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (z25) {
                            z24 = true;
                            break;
                        }
                        i60++;
                        listA2 = list;
                    }
                    if (z24) {
                    }
                    if (!z21) {
                        iF2 = lazyStaggeredGridLaneInfo.f(iIntValue);
                        if (iF2 != -2) {
                            iArr10 = iArr4;
                            length4 = iArr10.length;
                            i58 = 0;
                            while (true) {
                                if (i58 < length4) {
                                    i59 = size2;
                                    if (iArr10[i58] < iIntValue) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (z22) {
                                        z23 = false;
                                    } else {
                                        i58++;
                                        size2 = i59;
                                    }
                                } else {
                                    i59 = size2;
                                    z23 = true;
                                }
                            }
                        } else {
                            iArr10 = iArr4;
                            length4 = iArr10.length;
                            i58 = 0;
                            while (true) {
                                if (i58 < length4) {
                                    i59 = size2;
                                    if (iArr10[i58] < iIntValue) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (z22) {
                                        z23 = false;
                                    } else {
                                        i58++;
                                        size2 = i59;
                                    }
                                } else {
                                    i59 = size2;
                                    z23 = true;
                                }
                            }
                        }
                    }
                    i18 = i57;
                    if (z23) {
                        long jB15 = lVar2.b(fVar, iIntValue, 0);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        List list11 = arrayList4;
                        p pVarC15 = kVar.c(iIntValue, jB15);
                        pVarC15.p(i39, 0, iMin);
                        int i178 = pVarC15.f10880n + i39;
                        list11.add(pVarC15);
                        i39 = i178;
                        arrayList4 = list11;
                    }
                    i42++;
                    iArr4 = iArr10;
                    size2 = i59;
                    listA2 = list;
                } else {
                    list = listA2;
                }
                if (!z21) {
                    iF2 = lazyStaggeredGridLaneInfo.f(iIntValue);
                    if (iF2 != -2) {
                        iArr10 = iArr4;
                        length4 = iArr10.length;
                        i58 = 0;
                        while (true) {
                            if (i58 < length4) {
                                i59 = size2;
                                if (iArr10[i58] < iIntValue) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                if (z22) {
                                    z23 = false;
                                } else {
                                    i58++;
                                    size2 = i59;
                                }
                            } else {
                                i59 = size2;
                                z23 = true;
                            }
                        }
                    } else {
                        iArr10 = iArr4;
                        length4 = iArr10.length;
                        i58 = 0;
                        while (true) {
                            if (i58 < length4) {
                                i59 = size2;
                                if (iArr10[i58] < iIntValue) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                if (z22) {
                                    z23 = false;
                                } else {
                                    i58++;
                                    size2 = i59;
                                }
                            } else {
                                i59 = size2;
                                z23 = true;
                            }
                        }
                    }
                }
                i18 = i57;
                if (z23) {
                    long jB16 = lVar2.b(fVar, iIntValue, 0);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    List list12 = arrayList4;
                    p pVarC16 = kVar.c(iIntValue, jB16);
                    pVarC16.p(i39, 0, iMin);
                    int i179 = pVarC16.f10880n + i39;
                    list12.add(pVarC16);
                    i39 = i179;
                    arrayList4 = list12;
                }
                i42++;
                iArr4 = iArr10;
                size2 = i59;
                listA2 = list;
            }
            i59 = size2;
            iArr10 = iArr4;
            z23 = false;
            i18 = i57;
            if (z23) {
                long jB17 = lVar2.b(fVar, iIntValue, 0);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                List list13 = arrayList4;
                p pVarC17 = kVar.c(iIntValue, jB17);
                pVarC17.p(i39, 0, iMin);
                int i1710 = pVarC17.f10880n + i39;
                list13.add(pVarC17);
                i39 = i1710;
                arrayList4 = list13;
            }
            i42++;
            iArr4 = iArr10;
            size2 = i59;
            listA2 = list;
        }
        iArr9 = iArr4;
        if (arrayList4 == null) {
            arrayList4 = EmptyList.f42983b;
        }
        arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList);
        arrayList5.addAll(arrayList2);
        if (arrayList3 != null) {
            arrayList5.addAll(arrayList3);
        }
        arrayList5.addAll(arrayList4);
        lazyStaggeredGridState3 = lazyStaggeredGridState2;
        lazyLayoutItemAnimator = lazyStaggeredGridState3.f10807t;
        f14 = f13;
        i43 = (int) f14;
        interfaceC0987wA = kVar.f10843b.a();
        zS0 = interfaceC0988x.S0();
        if (iArr8.length != 0) {
            throw new NoSuchElementException();
        }
        i44 = iArr8[0];
        length2 = iArr8.length - 1;
        if (1 <= length2) {
            i54 = i44;
            i55 = 1;
            while (true) {
                i56 = iArr8[i55];
                if (i54 > i56) {
                    i54 = i56;
                }
                if (i55 != length2) {
                    break;
                    break;
                }
                i55++;
            }
            i45 = i54;
        } else {
            i45 = i44;
        }
        lazyLayoutItemAnimator.d(i43, i35, i37, arrayList5, interfaceC0987wA, lVar2.f10839r, lVar2.f10828f, zS0, lVar2.f10841t, lVar2.f10836o, i45, kotlin.collections.k.W(iArr6) + i36, lVar2.f10835n, lVar2.f10838q);
        if (interfaceC0988x.S0()) {
            jB = lazyStaggeredGridState3.f10807t.b();
            if (p013b0.l.b(jB, 0L)) {
                if (z15) {
                    i51 = i37;
                } else {
                    i51 = i35;
                }
                long j18 = j12;
                iG3 = p013b0.b.g(Math.max(i35, (int) (jB >> 32)), j18);
                iF = p013b0.b.f(Math.max(i37, (int) (jB & 4294967295L)), j18);
                if (z15) {
                    i52 = iF;
                } else {
                    i52 = iG3;
                }
                if (i52 != i51) {
                    size3 = arrayList5.size();
                    while (i53 < size3) {
                        p pVar14 = (p) arrayList5.get(i53);
                        pVar14.f10881o = i52;
                        pVar14.f10883q = pVar14.f10875h + i52;
                    }
                }
                i46 = iG3;
            } else {
                iF = i37;
                i46 = i35;
            }
        } else {
            iF = i37;
            i46 = i35;
        }
        i47 = i23;
        i48 = 0;
        while (true) {
            if (i48 >= i47) {
                z16 = false;
                break;
            }
            i50 = i21;
            if (iArr6[i48] > i50) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (z20) {
                z16 = true;
                break;
            }
            i48++;
            i21 = i50;
        }
        if (z16) {
            length3 = iArr9.length;
            i49 = 0;
            while (true) {
                if (i49 < length3) {
                    z18 = true;
                    break;
                }
                if (iArr9[i49] < i18 - 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (!z19) {
                    z18 = false;
                    break;
                }
                i49++;
            }
            if (z18) {
                z17 = true;
            } else {
                z17 = false;
            }
        } else {
            z17 = true;
        }
        final InterfaceC0988x interfaceC0988x5 = interfaceC0988x;
        return new n(iArr7, iArr8, f14, interfaceC0988x5.y1(i46, iF, y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                final List<p> list14 = arrayList5;
                final l lVar3 = lVar2;
                final InterfaceC0988x interfaceC0988x6 = interfaceC0988x5;
                Ia.l<Y.a, p293xa.r> lVar4 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.l
                    public final p293xa.r invoke(Y.a aVar3) {
                        List<Y> list15;
                        androidx.compose.ui.graphics.layer.b bVar;
                        Y.a aVar4;
                        Y.a aVar5 = aVar3;
                        List<p> list16 = list14;
                        l lVar5 = lVar3;
                        InterfaceC0988x interfaceC0988x7 = interfaceC0988x6;
                        int size8 = list16.size();
                        for (int i1711 = 0; i1711 < size8; i1711++) {
                            p pVar15 = list16.get(i1711);
                            boolean zS1 = interfaceC0988x7.S0();
                            if (pVar15.f10881o == -1) {
                                p245u.c.a("position() should be called first");
                            }
                            List<Y> list17 = pVar15.f10870c;
                            int size9 = list17.size();
                            int i1712 = 0;
                            while (i1712 < size9) {
                                Y y10 = list17.get(i1712);
                                int i1713 = pVar15.f10882p;
                                boolean z37 = pVar15.f10871d;
                                int i1714 = i1713 - (z37 ? y10.f14221c : y10.f14220b);
                                int i180 = pVar15.f10883q;
                                InterfaceC0988x interfaceC0988x8 = interfaceC0988x7;
                                int i181 = size8;
                                long j19 = pVar15.f10886t;
                                List<p> list18 = list16;
                                LazyLayoutItemAnimation lazyLayoutItemAnimationA = pVar15.j.a(i1712, pVar15.f10869b);
                                if (lazyLayoutItemAnimationA != null) {
                                    if (zS1) {
                                        lazyLayoutItemAnimationA.f10625q = j19;
                                        list15 = list17;
                                    } else {
                                        list15 = list17;
                                        long jD = p013b0.j.d(!p013b0.j.b(lazyLayoutItemAnimationA.f10625q, LazyLayoutItemAnimation.f10608r) ? lazyLayoutItemAnimationA.f10625q : j19, ((p013b0.j) lazyLayoutItemAnimationA.f10624p.getValue()).f20484a);
                                        if ((pVar15.k(j19) <= i1714 && pVar15.k(jD) <= i1714) || (pVar15.k(j19) >= i180 && pVar15.k(jD) >= i180)) {
                                            lazyLayoutItemAnimationA.b();
                                        }
                                        j19 = jD;
                                    }
                                    bVar = lazyLayoutItemAnimationA.f10621m;
                                } else {
                                    aVar5 = aVar5;
                                    list15 = list17;
                                    size9 = size9;
                                    bVar = null;
                                }
                                if (lVar5.f10833l) {
                                    int i182 = z37 ? (int) (j19 >> 32) : (pVar15.f10881o - ((int) (j19 >> 32))) - (z37 ? y10.f14221c : y10.f14220b);
                                    j19 = (((long) (z37 ? (pVar15.f10881o - ((int) (j19 & 4294967295L))) - (z37 ? y10.f14221c : y10.f14220b) : (int) (j19 & 4294967295L))) & 4294967295L) | (((long) i182) << 32);
                                }
                                long jD2 = p013b0.j.d(j19, lVar5.f10831i);
                                if (!zS1 && lazyLayoutItemAnimationA != null) {
                                    lazyLayoutItemAnimationA.f10620l = jD2;
                                }
                                if (bVar != null) {
                                    aVar4 = aVar5;
                                    Y.a.j(aVar4, y10, jD2, bVar);
                                } else {
                                    aVar4 = aVar5;
                                    Y.a.i(aVar4, y10, jD2);
                                }
                                i1712++;
                                aVar5 = aVar4;
                                interfaceC0988x7 = interfaceC0988x8;
                                size8 = i181;
                                list16 = list18;
                                size9 = size9;
                                list17 = list15;
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                };
                aVar2.f14225a = true;
                lVar4.invoke(aVar2);
                aVar2.f14225a = false;
                lVar2.f10823a.f10808u.getValue();
                return p293xa.r.f47939a;
            }
        }), f12, z17, lVar2.f10828f, z33, lVar2.f10826d, fVar.g(), interfaceC0988x5, i18, arrayList2, (((long) i46) << 32) | (((long) iF) & 4294967295L), i119, i41, lVar2.j, lVar2.f10832k, lVar2.f10834m, lVar2.f10835n);
    }

    public static final boolean e(int[] iArr, l lVar, int[] iArr2, int i10) {
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar.f10840s;
            if (i11 >= length) {
                int length2 = iArr.length;
                for (int i12 = 0; i12 < length2; i12++) {
                    if (lazyStaggeredGridLaneInfo.d(iArr[i12], i12) != -1 && iArr2[i12] >= iArr2[i10]) {
                        return true;
                    }
                }
                int iF = lazyStaggeredGridLaneInfo.f(0);
                return (iF == 0 || iF == -1 || iF == -2) ? false : true;
            }
            if (lazyStaggeredGridLaneInfo.d(iArr[i11], i11) == -1 && iArr2[i11] != iArr2[i10]) {
                return true;
            }
            i11++;
        }
    }

    public static final void f(int[] iArr, int i10) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = iArr[i11] + i10;
        }
    }
}
