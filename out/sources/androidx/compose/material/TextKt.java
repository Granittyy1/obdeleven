package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.Q0;
import com.braze.support.BrazeLogger;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Text.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.runtime.C f11859a = new androidx.compose.runtime.C(new Ia.a<androidx.compose.ui.text.F>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        @Override // Ia.a
        public final androidx.compose.ui.text.F invoke() {
            return TypographyKt.f11863a;
        }
    }, Q0.f12888a);

    /* JADX INFO: compiled from: Text.kt */
    public static final class a implements androidx.compose.ui.graphics.L {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f11862b;

        public a(long j) {
            this.f11862b = j;
        }

        @Override // androidx.compose.ui.graphics.L
        public final long a() {
            return this.f11862b;
        }
    }

    public static final void a(final androidx.compose.ui.text.F f10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(1772272796);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if (c1086gP.C(i11 & 1, (i11 & 19) != 18)) {
            androidx.compose.runtime.C c10 = f11859a;
            CompositionLocalKt.a(c10.b(((androidx.compose.ui.text.F) c1086gP.x(c10)).d(f10)), pVar, c1086gP, (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextKt.a(f10, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0133  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0144  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x0158  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:129:0x0182  */
    /* JADX WARN: Code duplicated, block: B:131:0x0187  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0193  */
    /* JADX WARN: Code duplicated, block: B:136:0x0196  */
    /* JADX WARN: Code duplicated, block: B:140:0x019e  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:163:0x01de  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:168:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:172:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:178:0x0204  */
    /* JADX WARN: Code duplicated, block: B:181:0x0212  */
    /* JADX WARN: Code duplicated, block: B:185:0x021e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0228  */
    /* JADX WARN: Code duplicated, block: B:190:0x0232  */
    /* JADX WARN: Code duplicated, block: B:197:0x025f A[PHI: r1 r2 r3 r5 r6 r7 r8 r9 r11 r16 r19 r20 r21 r23 r25 r28
      0x025f: PHI (r1v16 int) = (r1v13 int), (r1v18 int) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r2v17 androidx.compose.ui.text.style.g) = (r2v9 androidx.compose.ui.text.style.g), (r2v18 androidx.compose.ui.text.style.g) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r3v19 androidx.compose.ui.text.style.h) = (r3v8 androidx.compose.ui.text.style.h), (r3v20 androidx.compose.ui.text.style.h) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r5v8 androidx.compose.ui.h) = (r5v4 androidx.compose.ui.h), (r5v9 androidx.compose.ui.h) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r6v10 boolean) = (r6v7 boolean), (r6v11 boolean) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r7v24 int) = (r7v11 int), (r7v25 int) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r8v11 int) = (r8v7 int), (r8v12 int) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r9v12 Ia.l<? super androidx.compose.ui.text.B, xa.r>) = (r9v8 Ia.l<? super androidx.compose.ui.text.B, xa.r>), (r9v13 Ia.l<? super androidx.compose.ui.text.B, xa.r>) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r11v17 androidx.compose.ui.text.font.j) = (r11v14 androidx.compose.ui.text.font.j), (r11v19 androidx.compose.ui.text.font.j) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r16v12 androidx.compose.ui.text.font.l) = (r16v8 androidx.compose.ui.text.font.l), (r16v13 androidx.compose.ui.text.font.l) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r19v12 int) = (r19v9 int), (r19v13 int) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r20v12 androidx.compose.ui.text.font.d) = (r20v8 androidx.compose.ui.text.font.d), (r20v13 androidx.compose.ui.text.font.d) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r21v10 long) = (r21v6 long), (r21v11 long) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r23v8 long) = (r23v5 long), (r23v9 long) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r25v7 long) = (r25v4 long), (r25v8 long) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r28v10 long) = (r28v7 long), (r28v11 long) binds: [B:245:0x02c9, B:196:0x0241] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x0265  */
    /* JADX WARN: Code duplicated, block: B:200:0x0268  */
    /* JADX WARN: Code duplicated, block: B:202:0x026c  */
    /* JADX WARN: Code duplicated, block: B:203:0x026f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0273  */
    /* JADX WARN: Code duplicated, block: B:206:0x0276  */
    /* JADX WARN: Code duplicated, block: B:209:0x027b  */
    /* JADX WARN: Code duplicated, block: B:210:0x027d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0281  */
    /* JADX WARN: Code duplicated, block: B:213:0x0284  */
    /* JADX WARN: Code duplicated, block: B:215:0x0288  */
    /* JADX WARN: Code duplicated, block: B:216:0x028b  */
    /* JADX WARN: Code duplicated, block: B:218:0x028f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0292  */
    /* JADX WARN: Code duplicated, block: B:221:0x0296  */
    /* JADX WARN: Code duplicated, block: B:222:0x0298  */
    /* JADX WARN: Code duplicated, block: B:224:0x029c  */
    /* JADX WARN: Code duplicated, block: B:225:0x029e  */
    /* JADX WARN: Code duplicated, block: B:227:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:228:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:230:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:231:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:233:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:234:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:236:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:237:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:240:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:243:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:246:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:249:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:250:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:252:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:253:0x0303  */
    /* JADX WARN: Code duplicated, block: B:255:0x0309  */
    /* JADX WARN: Code duplicated, block: B:256:0x030c  */
    /* JADX WARN: Code duplicated, block: B:259:0x033b  */
    /* JADX WARN: Code duplicated, block: B:261:0x033f  */
    /* JADX WARN: Code duplicated, block: B:263:0x039c  */
    /* JADX WARN: Code duplicated, block: B:266:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110  */
    /* JADX WARN: Code duplicated, block: B:90:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    public static final void b(final String str, androidx.compose.ui.h hVar, long j, long j10, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.d dVar, long j11, androidx.compose.ui.text.style.h hVar2, androidx.compose.ui.text.style.g gVar, long j12, int i10, boolean z10, int i11, int i12, Ia.l<? super androidx.compose.ui.text.B, p293xa.r> lVar2, androidx.compose.ui.text.F f10, InterfaceC1084f interfaceC1084f, final int i13, final int i14, final int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        boolean z11;
        final androidx.compose.ui.h hVar3;
        final long j13;
        final long j14;
        final androidx.compose.ui.text.font.j jVar2;
        final androidx.compose.ui.text.font.l lVar3;
        final androidx.compose.ui.text.font.d dVar2;
        final long j15;
        final androidx.compose.ui.text.style.h hVar4;
        final androidx.compose.ui.text.style.g gVar2;
        long j16;
        final int i46;
        final boolean z12;
        final int i47;
        final int i48;
        final Ia.l<? super androidx.compose.ui.text.B, p293xa.r> lVar4;
        final androidx.compose.ui.text.F f11;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar5;
        long j17;
        long j18;
        androidx.compose.ui.text.font.j jVar3;
        androidx.compose.ui.text.font.l lVar5;
        androidx.compose.ui.text.font.d dVar3;
        long j19;
        androidx.compose.ui.text.style.h hVar6;
        androidx.compose.ui.text.style.g gVar3;
        int i49;
        boolean z13;
        int i50;
        Ia.l<? super androidx.compose.ui.text.B, p293xa.r> lVar6;
        androidx.compose.ui.text.F f12;
        long j20;
        float fFloatValue;
        long jB;
        int i51;
        boolean zI;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(1028090691);
        if ((i15 & 1) != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = (c1086gP.K(str) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        int i52 = i15 & 2;
        if (i52 == 0) {
            if ((i13 & 48) == 0) {
                i16 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                i16 |= 384;
            } else if ((i13 & 384) == 0) {
                if (c1086gP.i(j)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                i16 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if (c1086gP.i(j10)) {
                    i20 = 2048;
                } else {
                    i20 = 1024;
                }
                i16 |= i20;
            }
            i21 = i15 & 16;
            if (i21 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c1086gP.K(jVar)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i16 |= i22;
                }
                i23 = i15 & 32;
                if (i23 != 0) {
                    i16 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (c1086gP.K(lVar)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                i26 = 524288;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.K(dVar)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i16 |= i27;
                }
                i28 = i15 & 128;
                if (i28 != 0) {
                    i16 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.i(j11)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i16 |= i29;
                }
                i30 = i15 & 256;
                if (i30 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c1086gP.K(hVar2)) {
                        i31 = 67108864;
                    } else {
                        i31 = 33554432;
                    }
                    i16 |= i31;
                }
                i32 = i15 & 512;
                if (i32 != 0) {
                    i16 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c1086gP.K(gVar)) {
                        i33 = 536870912;
                    } else {
                        i33 = 268435456;
                    }
                    i16 |= i33;
                }
                i34 = i15 & 1024;
                if (i34 != 0) {
                    i35 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c1086gP.i(j12)) {
                        i36 = 4;
                    } else {
                        i36 = 2;
                    }
                    i35 = i14 | i36;
                } else {
                    i35 = i14;
                }
                i37 = i15 & 2048;
                if (i37 != 0) {
                    i35 |= 48;
                } else if ((i14 & 48) == 0) {
                    if (c1086gP.h(i10)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i35 |= i38;
                }
                i39 = i35;
                i40 = i15 & 4096;
                if (i40 != 0) {
                    if ((i14 & 384) == 0) {
                        if (c1086gP.c(z10)) {
                            i41 = 256;
                        } else {
                            i41 = 128;
                        }
                        i39 |= i41;
                    }
                    i42 = i15 & 8192;
                    if (i42 != 0) {
                        if ((i14 & 3072) == 0) {
                            i39 |= c1086gP.h(i11) ? 2048 : 1024;
                        }
                        i43 = i15 & 16384;
                        if (i43 != 0) {
                            i44 = i43;
                            if ((i14 & 24576) == 0) {
                                i39 |= c1086gP.h(i12) ? 16384 : 8192;
                            }
                            i45 = i15 & 32768;
                            if (i45 != 0) {
                                i39 |= 196608;
                            } else if ((i14 & 196608) == 0) {
                                i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                            }
                            if ((i14 & 1572864) != 0) {
                                if ((i15 & 65536) == 0 && c1086gP.K(f10)) {
                                    i26 = 1048576;
                                }
                                i39 |= i26;
                            }
                            if ((i16 & 306783379) == 306783378 || (599187 & i39) != 599186) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (c1086gP.C(i16 & 1, z11)) {
                                c1086gP.r0();
                                if ((i13 & 1) != 0 || c1086gP.a0()) {
                                    if (i52 != 0) {
                                        hVar5 = androidx.compose.ui.h.a.f13984b;
                                    } else {
                                        hVar5 = hVar;
                                    }
                                    if (i17 != 0) {
                                        j17 = androidx.compose.ui.graphics.H.f13504l;
                                    } else {
                                        j17 = j;
                                    }
                                    if (i19 != 0) {
                                        j18 = p013b0.n.f20493c;
                                    } else {
                                        j18 = j10;
                                    }
                                    if (i21 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if (i23 != 0) {
                                        lVar5 = null;
                                    } else {
                                        lVar5 = lVar;
                                    }
                                    if (i25 != 0) {
                                        dVar3 = null;
                                    } else {
                                        dVar3 = dVar;
                                    }
                                    if (i28 != 0) {
                                        j19 = p013b0.n.f20493c;
                                    } else {
                                        j19 = j11;
                                    }
                                    if (i30 != 0) {
                                        hVar6 = null;
                                    } else {
                                        hVar6 = hVar2;
                                    }
                                    if (i32 != 0) {
                                        gVar3 = null;
                                    } else {
                                        gVar3 = gVar;
                                    }
                                    if (i34 != 0) {
                                        j16 = p013b0.n.f20493c;
                                    } else {
                                        j16 = j12;
                                    }
                                    if (i37 != 0) {
                                        i49 = 1;
                                    } else {
                                        i49 = i10;
                                    }
                                    if (i40 != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = z10;
                                    }
                                    if (i42 != 0) {
                                        i50 = BrazeLogger.SUPPRESS;
                                    } else {
                                        i50 = i11;
                                    }
                                    i48 = i44 == 0 ? i12 : 1;
                                    lVar6 = i45 == 0 ? lVar2 : null;
                                    if ((i15 & 65536) != 0) {
                                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                        i39 &= -3670017;
                                    }
                                    c1086gP.U();
                                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                                    if (j17 != 16) {
                                        jB = j17;
                                    } else if (f12.b() != 16) {
                                        jB = f12.b();
                                    } else {
                                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                                    }
                                    if (gVar3 != null) {
                                        i51 = gVar3.f15669a;
                                    } else {
                                        i51 = Integer.MIN_VALUE;
                                    }
                                    androidx.compose.ui.text.F fE = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                                    zI = c1086gP.i(jB);
                                    androidx.compose.ui.text.style.g gVar4 = gVar3;
                                    objF = c1086gP.f();
                                    androidx.compose.ui.text.style.h hVar7 = hVar6;
                                    if (zI || objF == InterfaceC1084f.a.f12980a) {
                                        objF = new a(jB);
                                        c1086gP.E(objF);
                                    }
                                    int i53 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                                    int i54 = i39 << 9;
                                    BasicTextKt.d(str, hVar5, fE, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i53 | (57344 & i54) | (458752 & i54) | (3670016 & i54) | (i54 & 29360128), 0);
                                    gVar2 = gVar4;
                                    hVar4 = hVar7;
                                    hVar3 = hVar5;
                                    z12 = z13;
                                    i47 = i50;
                                    jVar2 = jVar3;
                                    lVar3 = lVar5;
                                    j13 = j17;
                                    j14 = j18;
                                    i46 = i49;
                                    f11 = f12;
                                    j15 = j19;
                                    androidx.compose.ui.text.font.d dVar4 = dVar3;
                                    lVar4 = lVar6;
                                    dVar2 = dVar4;
                                } else {
                                    c1086gP.w();
                                    if ((i15 & 65536) != 0) {
                                        i39 &= -3670017;
                                    }
                                    hVar5 = hVar;
                                    j17 = j;
                                    j18 = j10;
                                    jVar3 = jVar;
                                    lVar5 = lVar;
                                    dVar3 = dVar;
                                    j19 = j11;
                                    hVar6 = hVar2;
                                    gVar3 = gVar;
                                    j16 = j12;
                                    i49 = i10;
                                    z13 = z10;
                                    i50 = i11;
                                    i48 = i12;
                                    lVar6 = lVar2;
                                }
                                f12 = f10;
                                c1086gP.U();
                                j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                                fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                                if (j17 != 16) {
                                    jB = j17;
                                } else if (f12.b() != 16) {
                                    jB = f12.b();
                                } else {
                                    jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                                }
                                if (gVar3 != null) {
                                    i51 = gVar3.f15669a;
                                } else {
                                    i51 = Integer.MIN_VALUE;
                                }
                                androidx.compose.ui.text.F fE2 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                                zI = c1086gP.i(jB);
                                androidx.compose.ui.text.style.g gVar5 = gVar3;
                                objF = c1086gP.f();
                                androidx.compose.ui.text.style.h hVar8 = hVar6;
                                if (zI) {
                                    objF = new a(jB);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new a(jB);
                                    c1086gP.E(objF);
                                }
                                int i55 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                                int i56 = i39 << 9;
                                BasicTextKt.d(str, hVar5, fE2, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i55 | (57344 & i56) | (458752 & i56) | (3670016 & i56) | (i56 & 29360128), 0);
                                gVar2 = gVar5;
                                hVar4 = hVar8;
                                hVar3 = hVar5;
                                z12 = z13;
                                i47 = i50;
                                jVar2 = jVar3;
                                lVar3 = lVar5;
                                j13 = j17;
                                j14 = j18;
                                i46 = i49;
                                f11 = f12;
                                j15 = j19;
                                androidx.compose.ui.text.font.d dVar5 = dVar3;
                                lVar4 = lVar6;
                                dVar2 = dVar5;
                            } else {
                                c1086gP.w();
                                hVar3 = hVar;
                                j13 = j;
                                j14 = j10;
                                jVar2 = jVar;
                                lVar3 = lVar;
                                dVar2 = dVar;
                                j15 = j11;
                                hVar4 = hVar2;
                                gVar2 = gVar;
                                j16 = j12;
                                i46 = i10;
                                z12 = z10;
                                i47 = i11;
                                i48 = i12;
                                lVar4 = lVar2;
                                f11 = f10;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                final long j21 = j16;
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j21, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i39 |= 24576;
                        i44 = i43;
                        i45 = i15 & 32768;
                        if (i45 != 0) {
                            i39 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                        }
                        if ((i14 & 1572864) != 0) {
                            if ((i15 & 65536) == 0) {
                                i26 = 1048576;
                            }
                            i39 |= i26;
                        }
                        if ((i16 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i16 & 1, z11)) {
                            c1086gP.r0();
                            if ((i13 & 1) != 0) {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            } else {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            }
                            c1086gP.U();
                            j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                            fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                            if (j17 != 16) {
                                jB = j17;
                            } else if (f12.b() != 16) {
                                jB = f12.b();
                            } else {
                                jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                            }
                            if (gVar3 != null) {
                                i51 = gVar3.f15669a;
                            } else {
                                i51 = Integer.MIN_VALUE;
                            }
                            androidx.compose.ui.text.F fE3 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                            zI = c1086gP.i(jB);
                            androidx.compose.ui.text.style.g gVar6 = gVar3;
                            objF = c1086gP.f();
                            androidx.compose.ui.text.style.h hVar9 = hVar6;
                            if (zI) {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            }
                            int i57 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                            int i58 = i39 << 9;
                            BasicTextKt.d(str, hVar5, fE3, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i57 | (57344 & i58) | (458752 & i58) | (3670016 & i58) | (i58 & 29360128), 0);
                            gVar2 = gVar6;
                            hVar4 = hVar9;
                            hVar3 = hVar5;
                            z12 = z13;
                            i47 = i50;
                            jVar2 = jVar3;
                            lVar3 = lVar5;
                            j13 = j17;
                            j14 = j18;
                            i46 = i49;
                            f11 = f12;
                            j15 = j19;
                            androidx.compose.ui.text.font.d dVar6 = dVar3;
                            lVar4 = lVar6;
                            dVar2 = dVar6;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i46 = i10;
                            z12 = z10;
                            i47 = i11;
                            i48 = i12;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final long j22 = j16;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j22, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i39 |= 3072;
                    i43 = i15 & 16384;
                    if (i43 != 0) {
                        i44 = i43;
                        if ((i14 & 24576) == 0) {
                            i39 |= c1086gP.h(i12) ? 16384 : 8192;
                        }
                        i45 = i15 & 32768;
                        if (i45 != 0) {
                            i39 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                        }
                        if ((i14 & 1572864) != 0) {
                            if ((i15 & 65536) == 0) {
                                i26 = 1048576;
                            }
                            i39 |= i26;
                        }
                        if ((i16 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i16 & 1, z11)) {
                            c1086gP.r0();
                            if ((i13 & 1) != 0) {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            } else {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            }
                            c1086gP.U();
                            j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                            fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                            if (j17 != 16) {
                                jB = j17;
                            } else if (f12.b() != 16) {
                                jB = f12.b();
                            } else {
                                jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                            }
                            if (gVar3 != null) {
                                i51 = gVar3.f15669a;
                            } else {
                                i51 = Integer.MIN_VALUE;
                            }
                            androidx.compose.ui.text.F fE4 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                            zI = c1086gP.i(jB);
                            androidx.compose.ui.text.style.g gVar7 = gVar3;
                            objF = c1086gP.f();
                            androidx.compose.ui.text.style.h hVar10 = hVar6;
                            if (zI) {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            }
                            int i59 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                            int i510 = i39 << 9;
                            BasicTextKt.d(str, hVar5, fE4, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i59 | (57344 & i510) | (458752 & i510) | (3670016 & i510) | (i510 & 29360128), 0);
                            gVar2 = gVar7;
                            hVar4 = hVar10;
                            hVar3 = hVar5;
                            z12 = z13;
                            i47 = i50;
                            jVar2 = jVar3;
                            lVar3 = lVar5;
                            j13 = j17;
                            j14 = j18;
                            i46 = i49;
                            f11 = f12;
                            j15 = j19;
                            androidx.compose.ui.text.font.d dVar7 = dVar3;
                            lVar4 = lVar6;
                            dVar2 = dVar7;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i46 = i10;
                            z12 = z10;
                            i47 = i11;
                            i48 = i12;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final long j23 = j16;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j23, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i39 |= 24576;
                    i44 = i43;
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE5 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar8 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar11 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i511 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i512 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE5, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i511 | (57344 & i512) | (458752 & i512) | (3670016 & i512) | (i512 & 29360128), 0);
                        gVar2 = gVar8;
                        hVar4 = hVar11;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar8 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar8;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j24 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j24, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 384;
                i42 = i15 & 8192;
                if (i42 != 0) {
                    if ((i14 & 3072) == 0) {
                        i39 |= c1086gP.h(i11) ? 2048 : 1024;
                    }
                    i43 = i15 & 16384;
                    if (i43 != 0) {
                        i44 = i43;
                        if ((i14 & 24576) == 0) {
                            i39 |= c1086gP.h(i12) ? 16384 : 8192;
                        }
                        i45 = i15 & 32768;
                        if (i45 != 0) {
                            i39 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                        }
                        if ((i14 & 1572864) != 0) {
                            if ((i15 & 65536) == 0) {
                                i26 = 1048576;
                            }
                            i39 |= i26;
                        }
                        if ((i16 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i16 & 1, z11)) {
                            c1086gP.r0();
                            if ((i13 & 1) != 0) {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            } else {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            }
                            c1086gP.U();
                            j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                            fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                            if (j17 != 16) {
                                jB = j17;
                            } else if (f12.b() != 16) {
                                jB = f12.b();
                            } else {
                                jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                            }
                            if (gVar3 != null) {
                                i51 = gVar3.f15669a;
                            } else {
                                i51 = Integer.MIN_VALUE;
                            }
                            androidx.compose.ui.text.F fE6 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                            zI = c1086gP.i(jB);
                            androidx.compose.ui.text.style.g gVar9 = gVar3;
                            objF = c1086gP.f();
                            androidx.compose.ui.text.style.h hVar12 = hVar6;
                            if (zI) {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            }
                            int i513 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                            int i514 = i39 << 9;
                            BasicTextKt.d(str, hVar5, fE6, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i513 | (57344 & i514) | (458752 & i514) | (3670016 & i514) | (i514 & 29360128), 0);
                            gVar2 = gVar9;
                            hVar4 = hVar12;
                            hVar3 = hVar5;
                            z12 = z13;
                            i47 = i50;
                            jVar2 = jVar3;
                            lVar3 = lVar5;
                            j13 = j17;
                            j14 = j18;
                            i46 = i49;
                            f11 = f12;
                            j15 = j19;
                            androidx.compose.ui.text.font.d dVar9 = dVar3;
                            lVar4 = lVar6;
                            dVar2 = dVar9;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i46 = i10;
                            z12 = z10;
                            i47 = i11;
                            i48 = i12;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final long j25 = j16;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j25, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i39 |= 24576;
                    i44 = i43;
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE7 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar10 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar13 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i515 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i516 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE7, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i515 | (57344 & i516) | (458752 & i516) | (3670016 & i516) | (i516 & 29360128), 0);
                        gVar2 = gVar10;
                        hVar4 = hVar13;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar10 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar10;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j26 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j26, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 3072;
                i43 = i15 & 16384;
                if (i43 != 0) {
                    i44 = i43;
                    if ((i14 & 24576) == 0) {
                        i39 |= c1086gP.h(i12) ? 16384 : 8192;
                    }
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE8 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar11 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar14 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i517 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i518 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE8, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i517 | (57344 & i518) | (458752 & i518) | (3670016 & i518) | (i518 & 29360128), 0);
                        gVar2 = gVar11;
                        hVar4 = hVar14;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar11 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar11;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j27 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j27, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 24576;
                i44 = i43;
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE9 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar12 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar15 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i519 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i5110 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE9, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i519 | (57344 & i5110) | (458752 & i5110) | (3670016 & i5110) | (i5110 & 29360128), 0);
                    gVar2 = gVar12;
                    hVar4 = hVar15;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar12 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar12;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j28 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j28, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i16 |= 24576;
            i23 = i15 & 32;
            if (i23 != 0) {
                i16 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (c1086gP.K(lVar)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
            i25 = i15 & 64;
            i26 = 524288;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.K(dVar)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            }
            i28 = i15 & 128;
            if (i28 != 0) {
                i16 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.i(j11)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i16 |= i29;
            }
            i30 = i15 & 256;
            if (i30 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c1086gP.K(hVar2)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i16 |= i31;
            }
            i32 = i15 & 512;
            if (i32 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c1086gP.K(gVar)) {
                    i33 = 536870912;
                } else {
                    i33 = 268435456;
                }
                i16 |= i33;
            }
            i34 = i15 & 1024;
            if (i34 != 0) {
                i35 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c1086gP.i(j12)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i35 = i14 | i36;
            } else {
                i35 = i14;
            }
            i37 = i15 & 2048;
            if (i37 != 0) {
                i35 |= 48;
            } else if ((i14 & 48) == 0) {
                if (c1086gP.h(i10)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i35 |= i38;
            }
            i39 = i35;
            i40 = i15 & 4096;
            if (i40 != 0) {
                if ((i14 & 384) == 0) {
                    if (c1086gP.c(z10)) {
                        i41 = 256;
                    } else {
                        i41 = 128;
                    }
                    i39 |= i41;
                }
                i42 = i15 & 8192;
                if (i42 != 0) {
                    if ((i14 & 3072) == 0) {
                        i39 |= c1086gP.h(i11) ? 2048 : 1024;
                    }
                    i43 = i15 & 16384;
                    if (i43 != 0) {
                        i44 = i43;
                        if ((i14 & 24576) == 0) {
                            i39 |= c1086gP.h(i12) ? 16384 : 8192;
                        }
                        i45 = i15 & 32768;
                        if (i45 != 0) {
                            i39 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                        }
                        if ((i14 & 1572864) != 0) {
                            if ((i15 & 65536) == 0) {
                                i26 = 1048576;
                            }
                            i39 |= i26;
                        }
                        if ((i16 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i16 & 1, z11)) {
                            c1086gP.r0();
                            if ((i13 & 1) != 0) {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            } else {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            }
                            c1086gP.U();
                            j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                            fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                            if (j17 != 16) {
                                jB = j17;
                            } else if (f12.b() != 16) {
                                jB = f12.b();
                            } else {
                                jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                            }
                            if (gVar3 != null) {
                                i51 = gVar3.f15669a;
                            } else {
                                i51 = Integer.MIN_VALUE;
                            }
                            androidx.compose.ui.text.F fE10 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                            zI = c1086gP.i(jB);
                            androidx.compose.ui.text.style.g gVar13 = gVar3;
                            objF = c1086gP.f();
                            androidx.compose.ui.text.style.h hVar16 = hVar6;
                            if (zI) {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            }
                            int i5111 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                            int i5112 = i39 << 9;
                            BasicTextKt.d(str, hVar5, fE10, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5111 | (57344 & i5112) | (458752 & i5112) | (3670016 & i5112) | (i5112 & 29360128), 0);
                            gVar2 = gVar13;
                            hVar4 = hVar16;
                            hVar3 = hVar5;
                            z12 = z13;
                            i47 = i50;
                            jVar2 = jVar3;
                            lVar3 = lVar5;
                            j13 = j17;
                            j14 = j18;
                            i46 = i49;
                            f11 = f12;
                            j15 = j19;
                            androidx.compose.ui.text.font.d dVar13 = dVar3;
                            lVar4 = lVar6;
                            dVar2 = dVar13;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i46 = i10;
                            z12 = z10;
                            i47 = i11;
                            i48 = i12;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final long j29 = j16;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j29, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i39 |= 24576;
                    i44 = i43;
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE11 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar14 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar17 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i5113 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i5114 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE11, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5113 | (57344 & i5114) | (458752 & i5114) | (3670016 & i5114) | (i5114 & 29360128), 0);
                        gVar2 = gVar14;
                        hVar4 = hVar17;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar14 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar14;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j210 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j210, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 3072;
                i43 = i15 & 16384;
                if (i43 != 0) {
                    i44 = i43;
                    if ((i14 & 24576) == 0) {
                        i39 |= c1086gP.h(i12) ? 16384 : 8192;
                    }
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE12 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar15 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar18 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i5115 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i5116 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE12, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5115 | (57344 & i5116) | (458752 & i5116) | (3670016 & i5116) | (i5116 & 29360128), 0);
                        gVar2 = gVar15;
                        hVar4 = hVar18;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar15 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar15;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j211 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j211, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 24576;
                i44 = i43;
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE13 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar16 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar19 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i5117 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i5118 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE13, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5117 | (57344 & i5118) | (458752 & i5118) | (3670016 & i5118) | (i5118 & 29360128), 0);
                    gVar2 = gVar16;
                    hVar4 = hVar19;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar16 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar16;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j212 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j212, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i39 |= 384;
            i42 = i15 & 8192;
            if (i42 != 0) {
                if ((i14 & 3072) == 0) {
                    i39 |= c1086gP.h(i11) ? 2048 : 1024;
                }
                i43 = i15 & 16384;
                if (i43 != 0) {
                    i44 = i43;
                    if ((i14 & 24576) == 0) {
                        i39 |= c1086gP.h(i12) ? 16384 : 8192;
                    }
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE14 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar17 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar110 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i5119 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i51110 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE14, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5119 | (57344 & i51110) | (458752 & i51110) | (3670016 & i51110) | (i51110 & 29360128), 0);
                        gVar2 = gVar17;
                        hVar4 = hVar110;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar17 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar17;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j213 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j213, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 24576;
                i44 = i43;
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE15 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar18 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar111 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i51111 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i51112 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE15, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i51111 | (57344 & i51112) | (458752 & i51112) | (3670016 & i51112) | (i51112 & 29360128), 0);
                    gVar2 = gVar18;
                    hVar4 = hVar111;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar18 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar18;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j214 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j214, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i39 |= 3072;
            i43 = i15 & 16384;
            if (i43 != 0) {
                i44 = i43;
                if ((i14 & 24576) == 0) {
                    i39 |= c1086gP.h(i12) ? 16384 : 8192;
                }
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE16 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar19 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar112 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i51113 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i51114 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE16, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i51113 | (57344 & i51114) | (458752 & i51114) | (3670016 & i51114) | (i51114 & 29360128), 0);
                    gVar2 = gVar19;
                    hVar4 = hVar112;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar19 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar19;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j215 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j215, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i39 |= 24576;
            i44 = i43;
            i45 = i15 & 32768;
            if (i45 != 0) {
                i39 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
            }
            if ((i14 & 1572864) != 0) {
                if ((i15 & 65536) == 0) {
                    i26 = 1048576;
                }
                i39 |= i26;
            }
            if ((i16 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i16 & 1, z11)) {
                c1086gP.r0();
                if ((i13 & 1) != 0) {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                } else {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                }
                c1086gP.U();
                j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                if (j17 != 16) {
                    jB = j17;
                } else if (f12.b() != 16) {
                    jB = f12.b();
                } else {
                    jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                }
                if (gVar3 != null) {
                    i51 = gVar3.f15669a;
                } else {
                    i51 = Integer.MIN_VALUE;
                }
                androidx.compose.ui.text.F fE17 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                zI = c1086gP.i(jB);
                androidx.compose.ui.text.style.g gVar110 = gVar3;
                objF = c1086gP.f();
                androidx.compose.ui.text.style.h hVar113 = hVar6;
                if (zI) {
                    objF = new a(jB);
                    c1086gP.E(objF);
                } else {
                    objF = new a(jB);
                    c1086gP.E(objF);
                }
                int i51115 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                int i51116 = i39 << 9;
                BasicTextKt.d(str, hVar5, fE17, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i51115 | (57344 & i51116) | (458752 & i51116) | (3670016 & i51116) | (i51116 & 29360128), 0);
                gVar2 = gVar110;
                hVar4 = hVar113;
                hVar3 = hVar5;
                z12 = z13;
                i47 = i50;
                jVar2 = jVar3;
                lVar3 = lVar5;
                j13 = j17;
                j14 = j18;
                i46 = i49;
                f11 = f12;
                j15 = j19;
                androidx.compose.ui.text.font.d dVar110 = dVar3;
                lVar4 = lVar6;
                dVar2 = dVar110;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i46 = i10;
                z12 = z10;
                i47 = i11;
                i48 = i12;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j216 = j16;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j216, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i16 |= 48;
        i17 = i15 & 4;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i13 & 384) == 0) {
            if (c1086gP.i(j)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i16 |= i18;
        }
        i19 = i15 & 8;
        if (i19 != 0) {
            i16 |= 3072;
        } else if ((i13 & 3072) == 0) {
            if (c1086gP.i(j10)) {
                i20 = 2048;
            } else {
                i20 = 1024;
            }
            i16 |= i20;
        }
        i21 = i15 & 16;
        if (i21 != 0) {
            if ((i13 & 24576) == 0) {
                if (c1086gP.K(jVar)) {
                    i22 = 16384;
                } else {
                    i22 = 8192;
                }
                i16 |= i22;
            }
            i23 = i15 & 32;
            if (i23 != 0) {
                i16 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (c1086gP.K(lVar)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
            i25 = i15 & 64;
            i26 = 524288;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.K(dVar)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            }
            i28 = i15 & 128;
            if (i28 != 0) {
                i16 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.i(j11)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i16 |= i29;
            }
            i30 = i15 & 256;
            if (i30 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c1086gP.K(hVar2)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i16 |= i31;
            }
            i32 = i15 & 512;
            if (i32 != 0) {
                i16 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c1086gP.K(gVar)) {
                    i33 = 536870912;
                } else {
                    i33 = 268435456;
                }
                i16 |= i33;
            }
            i34 = i15 & 1024;
            if (i34 != 0) {
                i35 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c1086gP.i(j12)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i35 = i14 | i36;
            } else {
                i35 = i14;
            }
            i37 = i15 & 2048;
            if (i37 != 0) {
                i35 |= 48;
            } else if ((i14 & 48) == 0) {
                if (c1086gP.h(i10)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i35 |= i38;
            }
            i39 = i35;
            i40 = i15 & 4096;
            if (i40 != 0) {
                if ((i14 & 384) == 0) {
                    if (c1086gP.c(z10)) {
                        i41 = 256;
                    } else {
                        i41 = 128;
                    }
                    i39 |= i41;
                }
                i42 = i15 & 8192;
                if (i42 != 0) {
                    if ((i14 & 3072) == 0) {
                        i39 |= c1086gP.h(i11) ? 2048 : 1024;
                    }
                    i43 = i15 & 16384;
                    if (i43 != 0) {
                        i44 = i43;
                        if ((i14 & 24576) == 0) {
                            i39 |= c1086gP.h(i12) ? 16384 : 8192;
                        }
                        i45 = i15 & 32768;
                        if (i45 != 0) {
                            i39 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                        }
                        if ((i14 & 1572864) != 0) {
                            if ((i15 & 65536) == 0) {
                                i26 = 1048576;
                            }
                            i39 |= i26;
                        }
                        if ((i16 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i16 & 1, z11)) {
                            c1086gP.r0();
                            if ((i13 & 1) != 0) {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            } else {
                                if (i52 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i17 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i19 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i21 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i23 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i28 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i30 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i32 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                if (i34 != 0) {
                                    j16 = p013b0.n.f20493c;
                                } else {
                                    j16 = j12;
                                }
                                if (i37 != 0) {
                                    i49 = 1;
                                } else {
                                    i49 = i10;
                                }
                                if (i40 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i42 != 0) {
                                    i50 = BrazeLogger.SUPPRESS;
                                } else {
                                    i50 = i11;
                                }
                                if (i44 == 0) {
                                }
                                if (i45 == 0) {
                                }
                                if ((i15 & 65536) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    i39 &= -3670017;
                                } else {
                                    f12 = f10;
                                }
                            }
                            c1086gP.U();
                            j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                            fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                            if (j17 != 16) {
                                jB = j17;
                            } else if (f12.b() != 16) {
                                jB = f12.b();
                            } else {
                                jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                            }
                            if (gVar3 != null) {
                                i51 = gVar3.f15669a;
                            } else {
                                i51 = Integer.MIN_VALUE;
                            }
                            androidx.compose.ui.text.F fE18 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                            zI = c1086gP.i(jB);
                            androidx.compose.ui.text.style.g gVar111 = gVar3;
                            objF = c1086gP.f();
                            androidx.compose.ui.text.style.h hVar114 = hVar6;
                            if (zI) {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(jB);
                                c1086gP.E(objF);
                            }
                            int i51117 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                            int i51118 = i39 << 9;
                            BasicTextKt.d(str, hVar5, fE18, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i51117 | (57344 & i51118) | (458752 & i51118) | (3670016 & i51118) | (i51118 & 29360128), 0);
                            gVar2 = gVar111;
                            hVar4 = hVar114;
                            hVar3 = hVar5;
                            z12 = z13;
                            i47 = i50;
                            jVar2 = jVar3;
                            lVar3 = lVar5;
                            j13 = j17;
                            j14 = j18;
                            i46 = i49;
                            f11 = f12;
                            j15 = j19;
                            androidx.compose.ui.text.font.d dVar111 = dVar3;
                            lVar4 = lVar6;
                            dVar2 = dVar111;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i46 = i10;
                            z12 = z10;
                            i47 = i11;
                            i48 = i12;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final long j217 = j16;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j217, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i39 |= 24576;
                    i44 = i43;
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE19 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar112 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar115 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i51119 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i511110 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE19, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i51119 | (57344 & i511110) | (458752 & i511110) | (3670016 & i511110) | (i511110 & 29360128), 0);
                        gVar2 = gVar112;
                        hVar4 = hVar115;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar112 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar112;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j218 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j218, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 3072;
                i43 = i15 & 16384;
                if (i43 != 0) {
                    i44 = i43;
                    if ((i14 & 24576) == 0) {
                        i39 |= c1086gP.h(i12) ? 16384 : 8192;
                    }
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE110 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar113 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar116 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i511111 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i511112 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE110, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i511111 | (57344 & i511112) | (458752 & i511112) | (3670016 & i511112) | (i511112 & 29360128), 0);
                        gVar2 = gVar113;
                        hVar4 = hVar116;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar113 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar113;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j219 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j219, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 24576;
                i44 = i43;
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE111 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar114 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar117 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i511113 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i511114 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE111, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i511113 | (57344 & i511114) | (458752 & i511114) | (3670016 & i511114) | (i511114 & 29360128), 0);
                    gVar2 = gVar114;
                    hVar4 = hVar117;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar114 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar114;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j2110 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2110, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i39 |= 384;
            i42 = i15 & 8192;
            if (i42 != 0) {
                if ((i14 & 3072) == 0) {
                    i39 |= c1086gP.h(i11) ? 2048 : 1024;
                }
                i43 = i15 & 16384;
                if (i43 != 0) {
                    i44 = i43;
                    if ((i14 & 24576) == 0) {
                        i39 |= c1086gP.h(i12) ? 16384 : 8192;
                    }
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE112 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar115 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar118 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i511115 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i511116 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE112, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i511115 | (57344 & i511116) | (458752 & i511116) | (3670016 & i511116) | (i511116 & 29360128), 0);
                        gVar2 = gVar115;
                        hVar4 = hVar118;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar115 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar115;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j2111 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2111, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 24576;
                i44 = i43;
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE113 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar116 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar119 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i511117 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i511118 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE113, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i511117 | (57344 & i511118) | (458752 & i511118) | (3670016 & i511118) | (i511118 & 29360128), 0);
                    gVar2 = gVar116;
                    hVar4 = hVar119;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar116 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar116;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j2112 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2112, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i39 |= 3072;
            i43 = i15 & 16384;
            if (i43 != 0) {
                i44 = i43;
                if ((i14 & 24576) == 0) {
                    i39 |= c1086gP.h(i12) ? 16384 : 8192;
                }
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE114 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar117 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar1110 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i511119 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i5111110 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE114, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i511119 | (57344 & i5111110) | (458752 & i5111110) | (3670016 & i5111110) | (i5111110 & 29360128), 0);
                    gVar2 = gVar117;
                    hVar4 = hVar1110;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar117 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar117;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j2113 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2113, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i39 |= 24576;
            i44 = i43;
            i45 = i15 & 32768;
            if (i45 != 0) {
                i39 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
            }
            if ((i14 & 1572864) != 0) {
                if ((i15 & 65536) == 0) {
                    i26 = 1048576;
                }
                i39 |= i26;
            }
            if ((i16 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i16 & 1, z11)) {
                c1086gP.r0();
                if ((i13 & 1) != 0) {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                } else {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                }
                c1086gP.U();
                j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                if (j17 != 16) {
                    jB = j17;
                } else if (f12.b() != 16) {
                    jB = f12.b();
                } else {
                    jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                }
                if (gVar3 != null) {
                    i51 = gVar3.f15669a;
                } else {
                    i51 = Integer.MIN_VALUE;
                }
                androidx.compose.ui.text.F fE115 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                zI = c1086gP.i(jB);
                androidx.compose.ui.text.style.g gVar118 = gVar3;
                objF = c1086gP.f();
                androidx.compose.ui.text.style.h hVar1111 = hVar6;
                if (zI) {
                    objF = new a(jB);
                    c1086gP.E(objF);
                } else {
                    objF = new a(jB);
                    c1086gP.E(objF);
                }
                int i5111111 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                int i5111112 = i39 << 9;
                BasicTextKt.d(str, hVar5, fE115, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5111111 | (57344 & i5111112) | (458752 & i5111112) | (3670016 & i5111112) | (i5111112 & 29360128), 0);
                gVar2 = gVar118;
                hVar4 = hVar1111;
                hVar3 = hVar5;
                z12 = z13;
                i47 = i50;
                jVar2 = jVar3;
                lVar3 = lVar5;
                j13 = j17;
                j14 = j18;
                i46 = i49;
                f11 = f12;
                j15 = j19;
                androidx.compose.ui.text.font.d dVar118 = dVar3;
                lVar4 = lVar6;
                dVar2 = dVar118;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i46 = i10;
                z12 = z10;
                i47 = i11;
                i48 = i12;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j2114 = j16;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2114, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i16 |= 24576;
        i23 = i15 & 32;
        if (i23 != 0) {
            i16 |= 196608;
        } else if ((i13 & 196608) == 0) {
            if (c1086gP.K(lVar)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i16 |= i24;
        }
        i25 = i15 & 64;
        i26 = 524288;
        if (i25 != 0) {
            i16 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c1086gP.K(dVar)) {
                i27 = 1048576;
            } else {
                i27 = 524288;
            }
            i16 |= i27;
        }
        i28 = i15 & 128;
        if (i28 != 0) {
            i16 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c1086gP.i(j11)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i16 |= i29;
        }
        i30 = i15 & 256;
        if (i30 != 0) {
            i16 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c1086gP.K(hVar2)) {
                i31 = 67108864;
            } else {
                i31 = 33554432;
            }
            i16 |= i31;
        }
        i32 = i15 & 512;
        if (i32 != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c1086gP.K(gVar)) {
                i33 = 536870912;
            } else {
                i33 = 268435456;
            }
            i16 |= i33;
        }
        i34 = i15 & 1024;
        if (i34 != 0) {
            i35 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c1086gP.i(j12)) {
                i36 = 4;
            } else {
                i36 = 2;
            }
            i35 = i14 | i36;
        } else {
            i35 = i14;
        }
        i37 = i15 & 2048;
        if (i37 != 0) {
            i35 |= 48;
        } else if ((i14 & 48) == 0) {
            if (c1086gP.h(i10)) {
                i38 = 32;
            } else {
                i38 = 16;
            }
            i35 |= i38;
        }
        i39 = i35;
        i40 = i15 & 4096;
        if (i40 != 0) {
            if ((i14 & 384) == 0) {
                if (c1086gP.c(z10)) {
                    i41 = 256;
                } else {
                    i41 = 128;
                }
                i39 |= i41;
            }
            i42 = i15 & 8192;
            if (i42 != 0) {
                if ((i14 & 3072) == 0) {
                    i39 |= c1086gP.h(i11) ? 2048 : 1024;
                }
                i43 = i15 & 16384;
                if (i43 != 0) {
                    i44 = i43;
                    if ((i14 & 24576) == 0) {
                        i39 |= c1086gP.h(i12) ? 16384 : 8192;
                    }
                    i45 = i15 & 32768;
                    if (i45 != 0) {
                        i39 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & 65536) == 0) {
                            i26 = 1048576;
                        }
                        i39 |= i26;
                    }
                    if ((i16 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i16 & 1, z11)) {
                        c1086gP.r0();
                        if ((i13 & 1) != 0) {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        } else {
                            if (i52 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i17 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i19 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i21 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i23 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i28 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i30 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i32 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            if (i34 != 0) {
                                j16 = p013b0.n.f20493c;
                            } else {
                                j16 = j12;
                            }
                            if (i37 != 0) {
                                i49 = 1;
                            } else {
                                i49 = i10;
                            }
                            if (i40 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i42 != 0) {
                                i50 = BrazeLogger.SUPPRESS;
                            } else {
                                i50 = i11;
                            }
                            if (i44 == 0) {
                            }
                            if (i45 == 0) {
                            }
                            if ((i15 & 65536) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                i39 &= -3670017;
                            } else {
                                f12 = f10;
                            }
                        }
                        c1086gP.U();
                        j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                        fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                        if (j17 != 16) {
                            jB = j17;
                        } else if (f12.b() != 16) {
                            jB = f12.b();
                        } else {
                            jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                        }
                        if (gVar3 != null) {
                            i51 = gVar3.f15669a;
                        } else {
                            i51 = Integer.MIN_VALUE;
                        }
                        androidx.compose.ui.text.F fE116 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                        zI = c1086gP.i(jB);
                        androidx.compose.ui.text.style.g gVar119 = gVar3;
                        objF = c1086gP.f();
                        androidx.compose.ui.text.style.h hVar1112 = hVar6;
                        if (zI) {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(jB);
                            c1086gP.E(objF);
                        }
                        int i5111113 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                        int i5111114 = i39 << 9;
                        BasicTextKt.d(str, hVar5, fE116, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5111113 | (57344 & i5111114) | (458752 & i5111114) | (3670016 & i5111114) | (i5111114 & 29360128), 0);
                        gVar2 = gVar119;
                        hVar4 = hVar1112;
                        hVar3 = hVar5;
                        z12 = z13;
                        i47 = i50;
                        jVar2 = jVar3;
                        lVar3 = lVar5;
                        j13 = j17;
                        j14 = j18;
                        i46 = i49;
                        f11 = f12;
                        j15 = j19;
                        androidx.compose.ui.text.font.d dVar119 = dVar3;
                        lVar4 = lVar6;
                        dVar2 = dVar119;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i46 = i10;
                        z12 = z10;
                        i47 = i11;
                        i48 = i12;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j2115 = j16;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2115, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i39 |= 24576;
                i44 = i43;
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE117 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar1110 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar1113 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i5111115 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i5111116 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE117, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5111115 | (57344 & i5111116) | (458752 & i5111116) | (3670016 & i5111116) | (i5111116 & 29360128), 0);
                    gVar2 = gVar1110;
                    hVar4 = hVar1113;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar1110 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar1110;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j2116 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2116, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i39 |= 3072;
            i43 = i15 & 16384;
            if (i43 != 0) {
                i44 = i43;
                if ((i14 & 24576) == 0) {
                    i39 |= c1086gP.h(i12) ? 16384 : 8192;
                }
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE118 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar1111 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar1114 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i5111117 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i5111118 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE118, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5111117 | (57344 & i5111118) | (458752 & i5111118) | (3670016 & i5111118) | (i5111118 & 29360128), 0);
                    gVar2 = gVar1111;
                    hVar4 = hVar1114;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar1111 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar1111;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j2117 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2117, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i39 |= 24576;
            i44 = i43;
            i45 = i15 & 32768;
            if (i45 != 0) {
                i39 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
            }
            if ((i14 & 1572864) != 0) {
                if ((i15 & 65536) == 0) {
                    i26 = 1048576;
                }
                i39 |= i26;
            }
            if ((i16 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i16 & 1, z11)) {
                c1086gP.r0();
                if ((i13 & 1) != 0) {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                } else {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                }
                c1086gP.U();
                j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                if (j17 != 16) {
                    jB = j17;
                } else if (f12.b() != 16) {
                    jB = f12.b();
                } else {
                    jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                }
                if (gVar3 != null) {
                    i51 = gVar3.f15669a;
                } else {
                    i51 = Integer.MIN_VALUE;
                }
                androidx.compose.ui.text.F fE119 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                zI = c1086gP.i(jB);
                androidx.compose.ui.text.style.g gVar1112 = gVar3;
                objF = c1086gP.f();
                androidx.compose.ui.text.style.h hVar1115 = hVar6;
                if (zI) {
                    objF = new a(jB);
                    c1086gP.E(objF);
                } else {
                    objF = new a(jB);
                    c1086gP.E(objF);
                }
                int i5111119 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                int i51111110 = i39 << 9;
                BasicTextKt.d(str, hVar5, fE119, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i5111119 | (57344 & i51111110) | (458752 & i51111110) | (3670016 & i51111110) | (i51111110 & 29360128), 0);
                gVar2 = gVar1112;
                hVar4 = hVar1115;
                hVar3 = hVar5;
                z12 = z13;
                i47 = i50;
                jVar2 = jVar3;
                lVar3 = lVar5;
                j13 = j17;
                j14 = j18;
                i46 = i49;
                f11 = f12;
                j15 = j19;
                androidx.compose.ui.text.font.d dVar1112 = dVar3;
                lVar4 = lVar6;
                dVar2 = dVar1112;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i46 = i10;
                z12 = z10;
                i47 = i11;
                i48 = i12;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j2118 = j16;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2118, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i39 |= 384;
        i42 = i15 & 8192;
        if (i42 != 0) {
            if ((i14 & 3072) == 0) {
                i39 |= c1086gP.h(i11) ? 2048 : 1024;
            }
            i43 = i15 & 16384;
            if (i43 != 0) {
                i44 = i43;
                if ((i14 & 24576) == 0) {
                    i39 |= c1086gP.h(i12) ? 16384 : 8192;
                }
                i45 = i15 & 32768;
                if (i45 != 0) {
                    i39 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & 65536) == 0) {
                        i26 = 1048576;
                    }
                    i39 |= i26;
                }
                if ((i16 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i16 & 1, z11)) {
                    c1086gP.r0();
                    if ((i13 & 1) != 0) {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    } else {
                        if (i52 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i17 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i19 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i21 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i23 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i30 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i32 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        if (i34 != 0) {
                            j16 = p013b0.n.f20493c;
                        } else {
                            j16 = j12;
                        }
                        if (i37 != 0) {
                            i49 = 1;
                        } else {
                            i49 = i10;
                        }
                        if (i40 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i42 != 0) {
                            i50 = BrazeLogger.SUPPRESS;
                        } else {
                            i50 = i11;
                        }
                        if (i44 == 0) {
                        }
                        if (i45 == 0) {
                        }
                        if ((i15 & 65536) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            i39 &= -3670017;
                        } else {
                            f12 = f10;
                        }
                    }
                    c1086gP.U();
                    j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                    fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                    if (j17 != 16) {
                        jB = j17;
                    } else if (f12.b() != 16) {
                        jB = f12.b();
                    } else {
                        jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                    }
                    if (gVar3 != null) {
                        i51 = gVar3.f15669a;
                    } else {
                        i51 = Integer.MIN_VALUE;
                    }
                    androidx.compose.ui.text.F fE1110 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                    zI = c1086gP.i(jB);
                    androidx.compose.ui.text.style.g gVar1113 = gVar3;
                    objF = c1086gP.f();
                    androidx.compose.ui.text.style.h hVar1116 = hVar6;
                    if (zI) {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(jB);
                        c1086gP.E(objF);
                    }
                    int i51111111 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                    int i51111112 = i39 << 9;
                    BasicTextKt.d(str, hVar5, fE1110, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i51111111 | (57344 & i51111112) | (458752 & i51111112) | (3670016 & i51111112) | (i51111112 & 29360128), 0);
                    gVar2 = gVar1113;
                    hVar4 = hVar1116;
                    hVar3 = hVar5;
                    z12 = z13;
                    i47 = i50;
                    jVar2 = jVar3;
                    lVar3 = lVar5;
                    j13 = j17;
                    j14 = j18;
                    i46 = i49;
                    f11 = f12;
                    j15 = j19;
                    androidx.compose.ui.text.font.d dVar1113 = dVar3;
                    lVar4 = lVar6;
                    dVar2 = dVar1113;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i46 = i10;
                    z12 = z10;
                    i47 = i11;
                    i48 = i12;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j2119 = j16;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j2119, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i39 |= 24576;
            i44 = i43;
            i45 = i15 & 32768;
            if (i45 != 0) {
                i39 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
            }
            if ((i14 & 1572864) != 0) {
                if ((i15 & 65536) == 0) {
                    i26 = 1048576;
                }
                i39 |= i26;
            }
            if ((i16 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i16 & 1, z11)) {
                c1086gP.r0();
                if ((i13 & 1) != 0) {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                } else {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                }
                c1086gP.U();
                j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                if (j17 != 16) {
                    jB = j17;
                } else if (f12.b() != 16) {
                    jB = f12.b();
                } else {
                    jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                }
                if (gVar3 != null) {
                    i51 = gVar3.f15669a;
                } else {
                    i51 = Integer.MIN_VALUE;
                }
                androidx.compose.ui.text.F fE1111 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                zI = c1086gP.i(jB);
                androidx.compose.ui.text.style.g gVar1114 = gVar3;
                objF = c1086gP.f();
                androidx.compose.ui.text.style.h hVar1117 = hVar6;
                if (zI) {
                    objF = new a(jB);
                    c1086gP.E(objF);
                } else {
                    objF = new a(jB);
                    c1086gP.E(objF);
                }
                int i51111113 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                int i51111114 = i39 << 9;
                BasicTextKt.d(str, hVar5, fE1111, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i51111113 | (57344 & i51111114) | (458752 & i51111114) | (3670016 & i51111114) | (i51111114 & 29360128), 0);
                gVar2 = gVar1114;
                hVar4 = hVar1117;
                hVar3 = hVar5;
                z12 = z13;
                i47 = i50;
                jVar2 = jVar3;
                lVar3 = lVar5;
                j13 = j17;
                j14 = j18;
                i46 = i49;
                f11 = f12;
                j15 = j19;
                androidx.compose.ui.text.font.d dVar1114 = dVar3;
                lVar4 = lVar6;
                dVar2 = dVar1114;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i46 = i10;
                z12 = z10;
                i47 = i11;
                i48 = i12;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j21110 = j16;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j21110, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i39 |= 3072;
        i43 = i15 & 16384;
        if (i43 != 0) {
            i44 = i43;
            if ((i14 & 24576) == 0) {
                i39 |= c1086gP.h(i12) ? 16384 : 8192;
            }
            i45 = i15 & 32768;
            if (i45 != 0) {
                i39 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
            }
            if ((i14 & 1572864) != 0) {
                if ((i15 & 65536) == 0) {
                    i26 = 1048576;
                }
                i39 |= i26;
            }
            if ((i16 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i16 & 1, z11)) {
                c1086gP.r0();
                if ((i13 & 1) != 0) {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                } else {
                    if (i52 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i17 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i19 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i21 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i23 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i30 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i32 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    if (i34 != 0) {
                        j16 = p013b0.n.f20493c;
                    } else {
                        j16 = j12;
                    }
                    if (i37 != 0) {
                        i49 = 1;
                    } else {
                        i49 = i10;
                    }
                    if (i40 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i42 != 0) {
                        i50 = BrazeLogger.SUPPRESS;
                    } else {
                        i50 = i11;
                    }
                    if (i44 == 0) {
                    }
                    if (i45 == 0) {
                    }
                    if ((i15 & 65536) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        i39 &= -3670017;
                    } else {
                        f12 = f10;
                    }
                }
                c1086gP.U();
                j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
                fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
                if (j17 != 16) {
                    jB = j17;
                } else if (f12.b() != 16) {
                    jB = f12.b();
                } else {
                    jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
                }
                if (gVar3 != null) {
                    i51 = gVar3.f15669a;
                } else {
                    i51 = Integer.MIN_VALUE;
                }
                androidx.compose.ui.text.F fE1112 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
                zI = c1086gP.i(jB);
                androidx.compose.ui.text.style.g gVar1115 = gVar3;
                objF = c1086gP.f();
                androidx.compose.ui.text.style.h hVar1118 = hVar6;
                if (zI) {
                    objF = new a(jB);
                    c1086gP.E(objF);
                } else {
                    objF = new a(jB);
                    c1086gP.E(objF);
                }
                int i51111115 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
                int i51111116 = i39 << 9;
                BasicTextKt.d(str, hVar5, fE1112, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i51111115 | (57344 & i51111116) | (458752 & i51111116) | (3670016 & i51111116) | (i51111116 & 29360128), 0);
                gVar2 = gVar1115;
                hVar4 = hVar1118;
                hVar3 = hVar5;
                z12 = z13;
                i47 = i50;
                jVar2 = jVar3;
                lVar3 = lVar5;
                j13 = j17;
                j14 = j18;
                i46 = i49;
                f11 = f12;
                j15 = j19;
                androidx.compose.ui.text.font.d dVar1115 = dVar3;
                lVar4 = lVar6;
                dVar2 = dVar1115;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i46 = i10;
                z12 = z10;
                i47 = i11;
                i48 = i12;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j21111 = j16;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j21111, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i39 |= 24576;
        i44 = i43;
        i45 = i15 & 32768;
        if (i45 != 0) {
            i39 |= 196608;
        } else if ((i14 & 196608) == 0) {
            i39 |= c1086gP.k(lVar2) ? 131072 : 65536;
        }
        if ((i14 & 1572864) != 0) {
            if ((i15 & 65536) == 0) {
                i26 = 1048576;
            }
            i39 |= i26;
        }
        if ((i16 & 306783379) == 306783378) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (c1086gP.C(i16 & 1, z11)) {
            c1086gP.r0();
            if ((i13 & 1) != 0) {
                if (i52 != 0) {
                    hVar5 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar5 = hVar;
                }
                if (i17 != 0) {
                    j17 = androidx.compose.ui.graphics.H.f13504l;
                } else {
                    j17 = j;
                }
                if (i19 != 0) {
                    j18 = p013b0.n.f20493c;
                } else {
                    j18 = j10;
                }
                if (i21 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (i23 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar;
                }
                if (i25 != 0) {
                    dVar3 = null;
                } else {
                    dVar3 = dVar;
                }
                if (i28 != 0) {
                    j19 = p013b0.n.f20493c;
                } else {
                    j19 = j11;
                }
                if (i30 != 0) {
                    hVar6 = null;
                } else {
                    hVar6 = hVar2;
                }
                if (i32 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                if (i34 != 0) {
                    j16 = p013b0.n.f20493c;
                } else {
                    j16 = j12;
                }
                if (i37 != 0) {
                    i49 = 1;
                } else {
                    i49 = i10;
                }
                if (i40 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i42 != 0) {
                    i50 = BrazeLogger.SUPPRESS;
                } else {
                    i50 = i11;
                }
                if (i44 == 0) {
                }
                if (i45 == 0) {
                }
                if ((i15 & 65536) != 0) {
                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                    i39 &= -3670017;
                } else {
                    f12 = f10;
                }
            } else {
                if (i52 != 0) {
                    hVar5 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar5 = hVar;
                }
                if (i17 != 0) {
                    j17 = androidx.compose.ui.graphics.H.f13504l;
                } else {
                    j17 = j;
                }
                if (i19 != 0) {
                    j18 = p013b0.n.f20493c;
                } else {
                    j18 = j10;
                }
                if (i21 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (i23 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar;
                }
                if (i25 != 0) {
                    dVar3 = null;
                } else {
                    dVar3 = dVar;
                }
                if (i28 != 0) {
                    j19 = p013b0.n.f20493c;
                } else {
                    j19 = j11;
                }
                if (i30 != 0) {
                    hVar6 = null;
                } else {
                    hVar6 = hVar2;
                }
                if (i32 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                if (i34 != 0) {
                    j16 = p013b0.n.f20493c;
                } else {
                    j16 = j12;
                }
                if (i37 != 0) {
                    i49 = 1;
                } else {
                    i49 = i10;
                }
                if (i40 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i42 != 0) {
                    i50 = BrazeLogger.SUPPRESS;
                } else {
                    i50 = i11;
                }
                if (i44 == 0) {
                }
                if (i45 == 0) {
                }
                if ((i15 & 65536) != 0) {
                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                    i39 &= -3670017;
                } else {
                    f12 = f10;
                }
            }
            c1086gP.U();
            j20 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a;
            fFloatValue = ((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue();
            if (j17 != 16) {
                jB = j17;
            } else if (f12.b() != 16) {
                jB = f12.b();
            } else {
                jB = androidx.compose.ui.graphics.H.b(fFloatValue, j20);
            }
            if (gVar3 != null) {
                i51 = gVar3.f15669a;
            } else {
                i51 = Integer.MIN_VALUE;
            }
            androidx.compose.ui.text.F fE1113 = androidx.compose.ui.text.F.e(f12, 0L, j18, lVar5, jVar3, dVar3, j19, hVar6, i51, j16, 16609105);
            zI = c1086gP.i(jB);
            androidx.compose.ui.text.style.g gVar1116 = gVar3;
            objF = c1086gP.f();
            androidx.compose.ui.text.style.h hVar1119 = hVar6;
            if (zI) {
                objF = new a(jB);
                c1086gP.E(objF);
            } else {
                objF = new a(jB);
                c1086gP.E(objF);
            }
            int i51111117 = (i16 & R.styleable.AppCompatTheme_windowNoTitle) | ((i39 >> 6) & 7168);
            int i51111118 = i39 << 9;
            BasicTextKt.d(str, hVar5, fE1113, lVar6, i49, z13, i50, i48, (androidx.compose.ui.graphics.L) objF, c1086gP, i51111117 | (57344 & i51111118) | (458752 & i51111118) | (3670016 & i51111118) | (i51111118 & 29360128), 0);
            gVar2 = gVar1116;
            hVar4 = hVar1119;
            hVar3 = hVar5;
            z12 = z13;
            i47 = i50;
            jVar2 = jVar3;
            lVar3 = lVar5;
            j13 = j17;
            j14 = j18;
            i46 = i49;
            f11 = f12;
            j15 = j19;
            androidx.compose.ui.text.font.d dVar1116 = dVar3;
            lVar4 = lVar6;
            dVar2 = dVar1116;
        } else {
            c1086gP.w();
            hVar3 = hVar;
            j13 = j;
            j14 = j10;
            jVar2 = jVar;
            lVar3 = lVar;
            dVar2 = dVar;
            j15 = j11;
            hVar4 = hVar2;
            gVar2 = gVar;
            j16 = j12;
            i46 = i10;
            z12 = z10;
            i47 = i11;
            i48 = i12;
            lVar4 = lVar2;
            f11 = f10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j21112 = j16;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextKt.b(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j21112, i46, z12, i47, i48, lVar4, f11, interfaceC1084f2, L4.b.l(i13 | 1), L4.b.l(i14), i15);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0135  */
    /* JADX WARN: Code duplicated, block: B:103:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x0140  */
    /* JADX WARN: Code duplicated, block: B:108:0x0145  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0151  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:125:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0192  */
    /* JADX WARN: Code duplicated, block: B:140:0x019a  */
    /* JADX WARN: Code duplicated, block: B:142:0x019f  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01db  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:171:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:175:0x0200  */
    /* JADX WARN: Code duplicated, block: B:178:0x020a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0214  */
    /* JADX WARN: Code duplicated, block: B:187:0x0244 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x0246  */
    /* JADX WARN: Code duplicated, block: B:189:0x0249  */
    /* JADX WARN: Code duplicated, block: B:191:0x024d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0250  */
    /* JADX WARN: Code duplicated, block: B:194:0x0254  */
    /* JADX WARN: Code duplicated, block: B:195:0x0257  */
    /* JADX WARN: Code duplicated, block: B:198:0x025c  */
    /* JADX WARN: Code duplicated, block: B:199:0x025e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0262  */
    /* JADX WARN: Code duplicated, block: B:202:0x0265  */
    /* JADX WARN: Code duplicated, block: B:204:0x0269  */
    /* JADX WARN: Code duplicated, block: B:205:0x026c  */
    /* JADX WARN: Code duplicated, block: B:207:0x0270  */
    /* JADX WARN: Code duplicated, block: B:208:0x0273  */
    /* JADX WARN: Code duplicated, block: B:210:0x0277  */
    /* JADX WARN: Code duplicated, block: B:211:0x0279  */
    /* JADX WARN: Code duplicated, block: B:214:0x027e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0282  */
    /* JADX WARN: Code duplicated, block: B:217:0x0285  */
    /* JADX WARN: Code duplicated, block: B:219:0x0289  */
    /* JADX WARN: Code duplicated, block: B:220:0x028c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0291  */
    /* JADX WARN: Code duplicated, block: B:225:0x0295  */
    /* JADX WARN: Code duplicated, block: B:226:0x0299  */
    /* JADX WARN: Code duplicated, block: B:228:0x029d  */
    /* JADX WARN: Code duplicated, block: B:229:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:232:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:233:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:235:0x0344  */
    /* JADX WARN: Code duplicated, block: B:238:0x036b  */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0129  */
    @p293xa.d
    public static final void c(final String str, androidx.compose.ui.h hVar, long j, long j10, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.d dVar, long j11, androidx.compose.ui.text.style.h hVar2, androidx.compose.ui.text.style.g gVar, long j12, int i10, boolean z10, int i11, Ia.l lVar2, androidx.compose.ui.text.F f10, InterfaceC1084f interfaceC1084f, final int i12, final int i13, final int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        boolean z11;
        final androidx.compose.ui.h hVar3;
        final long j13;
        final long j14;
        final androidx.compose.ui.text.font.j jVar2;
        final androidx.compose.ui.text.font.l lVar3;
        final androidx.compose.ui.text.font.d dVar2;
        final long j15;
        final androidx.compose.ui.text.style.h hVar4;
        final androidx.compose.ui.text.style.g gVar2;
        final long j16;
        final int i44;
        final boolean z12;
        final int i45;
        final Ia.l lVar4;
        final androidx.compose.ui.text.F f11;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar5;
        long j17;
        long j18;
        androidx.compose.ui.text.font.j jVar3;
        androidx.compose.ui.text.font.l lVar5;
        androidx.compose.ui.text.font.d dVar3;
        long j19;
        androidx.compose.ui.text.style.h hVar6;
        androidx.compose.ui.text.style.g gVar3;
        long j20;
        int i46;
        boolean z13;
        int i47;
        Ia.l lVar6;
        androidx.compose.ui.text.F f12;
        long j21;
        int i48;
        int i49;
        int i50;
        androidx.compose.ui.text.style.g gVar4;
        Ia.l lVar7;
        androidx.compose.ui.text.font.l lVar8;
        boolean z14;
        androidx.compose.ui.text.font.d dVar4;
        long j22;
        long j23;
        long j24;
        C1086g c1086gP = interfaceC1084f.p(-366126944);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i15 = (c1086gP.K(str) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        int i51 = i14 & 2;
        if (i51 == 0) {
            if ((i12 & 48) == 0) {
                i15 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                i15 |= 384;
            } else if ((i12 & 384) == 0) {
                if (c1086gP.i(j)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                i15 |= 3072;
            } else if ((i12 & 3072) == 0) {
                if (c1086gP.i(j10)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((i12 & 24576) == 0) {
                    if (c1086gP.K(jVar)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i15 |= i21;
                }
                i22 = i14 & 32;
                i23 = 65536;
                if (i22 != 0) {
                    i15 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (c1086gP.K(lVar)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c1086gP.K(dVar)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & 128;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.i(j11)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i15 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.K(hVar2)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i15 |= i30;
                }
                i31 = i14 & 512;
                if (i31 != 0) {
                    i15 |= 805306368;
                } else if ((i12 & 805306368) == 0) {
                    if (c1086gP.K(gVar)) {
                        i32 = 536870912;
                    } else {
                        i32 = 268435456;
                    }
                    i15 |= i32;
                }
                i33 = i14 & 1024;
                if (i33 != 0) {
                    i34 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    if (c1086gP.i(j12)) {
                        i35 = 4;
                    } else {
                        i35 = 2;
                    }
                    i34 = i13 | i35;
                } else {
                    i34 = i13;
                }
                i36 = i14 & 2048;
                if (i36 != 0) {
                    i34 |= 48;
                } else if ((i13 & 48) == 0) {
                    if (c1086gP.h(i10)) {
                        i37 = 32;
                    } else {
                        i37 = 16;
                    }
                    i34 |= i37;
                }
                i38 = i34;
                i39 = i14 & 4096;
                if (i39 != 0) {
                    if ((i13 & 384) == 0) {
                        if (c1086gP.c(z10)) {
                            i40 = 256;
                        } else {
                            i40 = 128;
                        }
                        i38 |= i40;
                    }
                    i41 = i14 & 8192;
                    if (i41 != 0) {
                        if ((i13 & 3072) == 0) {
                            i38 |= c1086gP.h(i11) ? 2048 : 1024;
                        }
                        i42 = i14 & 16384;
                        if (i42 != 0) {
                            i43 = i42;
                            if ((i13 & 24576) == 0) {
                                i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                            }
                            if ((i13 & 196608) != 0) {
                                if ((i14 & 32768) == 0 && c1086gP.K(f10)) {
                                    i23 = 131072;
                                }
                                i38 |= i23;
                            }
                            if ((i15 & 306783379) == 306783378 || (74899 & i38) != 74898) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (c1086gP.C(i15 & 1, z11)) {
                                c1086gP.r0();
                                if ((i12 & 1) != 0 || c1086gP.a0()) {
                                    if (i51 != 0) {
                                        hVar5 = androidx.compose.ui.h.a.f13984b;
                                    } else {
                                        hVar5 = hVar;
                                    }
                                    if (i16 != 0) {
                                        j17 = androidx.compose.ui.graphics.H.f13504l;
                                    } else {
                                        j17 = j;
                                    }
                                    if (i18 != 0) {
                                        j18 = p013b0.n.f20493c;
                                    } else {
                                        j18 = j10;
                                    }
                                    if (i20 != 0) {
                                        jVar3 = null;
                                    } else {
                                        jVar3 = jVar;
                                    }
                                    if (i22 != 0) {
                                        lVar5 = null;
                                    } else {
                                        lVar5 = lVar;
                                    }
                                    if (i25 != 0) {
                                        dVar3 = null;
                                    } else {
                                        dVar3 = dVar;
                                    }
                                    if (i27 != 0) {
                                        j19 = p013b0.n.f20493c;
                                    } else {
                                        j19 = j11;
                                    }
                                    if (i29 != 0) {
                                        hVar6 = null;
                                    } else {
                                        hVar6 = hVar2;
                                    }
                                    gVar3 = i31 == 0 ? gVar : null;
                                    if (i33 != 0) {
                                        j20 = p013b0.n.f20493c;
                                    } else {
                                        j20 = j12;
                                    }
                                    if (i36 != 0) {
                                        i46 = 1;
                                    } else {
                                        i46 = i10;
                                    }
                                    z13 = i39 == 0 ? z10 : true;
                                    if (i41 != 0) {
                                        i47 = BrazeLogger.SUPPRESS;
                                    } else {
                                        i47 = i11;
                                    }
                                    if (i43 != 0) {
                                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                            @Override // Ia.l
                                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                    } else {
                                        lVar6 = lVar2;
                                    }
                                    if ((i14 & 32768) != 0) {
                                        j21 = j20;
                                        i48 = i47;
                                        i49 = i38 & (-458753);
                                        i50 = i46;
                                        gVar4 = gVar3;
                                        lVar7 = lVar6;
                                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                        z14 = z13;
                                        dVar4 = dVar3;
                                        j22 = j17;
                                        j23 = j19;
                                        j24 = j18;
                                        hVar4 = hVar6;
                                        lVar8 = lVar5;
                                    } else {
                                        f12 = f10;
                                        j21 = j20;
                                        hVar4 = hVar6;
                                        i48 = i47;
                                        i49 = i38;
                                        i50 = i46;
                                        gVar4 = gVar3;
                                        lVar7 = lVar6;
                                        lVar8 = lVar5;
                                        z14 = z13;
                                        dVar4 = dVar3;
                                        j22 = j17;
                                        j23 = j19;
                                        j24 = j18;
                                    }
                                } else {
                                    c1086gP.w();
                                    if ((i14 & 32768) != 0) {
                                        i38 &= -458753;
                                    }
                                    hVar5 = hVar;
                                    j22 = j;
                                    jVar3 = jVar;
                                    lVar8 = lVar;
                                    dVar4 = dVar;
                                    j23 = j11;
                                    hVar4 = hVar2;
                                    gVar4 = gVar;
                                    j21 = j12;
                                    i50 = i10;
                                    z14 = z10;
                                    i48 = i11;
                                    lVar7 = lVar2;
                                    f12 = f10;
                                    i49 = i38;
                                    j24 = j10;
                                }
                                c1086gP.U();
                                int i52 = i15 & 2147483646;
                                int i53 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                                int i54 = i49 << 3;
                                b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i52, i53 | (458752 & i54) | (i54 & 3670016), 0);
                                gVar2 = gVar4;
                                j16 = j21;
                                i44 = i50;
                                z12 = z14;
                                i45 = i48;
                                lVar4 = lVar7;
                                f11 = f12;
                                androidx.compose.ui.text.font.d dVar5 = dVar4;
                                lVar3 = lVar8;
                                j13 = j22;
                                hVar3 = hVar5;
                                j14 = j24;
                                jVar2 = jVar3;
                                j15 = j23;
                                dVar2 = dVar5;
                            } else {
                                c1086gP.w();
                                hVar3 = hVar;
                                j13 = j;
                                j14 = j10;
                                jVar2 = jVar;
                                lVar3 = lVar;
                                dVar2 = dVar;
                                j15 = j11;
                                hVar4 = hVar2;
                                gVar2 = gVar;
                                j16 = j12;
                                i44 = i10;
                                z12 = z10;
                                i45 = i11;
                                lVar4 = lVar2;
                                f11 = f10;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i38 |= 24576;
                        i43 = i42;
                        if ((i13 & 196608) != 0) {
                            if ((i14 & 32768) == 0) {
                                i23 = 131072;
                            }
                            i38 |= i23;
                        }
                        if ((i15 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i15 & 1, z11)) {
                            c1086gP.r0();
                            if ((i12 & 1) != 0) {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            } else {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            }
                            c1086gP.U();
                            int i55 = i15 & 2147483646;
                            int i56 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                            int i57 = i49 << 3;
                            b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i55, i56 | (458752 & i57) | (i57 & 3670016), 0);
                            gVar2 = gVar4;
                            j16 = j21;
                            i44 = i50;
                            z12 = z14;
                            i45 = i48;
                            lVar4 = lVar7;
                            f11 = f12;
                            androidx.compose.ui.text.font.d dVar6 = dVar4;
                            lVar3 = lVar8;
                            j13 = j22;
                            hVar3 = hVar5;
                            j14 = j24;
                            jVar2 = jVar3;
                            j15 = j23;
                            dVar2 = dVar6;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i44 = i10;
                            z12 = z10;
                            i45 = i11;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i38 |= 3072;
                    i42 = i14 & 16384;
                    if (i42 != 0) {
                        i43 = i42;
                        if ((i13 & 24576) == 0) {
                            i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                        }
                        if ((i13 & 196608) != 0) {
                            if ((i14 & 32768) == 0) {
                                i23 = 131072;
                            }
                            i38 |= i23;
                        }
                        if ((i15 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i15 & 1, z11)) {
                            c1086gP.r0();
                            if ((i12 & 1) != 0) {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            } else {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            }
                            c1086gP.U();
                            int i58 = i15 & 2147483646;
                            int i59 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                            int i510 = i49 << 3;
                            b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i58, i59 | (458752 & i510) | (i510 & 3670016), 0);
                            gVar2 = gVar4;
                            j16 = j21;
                            i44 = i50;
                            z12 = z14;
                            i45 = i48;
                            lVar4 = lVar7;
                            f11 = f12;
                            androidx.compose.ui.text.font.d dVar7 = dVar4;
                            lVar3 = lVar8;
                            j13 = j22;
                            hVar3 = hVar5;
                            j14 = j24;
                            jVar2 = jVar3;
                            j15 = j23;
                            dVar2 = dVar7;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i44 = i10;
                            z12 = z10;
                            i45 = i11;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i38 |= 24576;
                    i43 = i42;
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i511 = i15 & 2147483646;
                        int i512 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i513 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i511, i512 | (458752 & i513) | (i513 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar8 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar8;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 384;
                i41 = i14 & 8192;
                if (i41 != 0) {
                    if ((i13 & 3072) == 0) {
                        i38 |= c1086gP.h(i11) ? 2048 : 1024;
                    }
                    i42 = i14 & 16384;
                    if (i42 != 0) {
                        i43 = i42;
                        if ((i13 & 24576) == 0) {
                            i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                        }
                        if ((i13 & 196608) != 0) {
                            if ((i14 & 32768) == 0) {
                                i23 = 131072;
                            }
                            i38 |= i23;
                        }
                        if ((i15 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i15 & 1, z11)) {
                            c1086gP.r0();
                            if ((i12 & 1) != 0) {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            } else {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            }
                            c1086gP.U();
                            int i514 = i15 & 2147483646;
                            int i515 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                            int i516 = i49 << 3;
                            b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i514, i515 | (458752 & i516) | (i516 & 3670016), 0);
                            gVar2 = gVar4;
                            j16 = j21;
                            i44 = i50;
                            z12 = z14;
                            i45 = i48;
                            lVar4 = lVar7;
                            f11 = f12;
                            androidx.compose.ui.text.font.d dVar9 = dVar4;
                            lVar3 = lVar8;
                            j13 = j22;
                            hVar3 = hVar5;
                            j14 = j24;
                            jVar2 = jVar3;
                            j15 = j23;
                            dVar2 = dVar9;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i44 = i10;
                            z12 = z10;
                            i45 = i11;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i38 |= 24576;
                    i43 = i42;
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i517 = i15 & 2147483646;
                        int i518 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i519 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i517, i518 | (458752 & i519) | (i519 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar10 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar10;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 3072;
                i42 = i14 & 16384;
                if (i42 != 0) {
                    i43 = i42;
                    if ((i13 & 24576) == 0) {
                        i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                    }
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i5110 = i15 & 2147483646;
                        int i5111 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i5112 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5110, i5111 | (458752 & i5112) | (i5112 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar11 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar11;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 24576;
                i43 = i42;
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i5113 = i15 & 2147483646;
                    int i5114 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i5115 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5113, i5114 | (458752 & i5115) | (i5115 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar12 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar12;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i15 |= 24576;
            i22 = i14 & 32;
            i23 = 65536;
            if (i22 != 0) {
                i15 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (c1086gP.K(lVar)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c1086gP.K(dVar)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & 128;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.i(j11)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            i29 = i14 & 256;
            if (i29 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.K(hVar2)) {
                    i30 = 67108864;
                } else {
                    i30 = 33554432;
                }
                i15 |= i30;
            }
            i31 = i14 & 512;
            if (i31 != 0) {
                i15 |= 805306368;
            } else if ((i12 & 805306368) == 0) {
                if (c1086gP.K(gVar)) {
                    i32 = 536870912;
                } else {
                    i32 = 268435456;
                }
                i15 |= i32;
            }
            i33 = i14 & 1024;
            if (i33 != 0) {
                i34 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                if (c1086gP.i(j12)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i34 = i13 | i35;
            } else {
                i34 = i13;
            }
            i36 = i14 & 2048;
            if (i36 != 0) {
                i34 |= 48;
            } else if ((i13 & 48) == 0) {
                if (c1086gP.h(i10)) {
                    i37 = 32;
                } else {
                    i37 = 16;
                }
                i34 |= i37;
            }
            i38 = i34;
            i39 = i14 & 4096;
            if (i39 != 0) {
                if ((i13 & 384) == 0) {
                    if (c1086gP.c(z10)) {
                        i40 = 256;
                    } else {
                        i40 = 128;
                    }
                    i38 |= i40;
                }
                i41 = i14 & 8192;
                if (i41 != 0) {
                    if ((i13 & 3072) == 0) {
                        i38 |= c1086gP.h(i11) ? 2048 : 1024;
                    }
                    i42 = i14 & 16384;
                    if (i42 != 0) {
                        i43 = i42;
                        if ((i13 & 24576) == 0) {
                            i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                        }
                        if ((i13 & 196608) != 0) {
                            if ((i14 & 32768) == 0) {
                                i23 = 131072;
                            }
                            i38 |= i23;
                        }
                        if ((i15 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i15 & 1, z11)) {
                            c1086gP.r0();
                            if ((i12 & 1) != 0) {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            } else {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            }
                            c1086gP.U();
                            int i5116 = i15 & 2147483646;
                            int i5117 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                            int i5118 = i49 << 3;
                            b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5116, i5117 | (458752 & i5118) | (i5118 & 3670016), 0);
                            gVar2 = gVar4;
                            j16 = j21;
                            i44 = i50;
                            z12 = z14;
                            i45 = i48;
                            lVar4 = lVar7;
                            f11 = f12;
                            androidx.compose.ui.text.font.d dVar13 = dVar4;
                            lVar3 = lVar8;
                            j13 = j22;
                            hVar3 = hVar5;
                            j14 = j24;
                            jVar2 = jVar3;
                            j15 = j23;
                            dVar2 = dVar13;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i44 = i10;
                            z12 = z10;
                            i45 = i11;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i38 |= 24576;
                    i43 = i42;
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i5119 = i15 & 2147483646;
                        int i51110 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i51111 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5119, i51110 | (458752 & i51111) | (i51111 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar14 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar14;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 3072;
                i42 = i14 & 16384;
                if (i42 != 0) {
                    i43 = i42;
                    if ((i13 & 24576) == 0) {
                        i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                    }
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i51112 = i15 & 2147483646;
                        int i51113 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i51114 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i51112, i51113 | (458752 & i51114) | (i51114 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar15 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar15;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 24576;
                i43 = i42;
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i51115 = i15 & 2147483646;
                    int i51116 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i51117 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i51115, i51116 | (458752 & i51117) | (i51117 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar16 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar16;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i38 |= 384;
            i41 = i14 & 8192;
            if (i41 != 0) {
                if ((i13 & 3072) == 0) {
                    i38 |= c1086gP.h(i11) ? 2048 : 1024;
                }
                i42 = i14 & 16384;
                if (i42 != 0) {
                    i43 = i42;
                    if ((i13 & 24576) == 0) {
                        i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                    }
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i51118 = i15 & 2147483646;
                        int i51119 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i511110 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i51118, i51119 | (458752 & i511110) | (i511110 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar17 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar17;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 24576;
                i43 = i42;
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i511111 = i15 & 2147483646;
                    int i511112 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i511113 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i511111, i511112 | (458752 & i511113) | (i511113 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar18 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar18;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i38 |= 3072;
            i42 = i14 & 16384;
            if (i42 != 0) {
                i43 = i42;
                if ((i13 & 24576) == 0) {
                    i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                }
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i511114 = i15 & 2147483646;
                    int i511115 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i511116 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i511114, i511115 | (458752 & i511116) | (i511116 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar19 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar19;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i38 |= 24576;
            i43 = i42;
            if ((i13 & 196608) != 0) {
                if ((i14 & 32768) == 0) {
                    i23 = 131072;
                }
                i38 |= i23;
            }
            if ((i15 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i15 & 1, z11)) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                } else {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                }
                c1086gP.U();
                int i511117 = i15 & 2147483646;
                int i511118 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                int i511119 = i49 << 3;
                b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i511117, i511118 | (458752 & i511119) | (i511119 & 3670016), 0);
                gVar2 = gVar4;
                j16 = j21;
                i44 = i50;
                z12 = z14;
                i45 = i48;
                lVar4 = lVar7;
                f11 = f12;
                androidx.compose.ui.text.font.d dVar110 = dVar4;
                lVar3 = lVar8;
                j13 = j22;
                hVar3 = hVar5;
                j14 = j24;
                jVar2 = jVar3;
                j15 = j23;
                dVar2 = dVar110;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i44 = i10;
                z12 = z10;
                i45 = i11;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i12 & 384) == 0) {
            if (c1086gP.i(j)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= 3072;
        } else if ((i12 & 3072) == 0) {
            if (c1086gP.i(j10)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i15 |= i19;
        }
        i20 = i14 & 16;
        if (i20 != 0) {
            if ((i12 & 24576) == 0) {
                if (c1086gP.K(jVar)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i15 |= i21;
            }
            i22 = i14 & 32;
            i23 = 65536;
            if (i22 != 0) {
                i15 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (c1086gP.K(lVar)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c1086gP.K(dVar)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & 128;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.i(j11)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            i29 = i14 & 256;
            if (i29 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.K(hVar2)) {
                    i30 = 67108864;
                } else {
                    i30 = 33554432;
                }
                i15 |= i30;
            }
            i31 = i14 & 512;
            if (i31 != 0) {
                i15 |= 805306368;
            } else if ((i12 & 805306368) == 0) {
                if (c1086gP.K(gVar)) {
                    i32 = 536870912;
                } else {
                    i32 = 268435456;
                }
                i15 |= i32;
            }
            i33 = i14 & 1024;
            if (i33 != 0) {
                i34 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                if (c1086gP.i(j12)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i34 = i13 | i35;
            } else {
                i34 = i13;
            }
            i36 = i14 & 2048;
            if (i36 != 0) {
                i34 |= 48;
            } else if ((i13 & 48) == 0) {
                if (c1086gP.h(i10)) {
                    i37 = 32;
                } else {
                    i37 = 16;
                }
                i34 |= i37;
            }
            i38 = i34;
            i39 = i14 & 4096;
            if (i39 != 0) {
                if ((i13 & 384) == 0) {
                    if (c1086gP.c(z10)) {
                        i40 = 256;
                    } else {
                        i40 = 128;
                    }
                    i38 |= i40;
                }
                i41 = i14 & 8192;
                if (i41 != 0) {
                    if ((i13 & 3072) == 0) {
                        i38 |= c1086gP.h(i11) ? 2048 : 1024;
                    }
                    i42 = i14 & 16384;
                    if (i42 != 0) {
                        i43 = i42;
                        if ((i13 & 24576) == 0) {
                            i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                        }
                        if ((i13 & 196608) != 0) {
                            if ((i14 & 32768) == 0) {
                                i23 = 131072;
                            }
                            i38 |= i23;
                        }
                        if ((i15 & 306783379) == 306783378) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (c1086gP.C(i15 & 1, z11)) {
                            c1086gP.r0();
                            if ((i12 & 1) != 0) {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            } else {
                                if (i51 != 0) {
                                    hVar5 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar5 = hVar;
                                }
                                if (i16 != 0) {
                                    j17 = androidx.compose.ui.graphics.H.f13504l;
                                } else {
                                    j17 = j;
                                }
                                if (i18 != 0) {
                                    j18 = p013b0.n.f20493c;
                                } else {
                                    j18 = j10;
                                }
                                if (i20 != 0) {
                                    jVar3 = null;
                                } else {
                                    jVar3 = jVar;
                                }
                                if (i22 != 0) {
                                    lVar5 = null;
                                } else {
                                    lVar5 = lVar;
                                }
                                if (i25 != 0) {
                                    dVar3 = null;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i27 != 0) {
                                    j19 = p013b0.n.f20493c;
                                } else {
                                    j19 = j11;
                                }
                                if (i29 != 0) {
                                    hVar6 = null;
                                } else {
                                    hVar6 = hVar2;
                                }
                                if (i31 == 0) {
                                }
                                if (i33 != 0) {
                                    j20 = p013b0.n.f20493c;
                                } else {
                                    j20 = j12;
                                }
                                if (i36 != 0) {
                                    i46 = 1;
                                } else {
                                    i46 = i10;
                                }
                                if (i39 == 0) {
                                }
                                if (i41 != 0) {
                                    i47 = BrazeLogger.SUPPRESS;
                                } else {
                                    i47 = i11;
                                }
                                if (i43 != 0) {
                                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                } else {
                                    lVar6 = lVar2;
                                }
                                if ((i14 & 32768) != 0) {
                                    j21 = j20;
                                    i48 = i47;
                                    i49 = i38 & (-458753);
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                    hVar4 = hVar6;
                                    lVar8 = lVar5;
                                } else {
                                    f12 = f10;
                                    j21 = j20;
                                    hVar4 = hVar6;
                                    i48 = i47;
                                    i49 = i38;
                                    i50 = i46;
                                    gVar4 = gVar3;
                                    lVar7 = lVar6;
                                    lVar8 = lVar5;
                                    z14 = z13;
                                    dVar4 = dVar3;
                                    j22 = j17;
                                    j23 = j19;
                                    j24 = j18;
                                }
                            }
                            c1086gP.U();
                            int i5111110 = i15 & 2147483646;
                            int i5111111 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                            int i5111112 = i49 << 3;
                            b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5111110, i5111111 | (458752 & i5111112) | (i5111112 & 3670016), 0);
                            gVar2 = gVar4;
                            j16 = j21;
                            i44 = i50;
                            z12 = z14;
                            i45 = i48;
                            lVar4 = lVar7;
                            f11 = f12;
                            androidx.compose.ui.text.font.d dVar111 = dVar4;
                            lVar3 = lVar8;
                            j13 = j22;
                            hVar3 = hVar5;
                            j14 = j24;
                            jVar2 = jVar3;
                            j15 = j23;
                            dVar2 = dVar111;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            j13 = j;
                            j14 = j10;
                            jVar2 = jVar;
                            lVar3 = lVar;
                            dVar2 = dVar;
                            j15 = j11;
                            hVar4 = hVar2;
                            gVar2 = gVar;
                            j16 = j12;
                            i44 = i10;
                            z12 = z10;
                            i45 = i11;
                            lVar4 = lVar2;
                            f11 = f10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i38 |= 24576;
                    i43 = i42;
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i5111113 = i15 & 2147483646;
                        int i5111114 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i5111115 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5111113, i5111114 | (458752 & i5111115) | (i5111115 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar112 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar112;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 3072;
                i42 = i14 & 16384;
                if (i42 != 0) {
                    i43 = i42;
                    if ((i13 & 24576) == 0) {
                        i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                    }
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i5111116 = i15 & 2147483646;
                        int i5111117 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i5111118 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5111116, i5111117 | (458752 & i5111118) | (i5111118 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar113 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar113;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 24576;
                i43 = i42;
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i5111119 = i15 & 2147483646;
                    int i51111110 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i51111111 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5111119, i51111110 | (458752 & i51111111) | (i51111111 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar114 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar114;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i38 |= 384;
            i41 = i14 & 8192;
            if (i41 != 0) {
                if ((i13 & 3072) == 0) {
                    i38 |= c1086gP.h(i11) ? 2048 : 1024;
                }
                i42 = i14 & 16384;
                if (i42 != 0) {
                    i43 = i42;
                    if ((i13 & 24576) == 0) {
                        i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                    }
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i51111112 = i15 & 2147483646;
                        int i51111113 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i51111114 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i51111112, i51111113 | (458752 & i51111114) | (i51111114 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar115 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar115;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 24576;
                i43 = i42;
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i51111115 = i15 & 2147483646;
                    int i51111116 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i51111117 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i51111115, i51111116 | (458752 & i51111117) | (i51111117 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar116 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar116;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i38 |= 3072;
            i42 = i14 & 16384;
            if (i42 != 0) {
                i43 = i42;
                if ((i13 & 24576) == 0) {
                    i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                }
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i51111118 = i15 & 2147483646;
                    int i51111119 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i511111110 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i51111118, i51111119 | (458752 & i511111110) | (i511111110 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar117 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar117;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i38 |= 24576;
            i43 = i42;
            if ((i13 & 196608) != 0) {
                if ((i14 & 32768) == 0) {
                    i23 = 131072;
                }
                i38 |= i23;
            }
            if ((i15 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i15 & 1, z11)) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                } else {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                }
                c1086gP.U();
                int i511111111 = i15 & 2147483646;
                int i511111112 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                int i511111113 = i49 << 3;
                b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i511111111, i511111112 | (458752 & i511111113) | (i511111113 & 3670016), 0);
                gVar2 = gVar4;
                j16 = j21;
                i44 = i50;
                z12 = z14;
                i45 = i48;
                lVar4 = lVar7;
                f11 = f12;
                androidx.compose.ui.text.font.d dVar118 = dVar4;
                lVar3 = lVar8;
                j13 = j22;
                hVar3 = hVar5;
                j14 = j24;
                jVar2 = jVar3;
                j15 = j23;
                dVar2 = dVar118;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i44 = i10;
                z12 = z10;
                i45 = i11;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i15 |= 24576;
        i22 = i14 & 32;
        i23 = 65536;
        if (i22 != 0) {
            i15 |= 196608;
        } else if ((i12 & 196608) == 0) {
            if (c1086gP.K(lVar)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i15 |= i24;
        }
        i25 = i14 & 64;
        if (i25 != 0) {
            i15 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (c1086gP.K(dVar)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i15 |= i26;
        }
        i27 = i14 & 128;
        if (i27 != 0) {
            i15 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            if (c1086gP.i(j11)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i15 |= i28;
        }
        i29 = i14 & 256;
        if (i29 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            if (c1086gP.K(hVar2)) {
                i30 = 67108864;
            } else {
                i30 = 33554432;
            }
            i15 |= i30;
        }
        i31 = i14 & 512;
        if (i31 != 0) {
            i15 |= 805306368;
        } else if ((i12 & 805306368) == 0) {
            if (c1086gP.K(gVar)) {
                i32 = 536870912;
            } else {
                i32 = 268435456;
            }
            i15 |= i32;
        }
        i33 = i14 & 1024;
        if (i33 != 0) {
            i34 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            if (c1086gP.i(j12)) {
                i35 = 4;
            } else {
                i35 = 2;
            }
            i34 = i13 | i35;
        } else {
            i34 = i13;
        }
        i36 = i14 & 2048;
        if (i36 != 0) {
            i34 |= 48;
        } else if ((i13 & 48) == 0) {
            if (c1086gP.h(i10)) {
                i37 = 32;
            } else {
                i37 = 16;
            }
            i34 |= i37;
        }
        i38 = i34;
        i39 = i14 & 4096;
        if (i39 != 0) {
            if ((i13 & 384) == 0) {
                if (c1086gP.c(z10)) {
                    i40 = 256;
                } else {
                    i40 = 128;
                }
                i38 |= i40;
            }
            i41 = i14 & 8192;
            if (i41 != 0) {
                if ((i13 & 3072) == 0) {
                    i38 |= c1086gP.h(i11) ? 2048 : 1024;
                }
                i42 = i14 & 16384;
                if (i42 != 0) {
                    i43 = i42;
                    if ((i13 & 24576) == 0) {
                        i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                    }
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i23 = 131072;
                        }
                        i38 |= i23;
                    }
                    if ((i15 & 306783379) == 306783378) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (c1086gP.C(i15 & 1, z11)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        } else {
                            if (i51 != 0) {
                                hVar5 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar5 = hVar;
                            }
                            if (i16 != 0) {
                                j17 = androidx.compose.ui.graphics.H.f13504l;
                            } else {
                                j17 = j;
                            }
                            if (i18 != 0) {
                                j18 = p013b0.n.f20493c;
                            } else {
                                j18 = j10;
                            }
                            if (i20 != 0) {
                                jVar3 = null;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i22 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar;
                            }
                            if (i25 != 0) {
                                dVar3 = null;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i27 != 0) {
                                j19 = p013b0.n.f20493c;
                            } else {
                                j19 = j11;
                            }
                            if (i29 != 0) {
                                hVar6 = null;
                            } else {
                                hVar6 = hVar2;
                            }
                            if (i31 == 0) {
                            }
                            if (i33 != 0) {
                                j20 = p013b0.n.f20493c;
                            } else {
                                j20 = j12;
                            }
                            if (i36 != 0) {
                                i46 = 1;
                            } else {
                                i46 = i10;
                            }
                            if (i39 == 0) {
                            }
                            if (i41 != 0) {
                                i47 = BrazeLogger.SUPPRESS;
                            } else {
                                i47 = i11;
                            }
                            if (i43 != 0) {
                                lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                        return p293xa.r.f47939a;
                                    }
                                };
                            } else {
                                lVar6 = lVar2;
                            }
                            if ((i14 & 32768) != 0) {
                                j21 = j20;
                                i48 = i47;
                                i49 = i38 & (-458753);
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                                hVar4 = hVar6;
                                lVar8 = lVar5;
                            } else {
                                f12 = f10;
                                j21 = j20;
                                hVar4 = hVar6;
                                i48 = i47;
                                i49 = i38;
                                i50 = i46;
                                gVar4 = gVar3;
                                lVar7 = lVar6;
                                lVar8 = lVar5;
                                z14 = z13;
                                dVar4 = dVar3;
                                j22 = j17;
                                j23 = j19;
                                j24 = j18;
                            }
                        }
                        c1086gP.U();
                        int i511111114 = i15 & 2147483646;
                        int i511111115 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                        int i511111116 = i49 << 3;
                        b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i511111114, i511111115 | (458752 & i511111116) | (i511111116 & 3670016), 0);
                        gVar2 = gVar4;
                        j16 = j21;
                        i44 = i50;
                        z12 = z14;
                        i45 = i48;
                        lVar4 = lVar7;
                        f11 = f12;
                        androidx.compose.ui.text.font.d dVar119 = dVar4;
                        lVar3 = lVar8;
                        j13 = j22;
                        hVar3 = hVar5;
                        j14 = j24;
                        jVar2 = jVar3;
                        j15 = j23;
                        dVar2 = dVar119;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        j13 = j;
                        j14 = j10;
                        jVar2 = jVar;
                        lVar3 = lVar;
                        dVar2 = dVar;
                        j15 = j11;
                        hVar4 = hVar2;
                        gVar2 = gVar;
                        j16 = j12;
                        i44 = i10;
                        z12 = z10;
                        i45 = i11;
                        lVar4 = lVar2;
                        f11 = f10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i38 |= 24576;
                i43 = i42;
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i511111117 = i15 & 2147483646;
                    int i511111118 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i511111119 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i511111117, i511111118 | (458752 & i511111119) | (i511111119 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar1110 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar1110;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i38 |= 3072;
            i42 = i14 & 16384;
            if (i42 != 0) {
                i43 = i42;
                if ((i13 & 24576) == 0) {
                    i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                }
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i5111111110 = i15 & 2147483646;
                    int i5111111111 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i5111111112 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5111111110, i5111111111 | (458752 & i5111111112) | (i5111111112 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar1111 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar1111;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i38 |= 24576;
            i43 = i42;
            if ((i13 & 196608) != 0) {
                if ((i14 & 32768) == 0) {
                    i23 = 131072;
                }
                i38 |= i23;
            }
            if ((i15 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i15 & 1, z11)) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                } else {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                }
                c1086gP.U();
                int i5111111113 = i15 & 2147483646;
                int i5111111114 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                int i5111111115 = i49 << 3;
                b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5111111113, i5111111114 | (458752 & i5111111115) | (i5111111115 & 3670016), 0);
                gVar2 = gVar4;
                j16 = j21;
                i44 = i50;
                z12 = z14;
                i45 = i48;
                lVar4 = lVar7;
                f11 = f12;
                androidx.compose.ui.text.font.d dVar1112 = dVar4;
                lVar3 = lVar8;
                j13 = j22;
                hVar3 = hVar5;
                j14 = j24;
                jVar2 = jVar3;
                j15 = j23;
                dVar2 = dVar1112;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i44 = i10;
                z12 = z10;
                i45 = i11;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i38 |= 384;
        i41 = i14 & 8192;
        if (i41 != 0) {
            if ((i13 & 3072) == 0) {
                i38 |= c1086gP.h(i11) ? 2048 : 1024;
            }
            i42 = i14 & 16384;
            if (i42 != 0) {
                i43 = i42;
                if ((i13 & 24576) == 0) {
                    i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
                }
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i23 = 131072;
                    }
                    i38 |= i23;
                }
                if ((i15 & 306783379) == 306783378) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (c1086gP.C(i15 & 1, z11)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    } else {
                        if (i51 != 0) {
                            hVar5 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar5 = hVar;
                        }
                        if (i16 != 0) {
                            j17 = androidx.compose.ui.graphics.H.f13504l;
                        } else {
                            j17 = j;
                        }
                        if (i18 != 0) {
                            j18 = p013b0.n.f20493c;
                        } else {
                            j18 = j10;
                        }
                        if (i20 != 0) {
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar;
                        }
                        if (i25 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i27 != 0) {
                            j19 = p013b0.n.f20493c;
                        } else {
                            j19 = j11;
                        }
                        if (i29 != 0) {
                            hVar6 = null;
                        } else {
                            hVar6 = hVar2;
                        }
                        if (i31 == 0) {
                        }
                        if (i33 != 0) {
                            j20 = p013b0.n.f20493c;
                        } else {
                            j20 = j12;
                        }
                        if (i36 != 0) {
                            i46 = 1;
                        } else {
                            i46 = i10;
                        }
                        if (i39 == 0) {
                        }
                        if (i41 != 0) {
                            i47 = BrazeLogger.SUPPRESS;
                        } else {
                            i47 = i11;
                        }
                        if (i43 != 0) {
                            lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                    return p293xa.r.f47939a;
                                }
                            };
                        } else {
                            lVar6 = lVar2;
                        }
                        if ((i14 & 32768) != 0) {
                            j21 = j20;
                            i48 = i47;
                            i49 = i38 & (-458753);
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                            hVar4 = hVar6;
                            lVar8 = lVar5;
                        } else {
                            f12 = f10;
                            j21 = j20;
                            hVar4 = hVar6;
                            i48 = i47;
                            i49 = i38;
                            i50 = i46;
                            gVar4 = gVar3;
                            lVar7 = lVar6;
                            lVar8 = lVar5;
                            z14 = z13;
                            dVar4 = dVar3;
                            j22 = j17;
                            j23 = j19;
                            j24 = j18;
                        }
                    }
                    c1086gP.U();
                    int i5111111116 = i15 & 2147483646;
                    int i5111111117 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                    int i5111111118 = i49 << 3;
                    b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5111111116, i5111111117 | (458752 & i5111111118) | (i5111111118 & 3670016), 0);
                    gVar2 = gVar4;
                    j16 = j21;
                    i44 = i50;
                    z12 = z14;
                    i45 = i48;
                    lVar4 = lVar7;
                    f11 = f12;
                    androidx.compose.ui.text.font.d dVar1113 = dVar4;
                    lVar3 = lVar8;
                    j13 = j22;
                    hVar3 = hVar5;
                    j14 = j24;
                    jVar2 = jVar3;
                    j15 = j23;
                    dVar2 = dVar1113;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    j13 = j;
                    j14 = j10;
                    jVar2 = jVar;
                    lVar3 = lVar;
                    dVar2 = dVar;
                    j15 = j11;
                    hVar4 = hVar2;
                    gVar2 = gVar;
                    j16 = j12;
                    i44 = i10;
                    z12 = z10;
                    i45 = i11;
                    lVar4 = lVar2;
                    f11 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i38 |= 24576;
            i43 = i42;
            if ((i13 & 196608) != 0) {
                if ((i14 & 32768) == 0) {
                    i23 = 131072;
                }
                i38 |= i23;
            }
            if ((i15 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i15 & 1, z11)) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                } else {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                }
                c1086gP.U();
                int i5111111119 = i15 & 2147483646;
                int i51111111110 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                int i51111111111 = i49 << 3;
                b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i5111111119, i51111111110 | (458752 & i51111111111) | (i51111111111 & 3670016), 0);
                gVar2 = gVar4;
                j16 = j21;
                i44 = i50;
                z12 = z14;
                i45 = i48;
                lVar4 = lVar7;
                f11 = f12;
                androidx.compose.ui.text.font.d dVar1114 = dVar4;
                lVar3 = lVar8;
                j13 = j22;
                hVar3 = hVar5;
                j14 = j24;
                jVar2 = jVar3;
                j15 = j23;
                dVar2 = dVar1114;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i44 = i10;
                z12 = z10;
                i45 = i11;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i38 |= 3072;
        i42 = i14 & 16384;
        if (i42 != 0) {
            i43 = i42;
            if ((i13 & 24576) == 0) {
                i38 |= c1086gP.k(lVar2) ? 16384 : 8192;
            }
            if ((i13 & 196608) != 0) {
                if ((i14 & 32768) == 0) {
                    i23 = 131072;
                }
                i38 |= i23;
            }
            if ((i15 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (c1086gP.C(i15 & 1, z11)) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                } else {
                    if (i51 != 0) {
                        hVar5 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar5 = hVar;
                    }
                    if (i16 != 0) {
                        j17 = androidx.compose.ui.graphics.H.f13504l;
                    } else {
                        j17 = j;
                    }
                    if (i18 != 0) {
                        j18 = p013b0.n.f20493c;
                    } else {
                        j18 = j10;
                    }
                    if (i20 != 0) {
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar;
                    }
                    if (i25 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i27 != 0) {
                        j19 = p013b0.n.f20493c;
                    } else {
                        j19 = j11;
                    }
                    if (i29 != 0) {
                        hVar6 = null;
                    } else {
                        hVar6 = hVar2;
                    }
                    if (i31 == 0) {
                    }
                    if (i33 != 0) {
                        j20 = p013b0.n.f20493c;
                    } else {
                        j20 = j12;
                    }
                    if (i36 != 0) {
                        i46 = 1;
                    } else {
                        i46 = i10;
                    }
                    if (i39 == 0) {
                    }
                    if (i41 != 0) {
                        i47 = BrazeLogger.SUPPRESS;
                    } else {
                        i47 = i11;
                    }
                    if (i43 != 0) {
                        lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                                return p293xa.r.f47939a;
                            }
                        };
                    } else {
                        lVar6 = lVar2;
                    }
                    if ((i14 & 32768) != 0) {
                        j21 = j20;
                        i48 = i47;
                        i49 = i38 & (-458753);
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                        hVar4 = hVar6;
                        lVar8 = lVar5;
                    } else {
                        f12 = f10;
                        j21 = j20;
                        hVar4 = hVar6;
                        i48 = i47;
                        i49 = i38;
                        i50 = i46;
                        gVar4 = gVar3;
                        lVar7 = lVar6;
                        lVar8 = lVar5;
                        z14 = z13;
                        dVar4 = dVar3;
                        j22 = j17;
                        j23 = j19;
                        j24 = j18;
                    }
                }
                c1086gP.U();
                int i51111111112 = i15 & 2147483646;
                int i51111111113 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
                int i51111111114 = i49 << 3;
                b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i51111111112, i51111111113 | (458752 & i51111111114) | (i51111111114 & 3670016), 0);
                gVar2 = gVar4;
                j16 = j21;
                i44 = i50;
                z12 = z14;
                i45 = i48;
                lVar4 = lVar7;
                f11 = f12;
                androidx.compose.ui.text.font.d dVar1115 = dVar4;
                lVar3 = lVar8;
                j13 = j22;
                hVar3 = hVar5;
                j14 = j24;
                jVar2 = jVar3;
                j15 = j23;
                dVar2 = dVar1115;
            } else {
                c1086gP.w();
                hVar3 = hVar;
                j13 = j;
                j14 = j10;
                jVar2 = jVar;
                lVar3 = lVar;
                dVar2 = dVar;
                j15 = j11;
                hVar4 = hVar2;
                gVar2 = gVar;
                j16 = j12;
                i44 = i10;
                z12 = z10;
                i45 = i11;
                lVar4 = lVar2;
                f11 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i38 |= 24576;
        i43 = i42;
        if ((i13 & 196608) != 0) {
            if ((i14 & 32768) == 0) {
                i23 = 131072;
            }
            i38 |= i23;
        }
        if ((i15 & 306783379) == 306783378) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (c1086gP.C(i15 & 1, z11)) {
            c1086gP.r0();
            if ((i12 & 1) != 0) {
                if (i51 != 0) {
                    hVar5 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar5 = hVar;
                }
                if (i16 != 0) {
                    j17 = androidx.compose.ui.graphics.H.f13504l;
                } else {
                    j17 = j;
                }
                if (i18 != 0) {
                    j18 = p013b0.n.f20493c;
                } else {
                    j18 = j10;
                }
                if (i20 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (i22 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar;
                }
                if (i25 != 0) {
                    dVar3 = null;
                } else {
                    dVar3 = dVar;
                }
                if (i27 != 0) {
                    j19 = p013b0.n.f20493c;
                } else {
                    j19 = j11;
                }
                if (i29 != 0) {
                    hVar6 = null;
                } else {
                    hVar6 = hVar2;
                }
                if (i31 == 0) {
                }
                if (i33 != 0) {
                    j20 = p013b0.n.f20493c;
                } else {
                    j20 = j12;
                }
                if (i36 != 0) {
                    i46 = 1;
                } else {
                    i46 = i10;
                }
                if (i39 == 0) {
                }
                if (i41 != 0) {
                    i47 = BrazeLogger.SUPPRESS;
                } else {
                    i47 = i11;
                }
                if (i43 != 0) {
                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                        @Override // Ia.l
                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                            return p293xa.r.f47939a;
                        }
                    };
                } else {
                    lVar6 = lVar2;
                }
                if ((i14 & 32768) != 0) {
                    j21 = j20;
                    i48 = i47;
                    i49 = i38 & (-458753);
                    i50 = i46;
                    gVar4 = gVar3;
                    lVar7 = lVar6;
                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                    z14 = z13;
                    dVar4 = dVar3;
                    j22 = j17;
                    j23 = j19;
                    j24 = j18;
                    hVar4 = hVar6;
                    lVar8 = lVar5;
                } else {
                    f12 = f10;
                    j21 = j20;
                    hVar4 = hVar6;
                    i48 = i47;
                    i49 = i38;
                    i50 = i46;
                    gVar4 = gVar3;
                    lVar7 = lVar6;
                    lVar8 = lVar5;
                    z14 = z13;
                    dVar4 = dVar3;
                    j22 = j17;
                    j23 = j19;
                    j24 = j18;
                }
            } else {
                if (i51 != 0) {
                    hVar5 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar5 = hVar;
                }
                if (i16 != 0) {
                    j17 = androidx.compose.ui.graphics.H.f13504l;
                } else {
                    j17 = j;
                }
                if (i18 != 0) {
                    j18 = p013b0.n.f20493c;
                } else {
                    j18 = j10;
                }
                if (i20 != 0) {
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (i22 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar;
                }
                if (i25 != 0) {
                    dVar3 = null;
                } else {
                    dVar3 = dVar;
                }
                if (i27 != 0) {
                    j19 = p013b0.n.f20493c;
                } else {
                    j19 = j11;
                }
                if (i29 != 0) {
                    hVar6 = null;
                } else {
                    hVar6 = hVar2;
                }
                if (i31 == 0) {
                }
                if (i33 != 0) {
                    j20 = p013b0.n.f20493c;
                } else {
                    j20 = j12;
                }
                if (i36 != 0) {
                    i46 = 1;
                } else {
                    i46 = i10;
                }
                if (i39 == 0) {
                }
                if (i41 != 0) {
                    i47 = BrazeLogger.SUPPRESS;
                } else {
                    i47 = i11;
                }
                if (i43 != 0) {
                    lVar6 = new Ia.l<androidx.compose.ui.text.B, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$3
                        @Override // Ia.l
                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.B b10) {
                            return p293xa.r.f47939a;
                        }
                    };
                } else {
                    lVar6 = lVar2;
                }
                if ((i14 & 32768) != 0) {
                    j21 = j20;
                    i48 = i47;
                    i49 = i38 & (-458753);
                    i50 = i46;
                    gVar4 = gVar3;
                    lVar7 = lVar6;
                    f12 = (androidx.compose.ui.text.F) c1086gP.x(f11859a);
                    z14 = z13;
                    dVar4 = dVar3;
                    j22 = j17;
                    j23 = j19;
                    j24 = j18;
                    hVar4 = hVar6;
                    lVar8 = lVar5;
                } else {
                    f12 = f10;
                    j21 = j20;
                    hVar4 = hVar6;
                    i48 = i47;
                    i49 = i38;
                    i50 = i46;
                    gVar4 = gVar3;
                    lVar7 = lVar6;
                    lVar8 = lVar5;
                    z14 = z13;
                    dVar4 = dVar3;
                    j22 = j17;
                    j23 = j19;
                    j24 = j18;
                }
            }
            c1086gP.U();
            int i51111111115 = i15 & 2147483646;
            int i51111111116 = (i49 & 14) | 24576 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i49 & 896) | (i49 & 7168);
            int i51111111117 = i49 << 3;
            b(str, hVar5, j22, j24, jVar3, lVar8, dVar4, j23, hVar4, gVar4, j21, i50, z14, i48, 1, lVar7, f12, c1086gP, i51111111115, i51111111116 | (458752 & i51111111117) | (i51111111117 & 3670016), 0);
            gVar2 = gVar4;
            j16 = j21;
            i44 = i50;
            z12 = z14;
            i45 = i48;
            lVar4 = lVar7;
            f11 = f12;
            androidx.compose.ui.text.font.d dVar1116 = dVar4;
            lVar3 = lVar8;
            j13 = j22;
            hVar3 = hVar5;
            j14 = j24;
            jVar2 = jVar3;
            j15 = j23;
            dVar2 = dVar1116;
        } else {
            c1086gP.w();
            hVar3 = hVar;
            j13 = j;
            j14 = j10;
            jVar2 = jVar;
            lVar3 = lVar;
            dVar2 = dVar;
            j15 = j11;
            hVar4 = hVar2;
            gVar2 = gVar;
            j16 = j12;
            i44 = i10;
            z12 = z10;
            i45 = i11;
            lVar4 = lVar2;
            f11 = f10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextKt.c(str, hVar3, j13, j14, jVar2, lVar3, dVar2, j15, hVar4, gVar2, j16, i44, z12, i45, lVar4, f11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
