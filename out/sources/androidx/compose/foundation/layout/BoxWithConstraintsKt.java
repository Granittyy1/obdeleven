package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.SubcomposeLayoutKt;

/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BoxWithConstraintsKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(androidx.compose.ui.h hVar, androidx.compose.ui.d dVar, boolean z10, final Ia.q<? super InterfaceC0950j, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        final androidx.compose.ui.h hVar2;
        final androidx.compose.ui.d dVar3;
        final boolean z13;
        C1105p0 c1105p0V;
        final androidx.compose.ui.layout.E eD;
        boolean zK;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(1781813501);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= c1086gP.K(dVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (c1086gP.k(qVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 1171) != 1170) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c1086gP.C(i12 & 1, z12)) {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        dVar3 = androidx.compose.ui.d.a.f13335a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    eD = BoxKt.d(dVar3, z11);
                    zK = c1086gP.K(eD) | ((i12 & 7168) == 2048);
                    objF = c1086gP.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        objF = new Ia.p<androidx.compose.ui.layout.e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final androidx.compose.ui.layout.F invoke(androidx.compose.ui.layout.e0 e0Var, p013b0.a aVar) {
                                androidx.compose.ui.layout.e0 e0Var2 = e0Var;
                                long j = aVar.f20475a;
                                final C0951k c0951k = new C0951k(e0Var2, j);
                                p293xa.r rVar = p293xa.r.f47939a;
                                final Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                return eD.g(e0Var2, e0Var2.R0(rVar, new ComposableLambdaImpl(true, -1945019079, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        int iIntValue = num.intValue();
                                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            qVar2.invoke(c0951k, interfaceC1084f3, 0);
                                        } else {
                                            interfaceC1084f3.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                })), j);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    SubcomposeLayoutKt.a(hVar2, (Ia.p) objF, c1086gP, i12 & 14, 0);
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    dVar3 = dVar2;
                }
                z13 = z11;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            BoxWithConstraintsKt.a(hVar2, dVar3, z13, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(qVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i12 & 1, z12)) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.a.f13335a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                eD = BoxKt.d(dVar3, z11);
                zK = c1086gP.K(eD) | ((i12 & 7168) == 2048);
                objF = c1086gP.f();
                if (zK) {
                    objF = new Ia.p<androidx.compose.ui.layout.e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final androidx.compose.ui.layout.F invoke(androidx.compose.ui.layout.e0 e0Var, p013b0.a aVar) {
                            androidx.compose.ui.layout.e0 e0Var2 = e0Var;
                            long j = aVar.f20475a;
                            final C0951k c0951k = new C0951k(e0Var2, j);
                            p293xa.r rVar = p293xa.r.f47939a;
                            final Ia.q<? super InterfaceC0950j, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            return eD.g(e0Var2, e0Var2.R0(rVar, new ComposableLambdaImpl(true, -1945019079, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar2.invoke(c0951k, interfaceC1084f3, 0);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            })), j);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.p<androidx.compose.ui.layout.e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final androidx.compose.ui.layout.F invoke(androidx.compose.ui.layout.e0 e0Var, p013b0.a aVar) {
                            androidx.compose.ui.layout.e0 e0Var2 = e0Var;
                            long j = aVar.f20475a;
                            final C0951k c0951k = new C0951k(e0Var2, j);
                            p293xa.r rVar = p293xa.r.f47939a;
                            final Ia.q<? super InterfaceC0950j, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            return eD.g(e0Var2, e0Var2.R0(rVar, new ComposableLambdaImpl(true, -1945019079, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar2.invoke(c0951k, interfaceC1084f3, 0);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            })), j);
                        }
                    };
                    c1086gP.E(objF);
                }
                SubcomposeLayoutKt.a(hVar2, (Ia.p) objF, c1086gP, i12 & 14, 0);
            } else {
                c1086gP.w();
                hVar2 = hVar;
                dVar3 = dVar2;
            }
            z13 = z11;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        BoxWithConstraintsKt.a(hVar2, dVar3, z13, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        dVar2 = dVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(qVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i12 & 1, z12)) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.a.f13335a;
                } else {
                    dVar3 = dVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                eD = BoxKt.d(dVar3, z11);
                zK = c1086gP.K(eD) | ((i12 & 7168) == 2048);
                objF = c1086gP.f();
                if (zK) {
                    objF = new Ia.p<androidx.compose.ui.layout.e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final androidx.compose.ui.layout.F invoke(androidx.compose.ui.layout.e0 e0Var, p013b0.a aVar) {
                            androidx.compose.ui.layout.e0 e0Var2 = e0Var;
                            long j = aVar.f20475a;
                            final C0951k c0951k = new C0951k(e0Var2, j);
                            p293xa.r rVar = p293xa.r.f47939a;
                            final Ia.q<? super InterfaceC0950j, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            return eD.g(e0Var2, e0Var2.R0(rVar, new ComposableLambdaImpl(true, -1945019079, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar2.invoke(c0951k, interfaceC1084f3, 0);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            })), j);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.p<androidx.compose.ui.layout.e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final androidx.compose.ui.layout.F invoke(androidx.compose.ui.layout.e0 e0Var, p013b0.a aVar) {
                            androidx.compose.ui.layout.e0 e0Var2 = e0Var;
                            long j = aVar.f20475a;
                            final C0951k c0951k = new C0951k(e0Var2, j);
                            p293xa.r rVar = p293xa.r.f47939a;
                            final Ia.q<? super InterfaceC0950j, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            return eD.g(e0Var2, e0Var2.R0(rVar, new ComposableLambdaImpl(true, -1945019079, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar2.invoke(c0951k, interfaceC1084f3, 0);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            })), j);
                        }
                    };
                    c1086gP.E(objF);
                }
                SubcomposeLayoutKt.a(hVar2, (Ia.p) objF, c1086gP, i12 & 14, 0);
            } else {
                c1086gP.w();
                hVar2 = hVar;
                dVar3 = dVar2;
            }
            z13 = z11;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        BoxWithConstraintsKt.a(hVar2, dVar3, z13, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c1086gP.k(qVar)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 1171) != 1170) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c1086gP.C(i12 & 1, z12)) {
            if (i16 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i17 != 0) {
                dVar3 = androidx.compose.ui.d.a.f13335a;
            } else {
                dVar3 = dVar2;
            }
            if (i13 != 0) {
                z11 = false;
            }
            eD = BoxKt.d(dVar3, z11);
            zK = c1086gP.K(eD) | ((i12 & 7168) == 2048);
            objF = c1086gP.f();
            if (zK) {
                objF = new Ia.p<androidx.compose.ui.layout.e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final androidx.compose.ui.layout.F invoke(androidx.compose.ui.layout.e0 e0Var, p013b0.a aVar) {
                        androidx.compose.ui.layout.e0 e0Var2 = e0Var;
                        long j = aVar.f20475a;
                        final C0951k c0951k = new C0951k(e0Var2, j);
                        p293xa.r rVar = p293xa.r.f47939a;
                        final Ia.q<? super InterfaceC0950j, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                        return eD.g(e0Var2, e0Var2.R0(rVar, new ComposableLambdaImpl(true, -1945019079, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar2.invoke(c0951k, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        })), j);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.p<androidx.compose.ui.layout.e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final androidx.compose.ui.layout.F invoke(androidx.compose.ui.layout.e0 e0Var, p013b0.a aVar) {
                        androidx.compose.ui.layout.e0 e0Var2 = e0Var;
                        long j = aVar.f20475a;
                        final C0951k c0951k = new C0951k(e0Var2, j);
                        p293xa.r rVar = p293xa.r.f47939a;
                        final Ia.q<? super InterfaceC0950j, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                        return eD.g(e0Var2, e0Var2.R0(rVar, new ComposableLambdaImpl(true, -1945019079, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar2.invoke(c0951k, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        })), j);
                    }
                };
                c1086gP.E(objF);
            }
            SubcomposeLayoutKt.a(hVar2, (Ia.p) objF, c1086gP, i12 & 14, 0);
        } else {
            c1086gP.w();
            hVar2 = hVar;
            dVar3 = dVar2;
        }
        z13 = z11;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    BoxWithConstraintsKt.a(hVar2, dVar3, z13, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
