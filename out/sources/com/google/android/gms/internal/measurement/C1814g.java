package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1814g implements InterfaceC1849l, InterfaceC1884q, Iterable<InterfaceC1884q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f25709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeMap f25710c;

    public C1814g() {
        this.f25709b = new TreeMap();
        this.f25710c = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final String A() {
        return v(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Iterator<InterfaceC1884q> B() {
        return new C1807f(this.f25709b.keySet().iterator(), this.f25710c.keySet().iterator());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:121:0x0201  */
    /* JADX WARN: Code duplicated, block: B:124:0x0213  */
    /* JADX WARN: Code duplicated, block: B:126:0x0219  */
    /* JADX WARN: Code duplicated, block: B:129:0x0226  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0238 A[PHI: r4 r6 r13
      0x0238: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String) binds: [B:131:0x0236, B:127:0x0223] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v4 java.lang.String) binds: [B:131:0x0236, B:127:0x0223] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r13v8 java.lang.String) = (r13v7 java.lang.String), (r13v9 java.lang.String) binds: [B:131:0x0236, B:127:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x023c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0240  */
    /* JADX WARN: Code duplicated, block: B:137:0x0250  */
    /* JADX WARN: Code duplicated, block: B:139:0x0254  */
    /* JADX WARN: Code duplicated, block: B:141:0x025c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0268  */
    /* JADX WARN: Code duplicated, block: B:145:0x027a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0284  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:168:0x0305  */
    /* JADX WARN: Code duplicated, block: B:171:0x030b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0311  */
    /* JADX WARN: Code duplicated, block: B:175:0x0323  */
    /* JADX WARN: Code duplicated, block: B:177:0x032e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0336  */
    /* JADX WARN: Code duplicated, block: B:181:0x0341  */
    /* JADX WARN: Code duplicated, block: B:183:0x0350  */
    /* JADX WARN: Code duplicated, block: B:184:0x0356  */
    /* JADX WARN: Code duplicated, block: B:186:0x0379  */
    /* JADX WARN: Code duplicated, block: B:187:0x037f  */
    /* JADX WARN: Code duplicated, block: B:190:0x038a  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:193:0x03af  */
    /* JADX WARN: Code duplicated, block: B:197:0x03be A[LOOP:2: B:195:0x03b9->B:197:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:202:0x03df  */
    /* JADX WARN: Code duplicated, block: B:204:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:206:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:210:0x041a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0422  */
    /* JADX WARN: Code duplicated, block: B:214:0x0431  */
    /* JADX WARN: Code duplicated, block: B:216:0x043b  */
    /* JADX WARN: Code duplicated, block: B:218:0x044c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0450  */
    /* JADX WARN: Code duplicated, block: B:221:0x0458  */
    /* JADX WARN: Code duplicated, block: B:225:0x046f A[LOOP:3: B:223:0x0469->B:225:0x046f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x047d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0498  */
    /* JADX WARN: Code duplicated, block: B:230:0x049e  */
    /* JADX WARN: Code duplicated, block: B:233:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:238:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:240:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:242:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:245:0x0502 A[LOOP:5: B:243:0x04fc->B:245:0x0502, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:247:0x0522  */
    /* JADX WARN: Code duplicated, block: B:249:0x0530  */
    /* JADX WARN: Code duplicated, block: B:250:0x0534  */
    /* JADX WARN: Code duplicated, block: B:252:0x053a  */
    /* JADX WARN: Code duplicated, block: B:254:0x054b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0555  */
    /* JADX WARN: Code duplicated, block: B:259:0x0558  */
    /* JADX WARN: Code duplicated, block: B:261:0x0565  */
    /* JADX WARN: Code duplicated, block: B:264:0x0573  */
    /* JADX WARN: Code duplicated, block: B:265:0x057e  */
    /* JADX WARN: Code duplicated, block: B:267:0x0599  */
    /* JADX WARN: Code duplicated, block: B:269:0x059f  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:271:0x05af  */
    /* JADX WARN: Code duplicated, block: B:273:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:275:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:278:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:280:0x05de A[LOOP:6: B:276:0x05c8->B:280:0x05de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x05f8 A[LOOP:7: B:284:0x05f2->B:286:0x05f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:290:0x061c A[LOOP:8: B:288:0x0616->B:290:0x061c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:292:0x0642  */
    /* JADX WARN: Code duplicated, block: B:294:0x0652  */
    /* JADX WARN: Code duplicated, block: B:297:0x066e  */
    /* JADX WARN: Code duplicated, block: B:299:0x0688  */
    /* JADX WARN: Code duplicated, block: B:301:0x0692  */
    /* JADX WARN: Code duplicated, block: B:304:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:305:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:308:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:309:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:311:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:313:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:318:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:320:0x0704  */
    /* JADX WARN: Code duplicated, block: B:323:0x070c  */
    /* JADX WARN: Code duplicated, block: B:324:0x0714  */
    /* JADX WARN: Code duplicated, block: B:326:0x071a  */
    /* JADX WARN: Code duplicated, block: B:328:0x0724  */
    /* JADX WARN: Code duplicated, block: B:329:0x072b  */
    /* JADX WARN: Code duplicated, block: B:331:0x0747  */
    /* JADX WARN: Code duplicated, block: B:332:0x0753  */
    /* JADX WARN: Code duplicated, block: B:334:0x0759  */
    /* JADX WARN: Code duplicated, block: B:337:0x076d  */
    /* JADX WARN: Code duplicated, block: B:339:0x078d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0796 A[LOOP:10: B:340:0x078e->B:342:0x0796, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:345:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:348:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:350:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:352:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:354:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:355:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:357:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:359:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:368:0x0824 A[ADDED_TO_REGION, LOOP:13: B:368:0x0824->B:369:0x0826, LOOP_START, PHI: r0
      0x0824: PHI (r0v26 int) = (r0v25 int), (r0v27 int) binds: [B:336:0x076b, B:369:0x0826] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:369:0x0826 A[LOOP:13: B:368:0x0824->B:369:0x0826, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:370:0x0834  */
    /* JADX WARN: Code duplicated, block: B:371:0x083f  */
    /* JADX WARN: Code duplicated, block: B:373:0x085c  */
    /* JADX WARN: Code duplicated, block: B:375:0x0862  */
    /* JADX WARN: Code duplicated, block: B:376:0x0869  */
    /* JADX WARN: Code duplicated, block: B:379:0x0887 A[LOOP:14: B:377:0x0881->B:379:0x0887, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:381:0x089d  */
    /* JADX WARN: Code duplicated, block: B:383:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:385:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:388:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:390:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:395:0x08e1 A[LOOP:16: B:393:0x08db->B:395:0x08e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:399:0x0904  */
    /* JADX WARN: Code duplicated, block: B:401:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x02ca A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x04ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x04a4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x06df A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0818 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x080c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x07fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x08fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x08f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x08d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0135 A[PHI: r4 r6 r13 r14
      0x0135: PHI (r4v58 java.lang.String) = 
      (r4v1 java.lang.String)
      (r4v3 java.lang.String)
      (r4v7 java.lang.String)
      (r4v14 java.lang.String)
      (r4v59 java.lang.String)
     binds: [B:135:0x024c, B:132:0x0238, B:123:0x020d, B:110:0x01d4, B:53:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r6v43 java.lang.String) = 
      (r6v1 java.lang.String)
      (r6v3 java.lang.String)
      (r6v7 java.lang.String)
      (r6v11 java.lang.String)
      (r6v44 java.lang.String)
     binds: [B:135:0x024c, B:132:0x0238, B:123:0x020d, B:110:0x01d4, B:53:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r13v31 java.lang.String) = 
      (r13v6 java.lang.String)
      (r13v8 java.lang.String)
      (r13v12 java.lang.String)
      (r13v14 java.lang.String)
      (r13v32 java.lang.String)
     binds: [B:135:0x024c, B:132:0x0238, B:123:0x020d, B:110:0x01d4, B:53:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r14v15 java.lang.String) = 
      (r14v4 java.lang.String)
      (r14v7 java.lang.String)
      (r14v9 java.lang.String)
      (r14v11 java.lang.String)
      (r14v16 java.lang.String)
     binds: [B:135:0x024c, B:132:0x0238, B:123:0x020d, B:110:0x01d4, B:53:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:58:0x013f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0171  */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX WARN: Code duplicated, block: B:82:0x017b  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0185  */
    /* JADX WARN: Code duplicated, block: B:87:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x019b  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b0  */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0410, code lost:
    
        if (A8.p.J(r3, r34, (com.google.android.gms.internal.measurement.r) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).s() != s()) goto L208;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v111, types: [com.google.android.gms.internal.measurement.j] */
    /* JADX WARN: Type inference failed for: r0v112, types: [com.google.android.gms.internal.measurement.j] */
    /* JADX WARN: Type inference failed for: r0v113, types: [com.google.android.gms.internal.measurement.j] */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.google.android.gms.internal.measurement.j] */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.google.android.gms.internal.measurement.j] */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.google.android.gms.internal.measurement.j] */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.google.android.gms.internal.measurement.j] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.measurement.s] */
    /* JADX WARN: Type inference failed for: r0v64, types: [com.google.android.gms.internal.measurement.s] */
    /* JADX WARN: Type inference failed for: r0v70, types: [com.google.android.gms.internal.measurement.j] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r0v97, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r20v19, types: [com.google.android.gms.internal.measurement.q] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1884q C(java.lang.String r33, com.google.android.gms.internal.measurement.Y1 r34, java.util.ArrayList r35) {
        /*
            Method dump skipped, instruction units count: 2454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1814g.C(java.lang.String, com.google.android.gms.internal.measurement.Y1, java.util.ArrayList):com.google.android.gms.internal.measurement.q");
    }

    public final void G(int i10) {
        TreeMap treeMap = this.f25709b;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            if (treeMap.containsKey(Integer.valueOf(i11)) || i11 < 0) {
                return;
            }
            treeMap.put(Integer.valueOf(i11), InterfaceC1884q.f25814f0);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            InterfaceC1884q interfaceC1884q = (InterfaceC1884q) treeMap.get(Integer.valueOf(i10));
            if (interfaceC1884q != null) {
                treeMap.put(Integer.valueOf(i10 - 1), interfaceC1884q);
                treeMap.remove(Integer.valueOf(i10));
            }
        }
    }

    public final void I(int i10, InterfaceC1884q interfaceC1884q) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(J4.i.b(i10, "Out of bounds index: "));
        }
        TreeMap treeMap = this.f25709b;
        if (interfaceC1884q == null) {
            treeMap.remove(Integer.valueOf(i10));
        } else {
            treeMap.put(Integer.valueOf(i10), interfaceC1884q);
        }
    }

    public final boolean J(int i10) {
        if (i10 >= 0) {
            TreeMap treeMap = this.f25709b;
            if (i10 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i10));
            }
        }
        throw new IndexOutOfBoundsException(J4.i.b(i10, "Out of bounds index: "));
    }

    public final Iterator<Integer> K() {
        return this.f25709b.keySet().iterator();
    }

    public final ArrayList L() {
        ArrayList arrayList = new ArrayList(s());
        for (int i10 = 0; i10 < s(); i10++) {
            arrayList.add(d(i10));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Boolean b() {
        return Boolean.TRUE;
    }

    public final InterfaceC1884q d(int i10) {
        InterfaceC1884q interfaceC1884q;
        if (i10 < s()) {
            return (!J(i10) || (interfaceC1884q = (InterfaceC1884q) this.f25709b.get(Integer.valueOf(i10))) == null) ? InterfaceC1884q.f25814f0 : interfaceC1884q;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1849l
    public final InterfaceC1884q e(String str) {
        InterfaceC1884q interfaceC1884q;
        if (Name.LENGTH.equals(str)) {
            return new C1835j(Double.valueOf(s()));
        }
        return (!g(str) || (interfaceC1884q = (InterfaceC1884q) this.f25710c.get(str)) == null) ? InterfaceC1884q.f25814f0 : interfaceC1884q;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1814g)) {
            return false;
        }
        C1814g c1814g = (C1814g) obj;
        if (s() != c1814g.s()) {
            return false;
        }
        TreeMap treeMap = this.f25709b;
        if (treeMap.isEmpty()) {
            return c1814g.f25709b.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!d(iIntValue).equals(c1814g.d(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1849l
    public final boolean g(String str) {
        return Name.LENGTH.equals(str) || this.f25710c.containsKey(str);
    }

    public final int hashCode() {
        return this.f25709b.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1884q> iterator() {
        return new C1828i(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1849l
    public final void k(String str, InterfaceC1884q interfaceC1884q) {
        TreeMap treeMap = this.f25710c;
        if (interfaceC1884q == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC1884q);
        }
    }

    public final void q(InterfaceC1884q interfaceC1884q) {
        I(s(), interfaceC1884q);
    }

    public final int s() {
        TreeMap treeMap = this.f25709b;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return v(",");
    }

    public final String v(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f25709b.isEmpty()) {
            for (int i10 = 0; i10 < s(); i10++) {
                InterfaceC1884q interfaceC1884qD = d(i10);
                sb2.append(str);
                if (!(interfaceC1884qD instanceof C1932x) && !(interfaceC1884qD instanceof C1870o)) {
                    sb2.append(interfaceC1884qD.A());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q y() {
        C1814g c1814g = new C1814g();
        for (Map.Entry entry : this.f25709b.entrySet()) {
            boolean z10 = entry.getValue() instanceof InterfaceC1849l;
            TreeMap treeMap = c1814g.f25709b;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC1884q) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC1884q) entry.getValue()).y());
            }
        }
        return c1814g;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Double z() {
        TreeMap treeMap = this.f25709b;
        if (treeMap.size() == 1) {
            return d(0).z();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public C1814g(List<InterfaceC1884q> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                I(i10, list.get(i10));
            }
        }
    }

    public C1814g(InterfaceC1884q... interfaceC1884qArr) {
        this((List<InterfaceC1884q>) Arrays.asList(interfaceC1884qArr));
    }
}
