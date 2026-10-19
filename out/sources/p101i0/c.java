package p101i0;

import Z3.n;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ChainRun.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends WidgetRun {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<WidgetRun> f36473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36474l;

    public c(ConstraintWidget constraintWidget, int i10) {
        ConstraintWidget constraintWidget2;
        super(constraintWidget);
        this.f36473k = new ArrayList<>();
        this.f16046f = i10;
        ConstraintWidget constraintWidget3 = this.f16042b;
        ConstraintWidget constraintWidgetQ = constraintWidget3.q(i10);
        while (true) {
            ConstraintWidget constraintWidget4 = constraintWidgetQ;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                constraintWidgetQ = constraintWidget3.q(this.f16046f);
            }
        }
        this.f16042b = constraintWidget2;
        int i11 = this.f16046f;
        WidgetRun widgetRun = i11 == 0 ? constraintWidget2.f15974d : i11 == 1 ? constraintWidget2.f15976e : null;
        ArrayList<WidgetRun> arrayList = this.f36473k;
        arrayList.add(widgetRun);
        ConstraintWidget constraintWidgetP = constraintWidget2.p(this.f16046f);
        while (constraintWidgetP != null) {
            int i12 = this.f16046f;
            arrayList.add(i12 == 0 ? constraintWidgetP.f15974d : i12 == 1 ? constraintWidgetP.f15976e : null);
            constraintWidgetP = constraintWidgetP.p(this.f16046f);
        }
        for (WidgetRun widgetRun2 : arrayList) {
            int i13 = this.f16046f;
            if (i13 == 0) {
                widgetRun2.f16042b.f15970b = this;
            } else if (i13 == 1) {
                widgetRun2.f16042b.f15972c = this;
            }
        }
        if (this.f16046f == 0 && ((d) this.f16042b.f15963V).f16092z0 && arrayList.size() > 1) {
            this.f16042b = ((WidgetRun) n.f(1, arrayList)).f16042b;
        }
        this.f36474l = this.f16046f == 0 ? this.f16042b.f15990l0 : this.f16042b.f15992m0;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0235  */
    /* JADX WARN: Code duplicated, block: B:147:0x0244 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0246  */
    /* JADX WARN: Code duplicated, block: B:149:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x024c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0250  */
    /* JADX WARN: Code duplicated, block: B:153:0x0253  */
    /* JADX WARN: Code duplicated, block: B:156:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x025b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0260  */
    /* JADX WARN: Code duplicated, block: B:161:0x0273  */
    /* JADX WARN: Code duplicated, block: B:162:0x027e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0282  */
    /* JADX WARN: Code duplicated, block: B:165:0x0284  */
    /* JADX WARN: Code duplicated, block: B:169:0x028b  */
    /* JADX WARN: Code duplicated, block: B:170:0x028f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0294  */
    /* JADX WARN: Code duplicated, block: B:173:0x0298  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:178:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:179:0x02af  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:184:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:186:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:194:0x02da  */
    /* JADX WARN: Code duplicated, block: B:196:0x02de  */
    /* JADX WARN: Code duplicated, block: B:198:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:201:0x02ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:203:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:206:0x0304  */
    /* JADX WARN: Code duplicated, block: B:207:0x030b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x030d  */
    /* JADX WARN: Code duplicated, block: B:209:0x030f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0316  */
    /* JADX WARN: Code duplicated, block: B:214:0x031a  */
    /* JADX WARN: Code duplicated, block: B:216:0x031f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0323  */
    /* JADX WARN: Code duplicated, block: B:224:0x033b  */
    /* JADX WARN: Code duplicated, block: B:225:0x033d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0340  */
    /* JADX WARN: Code duplicated, block: B:228:0x0344  */
    /* JADX WARN: Code duplicated, block: B:235:0x0359  */
    /* JADX WARN: Code duplicated, block: B:237:0x035c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0360  */
    /* JADX WARN: Code duplicated, block: B:240:0x0365  */
    /* JADX WARN: Code duplicated, block: B:242:0x036b  */
    /* JADX WARN: Code duplicated, block: B:246:0x037a  */
    /* JADX WARN: Code duplicated, block: B:248:0x037d  */
    /* JADX WARN: Code duplicated, block: B:249:0x0380  */
    /* JADX WARN: Code duplicated, block: B:252:0x0385 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0387  */
    /* JADX WARN: Code duplicated, block: B:254:0x038c  */
    /* JADX WARN: Code duplicated, block: B:257:0x039f  */
    /* JADX WARN: Code duplicated, block: B:258:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:261:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:262:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:264:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:265:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:273:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:274:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:276:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:277:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:297:0x00ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0166  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, p101i0.d
    public final void a(d dVar) {
        int i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ArrayList<WidgetRun> arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        boolean z10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ArrayList<WidgetRun> arrayList2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        float f11;
        int i22;
        int i23;
        int i24;
        int i25;
        WidgetRun widgetRun;
        int i26;
        DependencyNode dependencyNode;
        DependencyNode dependencyNode2;
        a aVar;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        WidgetRun widgetRun2;
        int i32;
        DependencyNode dependencyNode3;
        DependencyNode dependencyNode4;
        int i33;
        a aVar2;
        int iMin;
        int i34;
        int i35;
        int i36;
        int i37;
        WidgetRun widgetRun3;
        int i38;
        DependencyNode dependencyNode5;
        DependencyNode dependencyNode6;
        a aVar3;
        int i39;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        float f12;
        DependencyNode dependencyNode7 = this.f16048h;
        if (dependencyNode7.j) {
            DependencyNode dependencyNode8 = this.f16049i;
            if (dependencyNode8.j) {
                ConstraintWidget constraintWidget = this.f16042b.f15963V;
                boolean z11 = constraintWidget instanceof d ? ((d) constraintWidget).f16092z0 : false;
                int i46 = dependencyNode8.f16028g - dependencyNode7.f16028g;
                ArrayList<WidgetRun> arrayList3 = this.f36473k;
                int size = arrayList3.size();
                int i47 = 0;
                while (true) {
                    i10 = -1;
                    if (i47 >= size) {
                        i47 = -1;
                        break;
                    } else if (arrayList3.get(i47).f16042b.f15985i0 != 8) {
                        break;
                    } else {
                        i47++;
                    }
                }
                int i48 = size - 1;
                for (int i49 = i48; i49 >= 0; i49--) {
                    if (arrayList3.get(i49).f16042b.f15985i0 != 8) {
                        i10 = i49;
                        break;
                    }
                }
                int i50 = 0;
                while (true) {
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
                    if (i50 >= 2) {
                        arrayList = arrayList3;
                        i11 = size;
                        i12 = i47;
                        i13 = 0;
                        i14 = 0;
                        i15 = 0;
                        f10 = 0.0f;
                        break;
                    }
                    int i51 = 0;
                    i15 = 0;
                    int i52 = 0;
                    int i53 = 0;
                    f10 = 0.0f;
                    while (i51 < size) {
                        WidgetRun widgetRun4 = arrayList3.get(i51);
                        ConstraintWidget constraintWidget2 = widgetRun4.f16042b;
                        ArrayList<WidgetRun> arrayList4 = arrayList3;
                        int i54 = size;
                        if (constraintWidget2.f15985i0 == 8) {
                            i44 = i47;
                        } else {
                            i53++;
                            if (i51 > 0 && i51 >= i47) {
                                i15 += widgetRun4.f16048h.f16027f;
                            }
                            a aVar4 = widgetRun4.f16045e;
                            int i55 = aVar4.f16028g;
                            boolean z12 = widgetRun4.f16044d != dimensionBehaviour;
                            if (z12) {
                                int i56 = this.f16046f;
                                if (i56 == 0 && !constraintWidget2.f15974d.f16045e.j) {
                                    return;
                                }
                                if (i56 == 1 && !constraintWidget2.f15976e.f16045e.j) {
                                    return;
                                } else {
                                    i44 = i47;
                                }
                            } else {
                                i44 = i47;
                                if (widgetRun4.f16041a == 1 && i50 == 0) {
                                    i45 = aVar4.f16053m;
                                    i52++;
                                } else {
                                    if (aVar4.j) {
                                        i45 = i55;
                                    }
                                    if (z12) {
                                        i15 += i45;
                                    } else {
                                        i52++;
                                        f12 = constraintWidget2.f15994n0[this.f16046f];
                                        if (f12 >= 0.0f) {
                                            f10 += f12;
                                        }
                                    }
                                    if (i51 >= i48 && i51 < i10) {
                                        i15 += -widgetRun4.f16049i.f16027f;
                                    }
                                }
                                z12 = true;
                                if (z12) {
                                    i52++;
                                    f12 = constraintWidget2.f15994n0[this.f16046f];
                                    if (f12 >= 0.0f) {
                                        f10 += f12;
                                    }
                                } else {
                                    i15 += i45;
                                }
                                if (i51 >= i48) {
                                }
                            }
                            i45 = i55;
                            if (z12) {
                                i52++;
                                f12 = constraintWidget2.f15994n0[this.f16046f];
                                if (f12 >= 0.0f) {
                                    f10 += f12;
                                }
                            } else {
                                i15 += i45;
                            }
                            if (i51 >= i48) {
                            }
                        }
                        i51++;
                        arrayList3 = arrayList4;
                        size = i54;
                        i47 = i44;
                    }
                    arrayList = arrayList3;
                    i11 = size;
                    i12 = i47;
                    if (i15 < i46 || i52 == 0) {
                        i13 = i52;
                        i14 = i53;
                        break;
                    } else {
                        i50++;
                        arrayList3 = arrayList;
                        size = i11;
                        i47 = i12;
                    }
                }
                int i57 = dependencyNode7.f16028g;
                if (z11) {
                    i57 = dependencyNode8.f16028g;
                }
                if (i15 > i46) {
                    i57 = z11 ? i57 + ((int) (((i15 - i46) / 2.0f) + 0.5f)) : i57 - ((int) (((i15 - i46) / 2.0f) + 0.5f));
                }
                if (i13 > 0) {
                    float f13 = i46 - i15;
                    int i58 = (int) ((f13 / i13) + 0.5f);
                    i16 = i11;
                    int i59 = 0;
                    int i60 = 0;
                    while (i59 < i16) {
                        ArrayList<WidgetRun> arrayList5 = arrayList;
                        int i61 = i58;
                        WidgetRun widgetRun5 = arrayList5.get(i59);
                        int i62 = i15;
                        ConstraintWidget constraintWidget3 = widgetRun5.f16042b;
                        int i63 = i57;
                        boolean z13 = z11;
                        if (constraintWidget3.f15985i0 != 8 && widgetRun5.f16044d == dimensionBehaviour) {
                            a aVar5 = widgetRun5.f16045e;
                            if (aVar5.j) {
                                dimensionBehaviour = dimensionBehaviour;
                            } else {
                                int i64 = f10 > 0.0f ? (int) (((constraintWidget3.f15994n0[this.f16046f] * f13) / f10) + 0.5f) : i61;
                                if (this.f16046f == 0) {
                                    i42 = constraintWidget3.f16008v;
                                    i43 = constraintWidget3.f16007u;
                                } else {
                                    i42 = constraintWidget3.f16011y;
                                    i43 = constraintWidget3.f16010x;
                                }
                                int iMax = Math.max(i43, widgetRun5.f16041a == 1 ? Math.min(i64, aVar5.f16053m) : i64);
                                if (i42 > 0) {
                                    iMax = Math.min(i42, iMax);
                                }
                                if (iMax != i64) {
                                    i60++;
                                    i64 = iMax;
                                }
                                aVar5.d(i64);
                            }
                        } else {
                            dimensionBehaviour = dimensionBehaviour;
                        }
                        i59++;
                        i15 = i62;
                        i58 = i61;
                        i57 = i63;
                        z11 = z13;
                        dimensionBehaviour = dimensionBehaviour;
                        f13 = f13;
                        arrayList = arrayList5;
                    }
                    i19 = i57;
                    z10 = z11;
                    dimensionBehaviour2 = dimensionBehaviour;
                    int i65 = i15;
                    arrayList2 = arrayList;
                    if (i60 > 0) {
                        i13 -= i60;
                        int i66 = 0;
                        i15 = 0;
                        while (i66 < i16) {
                            WidgetRun widgetRun6 = arrayList2.get(i66);
                            if (widgetRun6.f16042b.f15985i0 == 8) {
                                i41 = i12;
                            } else {
                                i41 = i12;
                                if (i66 > 0 && i66 >= i41) {
                                    i15 += widgetRun6.f16048h.f16027f;
                                }
                                i15 += widgetRun6.f16045e.f16028g;
                                if (i66 < i48 && i66 < i10) {
                                    i15 += -widgetRun6.f16049i.f16027f;
                                }
                            }
                            i66++;
                            i12 = i41;
                        }
                        i17 = i12;
                    } else {
                        i17 = i12;
                        i15 = i65;
                    }
                    i18 = 2;
                    if (this.f36474l == 2 && i60 == 0) {
                        i20 = 0;
                        this.f36474l = 0;
                    }
                    if (i15 > i46) {
                        this.f36474l = i18;
                    }
                    if (i14 > 0 && i13 == 0 && i17 == i10) {
                        this.f36474l = i18;
                    }
                    i21 = this.f36474l;
                    if (i21 == 1) {
                        if (i14 > 1) {
                            i34 = (i46 - i15) / (i14 - 1);
                        } else if (i14 == 1) {
                            i34 = (i46 - i15) / 2;
                        } else {
                            i34 = i20;
                        }
                        if (i13 > 0) {
                            i34 = i20;
                        }
                        i35 = i20;
                        i36 = i19;
                        while (i35 < i16) {
                            if (z10) {
                                i37 = i16 - (i35 + 1);
                            } else {
                                i37 = i35;
                            }
                            widgetRun3 = arrayList2.get(i37);
                            i38 = widgetRun3.f16042b.f15985i0;
                            dependencyNode5 = widgetRun3.f16049i;
                            dependencyNode6 = widgetRun3.f16048h;
                            if (i38 == 8) {
                                dependencyNode6.d(i36);
                                dependencyNode5.d(i36);
                                i40 = i34;
                                dimensionBehaviour4 = dimensionBehaviour2;
                            } else {
                                if (i35 > 0) {
                                    if (z10) {
                                        i36 -= i34;
                                    } else {
                                        i36 += i34;
                                    }
                                }
                                if (i35 > 0 && i35 >= i17) {
                                    if (z10) {
                                        i36 -= dependencyNode6.f16027f;
                                    } else {
                                        i36 += dependencyNode6.f16027f;
                                    }
                                }
                                if (z10) {
                                    dependencyNode5.d(i36);
                                } else {
                                    dependencyNode6.d(i36);
                                }
                                aVar3 = widgetRun3.f16045e;
                                i39 = aVar3.f16028g;
                                dimensionBehaviour4 = dimensionBehaviour2;
                                if (widgetRun3.f16044d == dimensionBehaviour4) {
                                    i40 = i34;
                                    if (widgetRun3.f16041a == 1) {
                                        i39 = aVar3.f16053m;
                                    }
                                } else {
                                    i40 = i34;
                                }
                                if (z10) {
                                    i36 -= i39;
                                } else {
                                    i36 += i39;
                                }
                                if (z10) {
                                    dependencyNode6.d(i36);
                                } else {
                                    dependencyNode5.d(i36);
                                }
                                widgetRun3.f16047g = true;
                                if (i35 >= i48 && i35 < i10) {
                                    i36 = z10 ? i36 - (-dependencyNode5.f16027f) : i36 + (-dependencyNode5.f16027f);
                                }
                            }
                            i35++;
                            i34 = i40;
                            dimensionBehaviour2 = dimensionBehaviour4;
                        }
                        return;
                    }
                    dimensionBehaviour3 = dimensionBehaviour2;
                    if (i21 == 0) {
                        i28 = (i46 - i15) / (i14 + 1);
                        if (i13 > 0) {
                            i28 = i20;
                        }
                        i30 = i19;
                        for (i29 = i20; i29 < i16; i29++) {
                            if (z10) {
                                i31 = i16 - (i29 + 1);
                            } else {
                                i31 = i29;
                            }
                            widgetRun2 = arrayList2.get(i31);
                            i32 = widgetRun2.f16042b.f15985i0;
                            dependencyNode3 = widgetRun2.f16049i;
                            dependencyNode4 = widgetRun2.f16048h;
                            if (i32 == 8) {
                                dependencyNode4.d(i30);
                                dependencyNode3.d(i30);
                            } else {
                                if (z10) {
                                    i33 = i30 - i28;
                                } else {
                                    i33 = i30 + i28;
                                }
                                if (i29 > 0 && i29 >= i17) {
                                    if (z10) {
                                        i33 -= dependencyNode4.f16027f;
                                    } else {
                                        i33 += dependencyNode4.f16027f;
                                    }
                                }
                                if (z10) {
                                    dependencyNode3.d(i33);
                                } else {
                                    dependencyNode4.d(i33);
                                }
                                aVar2 = widgetRun2.f16045e;
                                iMin = aVar2.f16028g;
                                if (widgetRun2.f16044d == dimensionBehaviour3 && widgetRun2.f16041a == 1) {
                                    iMin = Math.min(iMin, aVar2.f16053m);
                                }
                                if (z10) {
                                    i30 = i33 - iMin;
                                } else {
                                    i30 = i33 + iMin;
                                }
                                if (z10) {
                                    dependencyNode4.d(i30);
                                } else {
                                    dependencyNode3.d(i30);
                                }
                                if (i29 >= i48 && i29 < i10) {
                                    i30 = z10 ? i30 - (-dependencyNode3.f16027f) : i30 + (-dependencyNode3.f16027f);
                                }
                            }
                        }
                        return;
                    }
                    if (i21 == 2) {
                        if (this.f16046f == 0) {
                            f11 = this.f16042b.f15979f0;
                        } else {
                            f11 = this.f16042b.f15981g0;
                        }
                        if (z10) {
                            f11 = 1.0f - f11;
                        }
                        i22 = (int) (((i46 - i15) * f11) + 0.5f);
                        if (i22 >= 0 || i13 > 0) {
                            i22 = i20;
                        }
                        if (z10) {
                            i23 = i19 - i22;
                        } else {
                            i23 = i19 + i22;
                        }
                        for (i24 = i20; i24 < i16; i24++) {
                            if (z10) {
                                i25 = i16 - (i24 + 1);
                            } else {
                                i25 = i24;
                            }
                            widgetRun = arrayList2.get(i25);
                            i26 = widgetRun.f16042b.f15985i0;
                            dependencyNode = widgetRun.f16049i;
                            dependencyNode2 = widgetRun.f16048h;
                            if (i26 == 8) {
                                dependencyNode2.d(i23);
                                dependencyNode.d(i23);
                            } else {
                                if (i24 > 0 && i24 >= i17) {
                                    if (z10) {
                                        i23 -= dependencyNode2.f16027f;
                                    } else {
                                        i23 += dependencyNode2.f16027f;
                                    }
                                }
                                if (z10) {
                                    dependencyNode.d(i23);
                                } else {
                                    dependencyNode2.d(i23);
                                }
                                aVar = widgetRun.f16045e;
                                i27 = aVar.f16028g;
                                if (widgetRun.f16044d == dimensionBehaviour3 && widgetRun.f16041a == 1) {
                                    i27 = aVar.f16053m;
                                }
                                if (z10) {
                                    i23 -= i27;
                                } else {
                                    i23 += i27;
                                }
                                if (z10) {
                                    dependencyNode2.d(i23);
                                } else {
                                    dependencyNode.d(i23);
                                }
                                if (i24 >= i48 && i24 < i10) {
                                    i23 = z10 ? i23 - (-dependencyNode.f16027f) : i23 + (-dependencyNode.f16027f);
                                }
                            }
                        }
                    }
                }
                z10 = z11;
                dimensionBehaviour2 = dimensionBehaviour;
                arrayList2 = arrayList;
                i16 = i11;
                i17 = i12;
                i18 = 2;
                i19 = i57;
                i20 = 0;
                if (i15 > i46) {
                    this.f36474l = i18;
                }
                if (i14 > 0) {
                    this.f36474l = i18;
                }
                i21 = this.f36474l;
                if (i21 == 1) {
                    if (i14 > 1) {
                        i34 = (i46 - i15) / (i14 - 1);
                    } else if (i14 == 1) {
                        i34 = (i46 - i15) / 2;
                    } else {
                        i34 = i20;
                    }
                    if (i13 > 0) {
                        i34 = i20;
                    }
                    i35 = i20;
                    i36 = i19;
                    while (i35 < i16) {
                        if (z10) {
                            i37 = i16 - (i35 + 1);
                        } else {
                            i37 = i35;
                        }
                        widgetRun3 = arrayList2.get(i37);
                        i38 = widgetRun3.f16042b.f15985i0;
                        dependencyNode5 = widgetRun3.f16049i;
                        dependencyNode6 = widgetRun3.f16048h;
                        if (i38 == 8) {
                            dependencyNode6.d(i36);
                            dependencyNode5.d(i36);
                            i40 = i34;
                            dimensionBehaviour4 = dimensionBehaviour2;
                        } else {
                            if (i35 > 0) {
                                if (z10) {
                                    i36 -= i34;
                                } else {
                                    i36 += i34;
                                }
                            }
                            if (i35 > 0) {
                                if (z10) {
                                    i36 -= dependencyNode6.f16027f;
                                } else {
                                    i36 += dependencyNode6.f16027f;
                                }
                            }
                            if (z10) {
                                dependencyNode5.d(i36);
                            } else {
                                dependencyNode6.d(i36);
                            }
                            aVar3 = widgetRun3.f16045e;
                            i39 = aVar3.f16028g;
                            dimensionBehaviour4 = dimensionBehaviour2;
                            if (widgetRun3.f16044d == dimensionBehaviour4) {
                                i40 = i34;
                                if (widgetRun3.f16041a == 1) {
                                    i39 = aVar3.f16053m;
                                }
                            } else {
                                i40 = i34;
                            }
                            if (z10) {
                                i36 -= i39;
                            } else {
                                i36 += i39;
                            }
                            if (z10) {
                                dependencyNode6.d(i36);
                            } else {
                                dependencyNode5.d(i36);
                            }
                            widgetRun3.f16047g = true;
                            if (i35 >= i48) {
                            }
                        }
                        i35++;
                        i34 = i40;
                        dimensionBehaviour2 = dimensionBehaviour4;
                    }
                    return;
                }
                dimensionBehaviour3 = dimensionBehaviour2;
                if (i21 == 0) {
                    i28 = (i46 - i15) / (i14 + 1);
                    if (i13 > 0) {
                        i28 = i20;
                    }
                    i30 = i19;
                    while (i29 < i16) {
                        if (z10) {
                            i31 = i16 - (i29 + 1);
                        } else {
                            i31 = i29;
                        }
                        widgetRun2 = arrayList2.get(i31);
                        i32 = widgetRun2.f16042b.f15985i0;
                        dependencyNode3 = widgetRun2.f16049i;
                        dependencyNode4 = widgetRun2.f16048h;
                        if (i32 == 8) {
                            dependencyNode4.d(i30);
                            dependencyNode3.d(i30);
                        } else {
                            if (z10) {
                                i33 = i30 - i28;
                            } else {
                                i33 = i30 + i28;
                            }
                            if (i29 > 0) {
                                if (z10) {
                                    i33 -= dependencyNode4.f16027f;
                                } else {
                                    i33 += dependencyNode4.f16027f;
                                }
                            }
                            if (z10) {
                                dependencyNode3.d(i33);
                            } else {
                                dependencyNode4.d(i33);
                            }
                            aVar2 = widgetRun2.f16045e;
                            iMin = aVar2.f16028g;
                            if (widgetRun2.f16044d == dimensionBehaviour3) {
                                iMin = Math.min(iMin, aVar2.f16053m);
                            }
                            if (z10) {
                                i30 = i33 - iMin;
                            } else {
                                i30 = i33 + iMin;
                            }
                            if (z10) {
                                dependencyNode4.d(i30);
                            } else {
                                dependencyNode3.d(i30);
                            }
                            if (i29 >= i48) {
                            }
                        }
                    }
                    return;
                }
                if (i21 == 2) {
                    if (this.f16046f == 0) {
                        f11 = this.f16042b.f15979f0;
                    } else {
                        f11 = this.f16042b.f15981g0;
                    }
                    if (z10) {
                        f11 = 1.0f - f11;
                    }
                    i22 = (int) (((i46 - i15) * f11) + 0.5f);
                    if (i22 >= 0) {
                        i22 = i20;
                    } else {
                        i22 = i20;
                    }
                    if (z10) {
                        i23 = i19 - i22;
                    } else {
                        i23 = i19 + i22;
                    }
                    while (i24 < i16) {
                        if (z10) {
                            i25 = i16 - (i24 + 1);
                        } else {
                            i25 = i24;
                        }
                        widgetRun = arrayList2.get(i25);
                        i26 = widgetRun.f16042b.f15985i0;
                        dependencyNode = widgetRun.f16049i;
                        dependencyNode2 = widgetRun.f16048h;
                        if (i26 == 8) {
                            dependencyNode2.d(i23);
                            dependencyNode.d(i23);
                        } else {
                            if (i24 > 0) {
                                if (z10) {
                                    i23 -= dependencyNode2.f16027f;
                                } else {
                                    i23 += dependencyNode2.f16027f;
                                }
                            }
                            if (z10) {
                                dependencyNode.d(i23);
                            } else {
                                dependencyNode2.d(i23);
                            }
                            aVar = widgetRun.f16045e;
                            i27 = aVar.f16028g;
                            if (widgetRun.f16044d == dimensionBehaviour3) {
                                i27 = aVar.f16053m;
                            }
                            if (z10) {
                                i23 -= i27;
                            } else {
                                i23 += i27;
                            }
                            if (z10) {
                                dependencyNode2.d(i23);
                            } else {
                                dependencyNode.d(i23);
                            }
                            if (i24 >= i48) {
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ArrayList<WidgetRun> arrayList = this.f36473k;
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = arrayList.get(0).f16042b;
        ConstraintWidget constraintWidget2 = arrayList.get(size - 1).f16042b;
        int i10 = this.f16046f;
        DependencyNode dependencyNode = this.f16049i;
        DependencyNode dependencyNode2 = this.f16048h;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f15951J;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f15953L;
            DependencyNode dependencyNodeI = WidgetRun.i(constraintAnchor, 0);
            int iE = constraintAnchor.e();
            ConstraintWidget constraintWidgetM = m();
            if (constraintWidgetM != null) {
                iE = constraintWidgetM.f15951J.e();
            }
            if (dependencyNodeI != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeI, iE);
            }
            DependencyNode dependencyNodeI2 = WidgetRun.i(constraintAnchor2, 0);
            int iE2 = constraintAnchor2.e();
            ConstraintWidget constraintWidgetN = n();
            if (constraintWidgetN != null) {
                iE2 = constraintWidgetN.f15953L.e();
            }
            if (dependencyNodeI2 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeI2, -iE2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f15952K;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f15954M;
            DependencyNode dependencyNodeI3 = WidgetRun.i(constraintAnchor3, 1);
            int iE3 = constraintAnchor3.e();
            ConstraintWidget constraintWidgetM2 = m();
            if (constraintWidgetM2 != null) {
                iE3 = constraintWidgetM2.f15952K.e();
            }
            if (dependencyNodeI3 != null) {
                WidgetRun.b(dependencyNode2, dependencyNodeI3, iE3);
            }
            DependencyNode dependencyNodeI4 = WidgetRun.i(constraintAnchor4, 1);
            int iE4 = constraintAnchor4.e();
            ConstraintWidget constraintWidgetN2 = n();
            if (constraintWidgetN2 != null) {
                iE4 = constraintWidgetN2.f15954M.e();
            }
            if (dependencyNodeI4 != null) {
                WidgetRun.b(dependencyNode, dependencyNodeI4, -iE4);
            }
        }
        dependencyNode2.f16022a = this;
        dependencyNode.f16022a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f36473k;
            if (i10 >= arrayList.size()) {
                return;
            }
            arrayList.get(i10).e();
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.f16043c = null;
        Iterator<WidgetRun> it = this.f36473k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final long j() {
        ArrayList<WidgetRun> arrayList = this.f36473k;
        int size = arrayList.size();
        long j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            WidgetRun widgetRun = arrayList.get(i10);
            j = ((long) widgetRun.f16049i.f16027f) + widgetRun.j() + j + ((long) widgetRun.f16048h.f16027f);
        }
        return j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        ArrayList<WidgetRun> arrayList = this.f36473k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!arrayList.get(i10).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f36473k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = arrayList.get(i10).f16042b;
            if (constraintWidget.f15985i0 != 8) {
                return constraintWidget;
            }
            i10++;
        }
    }

    public final ConstraintWidget n() {
        ArrayList<WidgetRun> arrayList = this.f36473k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = arrayList.get(size).f16042b;
            if (constraintWidget.f15985i0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f16046f == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.f36473k) {
            sb2.append("<");
            sb2.append(widgetRun);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
