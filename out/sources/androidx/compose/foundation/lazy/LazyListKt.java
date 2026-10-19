package androidx.compose.foundation.lazy;

import androidx.compose.foundation.E;
import androidx.compose.foundation.K;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.B;
import androidx.compose.foundation.lazy.layout.C0974i;
import androidx.compose.foundation.lazy.layout.C0977l;
import androidx.compose.foundation.lazy.layout.D;
import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.M;
import androidx.compose.foundation.lazy.layout.N;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.C1108r0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import androidx.compose.ui.graphics.S;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Code duplicated, block: B:101:0x011d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x012f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0134  */
    /* JADX WARN: Code duplicated, block: B:111:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:116:0x0148  */
    /* JADX WARN: Code duplicated, block: B:119:0x014e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0153  */
    /* JADX WARN: Code duplicated, block: B:123:0x0159  */
    /* JADX WARN: Code duplicated, block: B:125:0x015f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0168  */
    /* JADX WARN: Code duplicated, block: B:131:0x016d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0171  */
    /* JADX WARN: Code duplicated, block: B:135:0x0179  */
    /* JADX WARN: Code duplicated, block: B:139:0x0181  */
    /* JADX WARN: Code duplicated, block: B:140:0x0184  */
    /* JADX WARN: Code duplicated, block: B:142:0x0188  */
    /* JADX WARN: Code duplicated, block: B:144:0x018e  */
    /* JADX WARN: Code duplicated, block: B:148:0x019e  */
    /* JADX WARN: Code duplicated, block: B:152:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:157:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:160:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:162:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:163:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:165:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:166:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:168:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:169:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:172:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:174:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:180:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:184:0x024a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0250  */
    /* JADX WARN: Code duplicated, block: B:192:0x0262  */
    /* JADX WARN: Code duplicated, block: B:194:0x0268  */
    /* JADX WARN: Code duplicated, block: B:200:0x0277 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x0279  */
    /* JADX WARN: Code duplicated, block: B:204:0x028a  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:208:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:213:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:219:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:221:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:227:0x030e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0314  */
    /* JADX WARN: Code duplicated, block: B:235:0x0327  */
    /* JADX WARN: Code duplicated, block: B:237:0x032d  */
    /* JADX WARN: Code duplicated, block: B:243:0x033f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0345  */
    /* JADX WARN: Code duplicated, block: B:251:0x0357  */
    /* JADX WARN: Code duplicated, block: B:253:0x035d  */
    /* JADX WARN: Code duplicated, block: B:259:0x036f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0375  */
    /* JADX WARN: Code duplicated, block: B:267:0x0387  */
    /* JADX WARN: Code duplicated, block: B:269:0x038d  */
    /* JADX WARN: Code duplicated, block: B:275:0x03a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:281:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:283:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:285:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:287:0x040e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0414  */
    /* JADX WARN: Code duplicated, block: B:295:0x0424  */
    /* JADX WARN: Code duplicated, block: B:297:0x042a  */
    /* JADX WARN: Code duplicated, block: B:303:0x0439  */
    /* JADX WARN: Code duplicated, block: B:305:0x043d  */
    /* JADX WARN: Code duplicated, block: B:308:0x0455  */
    /* JADX WARN: Code duplicated, block: B:310:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:313:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    public static final void a(final androidx.compose.ui.h hVar, final LazyListState lazyListState, final L l10, final boolean z10, final boolean z11, final androidx.compose.foundation.gestures.j jVar, final boolean z12, final E e10, int i10, androidx.compose.ui.d.b bVar, C0945e.l lVar, androidx.compose.ui.d.c cVar, C0945e.InterfaceC0129e interfaceC0129e, final Ia.l<? super p, p293xa.r> lVar2, InterfaceC1084f interfaceC1084f, final int i11, final int i12, final int i13) {
        int i14;
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
        boolean z13;
        boolean z14;
        C1086g c1086g;
        final int i28;
        final androidx.compose.ui.d.b bVar2;
        final C0945e.l lVar3;
        final androidx.compose.ui.d.c cVar2;
        C0945e.InterfaceC0129e interfaceC0129e2;
        C1105p0 c1105p0V;
        int i29;
        androidx.compose.ui.d.b bVar3;
        C0945e.l lVar4;
        androidx.compose.ui.d.c cVar3;
        int i30;
        final X xI;
        boolean z15;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        final Oa.i iVar;
        final int i31;
        boolean z16;
        Object objF2;
        Object objF3;
        final A a10;
        final S s10;
        androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a;
        boolean zK;
        Object objF4;
        final androidx.compose.ui.d.b bVar4;
        C0945e.l lVar5;
        InterfaceC1084f.a.C0153a c0153a2;
        int i32;
        Orientation orientation;
        Orientation orientation2;
        LazyListState lazyListState2;
        androidx.compose.ui.h hVarA;
        int i33;
        boolean z17;
        Object objF5;
        C1086g c1086gP = interfaceC1084f.p(924924659);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= c1086gP.K(lazyListState) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            i14 |= c1086gP.K(l10) ? 256 : 128;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i14 |= c1086gP.c(z10) ? 2048 : 1024;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i14 |= c1086gP.c(z11) ? 16384 : 8192;
        }
        if ((i13 & 32) == 0) {
            if ((i11 & 196608) == 0) {
                i14 |= c1086gP.K(jVar) ? 131072 : 65536;
            }
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.c(z12)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i14 |= i15;
            }
            if ((i13 & 128) != 0) {
                if ((i11 & 12582912) == 0) {
                    if (c1086gP.K(e10)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 256;
                if (i17 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.h(i10)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 512;
                if (i19 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.K(bVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i14 |= i20;
                }
                i21 = i14;
                i22 = i13 & 1024;
                if (i22 != 0) {
                    i23 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c1086gP.K(lVar)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i12 | i24;
                } else {
                    i23 = i12;
                }
                i25 = i13 & 2048;
                if (i25 != 0) {
                    i23 |= 48;
                } else if ((i12 & 48) == 0) {
                    i23 |= c1086gP.K(cVar) ? 32 : 16;
                }
                i26 = i23;
                i27 = i13 & 4096;
                if (i27 != 0) {
                    if ((i12 & 384) == 0) {
                        i26 |= c1086gP.K(interfaceC0129e) ? 256 : 128;
                    }
                    if ((i13 & 8192) != 0) {
                        i26 |= 3072;
                    } else if ((i12 & 3072) == 0) {
                        i26 |= c1086gP.k(lVar2) ? 2048 : 1024;
                    }
                    z13 = true;
                    if ((i21 & 306783379) == 306783378 || (i26 & 1171) != 1170) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c1086gP.C(i21 & 1, z14)) {
                        if (i17 != 0) {
                            i29 = 0;
                        } else {
                            i29 = i10;
                        }
                        if (i19 != 0) {
                            bVar3 = null;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i22 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i25 != 0) {
                            cVar3 = null;
                        } else {
                            cVar3 = cVar;
                        }
                        if (i27 != 0) {
                            interfaceC0129e2 = null;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        i30 = (i21 >> 3) & 14;
                        int i34 = i30 | ((i26 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        xI = J0.i(lVar2, c1086gP);
                        z15 = (((i34 & 14) ^ 6) <= 4 && c1086gP.K(lazyListState)) || (i34 & 6) == 4;
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (z15 || objF == c0153a) {
                            final c cVar4 = new c();
                            cVar4.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                            cVar4.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                            C1108r0 c1108r0 = C1108r0.f13116a;
                            final DerivedSnapshotState derivedSnapshotStateE = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final LazyListIntervalContent invoke() {
                                    return new LazyListIntervalContent(xI.getValue());
                                }
                            }, c1108r0);
                            objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final i invoke() {
                                    LazyListIntervalContent value = derivedSnapshotStateE.getValue();
                                    return new i(lazyListState, value, cVar4, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                                }
                            }, c1108r0), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                            c1086gP.E(objF);
                        }
                        iVar = (Oa.i) objF;
                        int i35 = i21 >> 9;
                        int i36 = i30 | (i35 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        i31 = i29;
                        z16 = ((((i36 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.c(z11)) || (i36 & 48) == 32) | ((((i36 & 14) ^ 6) <= 4 && c1086gP.K(lazyListState)) || (i36 & 6) == 4);
                        objF2 = c1086gP.f();
                        if (z16 || objF2 == c0153a) {
                            objF2 = new d(lazyListState, z11);
                            c1086gP.E(objF2);
                        }
                        M m7 = (M) objF2;
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF3);
                        }
                        a10 = (A) objF3;
                        s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                        if (((Boolean) c1086gP.x(CompositionLocalsKt.f14860v)).booleanValue()) {
                            c0130a = null;
                        } else {
                            c0130a = androidx.compose.foundation.lazy.layout.X.a.f10698a;
                        }
                        int i37 = i26 << 18;
                        int i38 = (i21 & 65520) | (i35 & 458752) | (i35 & 3670016) | (i37 & 29360128) | (i37 & 234881024) | ((i26 << 27) & 1879048192);
                        zK = ((((i38 & 896) ^ 384) <= 256 && c1086gP.K(l10)) || (i38 & 384) == 256) | ((((i38 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lazyListState)) || (i38 & 48) == 32) | ((((i38 & 7168) ^ 3072) <= 2048 && c1086gP.c(z10)) || (i38 & 3072) == 2048) | ((((57344 & i38) ^ 24576) <= 16384 && c1086gP.c(z11)) || (i38 & 24576) == 16384) | ((((3670016 & i38) ^ 1572864) <= 1048576 && c1086gP.K(bVar3)) || (i38 & 1572864) == 1048576) | ((((29360128 & i38) ^ 12582912) <= 8388608 && c1086gP.K(cVar3)) || (i38 & 12582912) == 8388608) | ((((234881024 & i38) ^ 100663296) <= 67108864 && c1086gP.K(interfaceC0129e2)) || (i38 & 100663296) == 67108864) | ((((1879048192 & i38) ^ 805306368) <= 536870912 && c1086gP.K(lVar4)) || (i38 & 805306368) == 536870912) | c1086gP.K(s10) | c1086gP.K(c0130a);
                        objF4 = c1086gP.f();
                        if (!zK || objF4 == c0153a) {
                            final C0945e.l lVar6 = lVar4;
                            cVar2 = cVar3;
                            final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a2 = c0130a;
                            bVar4 = bVar3;
                            lVar5 = lVar6;
                            final C0945e.InterfaceC0129e interfaceC0129e3 = interfaceC0129e2;
                            c0153a2 = c0153a;
                            i32 = i31;
                            objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                                /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @Override // Ia.p
                                public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                                    int i39;
                                    float fMo1getSpacingD9Ej5fM;
                                    long j;
                                    int i40;
                                    m mVar;
                                    int i41;
                                    m mVar2;
                                    int i42;
                                    List arrayList;
                                    int i43;
                                    int i44;
                                    ArrayList arrayList2;
                                    boolean z18;
                                    List arrayList3;
                                    int i45;
                                    int i46;
                                    final j jVar2;
                                    Integer numValueOf;
                                    Integer numValueOf2;
                                    boolean z19;
                                    l lVar7;
                                    int[] iArr;
                                    int i47;
                                    m mVar3;
                                    float f10;
                                    int i48;
                                    m mVar4;
                                    Object obj;
                                    int i49;
                                    Object obj2;
                                    int index;
                                    int iMin;
                                    m mVar5;
                                    Object obj3;
                                    int i50;
                                    InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                    final long j10 = aVar.f20475a;
                                    lazyListState.f10367r.getValue();
                                    boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                                    Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                                    int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                                    int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                                    int iE3 = interfaceC0988x2.e1(l10.d());
                                    int iE4 = interfaceC0988x2.e1(l10.a());
                                    final int i51 = iE3 + iE4;
                                    final int i52 = iE1 + iE2;
                                    boolean z21 = z11;
                                    int i53 = z21 ? i51 : i52;
                                    if (z21 && !z10) {
                                        i39 = iE3;
                                    } else if (z21 && z10) {
                                        i39 = iE4;
                                    } else {
                                        i39 = (z21 || z10) ? iE2 : iE1;
                                    }
                                    int i54 = i53 - i39;
                                    long jI = p013b0.b.i(j10, -i52, -i51);
                                    h hVarInvoke = iVar.invoke();
                                    c cVarH = hVarInvoke.h();
                                    int iH = p013b0.a.h(jI);
                                    int iG = p013b0.a.g(jI);
                                    cVarH.f10386a.m(iH);
                                    cVarH.f10387b.m(iG);
                                    if (z11) {
                                        C0945e.l lVar8 = lVar6;
                                        if (lVar8 == null) {
                                            p245u.c.b("null verticalArrangement when isVertical == true");
                                            throw new KotlinNothingValueException();
                                        }
                                        fMo1getSpacingD9Ej5fM = lVar8.mo1getSpacingD9Ej5fM();
                                    } else {
                                        C0945e.InterfaceC0129e interfaceC0129e4 = interfaceC0129e3;
                                        if (interfaceC0129e4 == null) {
                                            p245u.c.b("null horizontalAlignment when isVertical == false");
                                            throw new KotlinNothingValueException();
                                        }
                                        fMo1getSpacingD9Ej5fM = interfaceC0129e4.mo1getSpacingD9Ej5fM();
                                    }
                                    int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                                    int iB = hVarInvoke.b();
                                    int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                                    boolean z22 = z10;
                                    if (!z22 || iG2 > 0) {
                                        j = ((long) iE1) << 32;
                                    } else {
                                        boolean z23 = z11;
                                        if (!z23) {
                                            iE1 += iG2;
                                        }
                                        if (z23) {
                                            iE3 += iG2;
                                        }
                                        j = ((long) iE1) << 32;
                                    }
                                    int i55 = iG2;
                                    int i56 = i39;
                                    final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                                    j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                                    LazyListState lazyListState3 = lazyListState;
                                    androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                    Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                    androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                    try {
                                        int iH2 = lazyListState3.h();
                                        q qVar = lazyListState3.f10354d;
                                        int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                        if (iH2 != iK) {
                                            ((C1081d0) qVar.f10774b).m(iK);
                                            ((D) qVar.f10777e).e(iH2);
                                        }
                                        int i57 = lazyListState3.i();
                                        p293xa.r rVar = p293xa.r.f47939a;
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        LazyListState lazyListState4 = lazyListState;
                                        List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                        float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                        boolean z24 = z11;
                                        C0945e.l lVar9 = lVar6;
                                        C0945e.InterfaceC0129e interfaceC0129e5 = interfaceC0129e3;
                                        boolean z25 = z10;
                                        LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                        int i58 = i31;
                                        boolean zS0 = interfaceC0988x3.S0();
                                        LazyListState lazyListState5 = lazyListState;
                                        l lVar10 = lazyListState5.f10353c;
                                        A a11 = a10;
                                        int i59 = i57;
                                        S s11 = s10;
                                        androidx.compose.foundation.lazy.layout.X x10 = c0130a2;
                                        l lVar11 = lVar10;
                                        Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                             */
                                            @Override // Ia.q
                                            public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar12) {
                                                int iIntValue = num.intValue();
                                                int iIntValue2 = num2.intValue();
                                                return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar12);
                                            }
                                        };
                                        int i60 = i56;
                                        if (i60 < 0) {
                                            p245u.c.a("invalid beforeContentPadding");
                                        }
                                        if (i54 < 0) {
                                            p245u.c.a("invalid afterContentPadding");
                                        }
                                        if (iB <= 0) {
                                            int iJ = p013b0.a.j(jI);
                                            int i61 = p013b0.a.i(jI);
                                            lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                            if (!zS0) {
                                                long jB = lazyLayoutItemAnimator.b();
                                                if (!p013b0.l.b(jB, 0L)) {
                                                    int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                                    i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                                    iJ = iG3;
                                                }
                                            }
                                            lVar7 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                                @Override // Ia.l
                                                public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                                    return p293xa.r.f47939a;
                                                }
                                            }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                            z19 = 0;
                                        } else {
                                            long j11 = jI;
                                            boolean z26 = zS0;
                                            int i62 = iB;
                                            if (iK >= i62) {
                                                iK = i62 - 1;
                                                i59 = 0;
                                            }
                                            int iRound = Math.round(fFloatValue);
                                            int i63 = i59 - iRound;
                                            if (iK == 0 && i63 < 0) {
                                                iRound += i63;
                                                i63 = 0;
                                            }
                                            kotlin.collections.i iVar2 = new kotlin.collections.i();
                                            int i64 = -i60;
                                            int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                            int i66 = i63 + i65;
                                            int iMax = 0;
                                            int i67 = iK;
                                            while (i66 < 0 && i67 > 0) {
                                                long j12 = j11;
                                                int i68 = i67 - 1;
                                                m mVarC = n.c(jVar3, i68);
                                                iVar2.add(0, mVarC);
                                                iMax = Math.max(iMax, mVarC.f10764t);
                                                i66 += mVarC.f10763s;
                                                i67 = i68;
                                                j11 = j12;
                                            }
                                            long j13 = j11;
                                            if (i66 < i65) {
                                                iRound -= i65 - i66;
                                                i66 = i65;
                                            }
                                            int i69 = i66 - i65;
                                            int i70 = i55 + i54;
                                            int i71 = i70 < 0 ? 0 : i70;
                                            int i72 = -i69;
                                            int i73 = iMax;
                                            int i74 = i67;
                                            int i75 = 0;
                                            boolean z27 = false;
                                            while (i75 < iVar2.f43019d) {
                                                if (i72 >= i71) {
                                                    iVar2.k(i75);
                                                    z27 = true;
                                                } else {
                                                    i74++;
                                                    i72 += ((m) iVar2.get(i75)).f10763s;
                                                    i75++;
                                                }
                                            }
                                            int i76 = i69;
                                            int iMax2 = i73;
                                            boolean z28 = z27;
                                            int i77 = i74;
                                            while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                                int i78 = i71;
                                                m mVarC2 = n.c(jVar3, i77);
                                                l lVar12 = lVar11;
                                                int i79 = mVarC2.f10763s;
                                                int i80 = i72 + i79;
                                                if (i80 > i65 || i77 == i62 - 1) {
                                                    iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                                    iVar2.addLast(mVarC2);
                                                    i50 = 1;
                                                } else {
                                                    i76 -= i79;
                                                    i67 = i77 + 1;
                                                    i50 = 1;
                                                    z28 = true;
                                                }
                                                i77 += i50;
                                                lVar11 = lVar12;
                                                i71 = i78;
                                                i72 = i80;
                                            }
                                            l lVar13 = lVar11;
                                            if (i72 < i55) {
                                                int i81 = i55 - i72;
                                                i76 -= i81;
                                                i72 += i81;
                                                while (i76 < i60 && i67 > 0) {
                                                    int i82 = i67 - 1;
                                                    m mVarC3 = n.c(jVar3, i82);
                                                    i67 = i82;
                                                    iVar2.add(0, mVarC3);
                                                    iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                                    i76 += mVarC3.f10763s;
                                                }
                                                int i83 = i81 + iRound;
                                                if (i76 < 0) {
                                                    i72 += i76;
                                                    i40 = i83 + i76;
                                                    i76 = 0;
                                                } else {
                                                    i40 = i83;
                                                }
                                            } else {
                                                i40 = iRound;
                                            }
                                            int i84 = i72;
                                            float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                            float f12 = fFloatValue - f11;
                                            float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                            if (i76 < 0) {
                                                p245u.c.a("negative currentFirstItemScrollOffset");
                                            }
                                            int i85 = -i76;
                                            m mVar6 = (m) iVar2.first();
                                            if (i60 > 0 || iE5 < 0) {
                                                int iE = iVar2.e();
                                                int i86 = i76;
                                                int i87 = 0;
                                                while (true) {
                                                    if (i87 >= iE) {
                                                        mVar = mVar6;
                                                        break;
                                                    }
                                                    mVar = mVar6;
                                                    int i88 = ((m) iVar2.get(i87)).f10763s;
                                                    if (i86 == 0 || i88 > i86) {
                                                        break;
                                                    }
                                                    int i89 = iE;
                                                    if (i87 == kotlin.collections.l.r(iVar2)) {
                                                        break;
                                                    }
                                                    i86 -= i88;
                                                    i87++;
                                                    mVar6 = (m) iVar2.get(i87);
                                                    iE = i89;
                                                }
                                                m mVar7 = mVar;
                                                i41 = i86;
                                                mVar2 = mVar7;
                                            } else {
                                                mVar2 = mVar6;
                                                i41 = i76;
                                            }
                                            int iMax3 = Math.max(0, i67 - i58);
                                            int i90 = i67 - 1;
                                            if (iMax3 <= i90) {
                                                arrayList = null;
                                                while (true) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    i42 = i60;
                                                    arrayList.add(n.c(jVar3, i90));
                                                    if (i90 == iMax3) {
                                                        break;
                                                    }
                                                    i90--;
                                                    i60 = i42;
                                                }
                                            } else {
                                                i42 = i60;
                                                arrayList = null;
                                            }
                                            List<Integer> list = listA;
                                            int size = list.size() - 1;
                                            float f14 = f13;
                                            if (size >= 0) {
                                                int i91 = size;
                                                while (true) {
                                                    int i92 = i91 - 1;
                                                    int iIntValue = listA.get(i91).intValue();
                                                    if (iIntValue < iMax3) {
                                                        if (arrayList == null) {
                                                            arrayList = new ArrayList();
                                                        }
                                                        arrayList.add(n.c(jVar3, iIntValue));
                                                    }
                                                    if (i92 < 0) {
                                                        break;
                                                    }
                                                    i91 = i92;
                                                }
                                            }
                                            if (arrayList == null) {
                                                arrayList = EmptyList.f42983b;
                                            }
                                            int iMax4 = iMax2;
                                            int i93 = 0;
                                            for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                                iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                                i93++;
                                            }
                                            int i94 = iMax4;
                                            int i95 = i62 - 1;
                                            int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                            int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                            if (i96 <= iMin2) {
                                                ArrayList arrayList4 = null;
                                                while (true) {
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList();
                                                    }
                                                    i44 = i77;
                                                    arrayList2 = arrayList4;
                                                    i43 = i85;
                                                    arrayList2.add(n.c(jVar3, i96));
                                                    if (i96 == iMin2) {
                                                        break;
                                                    }
                                                    i96++;
                                                    i85 = i43;
                                                    arrayList4 = arrayList2;
                                                    i77 = i44;
                                                }
                                            } else {
                                                i43 = i85;
                                                i44 = i77;
                                                arrayList2 = null;
                                            }
                                            if (!z26 || lVar13 == null || lVar13.f().isEmpty()) {
                                                z18 = z26;
                                                i84 = i84;
                                                arrayList3 = arrayList2;
                                            } else {
                                                List<m> listF = lVar13.f();
                                                int size3 = listF.size() - 1;
                                                ArrayList arrayList5 = arrayList2;
                                                int i97 = -1;
                                                while (true) {
                                                    if (i97 >= size3) {
                                                        mVar3 = null;
                                                        break;
                                                    }
                                                    if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                        mVar3 = listF.get(size3);
                                                        break;
                                                    }
                                                    i97 = -1;
                                                    size3--;
                                                }
                                                g gVar = (g) kotlin.collections.q.V(lVar13.f());
                                                if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                                    arrayList3 = arrayList5;
                                                    while (true) {
                                                        z18 = z26;
                                                        if (arrayList3 != null) {
                                                            int size4 = arrayList3.size();
                                                            int i98 = 0;
                                                            while (true) {
                                                                if (i98 >= size4) {
                                                                    obj3 = null;
                                                                    break;
                                                                }
                                                                obj3 = arrayList3.get(i98);
                                                                int i99 = size4;
                                                                if (((m) obj3).f10746a == index) {
                                                                    break;
                                                                }
                                                                i98++;
                                                                size4 = i99;
                                                            }
                                                            mVar5 = (m) obj3;
                                                        } else {
                                                            mVar5 = null;
                                                        }
                                                        if (mVar5 == null) {
                                                            if (arrayList3 == null) {
                                                                arrayList3 = new ArrayList();
                                                            }
                                                            arrayList3.add(n.c(jVar3, index));
                                                        }
                                                        if (index == iMin) {
                                                            break;
                                                        }
                                                        index++;
                                                        z26 = z18;
                                                        i84 = i84;
                                                    }
                                                } else {
                                                    z18 = z26;
                                                    i84 = i84;
                                                    arrayList3 = arrayList5;
                                                }
                                                float offset = ((lVar13.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                                if (offset > 0.0f) {
                                                    int index2 = gVar.getIndex() + 1;
                                                    int i100 = 0;
                                                    while (index2 < i62 && i100 < offset) {
                                                        if (index2 <= iMin2) {
                                                            int iE6 = iVar2.e();
                                                            int i101 = 0;
                                                            while (true) {
                                                                if (i101 >= iE6) {
                                                                    f10 = offset;
                                                                    obj2 = null;
                                                                    break;
                                                                }
                                                                obj2 = iVar2.get(i101);
                                                                f10 = offset;
                                                                if (((m) obj2).f10746a == index2) {
                                                                    break;
                                                                }
                                                                i101++;
                                                                offset = f10;
                                                            }
                                                            mVar4 = (m) obj2;
                                                            i48 = 1;
                                                        } else {
                                                            f10 = offset;
                                                            if (arrayList3 != null) {
                                                                int size5 = arrayList3.size();
                                                                int i102 = 0;
                                                                while (true) {
                                                                    if (i102 >= size5) {
                                                                        i48 = 1;
                                                                        obj = null;
                                                                        break;
                                                                    }
                                                                    obj = arrayList3.get(i102);
                                                                    int i103 = size5;
                                                                    if (((m) obj).f10746a == index2) {
                                                                        i48 = 1;
                                                                        break;
                                                                    }
                                                                    i102++;
                                                                    size5 = i103;
                                                                }
                                                                mVar4 = (m) obj;
                                                            } else {
                                                                i48 = 1;
                                                                mVar4 = null;
                                                            }
                                                        }
                                                        if (mVar4 != null) {
                                                            index2 += i48;
                                                            i49 = mVar4.f10763s;
                                                        } else {
                                                            if (arrayList3 == null) {
                                                                arrayList3 = new ArrayList();
                                                            }
                                                            arrayList3.add(n.c(jVar3, index2));
                                                            index2++;
                                                            i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                        }
                                                        i100 += i49;
                                                        offset = f10;
                                                    }
                                                }
                                            }
                                            if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                                iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                            }
                                            int size6 = list.size();
                                            for (int i104 = 0; i104 < size6; i104++) {
                                                int iIntValue2 = listA.get(i104).intValue();
                                                if (iIntValue2 > iMin2) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, iIntValue2));
                                                }
                                            }
                                            if (arrayList3 == null) {
                                                arrayList3 = EmptyList.f42983b;
                                            }
                                            int size7 = arrayList3.size();
                                            int iMax5 = i94;
                                            for (int i105 = 0; i105 < size7; i105++) {
                                                iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                            }
                                            boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                            int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                            if (z24) {
                                                iMax5 = i84;
                                            }
                                            int iF = p013b0.b.f(iMax5, j13);
                                            int i106 = z24 ? iF : iG4;
                                            int i107 = i84;
                                            boolean z30 = i107 < Math.min(i106, i55);
                                            if (z30 && i43 != 0) {
                                                p245u.c.c("non-zero itemsScrollOffset");
                                            }
                                            m mVar8 = mVar2;
                                            final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                            if (z30) {
                                                if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                                    p245u.c.a("no extra items");
                                                }
                                                int iE7 = iVar2.e();
                                                int[] iArr2 = new int[iE7];
                                                for (int i108 = 0; i108 < iE7; i108++) {
                                                    iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                                }
                                                int[] iArr3 = new int[iE7];
                                                if (z24) {
                                                    if (lVar9 == null) {
                                                        p245u.c.b("null verticalArrangement when isVertical == true");
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    lVar9.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                                    iArr = iArr3;
                                                    i45 = i55;
                                                    i47 = 0;
                                                    jVar2 = jVar3;
                                                } else {
                                                    if (interfaceC0129e5 == null) {
                                                        p245u.c.b("null horizontalArrangement when isVertical == false");
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    interfaceC0988x3 = interfaceC0988x3;
                                                    iArr = iArr3;
                                                    i45 = i55;
                                                    jVar2 = jVar3;
                                                    i47 = 0;
                                                    interfaceC0129e5.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                                }
                                                Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                                Na.g gVarH = iVarQ;
                                                if (z25) {
                                                    gVarH = Na.l.H(iVarQ);
                                                }
                                                int i109 = gVarH.f4687b;
                                                int i110 = gVarH.f4688c;
                                                int i111 = gVarH.f4689d;
                                                if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                                    while (true) {
                                                        int i112 = iArr[i109];
                                                        m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                        if (z25) {
                                                            i112 = (i106 - i112) - mVar9.f10761q;
                                                        }
                                                        mVar9.k(i112, iG4, iF);
                                                        arrayList6.add(mVar9);
                                                        if (i109 == i110) {
                                                            break;
                                                        }
                                                        i109 += i111;
                                                    }
                                                }
                                                i46 = i47;
                                            } else {
                                                i45 = i55;
                                                j13 = j13;
                                                i62 = i62;
                                                i42 = i42;
                                                i46 = 0;
                                                jVar2 = jVar3;
                                                i107 = i107;
                                                int size8 = arrayList.size();
                                                int i113 = i43;
                                                for (int i114 = 0; i114 < size8; i114++) {
                                                    m mVar10 = (m) arrayList.get(i114);
                                                    i113 -= mVar10.f10763s;
                                                    mVar10.k(i113, iG4, iF);
                                                    arrayList6.add(mVar10);
                                                }
                                                int iE8 = iVar2.e();
                                                int i115 = i43;
                                                for (int i116 = 0; i116 < iE8; i116++) {
                                                    m mVar11 = (m) iVar2.get(i116);
                                                    mVar11.k(i115, iG4, iF);
                                                    arrayList6.add(mVar11);
                                                    i115 += mVar11.f10763s;
                                                }
                                                int size9 = arrayList3.size();
                                                for (int i117 = 0; i117 < size9; i117++) {
                                                    m mVar12 = (m) arrayList3.get(i117);
                                                    mVar12.k(i115, iG4, iF);
                                                    arrayList6.add(mVar12);
                                                    i115 += mVar12.f10763s;
                                                }
                                            }
                                            h hVar2 = jVar2.f10770a;
                                            lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z18, 1, z20, i41, i107, a11, s11);
                                            if (!z18) {
                                                long jB2 = lazyLayoutItemAnimator.b();
                                                if (!p013b0.l.b(jB2, 0L)) {
                                                    int i118 = z24 ? iF : iG4;
                                                    long j14 = j13;
                                                    iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                                    iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                                    int i119 = z24 ? iF : iG4;
                                                    if (i119 != i118) {
                                                        int size10 = arrayList6.size();
                                                        for (int i120 = i46; i120 < size10; i120++) {
                                                            m mVar13 = (m) arrayList6.get(i120);
                                                            mVar13.f10766v = i119;
                                                            mVar13.f10768x = mVar13.f10754i + i119;
                                                        }
                                                    }
                                                }
                                            }
                                            final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final m invoke(Integer num) {
                                                    return n.c(jVar2, num.intValue());
                                                }
                                            });
                                            if (z29) {
                                                m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                                if (mVar14 != null) {
                                                    numValueOf = Integer.valueOf(mVar14.f10746a);
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else {
                                                m mVar15 = (m) iVar2.A();
                                                if (mVar15 != null) {
                                                    numValueOf = Integer.valueOf(mVar15.f10746a);
                                                } else {
                                                    numValueOf = null;
                                                }
                                            }
                                            if (z29) {
                                                m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                                if (mVar16 != null) {
                                                    numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                                } else {
                                                    numValueOf2 = null;
                                                }
                                            } else {
                                                m mVar17 = (m) iVar2.C();
                                                if (mVar17 != null) {
                                                    numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                                } else {
                                                    numValueOf2 = null;
                                                }
                                            }
                                            boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                            Integer numValueOf3 = Integer.valueOf(iG4);
                                            Integer numValueOf4 = Integer.valueOf(iF);
                                            final X<p293xa.r> x11 = lazyListState5.f10370u;
                                            final boolean z32 = z18;
                                            F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(Y.a aVar2) {
                                                    Y.a aVar3 = aVar2;
                                                    final List<m> list2 = arrayList6;
                                                    final List<m> list3 = listD;
                                                    final boolean z33 = z32;
                                                    Ia.l<Y.a, p293xa.r> lVar14 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // Ia.l
                                                        public final p293xa.r invoke(Y.a aVar4) {
                                                            Y.a aVar5 = aVar4;
                                                            List<m> list4 = list2;
                                                            boolean z34 = z33;
                                                            int size11 = list4.size();
                                                            for (int i121 = 0; i121 < size11; i121++) {
                                                                list4.get(i121).e(aVar5, z34);
                                                            }
                                                            List<m> list5 = list3;
                                                            boolean z35 = z33;
                                                            int size12 = list5.size();
                                                            for (int i122 = 0; i122 < size12; i122++) {
                                                                list5.get(i122).e(aVar5, z35);
                                                            }
                                                            return p293xa.r.f47939a;
                                                        }
                                                    };
                                                    aVar3.f14225a = true;
                                                    lVar14.invoke(aVar3);
                                                    aVar3.f14225a = false;
                                                    x11.getValue();
                                                    return p293xa.r.f47939a;
                                                }
                                            });
                                            z19 = i46;
                                            lVar7 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                        }
                                        lazyListState.g(lVar7, interfaceC0988x3.S0(), z19);
                                        return lVar7;
                                    } catch (Throwable th) {
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        throw th;
                                    }
                                }
                            };
                            c1086g = c1086gP;
                            c1086g.E(objF4);
                        } else {
                            lVar5 = lVar4;
                            cVar2 = cVar3;
                            c1086g = c1086gP;
                            bVar4 = bVar3;
                            i32 = i31;
                            c0153a2 = c0153a;
                        }
                        Ia.p pVar = (Ia.p) objF4;
                        if (z11) {
                            orientation = Orientation.f9957b;
                        } else {
                            orientation = Orientation.f9958c;
                        }
                        orientation2 = orientation;
                        if (z12) {
                            c1086g.L(-1513147781);
                            i33 = i30 | ((i21 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                            lazyListState2 = lazyListState;
                            boolean z18 = (((i33 & 14) ^ 6) <= 4 && c1086g.K(lazyListState2)) || (i33 & 6) == 4;
                            if ((((i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 || !c1086g.h(i32)) && (i33 & 48) != 32) {
                            }
                            z17 = z18 | z13;
                            objF5 = c1086g.f();
                            if (z17 || objF5 == c0153a2) {
                                objF5 = new e(lazyListState2, i32);
                                c1086g.E(objF5);
                            }
                            hVarA = C0974i.a((e) objF5, lazyListState2.f10363n, z10, orientation2);
                            c1086g.T(false);
                        } else {
                            lazyListState2 = lazyListState;
                            c1086g.L(-1512720880);
                            c1086g.T(false);
                            hVarA = androidx.compose.ui.h.a.f13984b;
                        }
                        LazyLayoutKt.a(iVar, K.a(N.a(hVar.i(lazyListState2.f10360k).i(lazyListState2.f10361l), iVar, m7, orientation2, z12, z10).i(hVarA).i(lazyListState2.f10362m.f10635k), lazyListState, orientation2, z12, z10, jVar, lazyListState2.f10356f, false, e10, null), lazyListState2.f10364o, pVar, c1086g, 0, 0);
                        lVar3 = lVar5;
                        i28 = i32;
                        bVar2 = bVar4;
                    } else {
                        c1086g = c1086gP;
                        c1086g.w();
                        i28 = i10;
                        bVar2 = bVar;
                        lVar3 = lVar;
                        cVar2 = cVar;
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        final androidx.compose.ui.d.c cVar5 = cVar2;
                        final C0945e.InterfaceC0129e interfaceC0129e4 = interfaceC0129e2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyListKt.a(hVar, lazyListState, l10, z10, z11, jVar, z12, e10, i28, bVar2, lVar3, cVar5, interfaceC0129e4, lVar2, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i26 |= 384;
                if ((i13 & 8192) != 0) {
                    i26 |= 3072;
                } else if ((i12 & 3072) == 0) {
                    i26 |= c1086gP.k(lVar2) ? 2048 : 1024;
                }
                z13 = true;
                if ((i21 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c1086gP.C(i21 & 1, z14)) {
                    if (i17 != 0) {
                        i29 = 0;
                    } else {
                        i29 = i10;
                    }
                    if (i19 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i22 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i25 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i27 != 0) {
                        interfaceC0129e2 = null;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    i30 = (i21 >> 3) & 14;
                    int i39 = i30 | ((i26 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    xI = J0.i(lVar2, c1086gP);
                    if (((i39 & 14) ^ 6) <= 4) {
                    }
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (z15) {
                        final c cVar6 = new c();
                        cVar6.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                        cVar6.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                        C1108r0 c1108r1 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE2 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyListIntervalContent invoke() {
                                return new LazyListIntervalContent(xI.getValue());
                            }
                        }, c1108r1);
                        objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final i invoke() {
                                LazyListIntervalContent value = derivedSnapshotStateE2.getValue();
                                return new i(lazyListState, value, cVar6, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                            }
                        }, c1108r1), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF);
                    } else {
                        final c cVar7 = new c();
                        cVar7.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                        cVar7.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                        C1108r0 c1108r2 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE3 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyListIntervalContent invoke() {
                                return new LazyListIntervalContent(xI.getValue());
                            }
                        }, c1108r2);
                        objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final i invoke() {
                                LazyListIntervalContent value = derivedSnapshotStateE3.getValue();
                                return new i(lazyListState, value, cVar7, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                            }
                        }, c1108r2), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF);
                    }
                    iVar = (Oa.i) objF;
                    int i310 = i21 >> 9;
                    int i311 = i30 | (i310 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    i31 = i29;
                    if (((i311 & 14) ^ 6) <= 4) {
                    }
                    z16 = ((((i311 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.c(z11)) || (i311 & 48) == 32) | ((((i311 & 14) ^ 6) <= 4 && c1086gP.K(lazyListState)) || (i311 & 6) == 4);
                    objF2 = c1086gP.f();
                    if (z16) {
                        objF2 = new d(lazyListState, z11);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new d(lazyListState, z11);
                        c1086gP.E(objF2);
                    }
                    M m10 = (M) objF2;
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF3);
                    }
                    a10 = (A) objF3;
                    s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                    if (((Boolean) c1086gP.x(CompositionLocalsKt.f14860v)).booleanValue()) {
                        c0130a = androidx.compose.foundation.lazy.layout.X.a.f10698a;
                    } else {
                        c0130a = null;
                    }
                    int i312 = i26 << 18;
                    int i313 = (i21 & 65520) | (i310 & 458752) | (i310 & 3670016) | (i312 & 29360128) | (i312 & 234881024) | ((i26 << 27) & 1879048192);
                    if (((i313 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32) {
                    }
                    zK = ((((i313 & 896) ^ 384) <= 256 && c1086gP.K(l10)) || (i313 & 384) == 256) | ((((i313 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lazyListState)) || (i313 & 48) == 32) | ((((i313 & 7168) ^ 3072) <= 2048 && c1086gP.c(z10)) || (i313 & 3072) == 2048) | ((((57344 & i313) ^ 24576) <= 16384 && c1086gP.c(z11)) || (i313 & 24576) == 16384) | ((((3670016 & i313) ^ 1572864) <= 1048576 && c1086gP.K(bVar3)) || (i313 & 1572864) == 1048576) | ((((29360128 & i313) ^ 12582912) <= 8388608 && c1086gP.K(cVar3)) || (i313 & 12582912) == 8388608) | ((((234881024 & i313) ^ 100663296) <= 67108864 && c1086gP.K(interfaceC0129e2)) || (i313 & 100663296) == 67108864) | ((((1879048192 & i313) ^ 805306368) <= 536870912 && c1086gP.K(lVar4)) || (i313 & 805306368) == 536870912) | c1086gP.K(s10) | c1086gP.K(c0130a);
                    objF4 = c1086gP.f();
                    if (zK) {
                        final C0945e.l lVar7 = lVar4;
                        cVar2 = cVar3;
                        final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a3 = c0130a;
                        bVar4 = bVar3;
                        lVar5 = lVar7;
                        final C0945e.InterfaceC0129e interfaceC0129e5 = interfaceC0129e2;
                        c0153a2 = c0153a;
                        i32 = i31;
                        objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                            /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.p
                            public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                                int i314;
                                float fMo1getSpacingD9Ej5fM;
                                long j;
                                int i40;
                                m mVar;
                                int i41;
                                m mVar2;
                                int i42;
                                List arrayList;
                                int i43;
                                int i44;
                                ArrayList arrayList2;
                                boolean z19;
                                List arrayList3;
                                int i45;
                                int i46;
                                final j jVar2;
                                Integer numValueOf;
                                Integer numValueOf2;
                                boolean z110;
                                l lVar8;
                                int[] iArr;
                                int i47;
                                m mVar3;
                                float f10;
                                int i48;
                                m mVar4;
                                Object obj;
                                int i49;
                                Object obj2;
                                int index;
                                int iMin;
                                m mVar5;
                                Object obj3;
                                int i50;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                final long j10 = aVar.f20475a;
                                lazyListState.f10367r.getValue();
                                boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                                Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                                int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE3 = interfaceC0988x2.e1(l10.d());
                                int iE4 = interfaceC0988x2.e1(l10.a());
                                final int i51 = iE3 + iE4;
                                final int i52 = iE1 + iE2;
                                boolean z21 = z11;
                                int i53 = z21 ? i51 : i52;
                                if (z21 && !z10) {
                                    i314 = iE3;
                                } else if (z21 && z10) {
                                    i314 = iE4;
                                } else {
                                    i314 = (z21 || z10) ? iE2 : iE1;
                                }
                                int i54 = i53 - i314;
                                long jI = p013b0.b.i(j10, -i52, -i51);
                                h hVarInvoke = iVar.invoke();
                                c cVarH = hVarInvoke.h();
                                int iH = p013b0.a.h(jI);
                                int iG = p013b0.a.g(jI);
                                cVarH.f10386a.m(iH);
                                cVarH.f10387b.m(iG);
                                if (z11) {
                                    C0945e.l lVar9 = lVar7;
                                    if (lVar9 == null) {
                                        p245u.c.b("null verticalArrangement when isVertical == true");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = lVar9.mo1getSpacingD9Ej5fM();
                                } else {
                                    C0945e.InterfaceC0129e interfaceC0129e6 = interfaceC0129e5;
                                    if (interfaceC0129e6 == null) {
                                        p245u.c.b("null horizontalAlignment when isVertical == false");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = interfaceC0129e6.mo1getSpacingD9Ej5fM();
                                }
                                int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                                int iB = hVarInvoke.b();
                                int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                                boolean z22 = z10;
                                if (!z22 || iG2 > 0) {
                                    j = ((long) iE1) << 32;
                                } else {
                                    boolean z23 = z11;
                                    if (!z23) {
                                        iE1 += iG2;
                                    }
                                    if (z23) {
                                        iE3 += iG2;
                                    }
                                    j = ((long) iE1) << 32;
                                }
                                int i55 = iG2;
                                int i56 = i314;
                                final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                                j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                                LazyListState lazyListState3 = lazyListState;
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    int iH2 = lazyListState3.h();
                                    q qVar = lazyListState3.f10354d;
                                    int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                    if (iH2 != iK) {
                                        ((C1081d0) qVar.f10774b).m(iK);
                                        ((D) qVar.f10777e).e(iH2);
                                    }
                                    int i57 = lazyListState3.i();
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    LazyListState lazyListState4 = lazyListState;
                                    List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                    float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                    boolean z24 = z11;
                                    C0945e.l lVar10 = lVar7;
                                    C0945e.InterfaceC0129e interfaceC0129e7 = interfaceC0129e5;
                                    boolean z25 = z10;
                                    LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                    int i58 = i31;
                                    boolean zS0 = interfaceC0988x3.S0();
                                    LazyListState lazyListState5 = lazyListState;
                                    l lVar11 = lazyListState5.f10353c;
                                    A a11 = a10;
                                    int i59 = i57;
                                    S s11 = s10;
                                    androidx.compose.foundation.lazy.layout.X x10 = c0130a3;
                                    l lVar12 = lVar11;
                                    Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // Ia.q
                                        public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar13) {
                                            int iIntValue = num.intValue();
                                            int iIntValue2 = num2.intValue();
                                            return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar13);
                                        }
                                    };
                                    int i60 = i56;
                                    if (i60 < 0) {
                                        p245u.c.a("invalid beforeContentPadding");
                                    }
                                    if (i54 < 0) {
                                        p245u.c.a("invalid afterContentPadding");
                                    }
                                    if (iB <= 0) {
                                        int iJ = p013b0.a.j(jI);
                                        int i61 = p013b0.a.i(jI);
                                        lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                        if (!zS0) {
                                            long jB = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB, 0L)) {
                                                int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                                i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                                iJ = iG3;
                                            }
                                        }
                                        lVar8 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                            @Override // Ia.l
                                            public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                                return p293xa.r.f47939a;
                                            }
                                        }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                        z110 = 0;
                                    } else {
                                        long j11 = jI;
                                        boolean z26 = zS0;
                                        int i62 = iB;
                                        if (iK >= i62) {
                                            iK = i62 - 1;
                                            i59 = 0;
                                        }
                                        int iRound = Math.round(fFloatValue);
                                        int i63 = i59 - iRound;
                                        if (iK == 0 && i63 < 0) {
                                            iRound += i63;
                                            i63 = 0;
                                        }
                                        kotlin.collections.i iVar2 = new kotlin.collections.i();
                                        int i64 = -i60;
                                        int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                        int i66 = i63 + i65;
                                        int iMax = 0;
                                        int i67 = iK;
                                        while (i66 < 0 && i67 > 0) {
                                            long j12 = j11;
                                            int i68 = i67 - 1;
                                            m mVarC = n.c(jVar3, i68);
                                            iVar2.add(0, mVarC);
                                            iMax = Math.max(iMax, mVarC.f10764t);
                                            i66 += mVarC.f10763s;
                                            i67 = i68;
                                            j11 = j12;
                                        }
                                        long j13 = j11;
                                        if (i66 < i65) {
                                            iRound -= i65 - i66;
                                            i66 = i65;
                                        }
                                        int i69 = i66 - i65;
                                        int i70 = i55 + i54;
                                        int i71 = i70 < 0 ? 0 : i70;
                                        int i72 = -i69;
                                        int i73 = iMax;
                                        int i74 = i67;
                                        int i75 = 0;
                                        boolean z27 = false;
                                        while (i75 < iVar2.f43019d) {
                                            if (i72 >= i71) {
                                                iVar2.k(i75);
                                                z27 = true;
                                            } else {
                                                i74++;
                                                i72 += ((m) iVar2.get(i75)).f10763s;
                                                i75++;
                                            }
                                        }
                                        int i76 = i69;
                                        int iMax2 = i73;
                                        boolean z28 = z27;
                                        int i77 = i74;
                                        while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                            int i78 = i71;
                                            m mVarC2 = n.c(jVar3, i77);
                                            l lVar13 = lVar12;
                                            int i79 = mVarC2.f10763s;
                                            int i80 = i72 + i79;
                                            if (i80 > i65 || i77 == i62 - 1) {
                                                iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                                iVar2.addLast(mVarC2);
                                                i50 = 1;
                                            } else {
                                                i76 -= i79;
                                                i67 = i77 + 1;
                                                i50 = 1;
                                                z28 = true;
                                            }
                                            i77 += i50;
                                            lVar12 = lVar13;
                                            i71 = i78;
                                            i72 = i80;
                                        }
                                        l lVar14 = lVar12;
                                        if (i72 < i55) {
                                            int i81 = i55 - i72;
                                            i76 -= i81;
                                            i72 += i81;
                                            while (i76 < i60 && i67 > 0) {
                                                int i82 = i67 - 1;
                                                m mVarC3 = n.c(jVar3, i82);
                                                i67 = i82;
                                                iVar2.add(0, mVarC3);
                                                iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                                i76 += mVarC3.f10763s;
                                            }
                                            int i83 = i81 + iRound;
                                            if (i76 < 0) {
                                                i72 += i76;
                                                i40 = i83 + i76;
                                                i76 = 0;
                                            } else {
                                                i40 = i83;
                                            }
                                        } else {
                                            i40 = iRound;
                                        }
                                        int i84 = i72;
                                        float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                        float f12 = fFloatValue - f11;
                                        float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                        if (i76 < 0) {
                                            p245u.c.a("negative currentFirstItemScrollOffset");
                                        }
                                        int i85 = -i76;
                                        m mVar6 = (m) iVar2.first();
                                        if (i60 > 0 || iE5 < 0) {
                                            int iE = iVar2.e();
                                            int i86 = i76;
                                            int i87 = 0;
                                            while (true) {
                                                if (i87 >= iE) {
                                                    mVar = mVar6;
                                                    break;
                                                }
                                                mVar = mVar6;
                                                int i88 = ((m) iVar2.get(i87)).f10763s;
                                                if (i86 == 0 || i88 > i86) {
                                                    break;
                                                }
                                                int i89 = iE;
                                                if (i87 == kotlin.collections.l.r(iVar2)) {
                                                    break;
                                                }
                                                i86 -= i88;
                                                i87++;
                                                mVar6 = (m) iVar2.get(i87);
                                                iE = i89;
                                            }
                                            m mVar7 = mVar;
                                            i41 = i86;
                                            mVar2 = mVar7;
                                        } else {
                                            mVar2 = mVar6;
                                            i41 = i76;
                                        }
                                        int iMax3 = Math.max(0, i67 - i58);
                                        int i90 = i67 - 1;
                                        if (iMax3 <= i90) {
                                            arrayList = null;
                                            while (true) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                i42 = i60;
                                                arrayList.add(n.c(jVar3, i90));
                                                if (i90 == iMax3) {
                                                    break;
                                                }
                                                i90--;
                                                i60 = i42;
                                            }
                                        } else {
                                            i42 = i60;
                                            arrayList = null;
                                        }
                                        List<Integer> list = listA;
                                        int size = list.size() - 1;
                                        float f14 = f13;
                                        if (size >= 0) {
                                            int i91 = size;
                                            while (true) {
                                                int i92 = i91 - 1;
                                                int iIntValue = listA.get(i91).intValue();
                                                if (iIntValue < iMax3) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(n.c(jVar3, iIntValue));
                                                }
                                                if (i92 < 0) {
                                                    break;
                                                }
                                                i91 = i92;
                                            }
                                        }
                                        if (arrayList == null) {
                                            arrayList = EmptyList.f42983b;
                                        }
                                        int iMax4 = iMax2;
                                        int i93 = 0;
                                        for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                            iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                            i93++;
                                        }
                                        int i94 = iMax4;
                                        int i95 = i62 - 1;
                                        int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                        int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                        if (i96 <= iMin2) {
                                            ArrayList arrayList4 = null;
                                            while (true) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                i44 = i77;
                                                arrayList2 = arrayList4;
                                                i43 = i85;
                                                arrayList2.add(n.c(jVar3, i96));
                                                if (i96 == iMin2) {
                                                    break;
                                                }
                                                i96++;
                                                i85 = i43;
                                                arrayList4 = arrayList2;
                                                i77 = i44;
                                            }
                                        } else {
                                            i43 = i85;
                                            i44 = i77;
                                            arrayList2 = null;
                                        }
                                        if (!z26 || lVar14 == null || lVar14.f().isEmpty()) {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList2;
                                        } else {
                                            List<m> listF = lVar14.f();
                                            int size3 = listF.size() - 1;
                                            ArrayList arrayList5 = arrayList2;
                                            int i97 = -1;
                                            while (true) {
                                                if (i97 >= size3) {
                                                    mVar3 = null;
                                                    break;
                                                }
                                                if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                    mVar3 = listF.get(size3);
                                                    break;
                                                }
                                                i97 = -1;
                                                size3--;
                                            }
                                            g gVar = (g) kotlin.collections.q.V(lVar14.f());
                                            if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                                arrayList3 = arrayList5;
                                                while (true) {
                                                    z19 = z26;
                                                    if (arrayList3 != null) {
                                                        int size4 = arrayList3.size();
                                                        int i98 = 0;
                                                        while (true) {
                                                            if (i98 >= size4) {
                                                                obj3 = null;
                                                                break;
                                                            }
                                                            obj3 = arrayList3.get(i98);
                                                            int i99 = size4;
                                                            if (((m) obj3).f10746a == index) {
                                                                break;
                                                            }
                                                            i98++;
                                                            size4 = i99;
                                                        }
                                                        mVar5 = (m) obj3;
                                                    } else {
                                                        mVar5 = null;
                                                    }
                                                    if (mVar5 == null) {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index));
                                                    }
                                                    if (index == iMin) {
                                                        break;
                                                    }
                                                    index++;
                                                    z26 = z19;
                                                    i84 = i84;
                                                }
                                            } else {
                                                z19 = z26;
                                                i84 = i84;
                                                arrayList3 = arrayList5;
                                            }
                                            float offset = ((lVar14.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                            if (offset > 0.0f) {
                                                int index2 = gVar.getIndex() + 1;
                                                int i100 = 0;
                                                while (index2 < i62 && i100 < offset) {
                                                    if (index2 <= iMin2) {
                                                        int iE6 = iVar2.e();
                                                        int i101 = 0;
                                                        while (true) {
                                                            if (i101 >= iE6) {
                                                                f10 = offset;
                                                                obj2 = null;
                                                                break;
                                                            }
                                                            obj2 = iVar2.get(i101);
                                                            f10 = offset;
                                                            if (((m) obj2).f10746a == index2) {
                                                                break;
                                                            }
                                                            i101++;
                                                            offset = f10;
                                                        }
                                                        mVar4 = (m) obj2;
                                                        i48 = 1;
                                                    } else {
                                                        f10 = offset;
                                                        if (arrayList3 != null) {
                                                            int size5 = arrayList3.size();
                                                            int i102 = 0;
                                                            while (true) {
                                                                if (i102 >= size5) {
                                                                    i48 = 1;
                                                                    obj = null;
                                                                    break;
                                                                }
                                                                obj = arrayList3.get(i102);
                                                                int i103 = size5;
                                                                if (((m) obj).f10746a == index2) {
                                                                    i48 = 1;
                                                                    break;
                                                                }
                                                                i102++;
                                                                size5 = i103;
                                                            }
                                                            mVar4 = (m) obj;
                                                        } else {
                                                            i48 = 1;
                                                            mVar4 = null;
                                                        }
                                                    }
                                                    if (mVar4 != null) {
                                                        index2 += i48;
                                                        i49 = mVar4.f10763s;
                                                    } else {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index2));
                                                        index2++;
                                                        i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                    }
                                                    i100 += i49;
                                                    offset = f10;
                                                }
                                            }
                                        }
                                        if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                            iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                        }
                                        int size6 = list.size();
                                        for (int i104 = 0; i104 < size6; i104++) {
                                            int iIntValue2 = listA.get(i104).intValue();
                                            if (iIntValue2 > iMin2) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, iIntValue2));
                                            }
                                        }
                                        if (arrayList3 == null) {
                                            arrayList3 = EmptyList.f42983b;
                                        }
                                        int size7 = arrayList3.size();
                                        int iMax5 = i94;
                                        for (int i105 = 0; i105 < size7; i105++) {
                                            iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                        }
                                        boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                        int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                        if (z24) {
                                            iMax5 = i84;
                                        }
                                        int iF = p013b0.b.f(iMax5, j13);
                                        int i106 = z24 ? iF : iG4;
                                        int i107 = i84;
                                        boolean z30 = i107 < Math.min(i106, i55);
                                        if (z30 && i43 != 0) {
                                            p245u.c.c("non-zero itemsScrollOffset");
                                        }
                                        m mVar8 = mVar2;
                                        final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                        if (z30) {
                                            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                                p245u.c.a("no extra items");
                                            }
                                            int iE7 = iVar2.e();
                                            int[] iArr2 = new int[iE7];
                                            for (int i108 = 0; i108 < iE7; i108++) {
                                                iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                            }
                                            int[] iArr3 = new int[iE7];
                                            if (z24) {
                                                if (lVar10 == null) {
                                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                                    throw new KotlinNothingValueException();
                                                }
                                                lVar10.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                                iArr = iArr3;
                                                i45 = i55;
                                                i47 = 0;
                                                jVar2 = jVar3;
                                            } else {
                                                if (interfaceC0129e7 == null) {
                                                    p245u.c.b("null horizontalArrangement when isVertical == false");
                                                    throw new KotlinNothingValueException();
                                                }
                                                interfaceC0988x3 = interfaceC0988x3;
                                                iArr = iArr3;
                                                i45 = i55;
                                                jVar2 = jVar3;
                                                i47 = 0;
                                                interfaceC0129e7.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                            }
                                            Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                            Na.g gVarH = iVarQ;
                                            if (z25) {
                                                gVarH = Na.l.H(iVarQ);
                                            }
                                            int i109 = gVarH.f4687b;
                                            int i110 = gVarH.f4688c;
                                            int i111 = gVarH.f4689d;
                                            if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                                while (true) {
                                                    int i112 = iArr[i109];
                                                    m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                    if (z25) {
                                                        i112 = (i106 - i112) - mVar9.f10761q;
                                                    }
                                                    mVar9.k(i112, iG4, iF);
                                                    arrayList6.add(mVar9);
                                                    if (i109 == i110) {
                                                        break;
                                                    }
                                                    i109 += i111;
                                                }
                                            }
                                            i46 = i47;
                                        } else {
                                            i45 = i55;
                                            j13 = j13;
                                            i62 = i62;
                                            i42 = i42;
                                            i46 = 0;
                                            jVar2 = jVar3;
                                            i107 = i107;
                                            int size8 = arrayList.size();
                                            int i113 = i43;
                                            for (int i114 = 0; i114 < size8; i114++) {
                                                m mVar10 = (m) arrayList.get(i114);
                                                i113 -= mVar10.f10763s;
                                                mVar10.k(i113, iG4, iF);
                                                arrayList6.add(mVar10);
                                            }
                                            int iE8 = iVar2.e();
                                            int i115 = i43;
                                            for (int i116 = 0; i116 < iE8; i116++) {
                                                m mVar11 = (m) iVar2.get(i116);
                                                mVar11.k(i115, iG4, iF);
                                                arrayList6.add(mVar11);
                                                i115 += mVar11.f10763s;
                                            }
                                            int size9 = arrayList3.size();
                                            for (int i117 = 0; i117 < size9; i117++) {
                                                m mVar12 = (m) arrayList3.get(i117);
                                                mVar12.k(i115, iG4, iF);
                                                arrayList6.add(mVar12);
                                                i115 += mVar12.f10763s;
                                            }
                                        }
                                        h hVar2 = jVar2.f10770a;
                                        lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                        if (!z19) {
                                            long jB2 = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB2, 0L)) {
                                                int i118 = z24 ? iF : iG4;
                                                long j14 = j13;
                                                iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                                iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                                int i119 = z24 ? iF : iG4;
                                                if (i119 != i118) {
                                                    int size10 = arrayList6.size();
                                                    for (int i120 = i46; i120 < size10; i120++) {
                                                        m mVar13 = (m) arrayList6.get(i120);
                                                        mVar13.f10766v = i119;
                                                        mVar13.f10768x = mVar13.f10754i + i119;
                                                    }
                                                }
                                            }
                                        }
                                        final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final m invoke(Integer num) {
                                                return n.c(jVar2, num.intValue());
                                            }
                                        });
                                        if (z29) {
                                            m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                            if (mVar14 != null) {
                                                numValueOf = Integer.valueOf(mVar14.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else {
                                            m mVar15 = (m) iVar2.A();
                                            if (mVar15 != null) {
                                                numValueOf = Integer.valueOf(mVar15.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        }
                                        if (z29) {
                                            m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                            if (mVar16 != null) {
                                                numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        } else {
                                            m mVar17 = (m) iVar2.C();
                                            if (mVar17 != null) {
                                                numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        }
                                        boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                        Integer numValueOf3 = Integer.valueOf(iG4);
                                        Integer numValueOf4 = Integer.valueOf(iF);
                                        final X x11 = lazyListState5.f10370u;
                                        final boolean z32 = z19;
                                        F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Y.a aVar2) {
                                                Y.a aVar3 = aVar2;
                                                final List<m> list2 = arrayList6;
                                                final List<m> list3 = listD;
                                                final boolean z33 = z32;
                                                Ia.l<Y.a, p293xa.r> lVar15 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(Y.a aVar4) {
                                                        Y.a aVar5 = aVar4;
                                                        List<m> list4 = list2;
                                                        boolean z34 = z33;
                                                        int size11 = list4.size();
                                                        for (int i121 = 0; i121 < size11; i121++) {
                                                            list4.get(i121).e(aVar5, z34);
                                                        }
                                                        List<m> list5 = list3;
                                                        boolean z35 = z33;
                                                        int size12 = list5.size();
                                                        for (int i122 = 0; i122 < size12; i122++) {
                                                            list5.get(i122).e(aVar5, z35);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                aVar3.f14225a = true;
                                                lVar15.invoke(aVar3);
                                                aVar3.f14225a = false;
                                                x11.getValue();
                                                return p293xa.r.f47939a;
                                            }
                                        });
                                        z110 = i46;
                                        lVar8 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    }
                                    lazyListState.g(lVar8, interfaceC0988x3.S0(), z110);
                                    return lVar8;
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                        };
                        c1086g = c1086gP;
                        c1086g.E(objF4);
                    } else {
                        final C0945e.l lVar8 = lVar4;
                        cVar2 = cVar3;
                        final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a4 = c0130a;
                        bVar4 = bVar3;
                        lVar5 = lVar8;
                        final C0945e.InterfaceC0129e interfaceC0129e6 = interfaceC0129e2;
                        c0153a2 = c0153a;
                        i32 = i31;
                        objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                            /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.p
                            public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                                int i314;
                                float fMo1getSpacingD9Ej5fM;
                                long j;
                                int i40;
                                m mVar;
                                int i41;
                                m mVar2;
                                int i42;
                                List arrayList;
                                int i43;
                                int i44;
                                ArrayList arrayList2;
                                boolean z19;
                                List arrayList3;
                                int i45;
                                int i46;
                                final j jVar2;
                                Integer numValueOf;
                                Integer numValueOf2;
                                boolean z110;
                                l lVar9;
                                int[] iArr;
                                int i47;
                                m mVar3;
                                float f10;
                                int i48;
                                m mVar4;
                                Object obj;
                                int i49;
                                Object obj2;
                                int index;
                                int iMin;
                                m mVar5;
                                Object obj3;
                                int i50;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                final long j10 = aVar.f20475a;
                                lazyListState.f10367r.getValue();
                                boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                                Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                                int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE3 = interfaceC0988x2.e1(l10.d());
                                int iE4 = interfaceC0988x2.e1(l10.a());
                                final int i51 = iE3 + iE4;
                                final int i52 = iE1 + iE2;
                                boolean z21 = z11;
                                int i53 = z21 ? i51 : i52;
                                if (z21 && !z10) {
                                    i314 = iE3;
                                } else if (z21 && z10) {
                                    i314 = iE4;
                                } else {
                                    i314 = (z21 || z10) ? iE2 : iE1;
                                }
                                int i54 = i53 - i314;
                                long jI = p013b0.b.i(j10, -i52, -i51);
                                h hVarInvoke = iVar.invoke();
                                c cVarH = hVarInvoke.h();
                                int iH = p013b0.a.h(jI);
                                int iG = p013b0.a.g(jI);
                                cVarH.f10386a.m(iH);
                                cVarH.f10387b.m(iG);
                                if (z11) {
                                    C0945e.l lVar10 = lVar8;
                                    if (lVar10 == null) {
                                        p245u.c.b("null verticalArrangement when isVertical == true");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = lVar10.mo1getSpacingD9Ej5fM();
                                } else {
                                    C0945e.InterfaceC0129e interfaceC0129e7 = interfaceC0129e6;
                                    if (interfaceC0129e7 == null) {
                                        p245u.c.b("null horizontalAlignment when isVertical == false");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = interfaceC0129e7.mo1getSpacingD9Ej5fM();
                                }
                                int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                                int iB = hVarInvoke.b();
                                int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                                boolean z22 = z10;
                                if (!z22 || iG2 > 0) {
                                    j = ((long) iE1) << 32;
                                } else {
                                    boolean z23 = z11;
                                    if (!z23) {
                                        iE1 += iG2;
                                    }
                                    if (z23) {
                                        iE3 += iG2;
                                    }
                                    j = ((long) iE1) << 32;
                                }
                                int i55 = iG2;
                                int i56 = i314;
                                final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                                j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                                LazyListState lazyListState3 = lazyListState;
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    int iH2 = lazyListState3.h();
                                    q qVar = lazyListState3.f10354d;
                                    int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                    if (iH2 != iK) {
                                        ((C1081d0) qVar.f10774b).m(iK);
                                        ((D) qVar.f10777e).e(iH2);
                                    }
                                    int i57 = lazyListState3.i();
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    LazyListState lazyListState4 = lazyListState;
                                    List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                    float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                    boolean z24 = z11;
                                    C0945e.l lVar11 = lVar8;
                                    C0945e.InterfaceC0129e interfaceC0129e8 = interfaceC0129e6;
                                    boolean z25 = z10;
                                    LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                    int i58 = i31;
                                    boolean zS0 = interfaceC0988x3.S0();
                                    LazyListState lazyListState5 = lazyListState;
                                    l lVar12 = lazyListState5.f10353c;
                                    A a11 = a10;
                                    int i59 = i57;
                                    S s11 = s10;
                                    androidx.compose.foundation.lazy.layout.X x10 = c0130a4;
                                    l lVar13 = lVar12;
                                    Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // Ia.q
                                        public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar14) {
                                            int iIntValue = num.intValue();
                                            int iIntValue2 = num2.intValue();
                                            return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar14);
                                        }
                                    };
                                    int i60 = i56;
                                    if (i60 < 0) {
                                        p245u.c.a("invalid beforeContentPadding");
                                    }
                                    if (i54 < 0) {
                                        p245u.c.a("invalid afterContentPadding");
                                    }
                                    if (iB <= 0) {
                                        int iJ = p013b0.a.j(jI);
                                        int i61 = p013b0.a.i(jI);
                                        lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                        if (!zS0) {
                                            long jB = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB, 0L)) {
                                                int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                                i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                                iJ = iG3;
                                            }
                                        }
                                        lVar9 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                            @Override // Ia.l
                                            public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                                return p293xa.r.f47939a;
                                            }
                                        }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                        z110 = 0;
                                    } else {
                                        long j11 = jI;
                                        boolean z26 = zS0;
                                        int i62 = iB;
                                        if (iK >= i62) {
                                            iK = i62 - 1;
                                            i59 = 0;
                                        }
                                        int iRound = Math.round(fFloatValue);
                                        int i63 = i59 - iRound;
                                        if (iK == 0 && i63 < 0) {
                                            iRound += i63;
                                            i63 = 0;
                                        }
                                        kotlin.collections.i iVar2 = new kotlin.collections.i();
                                        int i64 = -i60;
                                        int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                        int i66 = i63 + i65;
                                        int iMax = 0;
                                        int i67 = iK;
                                        while (i66 < 0 && i67 > 0) {
                                            long j12 = j11;
                                            int i68 = i67 - 1;
                                            m mVarC = n.c(jVar3, i68);
                                            iVar2.add(0, mVarC);
                                            iMax = Math.max(iMax, mVarC.f10764t);
                                            i66 += mVarC.f10763s;
                                            i67 = i68;
                                            j11 = j12;
                                        }
                                        long j13 = j11;
                                        if (i66 < i65) {
                                            iRound -= i65 - i66;
                                            i66 = i65;
                                        }
                                        int i69 = i66 - i65;
                                        int i70 = i55 + i54;
                                        int i71 = i70 < 0 ? 0 : i70;
                                        int i72 = -i69;
                                        int i73 = iMax;
                                        int i74 = i67;
                                        int i75 = 0;
                                        boolean z27 = false;
                                        while (i75 < iVar2.f43019d) {
                                            if (i72 >= i71) {
                                                iVar2.k(i75);
                                                z27 = true;
                                            } else {
                                                i74++;
                                                i72 += ((m) iVar2.get(i75)).f10763s;
                                                i75++;
                                            }
                                        }
                                        int i76 = i69;
                                        int iMax2 = i73;
                                        boolean z28 = z27;
                                        int i77 = i74;
                                        while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                            int i78 = i71;
                                            m mVarC2 = n.c(jVar3, i77);
                                            l lVar14 = lVar13;
                                            int i79 = mVarC2.f10763s;
                                            int i80 = i72 + i79;
                                            if (i80 > i65 || i77 == i62 - 1) {
                                                iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                                iVar2.addLast(mVarC2);
                                                i50 = 1;
                                            } else {
                                                i76 -= i79;
                                                i67 = i77 + 1;
                                                i50 = 1;
                                                z28 = true;
                                            }
                                            i77 += i50;
                                            lVar13 = lVar14;
                                            i71 = i78;
                                            i72 = i80;
                                        }
                                        l lVar15 = lVar13;
                                        if (i72 < i55) {
                                            int i81 = i55 - i72;
                                            i76 -= i81;
                                            i72 += i81;
                                            while (i76 < i60 && i67 > 0) {
                                                int i82 = i67 - 1;
                                                m mVarC3 = n.c(jVar3, i82);
                                                i67 = i82;
                                                iVar2.add(0, mVarC3);
                                                iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                                i76 += mVarC3.f10763s;
                                            }
                                            int i83 = i81 + iRound;
                                            if (i76 < 0) {
                                                i72 += i76;
                                                i40 = i83 + i76;
                                                i76 = 0;
                                            } else {
                                                i40 = i83;
                                            }
                                        } else {
                                            i40 = iRound;
                                        }
                                        int i84 = i72;
                                        float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                        float f12 = fFloatValue - f11;
                                        float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                        if (i76 < 0) {
                                            p245u.c.a("negative currentFirstItemScrollOffset");
                                        }
                                        int i85 = -i76;
                                        m mVar6 = (m) iVar2.first();
                                        if (i60 > 0 || iE5 < 0) {
                                            int iE = iVar2.e();
                                            int i86 = i76;
                                            int i87 = 0;
                                            while (true) {
                                                if (i87 >= iE) {
                                                    mVar = mVar6;
                                                    break;
                                                }
                                                mVar = mVar6;
                                                int i88 = ((m) iVar2.get(i87)).f10763s;
                                                if (i86 == 0 || i88 > i86) {
                                                    break;
                                                }
                                                int i89 = iE;
                                                if (i87 == kotlin.collections.l.r(iVar2)) {
                                                    break;
                                                }
                                                i86 -= i88;
                                                i87++;
                                                mVar6 = (m) iVar2.get(i87);
                                                iE = i89;
                                            }
                                            m mVar7 = mVar;
                                            i41 = i86;
                                            mVar2 = mVar7;
                                        } else {
                                            mVar2 = mVar6;
                                            i41 = i76;
                                        }
                                        int iMax3 = Math.max(0, i67 - i58);
                                        int i90 = i67 - 1;
                                        if (iMax3 <= i90) {
                                            arrayList = null;
                                            while (true) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                i42 = i60;
                                                arrayList.add(n.c(jVar3, i90));
                                                if (i90 == iMax3) {
                                                    break;
                                                }
                                                i90--;
                                                i60 = i42;
                                            }
                                        } else {
                                            i42 = i60;
                                            arrayList = null;
                                        }
                                        List<Integer> list = listA;
                                        int size = list.size() - 1;
                                        float f14 = f13;
                                        if (size >= 0) {
                                            int i91 = size;
                                            while (true) {
                                                int i92 = i91 - 1;
                                                int iIntValue = listA.get(i91).intValue();
                                                if (iIntValue < iMax3) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(n.c(jVar3, iIntValue));
                                                }
                                                if (i92 < 0) {
                                                    break;
                                                }
                                                i91 = i92;
                                            }
                                        }
                                        if (arrayList == null) {
                                            arrayList = EmptyList.f42983b;
                                        }
                                        int iMax4 = iMax2;
                                        int i93 = 0;
                                        for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                            iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                            i93++;
                                        }
                                        int i94 = iMax4;
                                        int i95 = i62 - 1;
                                        int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                        int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                        if (i96 <= iMin2) {
                                            ArrayList arrayList4 = null;
                                            while (true) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                i44 = i77;
                                                arrayList2 = arrayList4;
                                                i43 = i85;
                                                arrayList2.add(n.c(jVar3, i96));
                                                if (i96 == iMin2) {
                                                    break;
                                                }
                                                i96++;
                                                i85 = i43;
                                                arrayList4 = arrayList2;
                                                i77 = i44;
                                            }
                                        } else {
                                            i43 = i85;
                                            i44 = i77;
                                            arrayList2 = null;
                                        }
                                        if (!z26 || lVar15 == null || lVar15.f().isEmpty()) {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList2;
                                        } else {
                                            List<m> listF = lVar15.f();
                                            int size3 = listF.size() - 1;
                                            ArrayList arrayList5 = arrayList2;
                                            int i97 = -1;
                                            while (true) {
                                                if (i97 >= size3) {
                                                    mVar3 = null;
                                                    break;
                                                }
                                                if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                    mVar3 = listF.get(size3);
                                                    break;
                                                }
                                                i97 = -1;
                                                size3--;
                                            }
                                            g gVar = (g) kotlin.collections.q.V(lVar15.f());
                                            if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                                arrayList3 = arrayList5;
                                                while (true) {
                                                    z19 = z26;
                                                    if (arrayList3 != null) {
                                                        int size4 = arrayList3.size();
                                                        int i98 = 0;
                                                        while (true) {
                                                            if (i98 >= size4) {
                                                                obj3 = null;
                                                                break;
                                                            }
                                                            obj3 = arrayList3.get(i98);
                                                            int i99 = size4;
                                                            if (((m) obj3).f10746a == index) {
                                                                break;
                                                            }
                                                            i98++;
                                                            size4 = i99;
                                                        }
                                                        mVar5 = (m) obj3;
                                                    } else {
                                                        mVar5 = null;
                                                    }
                                                    if (mVar5 == null) {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index));
                                                    }
                                                    if (index == iMin) {
                                                        break;
                                                    }
                                                    index++;
                                                    z26 = z19;
                                                    i84 = i84;
                                                }
                                            } else {
                                                z19 = z26;
                                                i84 = i84;
                                                arrayList3 = arrayList5;
                                            }
                                            float offset = ((lVar15.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                            if (offset > 0.0f) {
                                                int index2 = gVar.getIndex() + 1;
                                                int i100 = 0;
                                                while (index2 < i62 && i100 < offset) {
                                                    if (index2 <= iMin2) {
                                                        int iE6 = iVar2.e();
                                                        int i101 = 0;
                                                        while (true) {
                                                            if (i101 >= iE6) {
                                                                f10 = offset;
                                                                obj2 = null;
                                                                break;
                                                            }
                                                            obj2 = iVar2.get(i101);
                                                            f10 = offset;
                                                            if (((m) obj2).f10746a == index2) {
                                                                break;
                                                            }
                                                            i101++;
                                                            offset = f10;
                                                        }
                                                        mVar4 = (m) obj2;
                                                        i48 = 1;
                                                    } else {
                                                        f10 = offset;
                                                        if (arrayList3 != null) {
                                                            int size5 = arrayList3.size();
                                                            int i102 = 0;
                                                            while (true) {
                                                                if (i102 >= size5) {
                                                                    i48 = 1;
                                                                    obj = null;
                                                                    break;
                                                                }
                                                                obj = arrayList3.get(i102);
                                                                int i103 = size5;
                                                                if (((m) obj).f10746a == index2) {
                                                                    i48 = 1;
                                                                    break;
                                                                }
                                                                i102++;
                                                                size5 = i103;
                                                            }
                                                            mVar4 = (m) obj;
                                                        } else {
                                                            i48 = 1;
                                                            mVar4 = null;
                                                        }
                                                    }
                                                    if (mVar4 != null) {
                                                        index2 += i48;
                                                        i49 = mVar4.f10763s;
                                                    } else {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index2));
                                                        index2++;
                                                        i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                    }
                                                    i100 += i49;
                                                    offset = f10;
                                                }
                                            }
                                        }
                                        if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                            iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                        }
                                        int size6 = list.size();
                                        for (int i104 = 0; i104 < size6; i104++) {
                                            int iIntValue2 = listA.get(i104).intValue();
                                            if (iIntValue2 > iMin2) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, iIntValue2));
                                            }
                                        }
                                        if (arrayList3 == null) {
                                            arrayList3 = EmptyList.f42983b;
                                        }
                                        int size7 = arrayList3.size();
                                        int iMax5 = i94;
                                        for (int i105 = 0; i105 < size7; i105++) {
                                            iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                        }
                                        boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                        int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                        if (z24) {
                                            iMax5 = i84;
                                        }
                                        int iF = p013b0.b.f(iMax5, j13);
                                        int i106 = z24 ? iF : iG4;
                                        int i107 = i84;
                                        boolean z30 = i107 < Math.min(i106, i55);
                                        if (z30 && i43 != 0) {
                                            p245u.c.c("non-zero itemsScrollOffset");
                                        }
                                        m mVar8 = mVar2;
                                        final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                        if (z30) {
                                            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                                p245u.c.a("no extra items");
                                            }
                                            int iE7 = iVar2.e();
                                            int[] iArr2 = new int[iE7];
                                            for (int i108 = 0; i108 < iE7; i108++) {
                                                iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                            }
                                            int[] iArr3 = new int[iE7];
                                            if (z24) {
                                                if (lVar11 == null) {
                                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                                    throw new KotlinNothingValueException();
                                                }
                                                lVar11.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                                iArr = iArr3;
                                                i45 = i55;
                                                i47 = 0;
                                                jVar2 = jVar3;
                                            } else {
                                                if (interfaceC0129e8 == null) {
                                                    p245u.c.b("null horizontalArrangement when isVertical == false");
                                                    throw new KotlinNothingValueException();
                                                }
                                                interfaceC0988x3 = interfaceC0988x3;
                                                iArr = iArr3;
                                                i45 = i55;
                                                jVar2 = jVar3;
                                                i47 = 0;
                                                interfaceC0129e8.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                            }
                                            Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                            Na.g gVarH = iVarQ;
                                            if (z25) {
                                                gVarH = Na.l.H(iVarQ);
                                            }
                                            int i109 = gVarH.f4687b;
                                            int i110 = gVarH.f4688c;
                                            int i111 = gVarH.f4689d;
                                            if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                                while (true) {
                                                    int i112 = iArr[i109];
                                                    m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                    if (z25) {
                                                        i112 = (i106 - i112) - mVar9.f10761q;
                                                    }
                                                    mVar9.k(i112, iG4, iF);
                                                    arrayList6.add(mVar9);
                                                    if (i109 == i110) {
                                                        break;
                                                    }
                                                    i109 += i111;
                                                }
                                            }
                                            i46 = i47;
                                        } else {
                                            i45 = i55;
                                            j13 = j13;
                                            i62 = i62;
                                            i42 = i42;
                                            i46 = 0;
                                            jVar2 = jVar3;
                                            i107 = i107;
                                            int size8 = arrayList.size();
                                            int i113 = i43;
                                            for (int i114 = 0; i114 < size8; i114++) {
                                                m mVar10 = (m) arrayList.get(i114);
                                                i113 -= mVar10.f10763s;
                                                mVar10.k(i113, iG4, iF);
                                                arrayList6.add(mVar10);
                                            }
                                            int iE8 = iVar2.e();
                                            int i115 = i43;
                                            for (int i116 = 0; i116 < iE8; i116++) {
                                                m mVar11 = (m) iVar2.get(i116);
                                                mVar11.k(i115, iG4, iF);
                                                arrayList6.add(mVar11);
                                                i115 += mVar11.f10763s;
                                            }
                                            int size9 = arrayList3.size();
                                            for (int i117 = 0; i117 < size9; i117++) {
                                                m mVar12 = (m) arrayList3.get(i117);
                                                mVar12.k(i115, iG4, iF);
                                                arrayList6.add(mVar12);
                                                i115 += mVar12.f10763s;
                                            }
                                        }
                                        h hVar2 = jVar2.f10770a;
                                        lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                        if (!z19) {
                                            long jB2 = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB2, 0L)) {
                                                int i118 = z24 ? iF : iG4;
                                                long j14 = j13;
                                                iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                                iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                                int i119 = z24 ? iF : iG4;
                                                if (i119 != i118) {
                                                    int size10 = arrayList6.size();
                                                    for (int i120 = i46; i120 < size10; i120++) {
                                                        m mVar13 = (m) arrayList6.get(i120);
                                                        mVar13.f10766v = i119;
                                                        mVar13.f10768x = mVar13.f10754i + i119;
                                                    }
                                                }
                                            }
                                        }
                                        final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final m invoke(Integer num) {
                                                return n.c(jVar2, num.intValue());
                                            }
                                        });
                                        if (z29) {
                                            m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                            if (mVar14 != null) {
                                                numValueOf = Integer.valueOf(mVar14.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else {
                                            m mVar15 = (m) iVar2.A();
                                            if (mVar15 != null) {
                                                numValueOf = Integer.valueOf(mVar15.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        }
                                        if (z29) {
                                            m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                            if (mVar16 != null) {
                                                numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        } else {
                                            m mVar17 = (m) iVar2.C();
                                            if (mVar17 != null) {
                                                numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        }
                                        boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                        Integer numValueOf3 = Integer.valueOf(iG4);
                                        Integer numValueOf4 = Integer.valueOf(iF);
                                        final X x11 = lazyListState5.f10370u;
                                        final boolean z32 = z19;
                                        F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Y.a aVar2) {
                                                Y.a aVar3 = aVar2;
                                                final List<m> list2 = arrayList6;
                                                final List<m> list3 = listD;
                                                final boolean z33 = z32;
                                                Ia.l<Y.a, p293xa.r> lVar16 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(Y.a aVar4) {
                                                        Y.a aVar5 = aVar4;
                                                        List<m> list4 = list2;
                                                        boolean z34 = z33;
                                                        int size11 = list4.size();
                                                        for (int i121 = 0; i121 < size11; i121++) {
                                                            list4.get(i121).e(aVar5, z34);
                                                        }
                                                        List<m> list5 = list3;
                                                        boolean z35 = z33;
                                                        int size12 = list5.size();
                                                        for (int i122 = 0; i122 < size12; i122++) {
                                                            list5.get(i122).e(aVar5, z35);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                aVar3.f14225a = true;
                                                lVar16.invoke(aVar3);
                                                aVar3.f14225a = false;
                                                x11.getValue();
                                                return p293xa.r.f47939a;
                                            }
                                        });
                                        z110 = i46;
                                        lVar9 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    }
                                    lazyListState.g(lVar9, interfaceC0988x3.S0(), z110);
                                    return lVar9;
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                        };
                        c1086g = c1086gP;
                        c1086g.E(objF4);
                    }
                    Ia.p pVar2 = (Ia.p) objF4;
                    if (z11) {
                        orientation = Orientation.f9957b;
                    } else {
                        orientation = Orientation.f9958c;
                    }
                    orientation2 = orientation;
                    if (z12) {
                        c1086g.L(-1513147781);
                        i33 = i30 | ((i21 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        lazyListState2 = lazyListState;
                        if (((i33 & 14) ^ 6) <= 4) {
                        }
                        z13 = ((i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 ? false : false;
                        z17 = z18 | z13;
                        objF5 = c1086g.f();
                        if (z17) {
                            objF5 = new e(lazyListState2, i32);
                            c1086g.E(objF5);
                        } else {
                            objF5 = new e(lazyListState2, i32);
                            c1086g.E(objF5);
                        }
                        hVarA = C0974i.a((e) objF5, lazyListState2.f10363n, z10, orientation2);
                        c1086g.T(false);
                    } else {
                        lazyListState2 = lazyListState;
                        c1086g.L(-1512720880);
                        c1086g.T(false);
                        hVarA = androidx.compose.ui.h.a.f13984b;
                    }
                    LazyLayoutKt.a(iVar, K.a(N.a(hVar.i(lazyListState2.f10360k).i(lazyListState2.f10361l), iVar, m10, orientation2, z12, z10).i(hVarA).i(lazyListState2.f10362m.f10635k), lazyListState, orientation2, z12, z10, jVar, lazyListState2.f10356f, false, e10, null), lazyListState2.f10364o, pVar2, c1086g, 0, 0);
                    lVar3 = lVar5;
                    i28 = i32;
                    bVar2 = bVar4;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    i28 = i10;
                    bVar2 = bVar;
                    lVar3 = lVar;
                    cVar2 = cVar;
                    interfaceC0129e2 = interfaceC0129e;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.d.c cVar8 = cVar2;
                    final C0945e.InterfaceC0129e interfaceC0129e7 = interfaceC0129e2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyListKt.a(hVar, lazyListState, l10, z10, z11, jVar, z12, e10, i28, bVar2, lVar3, cVar8, interfaceC0129e7, lVar2, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 12582912;
            i17 = i13 & 256;
            if (i17 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.h(i10)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i14 |= i18;
            }
            i19 = i13 & 512;
            if (i19 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.K(bVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i14 |= i20;
            }
            i21 = i14;
            i22 = i13 & 1024;
            if (i22 != 0) {
                i23 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c1086gP.K(lVar)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i12 | i24;
            } else {
                i23 = i12;
            }
            i25 = i13 & 2048;
            if (i25 != 0) {
                i23 |= 48;
            } else if ((i12 & 48) == 0) {
                i23 |= c1086gP.K(cVar) ? 32 : 16;
            }
            i26 = i23;
            i27 = i13 & 4096;
            if (i27 != 0) {
                if ((i12 & 384) == 0) {
                    i26 |= c1086gP.K(interfaceC0129e) ? 256 : 128;
                }
                if ((i13 & 8192) != 0) {
                    i26 |= 3072;
                } else if ((i12 & 3072) == 0) {
                    i26 |= c1086gP.k(lVar2) ? 2048 : 1024;
                }
                z13 = true;
                if ((i21 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c1086gP.C(i21 & 1, z14)) {
                    if (i17 != 0) {
                        i29 = 0;
                    } else {
                        i29 = i10;
                    }
                    if (i19 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i22 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i25 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i27 != 0) {
                        interfaceC0129e2 = null;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    i30 = (i21 >> 3) & 14;
                    int i314 = i30 | ((i26 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    xI = J0.i(lVar2, c1086gP);
                    if (((i314 & 14) ^ 6) <= 4) {
                    }
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (z15) {
                        final c cVar9 = new c();
                        cVar9.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                        cVar9.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                        C1108r0 c1108r3 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE4 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyListIntervalContent invoke() {
                                return new LazyListIntervalContent(xI.getValue());
                            }
                        }, c1108r3);
                        objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final i invoke() {
                                LazyListIntervalContent value = derivedSnapshotStateE4.getValue();
                                return new i(lazyListState, value, cVar9, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                            }
                        }, c1108r3), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF);
                    } else {
                        final c cVar10 = new c();
                        cVar10.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                        cVar10.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                        C1108r0 c1108r4 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE5 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyListIntervalContent invoke() {
                                return new LazyListIntervalContent(xI.getValue());
                            }
                        }, c1108r4);
                        objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final i invoke() {
                                LazyListIntervalContent value = derivedSnapshotStateE5.getValue();
                                return new i(lazyListState, value, cVar10, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                            }
                        }, c1108r4), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF);
                    }
                    iVar = (Oa.i) objF;
                    int i315 = i21 >> 9;
                    int i316 = i30 | (i315 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    i31 = i29;
                    if (((i316 & 14) ^ 6) <= 4) {
                    }
                    z16 = ((((i316 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.c(z11)) || (i316 & 48) == 32) | ((((i316 & 14) ^ 6) <= 4 && c1086gP.K(lazyListState)) || (i316 & 6) == 4);
                    objF2 = c1086gP.f();
                    if (z16) {
                        objF2 = new d(lazyListState, z11);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new d(lazyListState, z11);
                        c1086gP.E(objF2);
                    }
                    M m11 = (M) objF2;
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF3);
                    }
                    a10 = (A) objF3;
                    s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                    if (((Boolean) c1086gP.x(CompositionLocalsKt.f14860v)).booleanValue()) {
                        c0130a = androidx.compose.foundation.lazy.layout.X.a.f10698a;
                    } else {
                        c0130a = null;
                    }
                    int i317 = i26 << 18;
                    int i318 = (i21 & 65520) | (i315 & 458752) | (i315 & 3670016) | (i317 & 29360128) | (i317 & 234881024) | ((i26 << 27) & 1879048192);
                    if (((i318 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32) {
                    }
                    zK = ((((i318 & 896) ^ 384) <= 256 && c1086gP.K(l10)) || (i318 & 384) == 256) | ((((i318 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lazyListState)) || (i318 & 48) == 32) | ((((i318 & 7168) ^ 3072) <= 2048 && c1086gP.c(z10)) || (i318 & 3072) == 2048) | ((((57344 & i318) ^ 24576) <= 16384 && c1086gP.c(z11)) || (i318 & 24576) == 16384) | ((((3670016 & i318) ^ 1572864) <= 1048576 && c1086gP.K(bVar3)) || (i318 & 1572864) == 1048576) | ((((29360128 & i318) ^ 12582912) <= 8388608 && c1086gP.K(cVar3)) || (i318 & 12582912) == 8388608) | ((((234881024 & i318) ^ 100663296) <= 67108864 && c1086gP.K(interfaceC0129e2)) || (i318 & 100663296) == 67108864) | ((((1879048192 & i318) ^ 805306368) <= 536870912 && c1086gP.K(lVar4)) || (i318 & 805306368) == 536870912) | c1086gP.K(s10) | c1086gP.K(c0130a);
                    objF4 = c1086gP.f();
                    if (zK) {
                        final C0945e.l lVar9 = lVar4;
                        cVar2 = cVar3;
                        final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a5 = c0130a;
                        bVar4 = bVar3;
                        lVar5 = lVar9;
                        final C0945e.InterfaceC0129e interfaceC0129e8 = interfaceC0129e2;
                        c0153a2 = c0153a;
                        i32 = i31;
                        objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                            /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.p
                            public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                                int i319;
                                float fMo1getSpacingD9Ej5fM;
                                long j;
                                int i40;
                                m mVar;
                                int i41;
                                m mVar2;
                                int i42;
                                List arrayList;
                                int i43;
                                int i44;
                                ArrayList arrayList2;
                                boolean z19;
                                List arrayList3;
                                int i45;
                                int i46;
                                final j jVar2;
                                Integer numValueOf;
                                Integer numValueOf2;
                                boolean z110;
                                l lVar10;
                                int[] iArr;
                                int i47;
                                m mVar3;
                                float f10;
                                int i48;
                                m mVar4;
                                Object obj;
                                int i49;
                                Object obj2;
                                int index;
                                int iMin;
                                m mVar5;
                                Object obj3;
                                int i50;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                final long j10 = aVar.f20475a;
                                lazyListState.f10367r.getValue();
                                boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                                Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                                int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE3 = interfaceC0988x2.e1(l10.d());
                                int iE4 = interfaceC0988x2.e1(l10.a());
                                final int i51 = iE3 + iE4;
                                final int i52 = iE1 + iE2;
                                boolean z21 = z11;
                                int i53 = z21 ? i51 : i52;
                                if (z21 && !z10) {
                                    i319 = iE3;
                                } else if (z21 && z10) {
                                    i319 = iE4;
                                } else {
                                    i319 = (z21 || z10) ? iE2 : iE1;
                                }
                                int i54 = i53 - i319;
                                long jI = p013b0.b.i(j10, -i52, -i51);
                                h hVarInvoke = iVar.invoke();
                                c cVarH = hVarInvoke.h();
                                int iH = p013b0.a.h(jI);
                                int iG = p013b0.a.g(jI);
                                cVarH.f10386a.m(iH);
                                cVarH.f10387b.m(iG);
                                if (z11) {
                                    C0945e.l lVar11 = lVar9;
                                    if (lVar11 == null) {
                                        p245u.c.b("null verticalArrangement when isVertical == true");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = lVar11.mo1getSpacingD9Ej5fM();
                                } else {
                                    C0945e.InterfaceC0129e interfaceC0129e9 = interfaceC0129e8;
                                    if (interfaceC0129e9 == null) {
                                        p245u.c.b("null horizontalAlignment when isVertical == false");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = interfaceC0129e9.mo1getSpacingD9Ej5fM();
                                }
                                int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                                int iB = hVarInvoke.b();
                                int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                                boolean z22 = z10;
                                if (!z22 || iG2 > 0) {
                                    j = ((long) iE1) << 32;
                                } else {
                                    boolean z23 = z11;
                                    if (!z23) {
                                        iE1 += iG2;
                                    }
                                    if (z23) {
                                        iE3 += iG2;
                                    }
                                    j = ((long) iE1) << 32;
                                }
                                int i55 = iG2;
                                int i56 = i319;
                                final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                                j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                                LazyListState lazyListState3 = lazyListState;
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    int iH2 = lazyListState3.h();
                                    q qVar = lazyListState3.f10354d;
                                    int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                    if (iH2 != iK) {
                                        ((C1081d0) qVar.f10774b).m(iK);
                                        ((D) qVar.f10777e).e(iH2);
                                    }
                                    int i57 = lazyListState3.i();
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    LazyListState lazyListState4 = lazyListState;
                                    List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                    float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                    boolean z24 = z11;
                                    C0945e.l lVar12 = lVar9;
                                    C0945e.InterfaceC0129e interfaceC0129e10 = interfaceC0129e8;
                                    boolean z25 = z10;
                                    LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                    int i58 = i31;
                                    boolean zS0 = interfaceC0988x3.S0();
                                    LazyListState lazyListState5 = lazyListState;
                                    l lVar13 = lazyListState5.f10353c;
                                    A a11 = a10;
                                    int i59 = i57;
                                    S s11 = s10;
                                    androidx.compose.foundation.lazy.layout.X x10 = c0130a5;
                                    l lVar14 = lVar13;
                                    Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // Ia.q
                                        public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar15) {
                                            int iIntValue = num.intValue();
                                            int iIntValue2 = num2.intValue();
                                            return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar15);
                                        }
                                    };
                                    int i60 = i56;
                                    if (i60 < 0) {
                                        p245u.c.a("invalid beforeContentPadding");
                                    }
                                    if (i54 < 0) {
                                        p245u.c.a("invalid afterContentPadding");
                                    }
                                    if (iB <= 0) {
                                        int iJ = p013b0.a.j(jI);
                                        int i61 = p013b0.a.i(jI);
                                        lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                        if (!zS0) {
                                            long jB = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB, 0L)) {
                                                int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                                i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                                iJ = iG3;
                                            }
                                        }
                                        lVar10 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                            @Override // Ia.l
                                            public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                                return p293xa.r.f47939a;
                                            }
                                        }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                        z110 = 0;
                                    } else {
                                        long j11 = jI;
                                        boolean z26 = zS0;
                                        int i62 = iB;
                                        if (iK >= i62) {
                                            iK = i62 - 1;
                                            i59 = 0;
                                        }
                                        int iRound = Math.round(fFloatValue);
                                        int i63 = i59 - iRound;
                                        if (iK == 0 && i63 < 0) {
                                            iRound += i63;
                                            i63 = 0;
                                        }
                                        kotlin.collections.i iVar2 = new kotlin.collections.i();
                                        int i64 = -i60;
                                        int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                        int i66 = i63 + i65;
                                        int iMax = 0;
                                        int i67 = iK;
                                        while (i66 < 0 && i67 > 0) {
                                            long j12 = j11;
                                            int i68 = i67 - 1;
                                            m mVarC = n.c(jVar3, i68);
                                            iVar2.add(0, mVarC);
                                            iMax = Math.max(iMax, mVarC.f10764t);
                                            i66 += mVarC.f10763s;
                                            i67 = i68;
                                            j11 = j12;
                                        }
                                        long j13 = j11;
                                        if (i66 < i65) {
                                            iRound -= i65 - i66;
                                            i66 = i65;
                                        }
                                        int i69 = i66 - i65;
                                        int i70 = i55 + i54;
                                        int i71 = i70 < 0 ? 0 : i70;
                                        int i72 = -i69;
                                        int i73 = iMax;
                                        int i74 = i67;
                                        int i75 = 0;
                                        boolean z27 = false;
                                        while (i75 < iVar2.f43019d) {
                                            if (i72 >= i71) {
                                                iVar2.k(i75);
                                                z27 = true;
                                            } else {
                                                i74++;
                                                i72 += ((m) iVar2.get(i75)).f10763s;
                                                i75++;
                                            }
                                        }
                                        int i76 = i69;
                                        int iMax2 = i73;
                                        boolean z28 = z27;
                                        int i77 = i74;
                                        while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                            int i78 = i71;
                                            m mVarC2 = n.c(jVar3, i77);
                                            l lVar15 = lVar14;
                                            int i79 = mVarC2.f10763s;
                                            int i80 = i72 + i79;
                                            if (i80 > i65 || i77 == i62 - 1) {
                                                iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                                iVar2.addLast(mVarC2);
                                                i50 = 1;
                                            } else {
                                                i76 -= i79;
                                                i67 = i77 + 1;
                                                i50 = 1;
                                                z28 = true;
                                            }
                                            i77 += i50;
                                            lVar14 = lVar15;
                                            i71 = i78;
                                            i72 = i80;
                                        }
                                        l lVar16 = lVar14;
                                        if (i72 < i55) {
                                            int i81 = i55 - i72;
                                            i76 -= i81;
                                            i72 += i81;
                                            while (i76 < i60 && i67 > 0) {
                                                int i82 = i67 - 1;
                                                m mVarC3 = n.c(jVar3, i82);
                                                i67 = i82;
                                                iVar2.add(0, mVarC3);
                                                iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                                i76 += mVarC3.f10763s;
                                            }
                                            int i83 = i81 + iRound;
                                            if (i76 < 0) {
                                                i72 += i76;
                                                i40 = i83 + i76;
                                                i76 = 0;
                                            } else {
                                                i40 = i83;
                                            }
                                        } else {
                                            i40 = iRound;
                                        }
                                        int i84 = i72;
                                        float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                        float f12 = fFloatValue - f11;
                                        float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                        if (i76 < 0) {
                                            p245u.c.a("negative currentFirstItemScrollOffset");
                                        }
                                        int i85 = -i76;
                                        m mVar6 = (m) iVar2.first();
                                        if (i60 > 0 || iE5 < 0) {
                                            int iE = iVar2.e();
                                            int i86 = i76;
                                            int i87 = 0;
                                            while (true) {
                                                if (i87 >= iE) {
                                                    mVar = mVar6;
                                                    break;
                                                }
                                                mVar = mVar6;
                                                int i88 = ((m) iVar2.get(i87)).f10763s;
                                                if (i86 == 0 || i88 > i86) {
                                                    break;
                                                }
                                                int i89 = iE;
                                                if (i87 == kotlin.collections.l.r(iVar2)) {
                                                    break;
                                                }
                                                i86 -= i88;
                                                i87++;
                                                mVar6 = (m) iVar2.get(i87);
                                                iE = i89;
                                            }
                                            m mVar7 = mVar;
                                            i41 = i86;
                                            mVar2 = mVar7;
                                        } else {
                                            mVar2 = mVar6;
                                            i41 = i76;
                                        }
                                        int iMax3 = Math.max(0, i67 - i58);
                                        int i90 = i67 - 1;
                                        if (iMax3 <= i90) {
                                            arrayList = null;
                                            while (true) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                i42 = i60;
                                                arrayList.add(n.c(jVar3, i90));
                                                if (i90 == iMax3) {
                                                    break;
                                                }
                                                i90--;
                                                i60 = i42;
                                            }
                                        } else {
                                            i42 = i60;
                                            arrayList = null;
                                        }
                                        List<Integer> list = listA;
                                        int size = list.size() - 1;
                                        float f14 = f13;
                                        if (size >= 0) {
                                            int i91 = size;
                                            while (true) {
                                                int i92 = i91 - 1;
                                                int iIntValue = listA.get(i91).intValue();
                                                if (iIntValue < iMax3) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(n.c(jVar3, iIntValue));
                                                }
                                                if (i92 < 0) {
                                                    break;
                                                }
                                                i91 = i92;
                                            }
                                        }
                                        if (arrayList == null) {
                                            arrayList = EmptyList.f42983b;
                                        }
                                        int iMax4 = iMax2;
                                        int i93 = 0;
                                        for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                            iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                            i93++;
                                        }
                                        int i94 = iMax4;
                                        int i95 = i62 - 1;
                                        int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                        int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                        if (i96 <= iMin2) {
                                            ArrayList arrayList4 = null;
                                            while (true) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                i44 = i77;
                                                arrayList2 = arrayList4;
                                                i43 = i85;
                                                arrayList2.add(n.c(jVar3, i96));
                                                if (i96 == iMin2) {
                                                    break;
                                                }
                                                i96++;
                                                i85 = i43;
                                                arrayList4 = arrayList2;
                                                i77 = i44;
                                            }
                                        } else {
                                            i43 = i85;
                                            i44 = i77;
                                            arrayList2 = null;
                                        }
                                        if (!z26 || lVar16 == null || lVar16.f().isEmpty()) {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList2;
                                        } else {
                                            List<m> listF = lVar16.f();
                                            int size3 = listF.size() - 1;
                                            ArrayList arrayList5 = arrayList2;
                                            int i97 = -1;
                                            while (true) {
                                                if (i97 >= size3) {
                                                    mVar3 = null;
                                                    break;
                                                }
                                                if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                    mVar3 = listF.get(size3);
                                                    break;
                                                }
                                                i97 = -1;
                                                size3--;
                                            }
                                            g gVar = (g) kotlin.collections.q.V(lVar16.f());
                                            if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                                arrayList3 = arrayList5;
                                                while (true) {
                                                    z19 = z26;
                                                    if (arrayList3 != null) {
                                                        int size4 = arrayList3.size();
                                                        int i98 = 0;
                                                        while (true) {
                                                            if (i98 >= size4) {
                                                                obj3 = null;
                                                                break;
                                                            }
                                                            obj3 = arrayList3.get(i98);
                                                            int i99 = size4;
                                                            if (((m) obj3).f10746a == index) {
                                                                break;
                                                            }
                                                            i98++;
                                                            size4 = i99;
                                                        }
                                                        mVar5 = (m) obj3;
                                                    } else {
                                                        mVar5 = null;
                                                    }
                                                    if (mVar5 == null) {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index));
                                                    }
                                                    if (index == iMin) {
                                                        break;
                                                    }
                                                    index++;
                                                    z26 = z19;
                                                    i84 = i84;
                                                }
                                            } else {
                                                z19 = z26;
                                                i84 = i84;
                                                arrayList3 = arrayList5;
                                            }
                                            float offset = ((lVar16.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                            if (offset > 0.0f) {
                                                int index2 = gVar.getIndex() + 1;
                                                int i100 = 0;
                                                while (index2 < i62 && i100 < offset) {
                                                    if (index2 <= iMin2) {
                                                        int iE6 = iVar2.e();
                                                        int i101 = 0;
                                                        while (true) {
                                                            if (i101 >= iE6) {
                                                                f10 = offset;
                                                                obj2 = null;
                                                                break;
                                                            }
                                                            obj2 = iVar2.get(i101);
                                                            f10 = offset;
                                                            if (((m) obj2).f10746a == index2) {
                                                                break;
                                                            }
                                                            i101++;
                                                            offset = f10;
                                                        }
                                                        mVar4 = (m) obj2;
                                                        i48 = 1;
                                                    } else {
                                                        f10 = offset;
                                                        if (arrayList3 != null) {
                                                            int size5 = arrayList3.size();
                                                            int i102 = 0;
                                                            while (true) {
                                                                if (i102 >= size5) {
                                                                    i48 = 1;
                                                                    obj = null;
                                                                    break;
                                                                }
                                                                obj = arrayList3.get(i102);
                                                                int i103 = size5;
                                                                if (((m) obj).f10746a == index2) {
                                                                    i48 = 1;
                                                                    break;
                                                                }
                                                                i102++;
                                                                size5 = i103;
                                                            }
                                                            mVar4 = (m) obj;
                                                        } else {
                                                            i48 = 1;
                                                            mVar4 = null;
                                                        }
                                                    }
                                                    if (mVar4 != null) {
                                                        index2 += i48;
                                                        i49 = mVar4.f10763s;
                                                    } else {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index2));
                                                        index2++;
                                                        i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                    }
                                                    i100 += i49;
                                                    offset = f10;
                                                }
                                            }
                                        }
                                        if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                            iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                        }
                                        int size6 = list.size();
                                        for (int i104 = 0; i104 < size6; i104++) {
                                            int iIntValue2 = listA.get(i104).intValue();
                                            if (iIntValue2 > iMin2) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, iIntValue2));
                                            }
                                        }
                                        if (arrayList3 == null) {
                                            arrayList3 = EmptyList.f42983b;
                                        }
                                        int size7 = arrayList3.size();
                                        int iMax5 = i94;
                                        for (int i105 = 0; i105 < size7; i105++) {
                                            iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                        }
                                        boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                        int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                        if (z24) {
                                            iMax5 = i84;
                                        }
                                        int iF = p013b0.b.f(iMax5, j13);
                                        int i106 = z24 ? iF : iG4;
                                        int i107 = i84;
                                        boolean z30 = i107 < Math.min(i106, i55);
                                        if (z30 && i43 != 0) {
                                            p245u.c.c("non-zero itemsScrollOffset");
                                        }
                                        m mVar8 = mVar2;
                                        final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                        if (z30) {
                                            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                                p245u.c.a("no extra items");
                                            }
                                            int iE7 = iVar2.e();
                                            int[] iArr2 = new int[iE7];
                                            for (int i108 = 0; i108 < iE7; i108++) {
                                                iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                            }
                                            int[] iArr3 = new int[iE7];
                                            if (z24) {
                                                if (lVar12 == null) {
                                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                                    throw new KotlinNothingValueException();
                                                }
                                                lVar12.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                                iArr = iArr3;
                                                i45 = i55;
                                                i47 = 0;
                                                jVar2 = jVar3;
                                            } else {
                                                if (interfaceC0129e10 == null) {
                                                    p245u.c.b("null horizontalArrangement when isVertical == false");
                                                    throw new KotlinNothingValueException();
                                                }
                                                interfaceC0988x3 = interfaceC0988x3;
                                                iArr = iArr3;
                                                i45 = i55;
                                                jVar2 = jVar3;
                                                i47 = 0;
                                                interfaceC0129e10.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                            }
                                            Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                            Na.g gVarH = iVarQ;
                                            if (z25) {
                                                gVarH = Na.l.H(iVarQ);
                                            }
                                            int i109 = gVarH.f4687b;
                                            int i110 = gVarH.f4688c;
                                            int i111 = gVarH.f4689d;
                                            if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                                while (true) {
                                                    int i112 = iArr[i109];
                                                    m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                    if (z25) {
                                                        i112 = (i106 - i112) - mVar9.f10761q;
                                                    }
                                                    mVar9.k(i112, iG4, iF);
                                                    arrayList6.add(mVar9);
                                                    if (i109 == i110) {
                                                        break;
                                                    }
                                                    i109 += i111;
                                                }
                                            }
                                            i46 = i47;
                                        } else {
                                            i45 = i55;
                                            j13 = j13;
                                            i62 = i62;
                                            i42 = i42;
                                            i46 = 0;
                                            jVar2 = jVar3;
                                            i107 = i107;
                                            int size8 = arrayList.size();
                                            int i113 = i43;
                                            for (int i114 = 0; i114 < size8; i114++) {
                                                m mVar10 = (m) arrayList.get(i114);
                                                i113 -= mVar10.f10763s;
                                                mVar10.k(i113, iG4, iF);
                                                arrayList6.add(mVar10);
                                            }
                                            int iE8 = iVar2.e();
                                            int i115 = i43;
                                            for (int i116 = 0; i116 < iE8; i116++) {
                                                m mVar11 = (m) iVar2.get(i116);
                                                mVar11.k(i115, iG4, iF);
                                                arrayList6.add(mVar11);
                                                i115 += mVar11.f10763s;
                                            }
                                            int size9 = arrayList3.size();
                                            for (int i117 = 0; i117 < size9; i117++) {
                                                m mVar12 = (m) arrayList3.get(i117);
                                                mVar12.k(i115, iG4, iF);
                                                arrayList6.add(mVar12);
                                                i115 += mVar12.f10763s;
                                            }
                                        }
                                        h hVar2 = jVar2.f10770a;
                                        lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                        if (!z19) {
                                            long jB2 = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB2, 0L)) {
                                                int i118 = z24 ? iF : iG4;
                                                long j14 = j13;
                                                iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                                iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                                int i119 = z24 ? iF : iG4;
                                                if (i119 != i118) {
                                                    int size10 = arrayList6.size();
                                                    for (int i120 = i46; i120 < size10; i120++) {
                                                        m mVar13 = (m) arrayList6.get(i120);
                                                        mVar13.f10766v = i119;
                                                        mVar13.f10768x = mVar13.f10754i + i119;
                                                    }
                                                }
                                            }
                                        }
                                        final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final m invoke(Integer num) {
                                                return n.c(jVar2, num.intValue());
                                            }
                                        });
                                        if (z29) {
                                            m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                            if (mVar14 != null) {
                                                numValueOf = Integer.valueOf(mVar14.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else {
                                            m mVar15 = (m) iVar2.A();
                                            if (mVar15 != null) {
                                                numValueOf = Integer.valueOf(mVar15.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        }
                                        if (z29) {
                                            m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                            if (mVar16 != null) {
                                                numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        } else {
                                            m mVar17 = (m) iVar2.C();
                                            if (mVar17 != null) {
                                                numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        }
                                        boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                        Integer numValueOf3 = Integer.valueOf(iG4);
                                        Integer numValueOf4 = Integer.valueOf(iF);
                                        final X x11 = lazyListState5.f10370u;
                                        final boolean z32 = z19;
                                        F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Y.a aVar2) {
                                                Y.a aVar3 = aVar2;
                                                final List<m> list2 = arrayList6;
                                                final List<m> list3 = listD;
                                                final boolean z33 = z32;
                                                Ia.l<Y.a, p293xa.r> lVar17 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(Y.a aVar4) {
                                                        Y.a aVar5 = aVar4;
                                                        List<m> list4 = list2;
                                                        boolean z34 = z33;
                                                        int size11 = list4.size();
                                                        for (int i121 = 0; i121 < size11; i121++) {
                                                            list4.get(i121).e(aVar5, z34);
                                                        }
                                                        List<m> list5 = list3;
                                                        boolean z35 = z33;
                                                        int size12 = list5.size();
                                                        for (int i122 = 0; i122 < size12; i122++) {
                                                            list5.get(i122).e(aVar5, z35);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                aVar3.f14225a = true;
                                                lVar17.invoke(aVar3);
                                                aVar3.f14225a = false;
                                                x11.getValue();
                                                return p293xa.r.f47939a;
                                            }
                                        });
                                        z110 = i46;
                                        lVar10 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    }
                                    lazyListState.g(lVar10, interfaceC0988x3.S0(), z110);
                                    return lVar10;
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                        };
                        c1086g = c1086gP;
                        c1086g.E(objF4);
                    } else {
                        final C0945e.l lVar10 = lVar4;
                        cVar2 = cVar3;
                        final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a6 = c0130a;
                        bVar4 = bVar3;
                        lVar5 = lVar10;
                        final C0945e.InterfaceC0129e interfaceC0129e9 = interfaceC0129e2;
                        c0153a2 = c0153a;
                        i32 = i31;
                        objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                            /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.p
                            public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                                int i319;
                                float fMo1getSpacingD9Ej5fM;
                                long j;
                                int i40;
                                m mVar;
                                int i41;
                                m mVar2;
                                int i42;
                                List arrayList;
                                int i43;
                                int i44;
                                ArrayList arrayList2;
                                boolean z19;
                                List arrayList3;
                                int i45;
                                int i46;
                                final j jVar2;
                                Integer numValueOf;
                                Integer numValueOf2;
                                boolean z110;
                                l lVar11;
                                int[] iArr;
                                int i47;
                                m mVar3;
                                float f10;
                                int i48;
                                m mVar4;
                                Object obj;
                                int i49;
                                Object obj2;
                                int index;
                                int iMin;
                                m mVar5;
                                Object obj3;
                                int i50;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                final long j10 = aVar.f20475a;
                                lazyListState.f10367r.getValue();
                                boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                                Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                                int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE3 = interfaceC0988x2.e1(l10.d());
                                int iE4 = interfaceC0988x2.e1(l10.a());
                                final int i51 = iE3 + iE4;
                                final int i52 = iE1 + iE2;
                                boolean z21 = z11;
                                int i53 = z21 ? i51 : i52;
                                if (z21 && !z10) {
                                    i319 = iE3;
                                } else if (z21 && z10) {
                                    i319 = iE4;
                                } else {
                                    i319 = (z21 || z10) ? iE2 : iE1;
                                }
                                int i54 = i53 - i319;
                                long jI = p013b0.b.i(j10, -i52, -i51);
                                h hVarInvoke = iVar.invoke();
                                c cVarH = hVarInvoke.h();
                                int iH = p013b0.a.h(jI);
                                int iG = p013b0.a.g(jI);
                                cVarH.f10386a.m(iH);
                                cVarH.f10387b.m(iG);
                                if (z11) {
                                    C0945e.l lVar12 = lVar10;
                                    if (lVar12 == null) {
                                        p245u.c.b("null verticalArrangement when isVertical == true");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = lVar12.mo1getSpacingD9Ej5fM();
                                } else {
                                    C0945e.InterfaceC0129e interfaceC0129e10 = interfaceC0129e9;
                                    if (interfaceC0129e10 == null) {
                                        p245u.c.b("null horizontalAlignment when isVertical == false");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = interfaceC0129e10.mo1getSpacingD9Ej5fM();
                                }
                                int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                                int iB = hVarInvoke.b();
                                int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                                boolean z22 = z10;
                                if (!z22 || iG2 > 0) {
                                    j = ((long) iE1) << 32;
                                } else {
                                    boolean z23 = z11;
                                    if (!z23) {
                                        iE1 += iG2;
                                    }
                                    if (z23) {
                                        iE3 += iG2;
                                    }
                                    j = ((long) iE1) << 32;
                                }
                                int i55 = iG2;
                                int i56 = i319;
                                final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                                j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                                LazyListState lazyListState3 = lazyListState;
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    int iH2 = lazyListState3.h();
                                    q qVar = lazyListState3.f10354d;
                                    int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                    if (iH2 != iK) {
                                        ((C1081d0) qVar.f10774b).m(iK);
                                        ((D) qVar.f10777e).e(iH2);
                                    }
                                    int i57 = lazyListState3.i();
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    LazyListState lazyListState4 = lazyListState;
                                    List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                    float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                    boolean z24 = z11;
                                    C0945e.l lVar13 = lVar10;
                                    C0945e.InterfaceC0129e interfaceC0129e11 = interfaceC0129e9;
                                    boolean z25 = z10;
                                    LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                    int i58 = i31;
                                    boolean zS0 = interfaceC0988x3.S0();
                                    LazyListState lazyListState5 = lazyListState;
                                    l lVar14 = lazyListState5.f10353c;
                                    A a11 = a10;
                                    int i59 = i57;
                                    S s11 = s10;
                                    androidx.compose.foundation.lazy.layout.X x10 = c0130a6;
                                    l lVar15 = lVar14;
                                    Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // Ia.q
                                        public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar16) {
                                            int iIntValue = num.intValue();
                                            int iIntValue2 = num2.intValue();
                                            return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar16);
                                        }
                                    };
                                    int i60 = i56;
                                    if (i60 < 0) {
                                        p245u.c.a("invalid beforeContentPadding");
                                    }
                                    if (i54 < 0) {
                                        p245u.c.a("invalid afterContentPadding");
                                    }
                                    if (iB <= 0) {
                                        int iJ = p013b0.a.j(jI);
                                        int i61 = p013b0.a.i(jI);
                                        lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                        if (!zS0) {
                                            long jB = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB, 0L)) {
                                                int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                                i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                                iJ = iG3;
                                            }
                                        }
                                        lVar11 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                            @Override // Ia.l
                                            public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                                return p293xa.r.f47939a;
                                            }
                                        }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                        z110 = 0;
                                    } else {
                                        long j11 = jI;
                                        boolean z26 = zS0;
                                        int i62 = iB;
                                        if (iK >= i62) {
                                            iK = i62 - 1;
                                            i59 = 0;
                                        }
                                        int iRound = Math.round(fFloatValue);
                                        int i63 = i59 - iRound;
                                        if (iK == 0 && i63 < 0) {
                                            iRound += i63;
                                            i63 = 0;
                                        }
                                        kotlin.collections.i iVar2 = new kotlin.collections.i();
                                        int i64 = -i60;
                                        int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                        int i66 = i63 + i65;
                                        int iMax = 0;
                                        int i67 = iK;
                                        while (i66 < 0 && i67 > 0) {
                                            long j12 = j11;
                                            int i68 = i67 - 1;
                                            m mVarC = n.c(jVar3, i68);
                                            iVar2.add(0, mVarC);
                                            iMax = Math.max(iMax, mVarC.f10764t);
                                            i66 += mVarC.f10763s;
                                            i67 = i68;
                                            j11 = j12;
                                        }
                                        long j13 = j11;
                                        if (i66 < i65) {
                                            iRound -= i65 - i66;
                                            i66 = i65;
                                        }
                                        int i69 = i66 - i65;
                                        int i70 = i55 + i54;
                                        int i71 = i70 < 0 ? 0 : i70;
                                        int i72 = -i69;
                                        int i73 = iMax;
                                        int i74 = i67;
                                        int i75 = 0;
                                        boolean z27 = false;
                                        while (i75 < iVar2.f43019d) {
                                            if (i72 >= i71) {
                                                iVar2.k(i75);
                                                z27 = true;
                                            } else {
                                                i74++;
                                                i72 += ((m) iVar2.get(i75)).f10763s;
                                                i75++;
                                            }
                                        }
                                        int i76 = i69;
                                        int iMax2 = i73;
                                        boolean z28 = z27;
                                        int i77 = i74;
                                        while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                            int i78 = i71;
                                            m mVarC2 = n.c(jVar3, i77);
                                            l lVar16 = lVar15;
                                            int i79 = mVarC2.f10763s;
                                            int i80 = i72 + i79;
                                            if (i80 > i65 || i77 == i62 - 1) {
                                                iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                                iVar2.addLast(mVarC2);
                                                i50 = 1;
                                            } else {
                                                i76 -= i79;
                                                i67 = i77 + 1;
                                                i50 = 1;
                                                z28 = true;
                                            }
                                            i77 += i50;
                                            lVar15 = lVar16;
                                            i71 = i78;
                                            i72 = i80;
                                        }
                                        l lVar17 = lVar15;
                                        if (i72 < i55) {
                                            int i81 = i55 - i72;
                                            i76 -= i81;
                                            i72 += i81;
                                            while (i76 < i60 && i67 > 0) {
                                                int i82 = i67 - 1;
                                                m mVarC3 = n.c(jVar3, i82);
                                                i67 = i82;
                                                iVar2.add(0, mVarC3);
                                                iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                                i76 += mVarC3.f10763s;
                                            }
                                            int i83 = i81 + iRound;
                                            if (i76 < 0) {
                                                i72 += i76;
                                                i40 = i83 + i76;
                                                i76 = 0;
                                            } else {
                                                i40 = i83;
                                            }
                                        } else {
                                            i40 = iRound;
                                        }
                                        int i84 = i72;
                                        float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                        float f12 = fFloatValue - f11;
                                        float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                        if (i76 < 0) {
                                            p245u.c.a("negative currentFirstItemScrollOffset");
                                        }
                                        int i85 = -i76;
                                        m mVar6 = (m) iVar2.first();
                                        if (i60 > 0 || iE5 < 0) {
                                            int iE = iVar2.e();
                                            int i86 = i76;
                                            int i87 = 0;
                                            while (true) {
                                                if (i87 >= iE) {
                                                    mVar = mVar6;
                                                    break;
                                                }
                                                mVar = mVar6;
                                                int i88 = ((m) iVar2.get(i87)).f10763s;
                                                if (i86 == 0 || i88 > i86) {
                                                    break;
                                                }
                                                int i89 = iE;
                                                if (i87 == kotlin.collections.l.r(iVar2)) {
                                                    break;
                                                }
                                                i86 -= i88;
                                                i87++;
                                                mVar6 = (m) iVar2.get(i87);
                                                iE = i89;
                                            }
                                            m mVar7 = mVar;
                                            i41 = i86;
                                            mVar2 = mVar7;
                                        } else {
                                            mVar2 = mVar6;
                                            i41 = i76;
                                        }
                                        int iMax3 = Math.max(0, i67 - i58);
                                        int i90 = i67 - 1;
                                        if (iMax3 <= i90) {
                                            arrayList = null;
                                            while (true) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                i42 = i60;
                                                arrayList.add(n.c(jVar3, i90));
                                                if (i90 == iMax3) {
                                                    break;
                                                }
                                                i90--;
                                                i60 = i42;
                                            }
                                        } else {
                                            i42 = i60;
                                            arrayList = null;
                                        }
                                        List<Integer> list = listA;
                                        int size = list.size() - 1;
                                        float f14 = f13;
                                        if (size >= 0) {
                                            int i91 = size;
                                            while (true) {
                                                int i92 = i91 - 1;
                                                int iIntValue = listA.get(i91).intValue();
                                                if (iIntValue < iMax3) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(n.c(jVar3, iIntValue));
                                                }
                                                if (i92 < 0) {
                                                    break;
                                                }
                                                i91 = i92;
                                            }
                                        }
                                        if (arrayList == null) {
                                            arrayList = EmptyList.f42983b;
                                        }
                                        int iMax4 = iMax2;
                                        int i93 = 0;
                                        for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                            iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                            i93++;
                                        }
                                        int i94 = iMax4;
                                        int i95 = i62 - 1;
                                        int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                        int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                        if (i96 <= iMin2) {
                                            ArrayList arrayList4 = null;
                                            while (true) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                i44 = i77;
                                                arrayList2 = arrayList4;
                                                i43 = i85;
                                                arrayList2.add(n.c(jVar3, i96));
                                                if (i96 == iMin2) {
                                                    break;
                                                }
                                                i96++;
                                                i85 = i43;
                                                arrayList4 = arrayList2;
                                                i77 = i44;
                                            }
                                        } else {
                                            i43 = i85;
                                            i44 = i77;
                                            arrayList2 = null;
                                        }
                                        if (!z26 || lVar17 == null || lVar17.f().isEmpty()) {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList2;
                                        } else {
                                            List<m> listF = lVar17.f();
                                            int size3 = listF.size() - 1;
                                            ArrayList arrayList5 = arrayList2;
                                            int i97 = -1;
                                            while (true) {
                                                if (i97 >= size3) {
                                                    mVar3 = null;
                                                    break;
                                                }
                                                if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                    mVar3 = listF.get(size3);
                                                    break;
                                                }
                                                i97 = -1;
                                                size3--;
                                            }
                                            g gVar = (g) kotlin.collections.q.V(lVar17.f());
                                            if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                                arrayList3 = arrayList5;
                                                while (true) {
                                                    z19 = z26;
                                                    if (arrayList3 != null) {
                                                        int size4 = arrayList3.size();
                                                        int i98 = 0;
                                                        while (true) {
                                                            if (i98 >= size4) {
                                                                obj3 = null;
                                                                break;
                                                            }
                                                            obj3 = arrayList3.get(i98);
                                                            int i99 = size4;
                                                            if (((m) obj3).f10746a == index) {
                                                                break;
                                                            }
                                                            i98++;
                                                            size4 = i99;
                                                        }
                                                        mVar5 = (m) obj3;
                                                    } else {
                                                        mVar5 = null;
                                                    }
                                                    if (mVar5 == null) {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index));
                                                    }
                                                    if (index == iMin) {
                                                        break;
                                                    }
                                                    index++;
                                                    z26 = z19;
                                                    i84 = i84;
                                                }
                                            } else {
                                                z19 = z26;
                                                i84 = i84;
                                                arrayList3 = arrayList5;
                                            }
                                            float offset = ((lVar17.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                            if (offset > 0.0f) {
                                                int index2 = gVar.getIndex() + 1;
                                                int i100 = 0;
                                                while (index2 < i62 && i100 < offset) {
                                                    if (index2 <= iMin2) {
                                                        int iE6 = iVar2.e();
                                                        int i101 = 0;
                                                        while (true) {
                                                            if (i101 >= iE6) {
                                                                f10 = offset;
                                                                obj2 = null;
                                                                break;
                                                            }
                                                            obj2 = iVar2.get(i101);
                                                            f10 = offset;
                                                            if (((m) obj2).f10746a == index2) {
                                                                break;
                                                            }
                                                            i101++;
                                                            offset = f10;
                                                        }
                                                        mVar4 = (m) obj2;
                                                        i48 = 1;
                                                    } else {
                                                        f10 = offset;
                                                        if (arrayList3 != null) {
                                                            int size5 = arrayList3.size();
                                                            int i102 = 0;
                                                            while (true) {
                                                                if (i102 >= size5) {
                                                                    i48 = 1;
                                                                    obj = null;
                                                                    break;
                                                                }
                                                                obj = arrayList3.get(i102);
                                                                int i103 = size5;
                                                                if (((m) obj).f10746a == index2) {
                                                                    i48 = 1;
                                                                    break;
                                                                }
                                                                i102++;
                                                                size5 = i103;
                                                            }
                                                            mVar4 = (m) obj;
                                                        } else {
                                                            i48 = 1;
                                                            mVar4 = null;
                                                        }
                                                    }
                                                    if (mVar4 != null) {
                                                        index2 += i48;
                                                        i49 = mVar4.f10763s;
                                                    } else {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index2));
                                                        index2++;
                                                        i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                    }
                                                    i100 += i49;
                                                    offset = f10;
                                                }
                                            }
                                        }
                                        if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                            iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                        }
                                        int size6 = list.size();
                                        for (int i104 = 0; i104 < size6; i104++) {
                                            int iIntValue2 = listA.get(i104).intValue();
                                            if (iIntValue2 > iMin2) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, iIntValue2));
                                            }
                                        }
                                        if (arrayList3 == null) {
                                            arrayList3 = EmptyList.f42983b;
                                        }
                                        int size7 = arrayList3.size();
                                        int iMax5 = i94;
                                        for (int i105 = 0; i105 < size7; i105++) {
                                            iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                        }
                                        boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                        int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                        if (z24) {
                                            iMax5 = i84;
                                        }
                                        int iF = p013b0.b.f(iMax5, j13);
                                        int i106 = z24 ? iF : iG4;
                                        int i107 = i84;
                                        boolean z30 = i107 < Math.min(i106, i55);
                                        if (z30 && i43 != 0) {
                                            p245u.c.c("non-zero itemsScrollOffset");
                                        }
                                        m mVar8 = mVar2;
                                        final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                        if (z30) {
                                            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                                p245u.c.a("no extra items");
                                            }
                                            int iE7 = iVar2.e();
                                            int[] iArr2 = new int[iE7];
                                            for (int i108 = 0; i108 < iE7; i108++) {
                                                iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                            }
                                            int[] iArr3 = new int[iE7];
                                            if (z24) {
                                                if (lVar13 == null) {
                                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                                    throw new KotlinNothingValueException();
                                                }
                                                lVar13.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                                iArr = iArr3;
                                                i45 = i55;
                                                i47 = 0;
                                                jVar2 = jVar3;
                                            } else {
                                                if (interfaceC0129e11 == null) {
                                                    p245u.c.b("null horizontalArrangement when isVertical == false");
                                                    throw new KotlinNothingValueException();
                                                }
                                                interfaceC0988x3 = interfaceC0988x3;
                                                iArr = iArr3;
                                                i45 = i55;
                                                jVar2 = jVar3;
                                                i47 = 0;
                                                interfaceC0129e11.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                            }
                                            Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                            Na.g gVarH = iVarQ;
                                            if (z25) {
                                                gVarH = Na.l.H(iVarQ);
                                            }
                                            int i109 = gVarH.f4687b;
                                            int i110 = gVarH.f4688c;
                                            int i111 = gVarH.f4689d;
                                            if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                                while (true) {
                                                    int i112 = iArr[i109];
                                                    m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                    if (z25) {
                                                        i112 = (i106 - i112) - mVar9.f10761q;
                                                    }
                                                    mVar9.k(i112, iG4, iF);
                                                    arrayList6.add(mVar9);
                                                    if (i109 == i110) {
                                                        break;
                                                    }
                                                    i109 += i111;
                                                }
                                            }
                                            i46 = i47;
                                        } else {
                                            i45 = i55;
                                            j13 = j13;
                                            i62 = i62;
                                            i42 = i42;
                                            i46 = 0;
                                            jVar2 = jVar3;
                                            i107 = i107;
                                            int size8 = arrayList.size();
                                            int i113 = i43;
                                            for (int i114 = 0; i114 < size8; i114++) {
                                                m mVar10 = (m) arrayList.get(i114);
                                                i113 -= mVar10.f10763s;
                                                mVar10.k(i113, iG4, iF);
                                                arrayList6.add(mVar10);
                                            }
                                            int iE8 = iVar2.e();
                                            int i115 = i43;
                                            for (int i116 = 0; i116 < iE8; i116++) {
                                                m mVar11 = (m) iVar2.get(i116);
                                                mVar11.k(i115, iG4, iF);
                                                arrayList6.add(mVar11);
                                                i115 += mVar11.f10763s;
                                            }
                                            int size9 = arrayList3.size();
                                            for (int i117 = 0; i117 < size9; i117++) {
                                                m mVar12 = (m) arrayList3.get(i117);
                                                mVar12.k(i115, iG4, iF);
                                                arrayList6.add(mVar12);
                                                i115 += mVar12.f10763s;
                                            }
                                        }
                                        h hVar2 = jVar2.f10770a;
                                        lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                        if (!z19) {
                                            long jB2 = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB2, 0L)) {
                                                int i118 = z24 ? iF : iG4;
                                                long j14 = j13;
                                                iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                                iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                                int i119 = z24 ? iF : iG4;
                                                if (i119 != i118) {
                                                    int size10 = arrayList6.size();
                                                    for (int i120 = i46; i120 < size10; i120++) {
                                                        m mVar13 = (m) arrayList6.get(i120);
                                                        mVar13.f10766v = i119;
                                                        mVar13.f10768x = mVar13.f10754i + i119;
                                                    }
                                                }
                                            }
                                        }
                                        final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final m invoke(Integer num) {
                                                return n.c(jVar2, num.intValue());
                                            }
                                        });
                                        if (z29) {
                                            m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                            if (mVar14 != null) {
                                                numValueOf = Integer.valueOf(mVar14.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else {
                                            m mVar15 = (m) iVar2.A();
                                            if (mVar15 != null) {
                                                numValueOf = Integer.valueOf(mVar15.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        }
                                        if (z29) {
                                            m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                            if (mVar16 != null) {
                                                numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        } else {
                                            m mVar17 = (m) iVar2.C();
                                            if (mVar17 != null) {
                                                numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        }
                                        boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                        Integer numValueOf3 = Integer.valueOf(iG4);
                                        Integer numValueOf4 = Integer.valueOf(iF);
                                        final X x11 = lazyListState5.f10370u;
                                        final boolean z32 = z19;
                                        F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Y.a aVar2) {
                                                Y.a aVar3 = aVar2;
                                                final List<m> list2 = arrayList6;
                                                final List<m> list3 = listD;
                                                final boolean z33 = z32;
                                                Ia.l<Y.a, p293xa.r> lVar18 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(Y.a aVar4) {
                                                        Y.a aVar5 = aVar4;
                                                        List<m> list4 = list2;
                                                        boolean z34 = z33;
                                                        int size11 = list4.size();
                                                        for (int i121 = 0; i121 < size11; i121++) {
                                                            list4.get(i121).e(aVar5, z34);
                                                        }
                                                        List<m> list5 = list3;
                                                        boolean z35 = z33;
                                                        int size12 = list5.size();
                                                        for (int i122 = 0; i122 < size12; i122++) {
                                                            list5.get(i122).e(aVar5, z35);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                aVar3.f14225a = true;
                                                lVar18.invoke(aVar3);
                                                aVar3.f14225a = false;
                                                x11.getValue();
                                                return p293xa.r.f47939a;
                                            }
                                        });
                                        z110 = i46;
                                        lVar11 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    }
                                    lazyListState.g(lVar11, interfaceC0988x3.S0(), z110);
                                    return lVar11;
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                        };
                        c1086g = c1086gP;
                        c1086g.E(objF4);
                    }
                    Ia.p pVar3 = (Ia.p) objF4;
                    if (z11) {
                        orientation = Orientation.f9957b;
                    } else {
                        orientation = Orientation.f9958c;
                    }
                    orientation2 = orientation;
                    if (z12) {
                        c1086g.L(-1513147781);
                        i33 = i30 | ((i21 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        lazyListState2 = lazyListState;
                        if (((i33 & 14) ^ 6) <= 4) {
                        }
                        if (((i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                        }
                        z17 = z18 | z13;
                        objF5 = c1086g.f();
                        if (z17) {
                            objF5 = new e(lazyListState2, i32);
                            c1086g.E(objF5);
                        } else {
                            objF5 = new e(lazyListState2, i32);
                            c1086g.E(objF5);
                        }
                        hVarA = C0974i.a((e) objF5, lazyListState2.f10363n, z10, orientation2);
                        c1086g.T(false);
                    } else {
                        lazyListState2 = lazyListState;
                        c1086g.L(-1512720880);
                        c1086g.T(false);
                        hVarA = androidx.compose.ui.h.a.f13984b;
                    }
                    LazyLayoutKt.a(iVar, K.a(N.a(hVar.i(lazyListState2.f10360k).i(lazyListState2.f10361l), iVar, m11, orientation2, z12, z10).i(hVarA).i(lazyListState2.f10362m.f10635k), lazyListState, orientation2, z12, z10, jVar, lazyListState2.f10356f, false, e10, null), lazyListState2.f10364o, pVar3, c1086g, 0, 0);
                    lVar3 = lVar5;
                    i28 = i32;
                    bVar2 = bVar4;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    i28 = i10;
                    bVar2 = bVar;
                    lVar3 = lVar;
                    cVar2 = cVar;
                    interfaceC0129e2 = interfaceC0129e;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.d.c cVar11 = cVar2;
                    final C0945e.InterfaceC0129e interfaceC0129e10 = interfaceC0129e2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyListKt.a(hVar, lazyListState, l10, z10, z11, jVar, z12, e10, i28, bVar2, lVar3, cVar11, interfaceC0129e10, lVar2, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i26 |= 384;
            if ((i13 & 8192) != 0) {
                i26 |= 3072;
            } else if ((i12 & 3072) == 0) {
                i26 |= c1086gP.k(lVar2) ? 2048 : 1024;
            }
            z13 = true;
            if ((i21 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c1086gP.C(i21 & 1, z14)) {
                if (i17 != 0) {
                    i29 = 0;
                } else {
                    i29 = i10;
                }
                if (i19 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i22 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar;
                }
                if (i25 != 0) {
                    cVar3 = null;
                } else {
                    cVar3 = cVar;
                }
                if (i27 != 0) {
                    interfaceC0129e2 = null;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                i30 = (i21 >> 3) & 14;
                int i319 = i30 | ((i26 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                xI = J0.i(lVar2, c1086gP);
                if (((i319 & 14) ^ 6) <= 4) {
                }
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (z15) {
                    final c cVar12 = new c();
                    cVar12.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                    cVar12.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                    C1108r0 c1108r5 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE6 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final LazyListIntervalContent invoke() {
                            return new LazyListIntervalContent(xI.getValue());
                        }
                    }, c1108r5);
                    objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final i invoke() {
                            LazyListIntervalContent value = derivedSnapshotStateE6.getValue();
                            return new i(lazyListState, value, cVar12, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                        }
                    }, c1108r5), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF);
                } else {
                    final c cVar13 = new c();
                    cVar13.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                    cVar13.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                    C1108r0 c1108r6 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE7 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final LazyListIntervalContent invoke() {
                            return new LazyListIntervalContent(xI.getValue());
                        }
                    }, c1108r6);
                    objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final i invoke() {
                            LazyListIntervalContent value = derivedSnapshotStateE7.getValue();
                            return new i(lazyListState, value, cVar13, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                        }
                    }, c1108r6), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF);
                }
                iVar = (Oa.i) objF;
                int i3110 = i21 >> 9;
                int i3111 = i30 | (i3110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                i31 = i29;
                if (((i3111 & 14) ^ 6) <= 4) {
                }
                z16 = ((((i3111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.c(z11)) || (i3111 & 48) == 32) | ((((i3111 & 14) ^ 6) <= 4 && c1086gP.K(lazyListState)) || (i3111 & 6) == 4);
                objF2 = c1086gP.f();
                if (z16) {
                    objF2 = new d(lazyListState, z11);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new d(lazyListState, z11);
                    c1086gP.E(objF2);
                }
                M m12 = (M) objF2;
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF3);
                }
                a10 = (A) objF3;
                s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                if (((Boolean) c1086gP.x(CompositionLocalsKt.f14860v)).booleanValue()) {
                    c0130a = androidx.compose.foundation.lazy.layout.X.a.f10698a;
                } else {
                    c0130a = null;
                }
                int i3112 = i26 << 18;
                int i3113 = (i21 & 65520) | (i3110 & 458752) | (i3110 & 3670016) | (i3112 & 29360128) | (i3112 & 234881024) | ((i26 << 27) & 1879048192);
                if (((i3113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32) {
                }
                zK = ((((i3113 & 896) ^ 384) <= 256 && c1086gP.K(l10)) || (i3113 & 384) == 256) | ((((i3113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lazyListState)) || (i3113 & 48) == 32) | ((((i3113 & 7168) ^ 3072) <= 2048 && c1086gP.c(z10)) || (i3113 & 3072) == 2048) | ((((57344 & i3113) ^ 24576) <= 16384 && c1086gP.c(z11)) || (i3113 & 24576) == 16384) | ((((3670016 & i3113) ^ 1572864) <= 1048576 && c1086gP.K(bVar3)) || (i3113 & 1572864) == 1048576) | ((((29360128 & i3113) ^ 12582912) <= 8388608 && c1086gP.K(cVar3)) || (i3113 & 12582912) == 8388608) | ((((234881024 & i3113) ^ 100663296) <= 67108864 && c1086gP.K(interfaceC0129e2)) || (i3113 & 100663296) == 67108864) | ((((1879048192 & i3113) ^ 805306368) <= 536870912 && c1086gP.K(lVar4)) || (i3113 & 805306368) == 536870912) | c1086gP.K(s10) | c1086gP.K(c0130a);
                objF4 = c1086gP.f();
                if (zK) {
                    final C0945e.l lVar11 = lVar4;
                    cVar2 = cVar3;
                    final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a7 = c0130a;
                    bVar4 = bVar3;
                    lVar5 = lVar11;
                    final C0945e.InterfaceC0129e interfaceC0129e11 = interfaceC0129e2;
                    c0153a2 = c0153a;
                    i32 = i31;
                    objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                        /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.p
                        public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                            int i3114;
                            float fMo1getSpacingD9Ej5fM;
                            long j;
                            int i40;
                            m mVar;
                            int i41;
                            m mVar2;
                            int i42;
                            List arrayList;
                            int i43;
                            int i44;
                            ArrayList arrayList2;
                            boolean z19;
                            List arrayList3;
                            int i45;
                            int i46;
                            final j jVar2;
                            Integer numValueOf;
                            Integer numValueOf2;
                            boolean z110;
                            l lVar12;
                            int[] iArr;
                            int i47;
                            m mVar3;
                            float f10;
                            int i48;
                            m mVar4;
                            Object obj;
                            int i49;
                            Object obj2;
                            int index;
                            int iMin;
                            m mVar5;
                            Object obj3;
                            int i50;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            final long j10 = aVar.f20475a;
                            lazyListState.f10367r.getValue();
                            boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                            Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                            int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE3 = interfaceC0988x2.e1(l10.d());
                            int iE4 = interfaceC0988x2.e1(l10.a());
                            final int i51 = iE3 + iE4;
                            final int i52 = iE1 + iE2;
                            boolean z21 = z11;
                            int i53 = z21 ? i51 : i52;
                            if (z21 && !z10) {
                                i3114 = iE3;
                            } else if (z21 && z10) {
                                i3114 = iE4;
                            } else {
                                i3114 = (z21 || z10) ? iE2 : iE1;
                            }
                            int i54 = i53 - i3114;
                            long jI = p013b0.b.i(j10, -i52, -i51);
                            h hVarInvoke = iVar.invoke();
                            c cVarH = hVarInvoke.h();
                            int iH = p013b0.a.h(jI);
                            int iG = p013b0.a.g(jI);
                            cVarH.f10386a.m(iH);
                            cVarH.f10387b.m(iG);
                            if (z11) {
                                C0945e.l lVar13 = lVar11;
                                if (lVar13 == null) {
                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = lVar13.mo1getSpacingD9Ej5fM();
                            } else {
                                C0945e.InterfaceC0129e interfaceC0129e12 = interfaceC0129e11;
                                if (interfaceC0129e12 == null) {
                                    p245u.c.b("null horizontalAlignment when isVertical == false");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = interfaceC0129e12.mo1getSpacingD9Ej5fM();
                            }
                            int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                            int iB = hVarInvoke.b();
                            int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                            boolean z22 = z10;
                            if (!z22 || iG2 > 0) {
                                j = ((long) iE1) << 32;
                            } else {
                                boolean z23 = z11;
                                if (!z23) {
                                    iE1 += iG2;
                                }
                                if (z23) {
                                    iE3 += iG2;
                                }
                                j = ((long) iE1) << 32;
                            }
                            int i55 = iG2;
                            int i56 = i3114;
                            final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                            j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                            LazyListState lazyListState3 = lazyListState;
                            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                            try {
                                int iH2 = lazyListState3.h();
                                q qVar = lazyListState3.f10354d;
                                int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                if (iH2 != iK) {
                                    ((C1081d0) qVar.f10774b).m(iK);
                                    ((D) qVar.f10777e).e(iH2);
                                }
                                int i57 = lazyListState3.i();
                                p293xa.r rVar = p293xa.r.f47939a;
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                LazyListState lazyListState4 = lazyListState;
                                List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                boolean z24 = z11;
                                C0945e.l lVar14 = lVar11;
                                C0945e.InterfaceC0129e interfaceC0129e13 = interfaceC0129e11;
                                boolean z25 = z10;
                                LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                int i58 = i31;
                                boolean zS0 = interfaceC0988x3.S0();
                                LazyListState lazyListState5 = lazyListState;
                                l lVar15 = lazyListState5.f10353c;
                                A a11 = a10;
                                int i59 = i57;
                                S s11 = s10;
                                androidx.compose.foundation.lazy.layout.X x10 = c0130a7;
                                l lVar16 = lVar15;
                                Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // Ia.q
                                    public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar17) {
                                        int iIntValue = num.intValue();
                                        int iIntValue2 = num2.intValue();
                                        return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar17);
                                    }
                                };
                                int i60 = i56;
                                if (i60 < 0) {
                                    p245u.c.a("invalid beforeContentPadding");
                                }
                                if (i54 < 0) {
                                    p245u.c.a("invalid afterContentPadding");
                                }
                                if (iB <= 0) {
                                    int iJ = p013b0.a.j(jI);
                                    int i61 = p013b0.a.i(jI);
                                    lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                    if (!zS0) {
                                        long jB = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB, 0L)) {
                                            int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                            i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                            iJ = iG3;
                                        }
                                    }
                                    lVar12 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                            return p293xa.r.f47939a;
                                        }
                                    }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    z110 = 0;
                                } else {
                                    long j11 = jI;
                                    boolean z26 = zS0;
                                    int i62 = iB;
                                    if (iK >= i62) {
                                        iK = i62 - 1;
                                        i59 = 0;
                                    }
                                    int iRound = Math.round(fFloatValue);
                                    int i63 = i59 - iRound;
                                    if (iK == 0 && i63 < 0) {
                                        iRound += i63;
                                        i63 = 0;
                                    }
                                    kotlin.collections.i iVar2 = new kotlin.collections.i();
                                    int i64 = -i60;
                                    int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                    int i66 = i63 + i65;
                                    int iMax = 0;
                                    int i67 = iK;
                                    while (i66 < 0 && i67 > 0) {
                                        long j12 = j11;
                                        int i68 = i67 - 1;
                                        m mVarC = n.c(jVar3, i68);
                                        iVar2.add(0, mVarC);
                                        iMax = Math.max(iMax, mVarC.f10764t);
                                        i66 += mVarC.f10763s;
                                        i67 = i68;
                                        j11 = j12;
                                    }
                                    long j13 = j11;
                                    if (i66 < i65) {
                                        iRound -= i65 - i66;
                                        i66 = i65;
                                    }
                                    int i69 = i66 - i65;
                                    int i70 = i55 + i54;
                                    int i71 = i70 < 0 ? 0 : i70;
                                    int i72 = -i69;
                                    int i73 = iMax;
                                    int i74 = i67;
                                    int i75 = 0;
                                    boolean z27 = false;
                                    while (i75 < iVar2.f43019d) {
                                        if (i72 >= i71) {
                                            iVar2.k(i75);
                                            z27 = true;
                                        } else {
                                            i74++;
                                            i72 += ((m) iVar2.get(i75)).f10763s;
                                            i75++;
                                        }
                                    }
                                    int i76 = i69;
                                    int iMax2 = i73;
                                    boolean z28 = z27;
                                    int i77 = i74;
                                    while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                        int i78 = i71;
                                        m mVarC2 = n.c(jVar3, i77);
                                        l lVar17 = lVar16;
                                        int i79 = mVarC2.f10763s;
                                        int i80 = i72 + i79;
                                        if (i80 > i65 || i77 == i62 - 1) {
                                            iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                            iVar2.addLast(mVarC2);
                                            i50 = 1;
                                        } else {
                                            i76 -= i79;
                                            i67 = i77 + 1;
                                            i50 = 1;
                                            z28 = true;
                                        }
                                        i77 += i50;
                                        lVar16 = lVar17;
                                        i71 = i78;
                                        i72 = i80;
                                    }
                                    l lVar18 = lVar16;
                                    if (i72 < i55) {
                                        int i81 = i55 - i72;
                                        i76 -= i81;
                                        i72 += i81;
                                        while (i76 < i60 && i67 > 0) {
                                            int i82 = i67 - 1;
                                            m mVarC3 = n.c(jVar3, i82);
                                            i67 = i82;
                                            iVar2.add(0, mVarC3);
                                            iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                            i76 += mVarC3.f10763s;
                                        }
                                        int i83 = i81 + iRound;
                                        if (i76 < 0) {
                                            i72 += i76;
                                            i40 = i83 + i76;
                                            i76 = 0;
                                        } else {
                                            i40 = i83;
                                        }
                                    } else {
                                        i40 = iRound;
                                    }
                                    int i84 = i72;
                                    float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                    float f12 = fFloatValue - f11;
                                    float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                    if (i76 < 0) {
                                        p245u.c.a("negative currentFirstItemScrollOffset");
                                    }
                                    int i85 = -i76;
                                    m mVar6 = (m) iVar2.first();
                                    if (i60 > 0 || iE5 < 0) {
                                        int iE = iVar2.e();
                                        int i86 = i76;
                                        int i87 = 0;
                                        while (true) {
                                            if (i87 >= iE) {
                                                mVar = mVar6;
                                                break;
                                            }
                                            mVar = mVar6;
                                            int i88 = ((m) iVar2.get(i87)).f10763s;
                                            if (i86 == 0 || i88 > i86) {
                                                break;
                                            }
                                            int i89 = iE;
                                            if (i87 == kotlin.collections.l.r(iVar2)) {
                                                break;
                                            }
                                            i86 -= i88;
                                            i87++;
                                            mVar6 = (m) iVar2.get(i87);
                                            iE = i89;
                                        }
                                        m mVar7 = mVar;
                                        i41 = i86;
                                        mVar2 = mVar7;
                                    } else {
                                        mVar2 = mVar6;
                                        i41 = i76;
                                    }
                                    int iMax3 = Math.max(0, i67 - i58);
                                    int i90 = i67 - 1;
                                    if (iMax3 <= i90) {
                                        arrayList = null;
                                        while (true) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            i42 = i60;
                                            arrayList.add(n.c(jVar3, i90));
                                            if (i90 == iMax3) {
                                                break;
                                            }
                                            i90--;
                                            i60 = i42;
                                        }
                                    } else {
                                        i42 = i60;
                                        arrayList = null;
                                    }
                                    List<Integer> list = listA;
                                    int size = list.size() - 1;
                                    float f14 = f13;
                                    if (size >= 0) {
                                        int i91 = size;
                                        while (true) {
                                            int i92 = i91 - 1;
                                            int iIntValue = listA.get(i91).intValue();
                                            if (iIntValue < iMax3) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(n.c(jVar3, iIntValue));
                                            }
                                            if (i92 < 0) {
                                                break;
                                            }
                                            i91 = i92;
                                        }
                                    }
                                    if (arrayList == null) {
                                        arrayList = EmptyList.f42983b;
                                    }
                                    int iMax4 = iMax2;
                                    int i93 = 0;
                                    for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                        iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                        i93++;
                                    }
                                    int i94 = iMax4;
                                    int i95 = i62 - 1;
                                    int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                    int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                    if (i96 <= iMin2) {
                                        ArrayList arrayList4 = null;
                                        while (true) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            i44 = i77;
                                            arrayList2 = arrayList4;
                                            i43 = i85;
                                            arrayList2.add(n.c(jVar3, i96));
                                            if (i96 == iMin2) {
                                                break;
                                            }
                                            i96++;
                                            i85 = i43;
                                            arrayList4 = arrayList2;
                                            i77 = i44;
                                        }
                                    } else {
                                        i43 = i85;
                                        i44 = i77;
                                        arrayList2 = null;
                                    }
                                    if (!z26 || lVar18 == null || lVar18.f().isEmpty()) {
                                        z19 = z26;
                                        i84 = i84;
                                        arrayList3 = arrayList2;
                                    } else {
                                        List<m> listF = lVar18.f();
                                        int size3 = listF.size() - 1;
                                        ArrayList arrayList5 = arrayList2;
                                        int i97 = -1;
                                        while (true) {
                                            if (i97 >= size3) {
                                                mVar3 = null;
                                                break;
                                            }
                                            if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                mVar3 = listF.get(size3);
                                                break;
                                            }
                                            i97 = -1;
                                            size3--;
                                        }
                                        g gVar = (g) kotlin.collections.q.V(lVar18.f());
                                        if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                            arrayList3 = arrayList5;
                                            while (true) {
                                                z19 = z26;
                                                if (arrayList3 != null) {
                                                    int size4 = arrayList3.size();
                                                    int i98 = 0;
                                                    while (true) {
                                                        if (i98 >= size4) {
                                                            obj3 = null;
                                                            break;
                                                        }
                                                        obj3 = arrayList3.get(i98);
                                                        int i99 = size4;
                                                        if (((m) obj3).f10746a == index) {
                                                            break;
                                                        }
                                                        i98++;
                                                        size4 = i99;
                                                    }
                                                    mVar5 = (m) obj3;
                                                } else {
                                                    mVar5 = null;
                                                }
                                                if (mVar5 == null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index));
                                                }
                                                if (index == iMin) {
                                                    break;
                                                }
                                                index++;
                                                z26 = z19;
                                                i84 = i84;
                                            }
                                        } else {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList5;
                                        }
                                        float offset = ((lVar18.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                        if (offset > 0.0f) {
                                            int index2 = gVar.getIndex() + 1;
                                            int i100 = 0;
                                            while (index2 < i62 && i100 < offset) {
                                                if (index2 <= iMin2) {
                                                    int iE6 = iVar2.e();
                                                    int i101 = 0;
                                                    while (true) {
                                                        if (i101 >= iE6) {
                                                            f10 = offset;
                                                            obj2 = null;
                                                            break;
                                                        }
                                                        obj2 = iVar2.get(i101);
                                                        f10 = offset;
                                                        if (((m) obj2).f10746a == index2) {
                                                            break;
                                                        }
                                                        i101++;
                                                        offset = f10;
                                                    }
                                                    mVar4 = (m) obj2;
                                                    i48 = 1;
                                                } else {
                                                    f10 = offset;
                                                    if (arrayList3 != null) {
                                                        int size5 = arrayList3.size();
                                                        int i102 = 0;
                                                        while (true) {
                                                            if (i102 >= size5) {
                                                                i48 = 1;
                                                                obj = null;
                                                                break;
                                                            }
                                                            obj = arrayList3.get(i102);
                                                            int i103 = size5;
                                                            if (((m) obj).f10746a == index2) {
                                                                i48 = 1;
                                                                break;
                                                            }
                                                            i102++;
                                                            size5 = i103;
                                                        }
                                                        mVar4 = (m) obj;
                                                    } else {
                                                        i48 = 1;
                                                        mVar4 = null;
                                                    }
                                                }
                                                if (mVar4 != null) {
                                                    index2 += i48;
                                                    i49 = mVar4.f10763s;
                                                } else {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index2));
                                                    index2++;
                                                    i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                }
                                                i100 += i49;
                                                offset = f10;
                                            }
                                        }
                                    }
                                    if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                        iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                    }
                                    int size6 = list.size();
                                    for (int i104 = 0; i104 < size6; i104++) {
                                        int iIntValue2 = listA.get(i104).intValue();
                                        if (iIntValue2 > iMin2) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(n.c(jVar3, iIntValue2));
                                        }
                                    }
                                    if (arrayList3 == null) {
                                        arrayList3 = EmptyList.f42983b;
                                    }
                                    int size7 = arrayList3.size();
                                    int iMax5 = i94;
                                    for (int i105 = 0; i105 < size7; i105++) {
                                        iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                    }
                                    boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                    int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                    if (z24) {
                                        iMax5 = i84;
                                    }
                                    int iF = p013b0.b.f(iMax5, j13);
                                    int i106 = z24 ? iF : iG4;
                                    int i107 = i84;
                                    boolean z30 = i107 < Math.min(i106, i55);
                                    if (z30 && i43 != 0) {
                                        p245u.c.c("non-zero itemsScrollOffset");
                                    }
                                    m mVar8 = mVar2;
                                    final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                    if (z30) {
                                        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                            p245u.c.a("no extra items");
                                        }
                                        int iE7 = iVar2.e();
                                        int[] iArr2 = new int[iE7];
                                        for (int i108 = 0; i108 < iE7; i108++) {
                                            iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                        }
                                        int[] iArr3 = new int[iE7];
                                        if (z24) {
                                            if (lVar14 == null) {
                                                p245u.c.b("null verticalArrangement when isVertical == true");
                                                throw new KotlinNothingValueException();
                                            }
                                            lVar14.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                            iArr = iArr3;
                                            i45 = i55;
                                            i47 = 0;
                                            jVar2 = jVar3;
                                        } else {
                                            if (interfaceC0129e13 == null) {
                                                p245u.c.b("null horizontalArrangement when isVertical == false");
                                                throw new KotlinNothingValueException();
                                            }
                                            interfaceC0988x3 = interfaceC0988x3;
                                            iArr = iArr3;
                                            i45 = i55;
                                            jVar2 = jVar3;
                                            i47 = 0;
                                            interfaceC0129e13.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                        }
                                        Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                        Na.g gVarH = iVarQ;
                                        if (z25) {
                                            gVarH = Na.l.H(iVarQ);
                                        }
                                        int i109 = gVarH.f4687b;
                                        int i110 = gVarH.f4688c;
                                        int i111 = gVarH.f4689d;
                                        if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                            while (true) {
                                                int i112 = iArr[i109];
                                                m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                if (z25) {
                                                    i112 = (i106 - i112) - mVar9.f10761q;
                                                }
                                                mVar9.k(i112, iG4, iF);
                                                arrayList6.add(mVar9);
                                                if (i109 == i110) {
                                                    break;
                                                }
                                                i109 += i111;
                                            }
                                        }
                                        i46 = i47;
                                    } else {
                                        i45 = i55;
                                        j13 = j13;
                                        i62 = i62;
                                        i42 = i42;
                                        i46 = 0;
                                        jVar2 = jVar3;
                                        i107 = i107;
                                        int size8 = arrayList.size();
                                        int i113 = i43;
                                        for (int i114 = 0; i114 < size8; i114++) {
                                            m mVar10 = (m) arrayList.get(i114);
                                            i113 -= mVar10.f10763s;
                                            mVar10.k(i113, iG4, iF);
                                            arrayList6.add(mVar10);
                                        }
                                        int iE8 = iVar2.e();
                                        int i115 = i43;
                                        for (int i116 = 0; i116 < iE8; i116++) {
                                            m mVar11 = (m) iVar2.get(i116);
                                            mVar11.k(i115, iG4, iF);
                                            arrayList6.add(mVar11);
                                            i115 += mVar11.f10763s;
                                        }
                                        int size9 = arrayList3.size();
                                        for (int i117 = 0; i117 < size9; i117++) {
                                            m mVar12 = (m) arrayList3.get(i117);
                                            mVar12.k(i115, iG4, iF);
                                            arrayList6.add(mVar12);
                                            i115 += mVar12.f10763s;
                                        }
                                    }
                                    h hVar2 = jVar2.f10770a;
                                    lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                    if (!z19) {
                                        long jB2 = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB2, 0L)) {
                                            int i118 = z24 ? iF : iG4;
                                            long j14 = j13;
                                            iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                            iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                            int i119 = z24 ? iF : iG4;
                                            if (i119 != i118) {
                                                int size10 = arrayList6.size();
                                                for (int i120 = i46; i120 < size10; i120++) {
                                                    m mVar13 = (m) arrayList6.get(i120);
                                                    mVar13.f10766v = i119;
                                                    mVar13.f10768x = mVar13.f10754i + i119;
                                                }
                                            }
                                        }
                                    }
                                    final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final m invoke(Integer num) {
                                            return n.c(jVar2, num.intValue());
                                        }
                                    });
                                    if (z29) {
                                        m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                        if (mVar14 != null) {
                                            numValueOf = Integer.valueOf(mVar14.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else {
                                        m mVar15 = (m) iVar2.A();
                                        if (mVar15 != null) {
                                            numValueOf = Integer.valueOf(mVar15.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (z29) {
                                        m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                        if (mVar16 != null) {
                                            numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    } else {
                                        m mVar17 = (m) iVar2.C();
                                        if (mVar17 != null) {
                                            numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    }
                                    boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                    Integer numValueOf3 = Integer.valueOf(iG4);
                                    Integer numValueOf4 = Integer.valueOf(iF);
                                    final X x11 = lazyListState5.f10370u;
                                    final boolean z32 = z19;
                                    F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Y.a aVar2) {
                                            Y.a aVar3 = aVar2;
                                            final List<m> list2 = arrayList6;
                                            final List<m> list3 = listD;
                                            final boolean z33 = z32;
                                            Ia.l<Y.a, p293xa.r> lVar19 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(Y.a aVar4) {
                                                    Y.a aVar5 = aVar4;
                                                    List<m> list4 = list2;
                                                    boolean z34 = z33;
                                                    int size11 = list4.size();
                                                    for (int i121 = 0; i121 < size11; i121++) {
                                                        list4.get(i121).e(aVar5, z34);
                                                    }
                                                    List<m> list5 = list3;
                                                    boolean z35 = z33;
                                                    int size12 = list5.size();
                                                    for (int i122 = 0; i122 < size12; i122++) {
                                                        list5.get(i122).e(aVar5, z35);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            aVar3.f14225a = true;
                                            lVar19.invoke(aVar3);
                                            aVar3.f14225a = false;
                                            x11.getValue();
                                            return p293xa.r.f47939a;
                                        }
                                    });
                                    z110 = i46;
                                    lVar12 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                }
                                lazyListState.g(lVar12, interfaceC0988x3.S0(), z110);
                                return lVar12;
                            } catch (Throwable th) {
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                throw th;
                            }
                        }
                    };
                    c1086g = c1086gP;
                    c1086g.E(objF4);
                } else {
                    final C0945e.l lVar12 = lVar4;
                    cVar2 = cVar3;
                    final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a8 = c0130a;
                    bVar4 = bVar3;
                    lVar5 = lVar12;
                    final C0945e.InterfaceC0129e interfaceC0129e12 = interfaceC0129e2;
                    c0153a2 = c0153a;
                    i32 = i31;
                    objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                        /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.p
                        public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                            int i3114;
                            float fMo1getSpacingD9Ej5fM;
                            long j;
                            int i40;
                            m mVar;
                            int i41;
                            m mVar2;
                            int i42;
                            List arrayList;
                            int i43;
                            int i44;
                            ArrayList arrayList2;
                            boolean z19;
                            List arrayList3;
                            int i45;
                            int i46;
                            final j jVar2;
                            Integer numValueOf;
                            Integer numValueOf2;
                            boolean z110;
                            l lVar13;
                            int[] iArr;
                            int i47;
                            m mVar3;
                            float f10;
                            int i48;
                            m mVar4;
                            Object obj;
                            int i49;
                            Object obj2;
                            int index;
                            int iMin;
                            m mVar5;
                            Object obj3;
                            int i50;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            final long j10 = aVar.f20475a;
                            lazyListState.f10367r.getValue();
                            boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                            Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                            int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE3 = interfaceC0988x2.e1(l10.d());
                            int iE4 = interfaceC0988x2.e1(l10.a());
                            final int i51 = iE3 + iE4;
                            final int i52 = iE1 + iE2;
                            boolean z21 = z11;
                            int i53 = z21 ? i51 : i52;
                            if (z21 && !z10) {
                                i3114 = iE3;
                            } else if (z21 && z10) {
                                i3114 = iE4;
                            } else {
                                i3114 = (z21 || z10) ? iE2 : iE1;
                            }
                            int i54 = i53 - i3114;
                            long jI = p013b0.b.i(j10, -i52, -i51);
                            h hVarInvoke = iVar.invoke();
                            c cVarH = hVarInvoke.h();
                            int iH = p013b0.a.h(jI);
                            int iG = p013b0.a.g(jI);
                            cVarH.f10386a.m(iH);
                            cVarH.f10387b.m(iG);
                            if (z11) {
                                C0945e.l lVar14 = lVar12;
                                if (lVar14 == null) {
                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = lVar14.mo1getSpacingD9Ej5fM();
                            } else {
                                C0945e.InterfaceC0129e interfaceC0129e13 = interfaceC0129e12;
                                if (interfaceC0129e13 == null) {
                                    p245u.c.b("null horizontalAlignment when isVertical == false");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = interfaceC0129e13.mo1getSpacingD9Ej5fM();
                            }
                            int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                            int iB = hVarInvoke.b();
                            int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                            boolean z22 = z10;
                            if (!z22 || iG2 > 0) {
                                j = ((long) iE1) << 32;
                            } else {
                                boolean z23 = z11;
                                if (!z23) {
                                    iE1 += iG2;
                                }
                                if (z23) {
                                    iE3 += iG2;
                                }
                                j = ((long) iE1) << 32;
                            }
                            int i55 = iG2;
                            int i56 = i3114;
                            final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                            j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                            LazyListState lazyListState3 = lazyListState;
                            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                            try {
                                int iH2 = lazyListState3.h();
                                q qVar = lazyListState3.f10354d;
                                int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                if (iH2 != iK) {
                                    ((C1081d0) qVar.f10774b).m(iK);
                                    ((D) qVar.f10777e).e(iH2);
                                }
                                int i57 = lazyListState3.i();
                                p293xa.r rVar = p293xa.r.f47939a;
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                LazyListState lazyListState4 = lazyListState;
                                List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                boolean z24 = z11;
                                C0945e.l lVar15 = lVar12;
                                C0945e.InterfaceC0129e interfaceC0129e14 = interfaceC0129e12;
                                boolean z25 = z10;
                                LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                int i58 = i31;
                                boolean zS0 = interfaceC0988x3.S0();
                                LazyListState lazyListState5 = lazyListState;
                                l lVar16 = lazyListState5.f10353c;
                                A a11 = a10;
                                int i59 = i57;
                                S s11 = s10;
                                androidx.compose.foundation.lazy.layout.X x10 = c0130a8;
                                l lVar17 = lVar16;
                                Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // Ia.q
                                    public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar18) {
                                        int iIntValue = num.intValue();
                                        int iIntValue2 = num2.intValue();
                                        return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar18);
                                    }
                                };
                                int i60 = i56;
                                if (i60 < 0) {
                                    p245u.c.a("invalid beforeContentPadding");
                                }
                                if (i54 < 0) {
                                    p245u.c.a("invalid afterContentPadding");
                                }
                                if (iB <= 0) {
                                    int iJ = p013b0.a.j(jI);
                                    int i61 = p013b0.a.i(jI);
                                    lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                    if (!zS0) {
                                        long jB = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB, 0L)) {
                                            int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                            i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                            iJ = iG3;
                                        }
                                    }
                                    lVar13 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                            return p293xa.r.f47939a;
                                        }
                                    }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    z110 = 0;
                                } else {
                                    long j11 = jI;
                                    boolean z26 = zS0;
                                    int i62 = iB;
                                    if (iK >= i62) {
                                        iK = i62 - 1;
                                        i59 = 0;
                                    }
                                    int iRound = Math.round(fFloatValue);
                                    int i63 = i59 - iRound;
                                    if (iK == 0 && i63 < 0) {
                                        iRound += i63;
                                        i63 = 0;
                                    }
                                    kotlin.collections.i iVar2 = new kotlin.collections.i();
                                    int i64 = -i60;
                                    int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                    int i66 = i63 + i65;
                                    int iMax = 0;
                                    int i67 = iK;
                                    while (i66 < 0 && i67 > 0) {
                                        long j12 = j11;
                                        int i68 = i67 - 1;
                                        m mVarC = n.c(jVar3, i68);
                                        iVar2.add(0, mVarC);
                                        iMax = Math.max(iMax, mVarC.f10764t);
                                        i66 += mVarC.f10763s;
                                        i67 = i68;
                                        j11 = j12;
                                    }
                                    long j13 = j11;
                                    if (i66 < i65) {
                                        iRound -= i65 - i66;
                                        i66 = i65;
                                    }
                                    int i69 = i66 - i65;
                                    int i70 = i55 + i54;
                                    int i71 = i70 < 0 ? 0 : i70;
                                    int i72 = -i69;
                                    int i73 = iMax;
                                    int i74 = i67;
                                    int i75 = 0;
                                    boolean z27 = false;
                                    while (i75 < iVar2.f43019d) {
                                        if (i72 >= i71) {
                                            iVar2.k(i75);
                                            z27 = true;
                                        } else {
                                            i74++;
                                            i72 += ((m) iVar2.get(i75)).f10763s;
                                            i75++;
                                        }
                                    }
                                    int i76 = i69;
                                    int iMax2 = i73;
                                    boolean z28 = z27;
                                    int i77 = i74;
                                    while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                        int i78 = i71;
                                        m mVarC2 = n.c(jVar3, i77);
                                        l lVar18 = lVar17;
                                        int i79 = mVarC2.f10763s;
                                        int i80 = i72 + i79;
                                        if (i80 > i65 || i77 == i62 - 1) {
                                            iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                            iVar2.addLast(mVarC2);
                                            i50 = 1;
                                        } else {
                                            i76 -= i79;
                                            i67 = i77 + 1;
                                            i50 = 1;
                                            z28 = true;
                                        }
                                        i77 += i50;
                                        lVar17 = lVar18;
                                        i71 = i78;
                                        i72 = i80;
                                    }
                                    l lVar19 = lVar17;
                                    if (i72 < i55) {
                                        int i81 = i55 - i72;
                                        i76 -= i81;
                                        i72 += i81;
                                        while (i76 < i60 && i67 > 0) {
                                            int i82 = i67 - 1;
                                            m mVarC3 = n.c(jVar3, i82);
                                            i67 = i82;
                                            iVar2.add(0, mVarC3);
                                            iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                            i76 += mVarC3.f10763s;
                                        }
                                        int i83 = i81 + iRound;
                                        if (i76 < 0) {
                                            i72 += i76;
                                            i40 = i83 + i76;
                                            i76 = 0;
                                        } else {
                                            i40 = i83;
                                        }
                                    } else {
                                        i40 = iRound;
                                    }
                                    int i84 = i72;
                                    float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                    float f12 = fFloatValue - f11;
                                    float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                    if (i76 < 0) {
                                        p245u.c.a("negative currentFirstItemScrollOffset");
                                    }
                                    int i85 = -i76;
                                    m mVar6 = (m) iVar2.first();
                                    if (i60 > 0 || iE5 < 0) {
                                        int iE = iVar2.e();
                                        int i86 = i76;
                                        int i87 = 0;
                                        while (true) {
                                            if (i87 >= iE) {
                                                mVar = mVar6;
                                                break;
                                            }
                                            mVar = mVar6;
                                            int i88 = ((m) iVar2.get(i87)).f10763s;
                                            if (i86 == 0 || i88 > i86) {
                                                break;
                                            }
                                            int i89 = iE;
                                            if (i87 == kotlin.collections.l.r(iVar2)) {
                                                break;
                                            }
                                            i86 -= i88;
                                            i87++;
                                            mVar6 = (m) iVar2.get(i87);
                                            iE = i89;
                                        }
                                        m mVar7 = mVar;
                                        i41 = i86;
                                        mVar2 = mVar7;
                                    } else {
                                        mVar2 = mVar6;
                                        i41 = i76;
                                    }
                                    int iMax3 = Math.max(0, i67 - i58);
                                    int i90 = i67 - 1;
                                    if (iMax3 <= i90) {
                                        arrayList = null;
                                        while (true) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            i42 = i60;
                                            arrayList.add(n.c(jVar3, i90));
                                            if (i90 == iMax3) {
                                                break;
                                            }
                                            i90--;
                                            i60 = i42;
                                        }
                                    } else {
                                        i42 = i60;
                                        arrayList = null;
                                    }
                                    List<Integer> list = listA;
                                    int size = list.size() - 1;
                                    float f14 = f13;
                                    if (size >= 0) {
                                        int i91 = size;
                                        while (true) {
                                            int i92 = i91 - 1;
                                            int iIntValue = listA.get(i91).intValue();
                                            if (iIntValue < iMax3) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(n.c(jVar3, iIntValue));
                                            }
                                            if (i92 < 0) {
                                                break;
                                            }
                                            i91 = i92;
                                        }
                                    }
                                    if (arrayList == null) {
                                        arrayList = EmptyList.f42983b;
                                    }
                                    int iMax4 = iMax2;
                                    int i93 = 0;
                                    for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                        iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                        i93++;
                                    }
                                    int i94 = iMax4;
                                    int i95 = i62 - 1;
                                    int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                    int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                    if (i96 <= iMin2) {
                                        ArrayList arrayList4 = null;
                                        while (true) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            i44 = i77;
                                            arrayList2 = arrayList4;
                                            i43 = i85;
                                            arrayList2.add(n.c(jVar3, i96));
                                            if (i96 == iMin2) {
                                                break;
                                            }
                                            i96++;
                                            i85 = i43;
                                            arrayList4 = arrayList2;
                                            i77 = i44;
                                        }
                                    } else {
                                        i43 = i85;
                                        i44 = i77;
                                        arrayList2 = null;
                                    }
                                    if (!z26 || lVar19 == null || lVar19.f().isEmpty()) {
                                        z19 = z26;
                                        i84 = i84;
                                        arrayList3 = arrayList2;
                                    } else {
                                        List<m> listF = lVar19.f();
                                        int size3 = listF.size() - 1;
                                        ArrayList arrayList5 = arrayList2;
                                        int i97 = -1;
                                        while (true) {
                                            if (i97 >= size3) {
                                                mVar3 = null;
                                                break;
                                            }
                                            if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                mVar3 = listF.get(size3);
                                                break;
                                            }
                                            i97 = -1;
                                            size3--;
                                        }
                                        g gVar = (g) kotlin.collections.q.V(lVar19.f());
                                        if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                            arrayList3 = arrayList5;
                                            while (true) {
                                                z19 = z26;
                                                if (arrayList3 != null) {
                                                    int size4 = arrayList3.size();
                                                    int i98 = 0;
                                                    while (true) {
                                                        if (i98 >= size4) {
                                                            obj3 = null;
                                                            break;
                                                        }
                                                        obj3 = arrayList3.get(i98);
                                                        int i99 = size4;
                                                        if (((m) obj3).f10746a == index) {
                                                            break;
                                                        }
                                                        i98++;
                                                        size4 = i99;
                                                    }
                                                    mVar5 = (m) obj3;
                                                } else {
                                                    mVar5 = null;
                                                }
                                                if (mVar5 == null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index));
                                                }
                                                if (index == iMin) {
                                                    break;
                                                }
                                                index++;
                                                z26 = z19;
                                                i84 = i84;
                                            }
                                        } else {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList5;
                                        }
                                        float offset = ((lVar19.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                        if (offset > 0.0f) {
                                            int index2 = gVar.getIndex() + 1;
                                            int i100 = 0;
                                            while (index2 < i62 && i100 < offset) {
                                                if (index2 <= iMin2) {
                                                    int iE6 = iVar2.e();
                                                    int i101 = 0;
                                                    while (true) {
                                                        if (i101 >= iE6) {
                                                            f10 = offset;
                                                            obj2 = null;
                                                            break;
                                                        }
                                                        obj2 = iVar2.get(i101);
                                                        f10 = offset;
                                                        if (((m) obj2).f10746a == index2) {
                                                            break;
                                                        }
                                                        i101++;
                                                        offset = f10;
                                                    }
                                                    mVar4 = (m) obj2;
                                                    i48 = 1;
                                                } else {
                                                    f10 = offset;
                                                    if (arrayList3 != null) {
                                                        int size5 = arrayList3.size();
                                                        int i102 = 0;
                                                        while (true) {
                                                            if (i102 >= size5) {
                                                                i48 = 1;
                                                                obj = null;
                                                                break;
                                                            }
                                                            obj = arrayList3.get(i102);
                                                            int i103 = size5;
                                                            if (((m) obj).f10746a == index2) {
                                                                i48 = 1;
                                                                break;
                                                            }
                                                            i102++;
                                                            size5 = i103;
                                                        }
                                                        mVar4 = (m) obj;
                                                    } else {
                                                        i48 = 1;
                                                        mVar4 = null;
                                                    }
                                                }
                                                if (mVar4 != null) {
                                                    index2 += i48;
                                                    i49 = mVar4.f10763s;
                                                } else {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index2));
                                                    index2++;
                                                    i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                }
                                                i100 += i49;
                                                offset = f10;
                                            }
                                        }
                                    }
                                    if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                        iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                    }
                                    int size6 = list.size();
                                    for (int i104 = 0; i104 < size6; i104++) {
                                        int iIntValue2 = listA.get(i104).intValue();
                                        if (iIntValue2 > iMin2) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(n.c(jVar3, iIntValue2));
                                        }
                                    }
                                    if (arrayList3 == null) {
                                        arrayList3 = EmptyList.f42983b;
                                    }
                                    int size7 = arrayList3.size();
                                    int iMax5 = i94;
                                    for (int i105 = 0; i105 < size7; i105++) {
                                        iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                    }
                                    boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                    int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                    if (z24) {
                                        iMax5 = i84;
                                    }
                                    int iF = p013b0.b.f(iMax5, j13);
                                    int i106 = z24 ? iF : iG4;
                                    int i107 = i84;
                                    boolean z30 = i107 < Math.min(i106, i55);
                                    if (z30 && i43 != 0) {
                                        p245u.c.c("non-zero itemsScrollOffset");
                                    }
                                    m mVar8 = mVar2;
                                    final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                    if (z30) {
                                        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                            p245u.c.a("no extra items");
                                        }
                                        int iE7 = iVar2.e();
                                        int[] iArr2 = new int[iE7];
                                        for (int i108 = 0; i108 < iE7; i108++) {
                                            iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                        }
                                        int[] iArr3 = new int[iE7];
                                        if (z24) {
                                            if (lVar15 == null) {
                                                p245u.c.b("null verticalArrangement when isVertical == true");
                                                throw new KotlinNothingValueException();
                                            }
                                            lVar15.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                            iArr = iArr3;
                                            i45 = i55;
                                            i47 = 0;
                                            jVar2 = jVar3;
                                        } else {
                                            if (interfaceC0129e14 == null) {
                                                p245u.c.b("null horizontalArrangement when isVertical == false");
                                                throw new KotlinNothingValueException();
                                            }
                                            interfaceC0988x3 = interfaceC0988x3;
                                            iArr = iArr3;
                                            i45 = i55;
                                            jVar2 = jVar3;
                                            i47 = 0;
                                            interfaceC0129e14.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                        }
                                        Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                        Na.g gVarH = iVarQ;
                                        if (z25) {
                                            gVarH = Na.l.H(iVarQ);
                                        }
                                        int i109 = gVarH.f4687b;
                                        int i110 = gVarH.f4688c;
                                        int i111 = gVarH.f4689d;
                                        if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                            while (true) {
                                                int i112 = iArr[i109];
                                                m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                if (z25) {
                                                    i112 = (i106 - i112) - mVar9.f10761q;
                                                }
                                                mVar9.k(i112, iG4, iF);
                                                arrayList6.add(mVar9);
                                                if (i109 == i110) {
                                                    break;
                                                }
                                                i109 += i111;
                                            }
                                        }
                                        i46 = i47;
                                    } else {
                                        i45 = i55;
                                        j13 = j13;
                                        i62 = i62;
                                        i42 = i42;
                                        i46 = 0;
                                        jVar2 = jVar3;
                                        i107 = i107;
                                        int size8 = arrayList.size();
                                        int i113 = i43;
                                        for (int i114 = 0; i114 < size8; i114++) {
                                            m mVar10 = (m) arrayList.get(i114);
                                            i113 -= mVar10.f10763s;
                                            mVar10.k(i113, iG4, iF);
                                            arrayList6.add(mVar10);
                                        }
                                        int iE8 = iVar2.e();
                                        int i115 = i43;
                                        for (int i116 = 0; i116 < iE8; i116++) {
                                            m mVar11 = (m) iVar2.get(i116);
                                            mVar11.k(i115, iG4, iF);
                                            arrayList6.add(mVar11);
                                            i115 += mVar11.f10763s;
                                        }
                                        int size9 = arrayList3.size();
                                        for (int i117 = 0; i117 < size9; i117++) {
                                            m mVar12 = (m) arrayList3.get(i117);
                                            mVar12.k(i115, iG4, iF);
                                            arrayList6.add(mVar12);
                                            i115 += mVar12.f10763s;
                                        }
                                    }
                                    h hVar2 = jVar2.f10770a;
                                    lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                    if (!z19) {
                                        long jB2 = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB2, 0L)) {
                                            int i118 = z24 ? iF : iG4;
                                            long j14 = j13;
                                            iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                            iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                            int i119 = z24 ? iF : iG4;
                                            if (i119 != i118) {
                                                int size10 = arrayList6.size();
                                                for (int i120 = i46; i120 < size10; i120++) {
                                                    m mVar13 = (m) arrayList6.get(i120);
                                                    mVar13.f10766v = i119;
                                                    mVar13.f10768x = mVar13.f10754i + i119;
                                                }
                                            }
                                        }
                                    }
                                    final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final m invoke(Integer num) {
                                            return n.c(jVar2, num.intValue());
                                        }
                                    });
                                    if (z29) {
                                        m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                        if (mVar14 != null) {
                                            numValueOf = Integer.valueOf(mVar14.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else {
                                        m mVar15 = (m) iVar2.A();
                                        if (mVar15 != null) {
                                            numValueOf = Integer.valueOf(mVar15.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (z29) {
                                        m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                        if (mVar16 != null) {
                                            numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    } else {
                                        m mVar17 = (m) iVar2.C();
                                        if (mVar17 != null) {
                                            numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    }
                                    boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                    Integer numValueOf3 = Integer.valueOf(iG4);
                                    Integer numValueOf4 = Integer.valueOf(iF);
                                    final X x11 = lazyListState5.f10370u;
                                    final boolean z32 = z19;
                                    F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Y.a aVar2) {
                                            Y.a aVar3 = aVar2;
                                            final List<m> list2 = arrayList6;
                                            final List<m> list3 = listD;
                                            final boolean z33 = z32;
                                            Ia.l<Y.a, p293xa.r> lVar110 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(Y.a aVar4) {
                                                    Y.a aVar5 = aVar4;
                                                    List<m> list4 = list2;
                                                    boolean z34 = z33;
                                                    int size11 = list4.size();
                                                    for (int i121 = 0; i121 < size11; i121++) {
                                                        list4.get(i121).e(aVar5, z34);
                                                    }
                                                    List<m> list5 = list3;
                                                    boolean z35 = z33;
                                                    int size12 = list5.size();
                                                    for (int i122 = 0; i122 < size12; i122++) {
                                                        list5.get(i122).e(aVar5, z35);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            aVar3.f14225a = true;
                                            lVar110.invoke(aVar3);
                                            aVar3.f14225a = false;
                                            x11.getValue();
                                            return p293xa.r.f47939a;
                                        }
                                    });
                                    z110 = i46;
                                    lVar13 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                }
                                lazyListState.g(lVar13, interfaceC0988x3.S0(), z110);
                                return lVar13;
                            } catch (Throwable th) {
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                throw th;
                            }
                        }
                    };
                    c1086g = c1086gP;
                    c1086g.E(objF4);
                }
                Ia.p pVar4 = (Ia.p) objF4;
                if (z11) {
                    orientation = Orientation.f9957b;
                } else {
                    orientation = Orientation.f9958c;
                }
                orientation2 = orientation;
                if (z12) {
                    c1086g.L(-1513147781);
                    i33 = i30 | ((i21 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    lazyListState2 = lazyListState;
                    if (((i33 & 14) ^ 6) <= 4) {
                    }
                    if (((i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                    }
                    z17 = z18 | z13;
                    objF5 = c1086g.f();
                    if (z17) {
                        objF5 = new e(lazyListState2, i32);
                        c1086g.E(objF5);
                    } else {
                        objF5 = new e(lazyListState2, i32);
                        c1086g.E(objF5);
                    }
                    hVarA = C0974i.a((e) objF5, lazyListState2.f10363n, z10, orientation2);
                    c1086g.T(false);
                } else {
                    lazyListState2 = lazyListState;
                    c1086g.L(-1512720880);
                    c1086g.T(false);
                    hVarA = androidx.compose.ui.h.a.f13984b;
                }
                LazyLayoutKt.a(iVar, K.a(N.a(hVar.i(lazyListState2.f10360k).i(lazyListState2.f10361l), iVar, m12, orientation2, z12, z10).i(hVarA).i(lazyListState2.f10362m.f10635k), lazyListState, orientation2, z12, z10, jVar, lazyListState2.f10356f, false, e10, null), lazyListState2.f10364o, pVar4, c1086g, 0, 0);
                lVar3 = lVar5;
                i28 = i32;
                bVar2 = bVar4;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                i28 = i10;
                bVar2 = bVar;
                lVar3 = lVar;
                cVar2 = cVar;
                interfaceC0129e2 = interfaceC0129e;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.d.c cVar14 = cVar2;
                final C0945e.InterfaceC0129e interfaceC0129e13 = interfaceC0129e2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyListKt.a(hVar, lazyListState, l10, z10, z11, jVar, z12, e10, i28, bVar2, lVar3, cVar14, interfaceC0129e13, lVar2, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 196608;
        if ((i13 & 64) != 0) {
            i14 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c1086gP.c(z12)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i14 |= i15;
        }
        if ((i13 & 128) != 0) {
            if ((i11 & 12582912) == 0) {
                if (c1086gP.K(e10)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i14 |= i16;
            }
            i17 = i13 & 256;
            if (i17 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.h(i10)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i14 |= i18;
            }
            i19 = i13 & 512;
            if (i19 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.K(bVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i14 |= i20;
            }
            i21 = i14;
            i22 = i13 & 1024;
            if (i22 != 0) {
                i23 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c1086gP.K(lVar)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i12 | i24;
            } else {
                i23 = i12;
            }
            i25 = i13 & 2048;
            if (i25 != 0) {
                i23 |= 48;
            } else if ((i12 & 48) == 0) {
                i23 |= c1086gP.K(cVar) ? 32 : 16;
            }
            i26 = i23;
            i27 = i13 & 4096;
            if (i27 != 0) {
                if ((i12 & 384) == 0) {
                    i26 |= c1086gP.K(interfaceC0129e) ? 256 : 128;
                }
                if ((i13 & 8192) != 0) {
                    i26 |= 3072;
                } else if ((i12 & 3072) == 0) {
                    i26 |= c1086gP.k(lVar2) ? 2048 : 1024;
                }
                z13 = true;
                if ((i21 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c1086gP.C(i21 & 1, z14)) {
                    if (i17 != 0) {
                        i29 = 0;
                    } else {
                        i29 = i10;
                    }
                    if (i19 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i22 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i25 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    if (i27 != 0) {
                        interfaceC0129e2 = null;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    i30 = (i21 >> 3) & 14;
                    int i3114 = i30 | ((i26 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    xI = J0.i(lVar2, c1086gP);
                    if (((i3114 & 14) ^ 6) <= 4) {
                    }
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (z15) {
                        final c cVar15 = new c();
                        cVar15.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                        cVar15.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                        C1108r0 c1108r7 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE8 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyListIntervalContent invoke() {
                                return new LazyListIntervalContent(xI.getValue());
                            }
                        }, c1108r7);
                        objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final i invoke() {
                                LazyListIntervalContent value = derivedSnapshotStateE8.getValue();
                                return new i(lazyListState, value, cVar15, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                            }
                        }, c1108r7), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF);
                    } else {
                        final c cVar16 = new c();
                        cVar16.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                        cVar16.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                        C1108r0 c1108r8 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE9 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyListIntervalContent invoke() {
                                return new LazyListIntervalContent(xI.getValue());
                            }
                        }, c1108r8);
                        objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final i invoke() {
                                LazyListIntervalContent value = derivedSnapshotStateE9.getValue();
                                return new i(lazyListState, value, cVar16, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                            }
                        }, c1108r8), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF);
                    }
                    iVar = (Oa.i) objF;
                    int i3115 = i21 >> 9;
                    int i3116 = i30 | (i3115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    i31 = i29;
                    if (((i3116 & 14) ^ 6) <= 4) {
                    }
                    z16 = ((((i3116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.c(z11)) || (i3116 & 48) == 32) | ((((i3116 & 14) ^ 6) <= 4 && c1086gP.K(lazyListState)) || (i3116 & 6) == 4);
                    objF2 = c1086gP.f();
                    if (z16) {
                        objF2 = new d(lazyListState, z11);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new d(lazyListState, z11);
                        c1086gP.E(objF2);
                    }
                    M m13 = (M) objF2;
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF3);
                    }
                    a10 = (A) objF3;
                    s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                    if (((Boolean) c1086gP.x(CompositionLocalsKt.f14860v)).booleanValue()) {
                        c0130a = androidx.compose.foundation.lazy.layout.X.a.f10698a;
                    } else {
                        c0130a = null;
                    }
                    int i3117 = i26 << 18;
                    int i3118 = (i21 & 65520) | (i3115 & 458752) | (i3115 & 3670016) | (i3117 & 29360128) | (i3117 & 234881024) | ((i26 << 27) & 1879048192);
                    if (((i3118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32) {
                    }
                    zK = ((((i3118 & 896) ^ 384) <= 256 && c1086gP.K(l10)) || (i3118 & 384) == 256) | ((((i3118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lazyListState)) || (i3118 & 48) == 32) | ((((i3118 & 7168) ^ 3072) <= 2048 && c1086gP.c(z10)) || (i3118 & 3072) == 2048) | ((((57344 & i3118) ^ 24576) <= 16384 && c1086gP.c(z11)) || (i3118 & 24576) == 16384) | ((((3670016 & i3118) ^ 1572864) <= 1048576 && c1086gP.K(bVar3)) || (i3118 & 1572864) == 1048576) | ((((29360128 & i3118) ^ 12582912) <= 8388608 && c1086gP.K(cVar3)) || (i3118 & 12582912) == 8388608) | ((((234881024 & i3118) ^ 100663296) <= 67108864 && c1086gP.K(interfaceC0129e2)) || (i3118 & 100663296) == 67108864) | ((((1879048192 & i3118) ^ 805306368) <= 536870912 && c1086gP.K(lVar4)) || (i3118 & 805306368) == 536870912) | c1086gP.K(s10) | c1086gP.K(c0130a);
                    objF4 = c1086gP.f();
                    if (zK) {
                        final C0945e.l lVar13 = lVar4;
                        cVar2 = cVar3;
                        final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a9 = c0130a;
                        bVar4 = bVar3;
                        lVar5 = lVar13;
                        final C0945e.InterfaceC0129e interfaceC0129e14 = interfaceC0129e2;
                        c0153a2 = c0153a;
                        i32 = i31;
                        objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                            /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.p
                            public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                                int i3119;
                                float fMo1getSpacingD9Ej5fM;
                                long j;
                                int i40;
                                m mVar;
                                int i41;
                                m mVar2;
                                int i42;
                                List arrayList;
                                int i43;
                                int i44;
                                ArrayList arrayList2;
                                boolean z19;
                                List arrayList3;
                                int i45;
                                int i46;
                                final j jVar2;
                                Integer numValueOf;
                                Integer numValueOf2;
                                boolean z110;
                                l lVar14;
                                int[] iArr;
                                int i47;
                                m mVar3;
                                float f10;
                                int i48;
                                m mVar4;
                                Object obj;
                                int i49;
                                Object obj2;
                                int index;
                                int iMin;
                                m mVar5;
                                Object obj3;
                                int i50;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                final long j10 = aVar.f20475a;
                                lazyListState.f10367r.getValue();
                                boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                                Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                                int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE3 = interfaceC0988x2.e1(l10.d());
                                int iE4 = interfaceC0988x2.e1(l10.a());
                                final int i51 = iE3 + iE4;
                                final int i52 = iE1 + iE2;
                                boolean z21 = z11;
                                int i53 = z21 ? i51 : i52;
                                if (z21 && !z10) {
                                    i3119 = iE3;
                                } else if (z21 && z10) {
                                    i3119 = iE4;
                                } else {
                                    i3119 = (z21 || z10) ? iE2 : iE1;
                                }
                                int i54 = i53 - i3119;
                                long jI = p013b0.b.i(j10, -i52, -i51);
                                h hVarInvoke = iVar.invoke();
                                c cVarH = hVarInvoke.h();
                                int iH = p013b0.a.h(jI);
                                int iG = p013b0.a.g(jI);
                                cVarH.f10386a.m(iH);
                                cVarH.f10387b.m(iG);
                                if (z11) {
                                    C0945e.l lVar15 = lVar13;
                                    if (lVar15 == null) {
                                        p245u.c.b("null verticalArrangement when isVertical == true");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = lVar15.mo1getSpacingD9Ej5fM();
                                } else {
                                    C0945e.InterfaceC0129e interfaceC0129e15 = interfaceC0129e14;
                                    if (interfaceC0129e15 == null) {
                                        p245u.c.b("null horizontalAlignment when isVertical == false");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = interfaceC0129e15.mo1getSpacingD9Ej5fM();
                                }
                                int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                                int iB = hVarInvoke.b();
                                int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                                boolean z22 = z10;
                                if (!z22 || iG2 > 0) {
                                    j = ((long) iE1) << 32;
                                } else {
                                    boolean z23 = z11;
                                    if (!z23) {
                                        iE1 += iG2;
                                    }
                                    if (z23) {
                                        iE3 += iG2;
                                    }
                                    j = ((long) iE1) << 32;
                                }
                                int i55 = iG2;
                                int i56 = i3119;
                                final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                                j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                                LazyListState lazyListState3 = lazyListState;
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    int iH2 = lazyListState3.h();
                                    q qVar = lazyListState3.f10354d;
                                    int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                    if (iH2 != iK) {
                                        ((C1081d0) qVar.f10774b).m(iK);
                                        ((D) qVar.f10777e).e(iH2);
                                    }
                                    int i57 = lazyListState3.i();
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    LazyListState lazyListState4 = lazyListState;
                                    List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                    float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                    boolean z24 = z11;
                                    C0945e.l lVar16 = lVar13;
                                    C0945e.InterfaceC0129e interfaceC0129e16 = interfaceC0129e14;
                                    boolean z25 = z10;
                                    LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                    int i58 = i31;
                                    boolean zS0 = interfaceC0988x3.S0();
                                    LazyListState lazyListState5 = lazyListState;
                                    l lVar17 = lazyListState5.f10353c;
                                    A a11 = a10;
                                    int i59 = i57;
                                    S s11 = s10;
                                    androidx.compose.foundation.lazy.layout.X x10 = c0130a9;
                                    l lVar18 = lVar17;
                                    Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // Ia.q
                                        public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar19) {
                                            int iIntValue = num.intValue();
                                            int iIntValue2 = num2.intValue();
                                            return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar19);
                                        }
                                    };
                                    int i60 = i56;
                                    if (i60 < 0) {
                                        p245u.c.a("invalid beforeContentPadding");
                                    }
                                    if (i54 < 0) {
                                        p245u.c.a("invalid afterContentPadding");
                                    }
                                    if (iB <= 0) {
                                        int iJ = p013b0.a.j(jI);
                                        int i61 = p013b0.a.i(jI);
                                        lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                        if (!zS0) {
                                            long jB = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB, 0L)) {
                                                int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                                i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                                iJ = iG3;
                                            }
                                        }
                                        lVar14 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                            @Override // Ia.l
                                            public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                                return p293xa.r.f47939a;
                                            }
                                        }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                        z110 = 0;
                                    } else {
                                        long j11 = jI;
                                        boolean z26 = zS0;
                                        int i62 = iB;
                                        if (iK >= i62) {
                                            iK = i62 - 1;
                                            i59 = 0;
                                        }
                                        int iRound = Math.round(fFloatValue);
                                        int i63 = i59 - iRound;
                                        if (iK == 0 && i63 < 0) {
                                            iRound += i63;
                                            i63 = 0;
                                        }
                                        kotlin.collections.i iVar2 = new kotlin.collections.i();
                                        int i64 = -i60;
                                        int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                        int i66 = i63 + i65;
                                        int iMax = 0;
                                        int i67 = iK;
                                        while (i66 < 0 && i67 > 0) {
                                            long j12 = j11;
                                            int i68 = i67 - 1;
                                            m mVarC = n.c(jVar3, i68);
                                            iVar2.add(0, mVarC);
                                            iMax = Math.max(iMax, mVarC.f10764t);
                                            i66 += mVarC.f10763s;
                                            i67 = i68;
                                            j11 = j12;
                                        }
                                        long j13 = j11;
                                        if (i66 < i65) {
                                            iRound -= i65 - i66;
                                            i66 = i65;
                                        }
                                        int i69 = i66 - i65;
                                        int i70 = i55 + i54;
                                        int i71 = i70 < 0 ? 0 : i70;
                                        int i72 = -i69;
                                        int i73 = iMax;
                                        int i74 = i67;
                                        int i75 = 0;
                                        boolean z27 = false;
                                        while (i75 < iVar2.f43019d) {
                                            if (i72 >= i71) {
                                                iVar2.k(i75);
                                                z27 = true;
                                            } else {
                                                i74++;
                                                i72 += ((m) iVar2.get(i75)).f10763s;
                                                i75++;
                                            }
                                        }
                                        int i76 = i69;
                                        int iMax2 = i73;
                                        boolean z28 = z27;
                                        int i77 = i74;
                                        while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                            int i78 = i71;
                                            m mVarC2 = n.c(jVar3, i77);
                                            l lVar19 = lVar18;
                                            int i79 = mVarC2.f10763s;
                                            int i80 = i72 + i79;
                                            if (i80 > i65 || i77 == i62 - 1) {
                                                iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                                iVar2.addLast(mVarC2);
                                                i50 = 1;
                                            } else {
                                                i76 -= i79;
                                                i67 = i77 + 1;
                                                i50 = 1;
                                                z28 = true;
                                            }
                                            i77 += i50;
                                            lVar18 = lVar19;
                                            i71 = i78;
                                            i72 = i80;
                                        }
                                        l lVar110 = lVar18;
                                        if (i72 < i55) {
                                            int i81 = i55 - i72;
                                            i76 -= i81;
                                            i72 += i81;
                                            while (i76 < i60 && i67 > 0) {
                                                int i82 = i67 - 1;
                                                m mVarC3 = n.c(jVar3, i82);
                                                i67 = i82;
                                                iVar2.add(0, mVarC3);
                                                iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                                i76 += mVarC3.f10763s;
                                            }
                                            int i83 = i81 + iRound;
                                            if (i76 < 0) {
                                                i72 += i76;
                                                i40 = i83 + i76;
                                                i76 = 0;
                                            } else {
                                                i40 = i83;
                                            }
                                        } else {
                                            i40 = iRound;
                                        }
                                        int i84 = i72;
                                        float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                        float f12 = fFloatValue - f11;
                                        float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                        if (i76 < 0) {
                                            p245u.c.a("negative currentFirstItemScrollOffset");
                                        }
                                        int i85 = -i76;
                                        m mVar6 = (m) iVar2.first();
                                        if (i60 > 0 || iE5 < 0) {
                                            int iE = iVar2.e();
                                            int i86 = i76;
                                            int i87 = 0;
                                            while (true) {
                                                if (i87 >= iE) {
                                                    mVar = mVar6;
                                                    break;
                                                }
                                                mVar = mVar6;
                                                int i88 = ((m) iVar2.get(i87)).f10763s;
                                                if (i86 == 0 || i88 > i86) {
                                                    break;
                                                }
                                                int i89 = iE;
                                                if (i87 == kotlin.collections.l.r(iVar2)) {
                                                    break;
                                                }
                                                i86 -= i88;
                                                i87++;
                                                mVar6 = (m) iVar2.get(i87);
                                                iE = i89;
                                            }
                                            m mVar7 = mVar;
                                            i41 = i86;
                                            mVar2 = mVar7;
                                        } else {
                                            mVar2 = mVar6;
                                            i41 = i76;
                                        }
                                        int iMax3 = Math.max(0, i67 - i58);
                                        int i90 = i67 - 1;
                                        if (iMax3 <= i90) {
                                            arrayList = null;
                                            while (true) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                i42 = i60;
                                                arrayList.add(n.c(jVar3, i90));
                                                if (i90 == iMax3) {
                                                    break;
                                                }
                                                i90--;
                                                i60 = i42;
                                            }
                                        } else {
                                            i42 = i60;
                                            arrayList = null;
                                        }
                                        List<Integer> list = listA;
                                        int size = list.size() - 1;
                                        float f14 = f13;
                                        if (size >= 0) {
                                            int i91 = size;
                                            while (true) {
                                                int i92 = i91 - 1;
                                                int iIntValue = listA.get(i91).intValue();
                                                if (iIntValue < iMax3) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(n.c(jVar3, iIntValue));
                                                }
                                                if (i92 < 0) {
                                                    break;
                                                }
                                                i91 = i92;
                                            }
                                        }
                                        if (arrayList == null) {
                                            arrayList = EmptyList.f42983b;
                                        }
                                        int iMax4 = iMax2;
                                        int i93 = 0;
                                        for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                            iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                            i93++;
                                        }
                                        int i94 = iMax4;
                                        int i95 = i62 - 1;
                                        int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                        int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                        if (i96 <= iMin2) {
                                            ArrayList arrayList4 = null;
                                            while (true) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                i44 = i77;
                                                arrayList2 = arrayList4;
                                                i43 = i85;
                                                arrayList2.add(n.c(jVar3, i96));
                                                if (i96 == iMin2) {
                                                    break;
                                                }
                                                i96++;
                                                i85 = i43;
                                                arrayList4 = arrayList2;
                                                i77 = i44;
                                            }
                                        } else {
                                            i43 = i85;
                                            i44 = i77;
                                            arrayList2 = null;
                                        }
                                        if (!z26 || lVar110 == null || lVar110.f().isEmpty()) {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList2;
                                        } else {
                                            List<m> listF = lVar110.f();
                                            int size3 = listF.size() - 1;
                                            ArrayList arrayList5 = arrayList2;
                                            int i97 = -1;
                                            while (true) {
                                                if (i97 >= size3) {
                                                    mVar3 = null;
                                                    break;
                                                }
                                                if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                    mVar3 = listF.get(size3);
                                                    break;
                                                }
                                                i97 = -1;
                                                size3--;
                                            }
                                            g gVar = (g) kotlin.collections.q.V(lVar110.f());
                                            if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                                arrayList3 = arrayList5;
                                                while (true) {
                                                    z19 = z26;
                                                    if (arrayList3 != null) {
                                                        int size4 = arrayList3.size();
                                                        int i98 = 0;
                                                        while (true) {
                                                            if (i98 >= size4) {
                                                                obj3 = null;
                                                                break;
                                                            }
                                                            obj3 = arrayList3.get(i98);
                                                            int i99 = size4;
                                                            if (((m) obj3).f10746a == index) {
                                                                break;
                                                            }
                                                            i98++;
                                                            size4 = i99;
                                                        }
                                                        mVar5 = (m) obj3;
                                                    } else {
                                                        mVar5 = null;
                                                    }
                                                    if (mVar5 == null) {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index));
                                                    }
                                                    if (index == iMin) {
                                                        break;
                                                    }
                                                    index++;
                                                    z26 = z19;
                                                    i84 = i84;
                                                }
                                            } else {
                                                z19 = z26;
                                                i84 = i84;
                                                arrayList3 = arrayList5;
                                            }
                                            float offset = ((lVar110.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                            if (offset > 0.0f) {
                                                int index2 = gVar.getIndex() + 1;
                                                int i100 = 0;
                                                while (index2 < i62 && i100 < offset) {
                                                    if (index2 <= iMin2) {
                                                        int iE6 = iVar2.e();
                                                        int i101 = 0;
                                                        while (true) {
                                                            if (i101 >= iE6) {
                                                                f10 = offset;
                                                                obj2 = null;
                                                                break;
                                                            }
                                                            obj2 = iVar2.get(i101);
                                                            f10 = offset;
                                                            if (((m) obj2).f10746a == index2) {
                                                                break;
                                                            }
                                                            i101++;
                                                            offset = f10;
                                                        }
                                                        mVar4 = (m) obj2;
                                                        i48 = 1;
                                                    } else {
                                                        f10 = offset;
                                                        if (arrayList3 != null) {
                                                            int size5 = arrayList3.size();
                                                            int i102 = 0;
                                                            while (true) {
                                                                if (i102 >= size5) {
                                                                    i48 = 1;
                                                                    obj = null;
                                                                    break;
                                                                }
                                                                obj = arrayList3.get(i102);
                                                                int i103 = size5;
                                                                if (((m) obj).f10746a == index2) {
                                                                    i48 = 1;
                                                                    break;
                                                                }
                                                                i102++;
                                                                size5 = i103;
                                                            }
                                                            mVar4 = (m) obj;
                                                        } else {
                                                            i48 = 1;
                                                            mVar4 = null;
                                                        }
                                                    }
                                                    if (mVar4 != null) {
                                                        index2 += i48;
                                                        i49 = mVar4.f10763s;
                                                    } else {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index2));
                                                        index2++;
                                                        i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                    }
                                                    i100 += i49;
                                                    offset = f10;
                                                }
                                            }
                                        }
                                        if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                            iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                        }
                                        int size6 = list.size();
                                        for (int i104 = 0; i104 < size6; i104++) {
                                            int iIntValue2 = listA.get(i104).intValue();
                                            if (iIntValue2 > iMin2) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, iIntValue2));
                                            }
                                        }
                                        if (arrayList3 == null) {
                                            arrayList3 = EmptyList.f42983b;
                                        }
                                        int size7 = arrayList3.size();
                                        int iMax5 = i94;
                                        for (int i105 = 0; i105 < size7; i105++) {
                                            iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                        }
                                        boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                        int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                        if (z24) {
                                            iMax5 = i84;
                                        }
                                        int iF = p013b0.b.f(iMax5, j13);
                                        int i106 = z24 ? iF : iG4;
                                        int i107 = i84;
                                        boolean z30 = i107 < Math.min(i106, i55);
                                        if (z30 && i43 != 0) {
                                            p245u.c.c("non-zero itemsScrollOffset");
                                        }
                                        m mVar8 = mVar2;
                                        final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                        if (z30) {
                                            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                                p245u.c.a("no extra items");
                                            }
                                            int iE7 = iVar2.e();
                                            int[] iArr2 = new int[iE7];
                                            for (int i108 = 0; i108 < iE7; i108++) {
                                                iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                            }
                                            int[] iArr3 = new int[iE7];
                                            if (z24) {
                                                if (lVar16 == null) {
                                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                                    throw new KotlinNothingValueException();
                                                }
                                                lVar16.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                                iArr = iArr3;
                                                i45 = i55;
                                                i47 = 0;
                                                jVar2 = jVar3;
                                            } else {
                                                if (interfaceC0129e16 == null) {
                                                    p245u.c.b("null horizontalArrangement when isVertical == false");
                                                    throw new KotlinNothingValueException();
                                                }
                                                interfaceC0988x3 = interfaceC0988x3;
                                                iArr = iArr3;
                                                i45 = i55;
                                                jVar2 = jVar3;
                                                i47 = 0;
                                                interfaceC0129e16.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                            }
                                            Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                            Na.g gVarH = iVarQ;
                                            if (z25) {
                                                gVarH = Na.l.H(iVarQ);
                                            }
                                            int i109 = gVarH.f4687b;
                                            int i110 = gVarH.f4688c;
                                            int i111 = gVarH.f4689d;
                                            if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                                while (true) {
                                                    int i112 = iArr[i109];
                                                    m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                    if (z25) {
                                                        i112 = (i106 - i112) - mVar9.f10761q;
                                                    }
                                                    mVar9.k(i112, iG4, iF);
                                                    arrayList6.add(mVar9);
                                                    if (i109 == i110) {
                                                        break;
                                                    }
                                                    i109 += i111;
                                                }
                                            }
                                            i46 = i47;
                                        } else {
                                            i45 = i55;
                                            j13 = j13;
                                            i62 = i62;
                                            i42 = i42;
                                            i46 = 0;
                                            jVar2 = jVar3;
                                            i107 = i107;
                                            int size8 = arrayList.size();
                                            int i113 = i43;
                                            for (int i114 = 0; i114 < size8; i114++) {
                                                m mVar10 = (m) arrayList.get(i114);
                                                i113 -= mVar10.f10763s;
                                                mVar10.k(i113, iG4, iF);
                                                arrayList6.add(mVar10);
                                            }
                                            int iE8 = iVar2.e();
                                            int i115 = i43;
                                            for (int i116 = 0; i116 < iE8; i116++) {
                                                m mVar11 = (m) iVar2.get(i116);
                                                mVar11.k(i115, iG4, iF);
                                                arrayList6.add(mVar11);
                                                i115 += mVar11.f10763s;
                                            }
                                            int size9 = arrayList3.size();
                                            for (int i117 = 0; i117 < size9; i117++) {
                                                m mVar12 = (m) arrayList3.get(i117);
                                                mVar12.k(i115, iG4, iF);
                                                arrayList6.add(mVar12);
                                                i115 += mVar12.f10763s;
                                            }
                                        }
                                        h hVar2 = jVar2.f10770a;
                                        lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                        if (!z19) {
                                            long jB2 = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB2, 0L)) {
                                                int i118 = z24 ? iF : iG4;
                                                long j14 = j13;
                                                iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                                iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                                int i119 = z24 ? iF : iG4;
                                                if (i119 != i118) {
                                                    int size10 = arrayList6.size();
                                                    for (int i120 = i46; i120 < size10; i120++) {
                                                        m mVar13 = (m) arrayList6.get(i120);
                                                        mVar13.f10766v = i119;
                                                        mVar13.f10768x = mVar13.f10754i + i119;
                                                    }
                                                }
                                            }
                                        }
                                        final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final m invoke(Integer num) {
                                                return n.c(jVar2, num.intValue());
                                            }
                                        });
                                        if (z29) {
                                            m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                            if (mVar14 != null) {
                                                numValueOf = Integer.valueOf(mVar14.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else {
                                            m mVar15 = (m) iVar2.A();
                                            if (mVar15 != null) {
                                                numValueOf = Integer.valueOf(mVar15.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        }
                                        if (z29) {
                                            m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                            if (mVar16 != null) {
                                                numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        } else {
                                            m mVar17 = (m) iVar2.C();
                                            if (mVar17 != null) {
                                                numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        }
                                        boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                        Integer numValueOf3 = Integer.valueOf(iG4);
                                        Integer numValueOf4 = Integer.valueOf(iF);
                                        final X x11 = lazyListState5.f10370u;
                                        final boolean z32 = z19;
                                        F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Y.a aVar2) {
                                                Y.a aVar3 = aVar2;
                                                final List<m> list2 = arrayList6;
                                                final List<m> list3 = listD;
                                                final boolean z33 = z32;
                                                Ia.l<Y.a, p293xa.r> lVar111 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(Y.a aVar4) {
                                                        Y.a aVar5 = aVar4;
                                                        List<m> list4 = list2;
                                                        boolean z34 = z33;
                                                        int size11 = list4.size();
                                                        for (int i121 = 0; i121 < size11; i121++) {
                                                            list4.get(i121).e(aVar5, z34);
                                                        }
                                                        List<m> list5 = list3;
                                                        boolean z35 = z33;
                                                        int size12 = list5.size();
                                                        for (int i122 = 0; i122 < size12; i122++) {
                                                            list5.get(i122).e(aVar5, z35);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                aVar3.f14225a = true;
                                                lVar111.invoke(aVar3);
                                                aVar3.f14225a = false;
                                                x11.getValue();
                                                return p293xa.r.f47939a;
                                            }
                                        });
                                        z110 = i46;
                                        lVar14 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    }
                                    lazyListState.g(lVar14, interfaceC0988x3.S0(), z110);
                                    return lVar14;
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                        };
                        c1086g = c1086gP;
                        c1086g.E(objF4);
                    } else {
                        final C0945e.l lVar14 = lVar4;
                        cVar2 = cVar3;
                        final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a10 = c0130a;
                        bVar4 = bVar3;
                        lVar5 = lVar14;
                        final C0945e.InterfaceC0129e interfaceC0129e15 = interfaceC0129e2;
                        c0153a2 = c0153a;
                        i32 = i31;
                        objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                            /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.p
                            public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                                int i3119;
                                float fMo1getSpacingD9Ej5fM;
                                long j;
                                int i40;
                                m mVar;
                                int i41;
                                m mVar2;
                                int i42;
                                List arrayList;
                                int i43;
                                int i44;
                                ArrayList arrayList2;
                                boolean z19;
                                List arrayList3;
                                int i45;
                                int i46;
                                final j jVar2;
                                Integer numValueOf;
                                Integer numValueOf2;
                                boolean z110;
                                l lVar15;
                                int[] iArr;
                                int i47;
                                m mVar3;
                                float f10;
                                int i48;
                                m mVar4;
                                Object obj;
                                int i49;
                                Object obj2;
                                int index;
                                int iMin;
                                m mVar5;
                                Object obj3;
                                int i50;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                final long j10 = aVar.f20475a;
                                lazyListState.f10367r.getValue();
                                boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                                Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                                int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                                int iE3 = interfaceC0988x2.e1(l10.d());
                                int iE4 = interfaceC0988x2.e1(l10.a());
                                final int i51 = iE3 + iE4;
                                final int i52 = iE1 + iE2;
                                boolean z21 = z11;
                                int i53 = z21 ? i51 : i52;
                                if (z21 && !z10) {
                                    i3119 = iE3;
                                } else if (z21 && z10) {
                                    i3119 = iE4;
                                } else {
                                    i3119 = (z21 || z10) ? iE2 : iE1;
                                }
                                int i54 = i53 - i3119;
                                long jI = p013b0.b.i(j10, -i52, -i51);
                                h hVarInvoke = iVar.invoke();
                                c cVarH = hVarInvoke.h();
                                int iH = p013b0.a.h(jI);
                                int iG = p013b0.a.g(jI);
                                cVarH.f10386a.m(iH);
                                cVarH.f10387b.m(iG);
                                if (z11) {
                                    C0945e.l lVar16 = lVar14;
                                    if (lVar16 == null) {
                                        p245u.c.b("null verticalArrangement when isVertical == true");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = lVar16.mo1getSpacingD9Ej5fM();
                                } else {
                                    C0945e.InterfaceC0129e interfaceC0129e16 = interfaceC0129e15;
                                    if (interfaceC0129e16 == null) {
                                        p245u.c.b("null horizontalAlignment when isVertical == false");
                                        throw new KotlinNothingValueException();
                                    }
                                    fMo1getSpacingD9Ej5fM = interfaceC0129e16.mo1getSpacingD9Ej5fM();
                                }
                                int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                                int iB = hVarInvoke.b();
                                int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                                boolean z22 = z10;
                                if (!z22 || iG2 > 0) {
                                    j = ((long) iE1) << 32;
                                } else {
                                    boolean z23 = z11;
                                    if (!z23) {
                                        iE1 += iG2;
                                    }
                                    if (z23) {
                                        iE3 += iG2;
                                    }
                                    j = ((long) iE1) << 32;
                                }
                                int i55 = iG2;
                                int i56 = i3119;
                                final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                                j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                                LazyListState lazyListState3 = lazyListState;
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    int iH2 = lazyListState3.h();
                                    q qVar = lazyListState3.f10354d;
                                    int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                    if (iH2 != iK) {
                                        ((C1081d0) qVar.f10774b).m(iK);
                                        ((D) qVar.f10777e).e(iH2);
                                    }
                                    int i57 = lazyListState3.i();
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    LazyListState lazyListState4 = lazyListState;
                                    List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                    float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                    boolean z24 = z11;
                                    C0945e.l lVar17 = lVar14;
                                    C0945e.InterfaceC0129e interfaceC0129e17 = interfaceC0129e15;
                                    boolean z25 = z10;
                                    LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                    int i58 = i31;
                                    boolean zS0 = interfaceC0988x3.S0();
                                    LazyListState lazyListState5 = lazyListState;
                                    l lVar18 = lazyListState5.f10353c;
                                    A a11 = a10;
                                    int i59 = i57;
                                    S s11 = s10;
                                    androidx.compose.foundation.lazy.layout.X x10 = c0130a10;
                                    l lVar19 = lVar18;
                                    Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // Ia.q
                                        public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar110) {
                                            int iIntValue = num.intValue();
                                            int iIntValue2 = num2.intValue();
                                            return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar110);
                                        }
                                    };
                                    int i60 = i56;
                                    if (i60 < 0) {
                                        p245u.c.a("invalid beforeContentPadding");
                                    }
                                    if (i54 < 0) {
                                        p245u.c.a("invalid afterContentPadding");
                                    }
                                    if (iB <= 0) {
                                        int iJ = p013b0.a.j(jI);
                                        int i61 = p013b0.a.i(jI);
                                        lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                        if (!zS0) {
                                            long jB = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB, 0L)) {
                                                int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                                i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                                iJ = iG3;
                                            }
                                        }
                                        lVar15 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                            @Override // Ia.l
                                            public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                                return p293xa.r.f47939a;
                                            }
                                        }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                        z110 = 0;
                                    } else {
                                        long j11 = jI;
                                        boolean z26 = zS0;
                                        int i62 = iB;
                                        if (iK >= i62) {
                                            iK = i62 - 1;
                                            i59 = 0;
                                        }
                                        int iRound = Math.round(fFloatValue);
                                        int i63 = i59 - iRound;
                                        if (iK == 0 && i63 < 0) {
                                            iRound += i63;
                                            i63 = 0;
                                        }
                                        kotlin.collections.i iVar2 = new kotlin.collections.i();
                                        int i64 = -i60;
                                        int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                        int i66 = i63 + i65;
                                        int iMax = 0;
                                        int i67 = iK;
                                        while (i66 < 0 && i67 > 0) {
                                            long j12 = j11;
                                            int i68 = i67 - 1;
                                            m mVarC = n.c(jVar3, i68);
                                            iVar2.add(0, mVarC);
                                            iMax = Math.max(iMax, mVarC.f10764t);
                                            i66 += mVarC.f10763s;
                                            i67 = i68;
                                            j11 = j12;
                                        }
                                        long j13 = j11;
                                        if (i66 < i65) {
                                            iRound -= i65 - i66;
                                            i66 = i65;
                                        }
                                        int i69 = i66 - i65;
                                        int i70 = i55 + i54;
                                        int i71 = i70 < 0 ? 0 : i70;
                                        int i72 = -i69;
                                        int i73 = iMax;
                                        int i74 = i67;
                                        int i75 = 0;
                                        boolean z27 = false;
                                        while (i75 < iVar2.f43019d) {
                                            if (i72 >= i71) {
                                                iVar2.k(i75);
                                                z27 = true;
                                            } else {
                                                i74++;
                                                i72 += ((m) iVar2.get(i75)).f10763s;
                                                i75++;
                                            }
                                        }
                                        int i76 = i69;
                                        int iMax2 = i73;
                                        boolean z28 = z27;
                                        int i77 = i74;
                                        while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                            int i78 = i71;
                                            m mVarC2 = n.c(jVar3, i77);
                                            l lVar110 = lVar19;
                                            int i79 = mVarC2.f10763s;
                                            int i80 = i72 + i79;
                                            if (i80 > i65 || i77 == i62 - 1) {
                                                iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                                iVar2.addLast(mVarC2);
                                                i50 = 1;
                                            } else {
                                                i76 -= i79;
                                                i67 = i77 + 1;
                                                i50 = 1;
                                                z28 = true;
                                            }
                                            i77 += i50;
                                            lVar19 = lVar110;
                                            i71 = i78;
                                            i72 = i80;
                                        }
                                        l lVar111 = lVar19;
                                        if (i72 < i55) {
                                            int i81 = i55 - i72;
                                            i76 -= i81;
                                            i72 += i81;
                                            while (i76 < i60 && i67 > 0) {
                                                int i82 = i67 - 1;
                                                m mVarC3 = n.c(jVar3, i82);
                                                i67 = i82;
                                                iVar2.add(0, mVarC3);
                                                iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                                i76 += mVarC3.f10763s;
                                            }
                                            int i83 = i81 + iRound;
                                            if (i76 < 0) {
                                                i72 += i76;
                                                i40 = i83 + i76;
                                                i76 = 0;
                                            } else {
                                                i40 = i83;
                                            }
                                        } else {
                                            i40 = iRound;
                                        }
                                        int i84 = i72;
                                        float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                        float f12 = fFloatValue - f11;
                                        float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                        if (i76 < 0) {
                                            p245u.c.a("negative currentFirstItemScrollOffset");
                                        }
                                        int i85 = -i76;
                                        m mVar6 = (m) iVar2.first();
                                        if (i60 > 0 || iE5 < 0) {
                                            int iE = iVar2.e();
                                            int i86 = i76;
                                            int i87 = 0;
                                            while (true) {
                                                if (i87 >= iE) {
                                                    mVar = mVar6;
                                                    break;
                                                }
                                                mVar = mVar6;
                                                int i88 = ((m) iVar2.get(i87)).f10763s;
                                                if (i86 == 0 || i88 > i86) {
                                                    break;
                                                }
                                                int i89 = iE;
                                                if (i87 == kotlin.collections.l.r(iVar2)) {
                                                    break;
                                                }
                                                i86 -= i88;
                                                i87++;
                                                mVar6 = (m) iVar2.get(i87);
                                                iE = i89;
                                            }
                                            m mVar7 = mVar;
                                            i41 = i86;
                                            mVar2 = mVar7;
                                        } else {
                                            mVar2 = mVar6;
                                            i41 = i76;
                                        }
                                        int iMax3 = Math.max(0, i67 - i58);
                                        int i90 = i67 - 1;
                                        if (iMax3 <= i90) {
                                            arrayList = null;
                                            while (true) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                i42 = i60;
                                                arrayList.add(n.c(jVar3, i90));
                                                if (i90 == iMax3) {
                                                    break;
                                                }
                                                i90--;
                                                i60 = i42;
                                            }
                                        } else {
                                            i42 = i60;
                                            arrayList = null;
                                        }
                                        List<Integer> list = listA;
                                        int size = list.size() - 1;
                                        float f14 = f13;
                                        if (size >= 0) {
                                            int i91 = size;
                                            while (true) {
                                                int i92 = i91 - 1;
                                                int iIntValue = listA.get(i91).intValue();
                                                if (iIntValue < iMax3) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(n.c(jVar3, iIntValue));
                                                }
                                                if (i92 < 0) {
                                                    break;
                                                }
                                                i91 = i92;
                                            }
                                        }
                                        if (arrayList == null) {
                                            arrayList = EmptyList.f42983b;
                                        }
                                        int iMax4 = iMax2;
                                        int i93 = 0;
                                        for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                            iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                            i93++;
                                        }
                                        int i94 = iMax4;
                                        int i95 = i62 - 1;
                                        int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                        int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                        if (i96 <= iMin2) {
                                            ArrayList arrayList4 = null;
                                            while (true) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                i44 = i77;
                                                arrayList2 = arrayList4;
                                                i43 = i85;
                                                arrayList2.add(n.c(jVar3, i96));
                                                if (i96 == iMin2) {
                                                    break;
                                                }
                                                i96++;
                                                i85 = i43;
                                                arrayList4 = arrayList2;
                                                i77 = i44;
                                            }
                                        } else {
                                            i43 = i85;
                                            i44 = i77;
                                            arrayList2 = null;
                                        }
                                        if (!z26 || lVar111 == null || lVar111.f().isEmpty()) {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList2;
                                        } else {
                                            List<m> listF = lVar111.f();
                                            int size3 = listF.size() - 1;
                                            ArrayList arrayList5 = arrayList2;
                                            int i97 = -1;
                                            while (true) {
                                                if (i97 >= size3) {
                                                    mVar3 = null;
                                                    break;
                                                }
                                                if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                    mVar3 = listF.get(size3);
                                                    break;
                                                }
                                                i97 = -1;
                                                size3--;
                                            }
                                            g gVar = (g) kotlin.collections.q.V(lVar111.f());
                                            if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                                arrayList3 = arrayList5;
                                                while (true) {
                                                    z19 = z26;
                                                    if (arrayList3 != null) {
                                                        int size4 = arrayList3.size();
                                                        int i98 = 0;
                                                        while (true) {
                                                            if (i98 >= size4) {
                                                                obj3 = null;
                                                                break;
                                                            }
                                                            obj3 = arrayList3.get(i98);
                                                            int i99 = size4;
                                                            if (((m) obj3).f10746a == index) {
                                                                break;
                                                            }
                                                            i98++;
                                                            size4 = i99;
                                                        }
                                                        mVar5 = (m) obj3;
                                                    } else {
                                                        mVar5 = null;
                                                    }
                                                    if (mVar5 == null) {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index));
                                                    }
                                                    if (index == iMin) {
                                                        break;
                                                    }
                                                    index++;
                                                    z26 = z19;
                                                    i84 = i84;
                                                }
                                            } else {
                                                z19 = z26;
                                                i84 = i84;
                                                arrayList3 = arrayList5;
                                            }
                                            float offset = ((lVar111.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                            if (offset > 0.0f) {
                                                int index2 = gVar.getIndex() + 1;
                                                int i100 = 0;
                                                while (index2 < i62 && i100 < offset) {
                                                    if (index2 <= iMin2) {
                                                        int iE6 = iVar2.e();
                                                        int i101 = 0;
                                                        while (true) {
                                                            if (i101 >= iE6) {
                                                                f10 = offset;
                                                                obj2 = null;
                                                                break;
                                                            }
                                                            obj2 = iVar2.get(i101);
                                                            f10 = offset;
                                                            if (((m) obj2).f10746a == index2) {
                                                                break;
                                                            }
                                                            i101++;
                                                            offset = f10;
                                                        }
                                                        mVar4 = (m) obj2;
                                                        i48 = 1;
                                                    } else {
                                                        f10 = offset;
                                                        if (arrayList3 != null) {
                                                            int size5 = arrayList3.size();
                                                            int i102 = 0;
                                                            while (true) {
                                                                if (i102 >= size5) {
                                                                    i48 = 1;
                                                                    obj = null;
                                                                    break;
                                                                }
                                                                obj = arrayList3.get(i102);
                                                                int i103 = size5;
                                                                if (((m) obj).f10746a == index2) {
                                                                    i48 = 1;
                                                                    break;
                                                                }
                                                                i102++;
                                                                size5 = i103;
                                                            }
                                                            mVar4 = (m) obj;
                                                        } else {
                                                            i48 = 1;
                                                            mVar4 = null;
                                                        }
                                                    }
                                                    if (mVar4 != null) {
                                                        index2 += i48;
                                                        i49 = mVar4.f10763s;
                                                    } else {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(n.c(jVar3, index2));
                                                        index2++;
                                                        i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                    }
                                                    i100 += i49;
                                                    offset = f10;
                                                }
                                            }
                                        }
                                        if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                            iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                        }
                                        int size6 = list.size();
                                        for (int i104 = 0; i104 < size6; i104++) {
                                            int iIntValue2 = listA.get(i104).intValue();
                                            if (iIntValue2 > iMin2) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, iIntValue2));
                                            }
                                        }
                                        if (arrayList3 == null) {
                                            arrayList3 = EmptyList.f42983b;
                                        }
                                        int size7 = arrayList3.size();
                                        int iMax5 = i94;
                                        for (int i105 = 0; i105 < size7; i105++) {
                                            iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                        }
                                        boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                        int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                        if (z24) {
                                            iMax5 = i84;
                                        }
                                        int iF = p013b0.b.f(iMax5, j13);
                                        int i106 = z24 ? iF : iG4;
                                        int i107 = i84;
                                        boolean z30 = i107 < Math.min(i106, i55);
                                        if (z30 && i43 != 0) {
                                            p245u.c.c("non-zero itemsScrollOffset");
                                        }
                                        m mVar8 = mVar2;
                                        final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                        if (z30) {
                                            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                                p245u.c.a("no extra items");
                                            }
                                            int iE7 = iVar2.e();
                                            int[] iArr2 = new int[iE7];
                                            for (int i108 = 0; i108 < iE7; i108++) {
                                                iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                            }
                                            int[] iArr3 = new int[iE7];
                                            if (z24) {
                                                if (lVar17 == null) {
                                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                                    throw new KotlinNothingValueException();
                                                }
                                                lVar17.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                                iArr = iArr3;
                                                i45 = i55;
                                                i47 = 0;
                                                jVar2 = jVar3;
                                            } else {
                                                if (interfaceC0129e17 == null) {
                                                    p245u.c.b("null horizontalArrangement when isVertical == false");
                                                    throw new KotlinNothingValueException();
                                                }
                                                interfaceC0988x3 = interfaceC0988x3;
                                                iArr = iArr3;
                                                i45 = i55;
                                                jVar2 = jVar3;
                                                i47 = 0;
                                                interfaceC0129e17.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                            }
                                            Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                            Na.g gVarH = iVarQ;
                                            if (z25) {
                                                gVarH = Na.l.H(iVarQ);
                                            }
                                            int i109 = gVarH.f4687b;
                                            int i110 = gVarH.f4688c;
                                            int i111 = gVarH.f4689d;
                                            if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                                while (true) {
                                                    int i112 = iArr[i109];
                                                    m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                    if (z25) {
                                                        i112 = (i106 - i112) - mVar9.f10761q;
                                                    }
                                                    mVar9.k(i112, iG4, iF);
                                                    arrayList6.add(mVar9);
                                                    if (i109 == i110) {
                                                        break;
                                                    }
                                                    i109 += i111;
                                                }
                                            }
                                            i46 = i47;
                                        } else {
                                            i45 = i55;
                                            j13 = j13;
                                            i62 = i62;
                                            i42 = i42;
                                            i46 = 0;
                                            jVar2 = jVar3;
                                            i107 = i107;
                                            int size8 = arrayList.size();
                                            int i113 = i43;
                                            for (int i114 = 0; i114 < size8; i114++) {
                                                m mVar10 = (m) arrayList.get(i114);
                                                i113 -= mVar10.f10763s;
                                                mVar10.k(i113, iG4, iF);
                                                arrayList6.add(mVar10);
                                            }
                                            int iE8 = iVar2.e();
                                            int i115 = i43;
                                            for (int i116 = 0; i116 < iE8; i116++) {
                                                m mVar11 = (m) iVar2.get(i116);
                                                mVar11.k(i115, iG4, iF);
                                                arrayList6.add(mVar11);
                                                i115 += mVar11.f10763s;
                                            }
                                            int size9 = arrayList3.size();
                                            for (int i117 = 0; i117 < size9; i117++) {
                                                m mVar12 = (m) arrayList3.get(i117);
                                                mVar12.k(i115, iG4, iF);
                                                arrayList6.add(mVar12);
                                                i115 += mVar12.f10763s;
                                            }
                                        }
                                        h hVar2 = jVar2.f10770a;
                                        lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                        if (!z19) {
                                            long jB2 = lazyLayoutItemAnimator.b();
                                            if (!p013b0.l.b(jB2, 0L)) {
                                                int i118 = z24 ? iF : iG4;
                                                long j14 = j13;
                                                iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                                iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                                int i119 = z24 ? iF : iG4;
                                                if (i119 != i118) {
                                                    int size10 = arrayList6.size();
                                                    for (int i120 = i46; i120 < size10; i120++) {
                                                        m mVar13 = (m) arrayList6.get(i120);
                                                        mVar13.f10766v = i119;
                                                        mVar13.f10768x = mVar13.f10754i + i119;
                                                    }
                                                }
                                            }
                                        }
                                        final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final m invoke(Integer num) {
                                                return n.c(jVar2, num.intValue());
                                            }
                                        });
                                        if (z29) {
                                            m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                            if (mVar14 != null) {
                                                numValueOf = Integer.valueOf(mVar14.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else {
                                            m mVar15 = (m) iVar2.A();
                                            if (mVar15 != null) {
                                                numValueOf = Integer.valueOf(mVar15.f10746a);
                                            } else {
                                                numValueOf = null;
                                            }
                                        }
                                        if (z29) {
                                            m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                            if (mVar16 != null) {
                                                numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        } else {
                                            m mVar17 = (m) iVar2.C();
                                            if (mVar17 != null) {
                                                numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                            } else {
                                                numValueOf2 = null;
                                            }
                                        }
                                        boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                        Integer numValueOf3 = Integer.valueOf(iG4);
                                        Integer numValueOf4 = Integer.valueOf(iF);
                                        final X x11 = lazyListState5.f10370u;
                                        final boolean z32 = z19;
                                        F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Y.a aVar2) {
                                                Y.a aVar3 = aVar2;
                                                final List<m> list2 = arrayList6;
                                                final List<m> list3 = listD;
                                                final boolean z33 = z32;
                                                Ia.l<Y.a, p293xa.r> lVar112 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(Y.a aVar4) {
                                                        Y.a aVar5 = aVar4;
                                                        List<m> list4 = list2;
                                                        boolean z34 = z33;
                                                        int size11 = list4.size();
                                                        for (int i121 = 0; i121 < size11; i121++) {
                                                            list4.get(i121).e(aVar5, z34);
                                                        }
                                                        List<m> list5 = list3;
                                                        boolean z35 = z33;
                                                        int size12 = list5.size();
                                                        for (int i122 = 0; i122 < size12; i122++) {
                                                            list5.get(i122).e(aVar5, z35);
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                aVar3.f14225a = true;
                                                lVar112.invoke(aVar3);
                                                aVar3.f14225a = false;
                                                x11.getValue();
                                                return p293xa.r.f47939a;
                                            }
                                        });
                                        z110 = i46;
                                        lVar15 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    }
                                    lazyListState.g(lVar15, interfaceC0988x3.S0(), z110);
                                    return lVar15;
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                        };
                        c1086g = c1086gP;
                        c1086g.E(objF4);
                    }
                    Ia.p pVar5 = (Ia.p) objF4;
                    if (z11) {
                        orientation = Orientation.f9957b;
                    } else {
                        orientation = Orientation.f9958c;
                    }
                    orientation2 = orientation;
                    if (z12) {
                        c1086g.L(-1513147781);
                        i33 = i30 | ((i21 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        lazyListState2 = lazyListState;
                        if (((i33 & 14) ^ 6) <= 4) {
                        }
                        if (((i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                        }
                        z17 = z18 | z13;
                        objF5 = c1086g.f();
                        if (z17) {
                            objF5 = new e(lazyListState2, i32);
                            c1086g.E(objF5);
                        } else {
                            objF5 = new e(lazyListState2, i32);
                            c1086g.E(objF5);
                        }
                        hVarA = C0974i.a((e) objF5, lazyListState2.f10363n, z10, orientation2);
                        c1086g.T(false);
                    } else {
                        lazyListState2 = lazyListState;
                        c1086g.L(-1512720880);
                        c1086g.T(false);
                        hVarA = androidx.compose.ui.h.a.f13984b;
                    }
                    LazyLayoutKt.a(iVar, K.a(N.a(hVar.i(lazyListState2.f10360k).i(lazyListState2.f10361l), iVar, m13, orientation2, z12, z10).i(hVarA).i(lazyListState2.f10362m.f10635k), lazyListState, orientation2, z12, z10, jVar, lazyListState2.f10356f, false, e10, null), lazyListState2.f10364o, pVar5, c1086g, 0, 0);
                    lVar3 = lVar5;
                    i28 = i32;
                    bVar2 = bVar4;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    i28 = i10;
                    bVar2 = bVar;
                    lVar3 = lVar;
                    cVar2 = cVar;
                    interfaceC0129e2 = interfaceC0129e;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.d.c cVar17 = cVar2;
                    final C0945e.InterfaceC0129e interfaceC0129e16 = interfaceC0129e2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyListKt.a(hVar, lazyListState, l10, z10, z11, jVar, z12, e10, i28, bVar2, lVar3, cVar17, interfaceC0129e16, lVar2, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i26 |= 384;
            if ((i13 & 8192) != 0) {
                i26 |= 3072;
            } else if ((i12 & 3072) == 0) {
                i26 |= c1086gP.k(lVar2) ? 2048 : 1024;
            }
            z13 = true;
            if ((i21 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c1086gP.C(i21 & 1, z14)) {
                if (i17 != 0) {
                    i29 = 0;
                } else {
                    i29 = i10;
                }
                if (i19 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i22 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar;
                }
                if (i25 != 0) {
                    cVar3 = null;
                } else {
                    cVar3 = cVar;
                }
                if (i27 != 0) {
                    interfaceC0129e2 = null;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                i30 = (i21 >> 3) & 14;
                int i3119 = i30 | ((i26 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                xI = J0.i(lVar2, c1086gP);
                if (((i3119 & 14) ^ 6) <= 4) {
                }
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (z15) {
                    final c cVar18 = new c();
                    cVar18.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                    cVar18.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                    C1108r0 c1108r9 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE10 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final LazyListIntervalContent invoke() {
                            return new LazyListIntervalContent(xI.getValue());
                        }
                    }, c1108r9);
                    objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final i invoke() {
                            LazyListIntervalContent value = derivedSnapshotStateE10.getValue();
                            return new i(lazyListState, value, cVar18, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                        }
                    }, c1108r9), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF);
                } else {
                    final c cVar19 = new c();
                    cVar19.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                    cVar19.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                    C1108r0 c1108r10 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE11 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final LazyListIntervalContent invoke() {
                            return new LazyListIntervalContent(xI.getValue());
                        }
                    }, c1108r10);
                    objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final i invoke() {
                            LazyListIntervalContent value = derivedSnapshotStateE11.getValue();
                            return new i(lazyListState, value, cVar19, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                        }
                    }, c1108r10), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF);
                }
                iVar = (Oa.i) objF;
                int i31110 = i21 >> 9;
                int i31111 = i30 | (i31110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                i31 = i29;
                if (((i31111 & 14) ^ 6) <= 4) {
                }
                z16 = ((((i31111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.c(z11)) || (i31111 & 48) == 32) | ((((i31111 & 14) ^ 6) <= 4 && c1086gP.K(lazyListState)) || (i31111 & 6) == 4);
                objF2 = c1086gP.f();
                if (z16) {
                    objF2 = new d(lazyListState, z11);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new d(lazyListState, z11);
                    c1086gP.E(objF2);
                }
                M m14 = (M) objF2;
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF3);
                }
                a10 = (A) objF3;
                s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                if (((Boolean) c1086gP.x(CompositionLocalsKt.f14860v)).booleanValue()) {
                    c0130a = androidx.compose.foundation.lazy.layout.X.a.f10698a;
                } else {
                    c0130a = null;
                }
                int i31112 = i26 << 18;
                int i31113 = (i21 & 65520) | (i31110 & 458752) | (i31110 & 3670016) | (i31112 & 29360128) | (i31112 & 234881024) | ((i26 << 27) & 1879048192);
                if (((i31113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32) {
                }
                zK = ((((i31113 & 896) ^ 384) <= 256 && c1086gP.K(l10)) || (i31113 & 384) == 256) | ((((i31113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lazyListState)) || (i31113 & 48) == 32) | ((((i31113 & 7168) ^ 3072) <= 2048 && c1086gP.c(z10)) || (i31113 & 3072) == 2048) | ((((57344 & i31113) ^ 24576) <= 16384 && c1086gP.c(z11)) || (i31113 & 24576) == 16384) | ((((3670016 & i31113) ^ 1572864) <= 1048576 && c1086gP.K(bVar3)) || (i31113 & 1572864) == 1048576) | ((((29360128 & i31113) ^ 12582912) <= 8388608 && c1086gP.K(cVar3)) || (i31113 & 12582912) == 8388608) | ((((234881024 & i31113) ^ 100663296) <= 67108864 && c1086gP.K(interfaceC0129e2)) || (i31113 & 100663296) == 67108864) | ((((1879048192 & i31113) ^ 805306368) <= 536870912 && c1086gP.K(lVar4)) || (i31113 & 805306368) == 536870912) | c1086gP.K(s10) | c1086gP.K(c0130a);
                objF4 = c1086gP.f();
                if (zK) {
                    final C0945e.l lVar15 = lVar4;
                    cVar2 = cVar3;
                    final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a11 = c0130a;
                    bVar4 = bVar3;
                    lVar5 = lVar15;
                    final C0945e.InterfaceC0129e interfaceC0129e17 = interfaceC0129e2;
                    c0153a2 = c0153a;
                    i32 = i31;
                    objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                        /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.p
                        public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                            int i31114;
                            float fMo1getSpacingD9Ej5fM;
                            long j;
                            int i40;
                            m mVar;
                            int i41;
                            m mVar2;
                            int i42;
                            List arrayList;
                            int i43;
                            int i44;
                            ArrayList arrayList2;
                            boolean z19;
                            List arrayList3;
                            int i45;
                            int i46;
                            final j jVar2;
                            Integer numValueOf;
                            Integer numValueOf2;
                            boolean z110;
                            l lVar16;
                            int[] iArr;
                            int i47;
                            m mVar3;
                            float f10;
                            int i48;
                            m mVar4;
                            Object obj;
                            int i49;
                            Object obj2;
                            int index;
                            int iMin;
                            m mVar5;
                            Object obj3;
                            int i50;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            final long j10 = aVar.f20475a;
                            lazyListState.f10367r.getValue();
                            boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                            Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                            int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE3 = interfaceC0988x2.e1(l10.d());
                            int iE4 = interfaceC0988x2.e1(l10.a());
                            final int i51 = iE3 + iE4;
                            final int i52 = iE1 + iE2;
                            boolean z21 = z11;
                            int i53 = z21 ? i51 : i52;
                            if (z21 && !z10) {
                                i31114 = iE3;
                            } else if (z21 && z10) {
                                i31114 = iE4;
                            } else {
                                i31114 = (z21 || z10) ? iE2 : iE1;
                            }
                            int i54 = i53 - i31114;
                            long jI = p013b0.b.i(j10, -i52, -i51);
                            h hVarInvoke = iVar.invoke();
                            c cVarH = hVarInvoke.h();
                            int iH = p013b0.a.h(jI);
                            int iG = p013b0.a.g(jI);
                            cVarH.f10386a.m(iH);
                            cVarH.f10387b.m(iG);
                            if (z11) {
                                C0945e.l lVar17 = lVar15;
                                if (lVar17 == null) {
                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = lVar17.mo1getSpacingD9Ej5fM();
                            } else {
                                C0945e.InterfaceC0129e interfaceC0129e18 = interfaceC0129e17;
                                if (interfaceC0129e18 == null) {
                                    p245u.c.b("null horizontalAlignment when isVertical == false");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = interfaceC0129e18.mo1getSpacingD9Ej5fM();
                            }
                            int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                            int iB = hVarInvoke.b();
                            int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                            boolean z22 = z10;
                            if (!z22 || iG2 > 0) {
                                j = ((long) iE1) << 32;
                            } else {
                                boolean z23 = z11;
                                if (!z23) {
                                    iE1 += iG2;
                                }
                                if (z23) {
                                    iE3 += iG2;
                                }
                                j = ((long) iE1) << 32;
                            }
                            int i55 = iG2;
                            int i56 = i31114;
                            final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                            j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                            LazyListState lazyListState3 = lazyListState;
                            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                            try {
                                int iH2 = lazyListState3.h();
                                q qVar = lazyListState3.f10354d;
                                int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                if (iH2 != iK) {
                                    ((C1081d0) qVar.f10774b).m(iK);
                                    ((D) qVar.f10777e).e(iH2);
                                }
                                int i57 = lazyListState3.i();
                                p293xa.r rVar = p293xa.r.f47939a;
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                LazyListState lazyListState4 = lazyListState;
                                List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                boolean z24 = z11;
                                C0945e.l lVar18 = lVar15;
                                C0945e.InterfaceC0129e interfaceC0129e19 = interfaceC0129e17;
                                boolean z25 = z10;
                                LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                int i58 = i31;
                                boolean zS0 = interfaceC0988x3.S0();
                                LazyListState lazyListState5 = lazyListState;
                                l lVar19 = lazyListState5.f10353c;
                                A a11 = a10;
                                int i59 = i57;
                                S s11 = s10;
                                androidx.compose.foundation.lazy.layout.X x10 = c0130a11;
                                l lVar110 = lVar19;
                                Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // Ia.q
                                    public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar111) {
                                        int iIntValue = num.intValue();
                                        int iIntValue2 = num2.intValue();
                                        return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar111);
                                    }
                                };
                                int i60 = i56;
                                if (i60 < 0) {
                                    p245u.c.a("invalid beforeContentPadding");
                                }
                                if (i54 < 0) {
                                    p245u.c.a("invalid afterContentPadding");
                                }
                                if (iB <= 0) {
                                    int iJ = p013b0.a.j(jI);
                                    int i61 = p013b0.a.i(jI);
                                    lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                    if (!zS0) {
                                        long jB = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB, 0L)) {
                                            int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                            i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                            iJ = iG3;
                                        }
                                    }
                                    lVar16 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                            return p293xa.r.f47939a;
                                        }
                                    }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    z110 = 0;
                                } else {
                                    long j11 = jI;
                                    boolean z26 = zS0;
                                    int i62 = iB;
                                    if (iK >= i62) {
                                        iK = i62 - 1;
                                        i59 = 0;
                                    }
                                    int iRound = Math.round(fFloatValue);
                                    int i63 = i59 - iRound;
                                    if (iK == 0 && i63 < 0) {
                                        iRound += i63;
                                        i63 = 0;
                                    }
                                    kotlin.collections.i iVar2 = new kotlin.collections.i();
                                    int i64 = -i60;
                                    int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                    int i66 = i63 + i65;
                                    int iMax = 0;
                                    int i67 = iK;
                                    while (i66 < 0 && i67 > 0) {
                                        long j12 = j11;
                                        int i68 = i67 - 1;
                                        m mVarC = n.c(jVar3, i68);
                                        iVar2.add(0, mVarC);
                                        iMax = Math.max(iMax, mVarC.f10764t);
                                        i66 += mVarC.f10763s;
                                        i67 = i68;
                                        j11 = j12;
                                    }
                                    long j13 = j11;
                                    if (i66 < i65) {
                                        iRound -= i65 - i66;
                                        i66 = i65;
                                    }
                                    int i69 = i66 - i65;
                                    int i70 = i55 + i54;
                                    int i71 = i70 < 0 ? 0 : i70;
                                    int i72 = -i69;
                                    int i73 = iMax;
                                    int i74 = i67;
                                    int i75 = 0;
                                    boolean z27 = false;
                                    while (i75 < iVar2.f43019d) {
                                        if (i72 >= i71) {
                                            iVar2.k(i75);
                                            z27 = true;
                                        } else {
                                            i74++;
                                            i72 += ((m) iVar2.get(i75)).f10763s;
                                            i75++;
                                        }
                                    }
                                    int i76 = i69;
                                    int iMax2 = i73;
                                    boolean z28 = z27;
                                    int i77 = i74;
                                    while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                        int i78 = i71;
                                        m mVarC2 = n.c(jVar3, i77);
                                        l lVar111 = lVar110;
                                        int i79 = mVarC2.f10763s;
                                        int i80 = i72 + i79;
                                        if (i80 > i65 || i77 == i62 - 1) {
                                            iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                            iVar2.addLast(mVarC2);
                                            i50 = 1;
                                        } else {
                                            i76 -= i79;
                                            i67 = i77 + 1;
                                            i50 = 1;
                                            z28 = true;
                                        }
                                        i77 += i50;
                                        lVar110 = lVar111;
                                        i71 = i78;
                                        i72 = i80;
                                    }
                                    l lVar112 = lVar110;
                                    if (i72 < i55) {
                                        int i81 = i55 - i72;
                                        i76 -= i81;
                                        i72 += i81;
                                        while (i76 < i60 && i67 > 0) {
                                            int i82 = i67 - 1;
                                            m mVarC3 = n.c(jVar3, i82);
                                            i67 = i82;
                                            iVar2.add(0, mVarC3);
                                            iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                            i76 += mVarC3.f10763s;
                                        }
                                        int i83 = i81 + iRound;
                                        if (i76 < 0) {
                                            i72 += i76;
                                            i40 = i83 + i76;
                                            i76 = 0;
                                        } else {
                                            i40 = i83;
                                        }
                                    } else {
                                        i40 = iRound;
                                    }
                                    int i84 = i72;
                                    float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                    float f12 = fFloatValue - f11;
                                    float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                    if (i76 < 0) {
                                        p245u.c.a("negative currentFirstItemScrollOffset");
                                    }
                                    int i85 = -i76;
                                    m mVar6 = (m) iVar2.first();
                                    if (i60 > 0 || iE5 < 0) {
                                        int iE = iVar2.e();
                                        int i86 = i76;
                                        int i87 = 0;
                                        while (true) {
                                            if (i87 >= iE) {
                                                mVar = mVar6;
                                                break;
                                            }
                                            mVar = mVar6;
                                            int i88 = ((m) iVar2.get(i87)).f10763s;
                                            if (i86 == 0 || i88 > i86) {
                                                break;
                                            }
                                            int i89 = iE;
                                            if (i87 == kotlin.collections.l.r(iVar2)) {
                                                break;
                                            }
                                            i86 -= i88;
                                            i87++;
                                            mVar6 = (m) iVar2.get(i87);
                                            iE = i89;
                                        }
                                        m mVar7 = mVar;
                                        i41 = i86;
                                        mVar2 = mVar7;
                                    } else {
                                        mVar2 = mVar6;
                                        i41 = i76;
                                    }
                                    int iMax3 = Math.max(0, i67 - i58);
                                    int i90 = i67 - 1;
                                    if (iMax3 <= i90) {
                                        arrayList = null;
                                        while (true) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            i42 = i60;
                                            arrayList.add(n.c(jVar3, i90));
                                            if (i90 == iMax3) {
                                                break;
                                            }
                                            i90--;
                                            i60 = i42;
                                        }
                                    } else {
                                        i42 = i60;
                                        arrayList = null;
                                    }
                                    List<Integer> list = listA;
                                    int size = list.size() - 1;
                                    float f14 = f13;
                                    if (size >= 0) {
                                        int i91 = size;
                                        while (true) {
                                            int i92 = i91 - 1;
                                            int iIntValue = listA.get(i91).intValue();
                                            if (iIntValue < iMax3) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(n.c(jVar3, iIntValue));
                                            }
                                            if (i92 < 0) {
                                                break;
                                            }
                                            i91 = i92;
                                        }
                                    }
                                    if (arrayList == null) {
                                        arrayList = EmptyList.f42983b;
                                    }
                                    int iMax4 = iMax2;
                                    int i93 = 0;
                                    for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                        iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                        i93++;
                                    }
                                    int i94 = iMax4;
                                    int i95 = i62 - 1;
                                    int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                    int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                    if (i96 <= iMin2) {
                                        ArrayList arrayList4 = null;
                                        while (true) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            i44 = i77;
                                            arrayList2 = arrayList4;
                                            i43 = i85;
                                            arrayList2.add(n.c(jVar3, i96));
                                            if (i96 == iMin2) {
                                                break;
                                            }
                                            i96++;
                                            i85 = i43;
                                            arrayList4 = arrayList2;
                                            i77 = i44;
                                        }
                                    } else {
                                        i43 = i85;
                                        i44 = i77;
                                        arrayList2 = null;
                                    }
                                    if (!z26 || lVar112 == null || lVar112.f().isEmpty()) {
                                        z19 = z26;
                                        i84 = i84;
                                        arrayList3 = arrayList2;
                                    } else {
                                        List<m> listF = lVar112.f();
                                        int size3 = listF.size() - 1;
                                        ArrayList arrayList5 = arrayList2;
                                        int i97 = -1;
                                        while (true) {
                                            if (i97 >= size3) {
                                                mVar3 = null;
                                                break;
                                            }
                                            if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                mVar3 = listF.get(size3);
                                                break;
                                            }
                                            i97 = -1;
                                            size3--;
                                        }
                                        g gVar = (g) kotlin.collections.q.V(lVar112.f());
                                        if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                            arrayList3 = arrayList5;
                                            while (true) {
                                                z19 = z26;
                                                if (arrayList3 != null) {
                                                    int size4 = arrayList3.size();
                                                    int i98 = 0;
                                                    while (true) {
                                                        if (i98 >= size4) {
                                                            obj3 = null;
                                                            break;
                                                        }
                                                        obj3 = arrayList3.get(i98);
                                                        int i99 = size4;
                                                        if (((m) obj3).f10746a == index) {
                                                            break;
                                                        }
                                                        i98++;
                                                        size4 = i99;
                                                    }
                                                    mVar5 = (m) obj3;
                                                } else {
                                                    mVar5 = null;
                                                }
                                                if (mVar5 == null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index));
                                                }
                                                if (index == iMin) {
                                                    break;
                                                }
                                                index++;
                                                z26 = z19;
                                                i84 = i84;
                                            }
                                        } else {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList5;
                                        }
                                        float offset = ((lVar112.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                        if (offset > 0.0f) {
                                            int index2 = gVar.getIndex() + 1;
                                            int i100 = 0;
                                            while (index2 < i62 && i100 < offset) {
                                                if (index2 <= iMin2) {
                                                    int iE6 = iVar2.e();
                                                    int i101 = 0;
                                                    while (true) {
                                                        if (i101 >= iE6) {
                                                            f10 = offset;
                                                            obj2 = null;
                                                            break;
                                                        }
                                                        obj2 = iVar2.get(i101);
                                                        f10 = offset;
                                                        if (((m) obj2).f10746a == index2) {
                                                            break;
                                                        }
                                                        i101++;
                                                        offset = f10;
                                                    }
                                                    mVar4 = (m) obj2;
                                                    i48 = 1;
                                                } else {
                                                    f10 = offset;
                                                    if (arrayList3 != null) {
                                                        int size5 = arrayList3.size();
                                                        int i102 = 0;
                                                        while (true) {
                                                            if (i102 >= size5) {
                                                                i48 = 1;
                                                                obj = null;
                                                                break;
                                                            }
                                                            obj = arrayList3.get(i102);
                                                            int i103 = size5;
                                                            if (((m) obj).f10746a == index2) {
                                                                i48 = 1;
                                                                break;
                                                            }
                                                            i102++;
                                                            size5 = i103;
                                                        }
                                                        mVar4 = (m) obj;
                                                    } else {
                                                        i48 = 1;
                                                        mVar4 = null;
                                                    }
                                                }
                                                if (mVar4 != null) {
                                                    index2 += i48;
                                                    i49 = mVar4.f10763s;
                                                } else {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index2));
                                                    index2++;
                                                    i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                }
                                                i100 += i49;
                                                offset = f10;
                                            }
                                        }
                                    }
                                    if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                        iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                    }
                                    int size6 = list.size();
                                    for (int i104 = 0; i104 < size6; i104++) {
                                        int iIntValue2 = listA.get(i104).intValue();
                                        if (iIntValue2 > iMin2) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(n.c(jVar3, iIntValue2));
                                        }
                                    }
                                    if (arrayList3 == null) {
                                        arrayList3 = EmptyList.f42983b;
                                    }
                                    int size7 = arrayList3.size();
                                    int iMax5 = i94;
                                    for (int i105 = 0; i105 < size7; i105++) {
                                        iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                    }
                                    boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                    int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                    if (z24) {
                                        iMax5 = i84;
                                    }
                                    int iF = p013b0.b.f(iMax5, j13);
                                    int i106 = z24 ? iF : iG4;
                                    int i107 = i84;
                                    boolean z30 = i107 < Math.min(i106, i55);
                                    if (z30 && i43 != 0) {
                                        p245u.c.c("non-zero itemsScrollOffset");
                                    }
                                    m mVar8 = mVar2;
                                    final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                    if (z30) {
                                        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                            p245u.c.a("no extra items");
                                        }
                                        int iE7 = iVar2.e();
                                        int[] iArr2 = new int[iE7];
                                        for (int i108 = 0; i108 < iE7; i108++) {
                                            iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                        }
                                        int[] iArr3 = new int[iE7];
                                        if (z24) {
                                            if (lVar18 == null) {
                                                p245u.c.b("null verticalArrangement when isVertical == true");
                                                throw new KotlinNothingValueException();
                                            }
                                            lVar18.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                            iArr = iArr3;
                                            i45 = i55;
                                            i47 = 0;
                                            jVar2 = jVar3;
                                        } else {
                                            if (interfaceC0129e19 == null) {
                                                p245u.c.b("null horizontalArrangement when isVertical == false");
                                                throw new KotlinNothingValueException();
                                            }
                                            interfaceC0988x3 = interfaceC0988x3;
                                            iArr = iArr3;
                                            i45 = i55;
                                            jVar2 = jVar3;
                                            i47 = 0;
                                            interfaceC0129e19.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                        }
                                        Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                        Na.g gVarH = iVarQ;
                                        if (z25) {
                                            gVarH = Na.l.H(iVarQ);
                                        }
                                        int i109 = gVarH.f4687b;
                                        int i110 = gVarH.f4688c;
                                        int i111 = gVarH.f4689d;
                                        if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                            while (true) {
                                                int i112 = iArr[i109];
                                                m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                if (z25) {
                                                    i112 = (i106 - i112) - mVar9.f10761q;
                                                }
                                                mVar9.k(i112, iG4, iF);
                                                arrayList6.add(mVar9);
                                                if (i109 == i110) {
                                                    break;
                                                }
                                                i109 += i111;
                                            }
                                        }
                                        i46 = i47;
                                    } else {
                                        i45 = i55;
                                        j13 = j13;
                                        i62 = i62;
                                        i42 = i42;
                                        i46 = 0;
                                        jVar2 = jVar3;
                                        i107 = i107;
                                        int size8 = arrayList.size();
                                        int i113 = i43;
                                        for (int i114 = 0; i114 < size8; i114++) {
                                            m mVar10 = (m) arrayList.get(i114);
                                            i113 -= mVar10.f10763s;
                                            mVar10.k(i113, iG4, iF);
                                            arrayList6.add(mVar10);
                                        }
                                        int iE8 = iVar2.e();
                                        int i115 = i43;
                                        for (int i116 = 0; i116 < iE8; i116++) {
                                            m mVar11 = (m) iVar2.get(i116);
                                            mVar11.k(i115, iG4, iF);
                                            arrayList6.add(mVar11);
                                            i115 += mVar11.f10763s;
                                        }
                                        int size9 = arrayList3.size();
                                        for (int i117 = 0; i117 < size9; i117++) {
                                            m mVar12 = (m) arrayList3.get(i117);
                                            mVar12.k(i115, iG4, iF);
                                            arrayList6.add(mVar12);
                                            i115 += mVar12.f10763s;
                                        }
                                    }
                                    h hVar2 = jVar2.f10770a;
                                    lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                    if (!z19) {
                                        long jB2 = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB2, 0L)) {
                                            int i118 = z24 ? iF : iG4;
                                            long j14 = j13;
                                            iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                            iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                            int i119 = z24 ? iF : iG4;
                                            if (i119 != i118) {
                                                int size10 = arrayList6.size();
                                                for (int i120 = i46; i120 < size10; i120++) {
                                                    m mVar13 = (m) arrayList6.get(i120);
                                                    mVar13.f10766v = i119;
                                                    mVar13.f10768x = mVar13.f10754i + i119;
                                                }
                                            }
                                        }
                                    }
                                    final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final m invoke(Integer num) {
                                            return n.c(jVar2, num.intValue());
                                        }
                                    });
                                    if (z29) {
                                        m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                        if (mVar14 != null) {
                                            numValueOf = Integer.valueOf(mVar14.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else {
                                        m mVar15 = (m) iVar2.A();
                                        if (mVar15 != null) {
                                            numValueOf = Integer.valueOf(mVar15.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (z29) {
                                        m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                        if (mVar16 != null) {
                                            numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    } else {
                                        m mVar17 = (m) iVar2.C();
                                        if (mVar17 != null) {
                                            numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    }
                                    boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                    Integer numValueOf3 = Integer.valueOf(iG4);
                                    Integer numValueOf4 = Integer.valueOf(iF);
                                    final X x11 = lazyListState5.f10370u;
                                    final boolean z32 = z19;
                                    F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Y.a aVar2) {
                                            Y.a aVar3 = aVar2;
                                            final List<m> list2 = arrayList6;
                                            final List<m> list3 = listD;
                                            final boolean z33 = z32;
                                            Ia.l<Y.a, p293xa.r> lVar113 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(Y.a aVar4) {
                                                    Y.a aVar5 = aVar4;
                                                    List<m> list4 = list2;
                                                    boolean z34 = z33;
                                                    int size11 = list4.size();
                                                    for (int i121 = 0; i121 < size11; i121++) {
                                                        list4.get(i121).e(aVar5, z34);
                                                    }
                                                    List<m> list5 = list3;
                                                    boolean z35 = z33;
                                                    int size12 = list5.size();
                                                    for (int i122 = 0; i122 < size12; i122++) {
                                                        list5.get(i122).e(aVar5, z35);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            aVar3.f14225a = true;
                                            lVar113.invoke(aVar3);
                                            aVar3.f14225a = false;
                                            x11.getValue();
                                            return p293xa.r.f47939a;
                                        }
                                    });
                                    z110 = i46;
                                    lVar16 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                }
                                lazyListState.g(lVar16, interfaceC0988x3.S0(), z110);
                                return lVar16;
                            } catch (Throwable th) {
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                throw th;
                            }
                        }
                    };
                    c1086g = c1086gP;
                    c1086g.E(objF4);
                } else {
                    final C0945e.l lVar16 = lVar4;
                    cVar2 = cVar3;
                    final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a12 = c0130a;
                    bVar4 = bVar3;
                    lVar5 = lVar16;
                    final C0945e.InterfaceC0129e interfaceC0129e18 = interfaceC0129e2;
                    c0153a2 = c0153a;
                    i32 = i31;
                    objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                        /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.p
                        public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                            int i31114;
                            float fMo1getSpacingD9Ej5fM;
                            long j;
                            int i40;
                            m mVar;
                            int i41;
                            m mVar2;
                            int i42;
                            List arrayList;
                            int i43;
                            int i44;
                            ArrayList arrayList2;
                            boolean z19;
                            List arrayList3;
                            int i45;
                            int i46;
                            final j jVar2;
                            Integer numValueOf;
                            Integer numValueOf2;
                            boolean z110;
                            l lVar17;
                            int[] iArr;
                            int i47;
                            m mVar3;
                            float f10;
                            int i48;
                            m mVar4;
                            Object obj;
                            int i49;
                            Object obj2;
                            int index;
                            int iMin;
                            m mVar5;
                            Object obj3;
                            int i50;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            final long j10 = aVar.f20475a;
                            lazyListState.f10367r.getValue();
                            boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                            Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                            int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE3 = interfaceC0988x2.e1(l10.d());
                            int iE4 = interfaceC0988x2.e1(l10.a());
                            final int i51 = iE3 + iE4;
                            final int i52 = iE1 + iE2;
                            boolean z21 = z11;
                            int i53 = z21 ? i51 : i52;
                            if (z21 && !z10) {
                                i31114 = iE3;
                            } else if (z21 && z10) {
                                i31114 = iE4;
                            } else {
                                i31114 = (z21 || z10) ? iE2 : iE1;
                            }
                            int i54 = i53 - i31114;
                            long jI = p013b0.b.i(j10, -i52, -i51);
                            h hVarInvoke = iVar.invoke();
                            c cVarH = hVarInvoke.h();
                            int iH = p013b0.a.h(jI);
                            int iG = p013b0.a.g(jI);
                            cVarH.f10386a.m(iH);
                            cVarH.f10387b.m(iG);
                            if (z11) {
                                C0945e.l lVar18 = lVar16;
                                if (lVar18 == null) {
                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = lVar18.mo1getSpacingD9Ej5fM();
                            } else {
                                C0945e.InterfaceC0129e interfaceC0129e19 = interfaceC0129e18;
                                if (interfaceC0129e19 == null) {
                                    p245u.c.b("null horizontalAlignment when isVertical == false");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = interfaceC0129e19.mo1getSpacingD9Ej5fM();
                            }
                            int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                            int iB = hVarInvoke.b();
                            int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                            boolean z22 = z10;
                            if (!z22 || iG2 > 0) {
                                j = ((long) iE1) << 32;
                            } else {
                                boolean z23 = z11;
                                if (!z23) {
                                    iE1 += iG2;
                                }
                                if (z23) {
                                    iE3 += iG2;
                                }
                                j = ((long) iE1) << 32;
                            }
                            int i55 = iG2;
                            int i56 = i31114;
                            final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                            j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                            LazyListState lazyListState3 = lazyListState;
                            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                            try {
                                int iH2 = lazyListState3.h();
                                q qVar = lazyListState3.f10354d;
                                int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                if (iH2 != iK) {
                                    ((C1081d0) qVar.f10774b).m(iK);
                                    ((D) qVar.f10777e).e(iH2);
                                }
                                int i57 = lazyListState3.i();
                                p293xa.r rVar = p293xa.r.f47939a;
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                LazyListState lazyListState4 = lazyListState;
                                List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                boolean z24 = z11;
                                C0945e.l lVar19 = lVar16;
                                C0945e.InterfaceC0129e interfaceC0129e110 = interfaceC0129e18;
                                boolean z25 = z10;
                                LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                int i58 = i31;
                                boolean zS0 = interfaceC0988x3.S0();
                                LazyListState lazyListState5 = lazyListState;
                                l lVar110 = lazyListState5.f10353c;
                                A a11 = a10;
                                int i59 = i57;
                                S s11 = s10;
                                androidx.compose.foundation.lazy.layout.X x10 = c0130a12;
                                l lVar111 = lVar110;
                                Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // Ia.q
                                    public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar112) {
                                        int iIntValue = num.intValue();
                                        int iIntValue2 = num2.intValue();
                                        return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar112);
                                    }
                                };
                                int i60 = i56;
                                if (i60 < 0) {
                                    p245u.c.a("invalid beforeContentPadding");
                                }
                                if (i54 < 0) {
                                    p245u.c.a("invalid afterContentPadding");
                                }
                                if (iB <= 0) {
                                    int iJ = p013b0.a.j(jI);
                                    int i61 = p013b0.a.i(jI);
                                    lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                    if (!zS0) {
                                        long jB = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB, 0L)) {
                                            int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                            i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                            iJ = iG3;
                                        }
                                    }
                                    lVar17 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                            return p293xa.r.f47939a;
                                        }
                                    }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    z110 = 0;
                                } else {
                                    long j11 = jI;
                                    boolean z26 = zS0;
                                    int i62 = iB;
                                    if (iK >= i62) {
                                        iK = i62 - 1;
                                        i59 = 0;
                                    }
                                    int iRound = Math.round(fFloatValue);
                                    int i63 = i59 - iRound;
                                    if (iK == 0 && i63 < 0) {
                                        iRound += i63;
                                        i63 = 0;
                                    }
                                    kotlin.collections.i iVar2 = new kotlin.collections.i();
                                    int i64 = -i60;
                                    int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                    int i66 = i63 + i65;
                                    int iMax = 0;
                                    int i67 = iK;
                                    while (i66 < 0 && i67 > 0) {
                                        long j12 = j11;
                                        int i68 = i67 - 1;
                                        m mVarC = n.c(jVar3, i68);
                                        iVar2.add(0, mVarC);
                                        iMax = Math.max(iMax, mVarC.f10764t);
                                        i66 += mVarC.f10763s;
                                        i67 = i68;
                                        j11 = j12;
                                    }
                                    long j13 = j11;
                                    if (i66 < i65) {
                                        iRound -= i65 - i66;
                                        i66 = i65;
                                    }
                                    int i69 = i66 - i65;
                                    int i70 = i55 + i54;
                                    int i71 = i70 < 0 ? 0 : i70;
                                    int i72 = -i69;
                                    int i73 = iMax;
                                    int i74 = i67;
                                    int i75 = 0;
                                    boolean z27 = false;
                                    while (i75 < iVar2.f43019d) {
                                        if (i72 >= i71) {
                                            iVar2.k(i75);
                                            z27 = true;
                                        } else {
                                            i74++;
                                            i72 += ((m) iVar2.get(i75)).f10763s;
                                            i75++;
                                        }
                                    }
                                    int i76 = i69;
                                    int iMax2 = i73;
                                    boolean z28 = z27;
                                    int i77 = i74;
                                    while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                        int i78 = i71;
                                        m mVarC2 = n.c(jVar3, i77);
                                        l lVar112 = lVar111;
                                        int i79 = mVarC2.f10763s;
                                        int i80 = i72 + i79;
                                        if (i80 > i65 || i77 == i62 - 1) {
                                            iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                            iVar2.addLast(mVarC2);
                                            i50 = 1;
                                        } else {
                                            i76 -= i79;
                                            i67 = i77 + 1;
                                            i50 = 1;
                                            z28 = true;
                                        }
                                        i77 += i50;
                                        lVar111 = lVar112;
                                        i71 = i78;
                                        i72 = i80;
                                    }
                                    l lVar113 = lVar111;
                                    if (i72 < i55) {
                                        int i81 = i55 - i72;
                                        i76 -= i81;
                                        i72 += i81;
                                        while (i76 < i60 && i67 > 0) {
                                            int i82 = i67 - 1;
                                            m mVarC3 = n.c(jVar3, i82);
                                            i67 = i82;
                                            iVar2.add(0, mVarC3);
                                            iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                            i76 += mVarC3.f10763s;
                                        }
                                        int i83 = i81 + iRound;
                                        if (i76 < 0) {
                                            i72 += i76;
                                            i40 = i83 + i76;
                                            i76 = 0;
                                        } else {
                                            i40 = i83;
                                        }
                                    } else {
                                        i40 = iRound;
                                    }
                                    int i84 = i72;
                                    float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                    float f12 = fFloatValue - f11;
                                    float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                    if (i76 < 0) {
                                        p245u.c.a("negative currentFirstItemScrollOffset");
                                    }
                                    int i85 = -i76;
                                    m mVar6 = (m) iVar2.first();
                                    if (i60 > 0 || iE5 < 0) {
                                        int iE = iVar2.e();
                                        int i86 = i76;
                                        int i87 = 0;
                                        while (true) {
                                            if (i87 >= iE) {
                                                mVar = mVar6;
                                                break;
                                            }
                                            mVar = mVar6;
                                            int i88 = ((m) iVar2.get(i87)).f10763s;
                                            if (i86 == 0 || i88 > i86) {
                                                break;
                                            }
                                            int i89 = iE;
                                            if (i87 == kotlin.collections.l.r(iVar2)) {
                                                break;
                                            }
                                            i86 -= i88;
                                            i87++;
                                            mVar6 = (m) iVar2.get(i87);
                                            iE = i89;
                                        }
                                        m mVar7 = mVar;
                                        i41 = i86;
                                        mVar2 = mVar7;
                                    } else {
                                        mVar2 = mVar6;
                                        i41 = i76;
                                    }
                                    int iMax3 = Math.max(0, i67 - i58);
                                    int i90 = i67 - 1;
                                    if (iMax3 <= i90) {
                                        arrayList = null;
                                        while (true) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            i42 = i60;
                                            arrayList.add(n.c(jVar3, i90));
                                            if (i90 == iMax3) {
                                                break;
                                            }
                                            i90--;
                                            i60 = i42;
                                        }
                                    } else {
                                        i42 = i60;
                                        arrayList = null;
                                    }
                                    List<Integer> list = listA;
                                    int size = list.size() - 1;
                                    float f14 = f13;
                                    if (size >= 0) {
                                        int i91 = size;
                                        while (true) {
                                            int i92 = i91 - 1;
                                            int iIntValue = listA.get(i91).intValue();
                                            if (iIntValue < iMax3) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(n.c(jVar3, iIntValue));
                                            }
                                            if (i92 < 0) {
                                                break;
                                            }
                                            i91 = i92;
                                        }
                                    }
                                    if (arrayList == null) {
                                        arrayList = EmptyList.f42983b;
                                    }
                                    int iMax4 = iMax2;
                                    int i93 = 0;
                                    for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                        iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                        i93++;
                                    }
                                    int i94 = iMax4;
                                    int i95 = i62 - 1;
                                    int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                    int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                    if (i96 <= iMin2) {
                                        ArrayList arrayList4 = null;
                                        while (true) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            i44 = i77;
                                            arrayList2 = arrayList4;
                                            i43 = i85;
                                            arrayList2.add(n.c(jVar3, i96));
                                            if (i96 == iMin2) {
                                                break;
                                            }
                                            i96++;
                                            i85 = i43;
                                            arrayList4 = arrayList2;
                                            i77 = i44;
                                        }
                                    } else {
                                        i43 = i85;
                                        i44 = i77;
                                        arrayList2 = null;
                                    }
                                    if (!z26 || lVar113 == null || lVar113.f().isEmpty()) {
                                        z19 = z26;
                                        i84 = i84;
                                        arrayList3 = arrayList2;
                                    } else {
                                        List<m> listF = lVar113.f();
                                        int size3 = listF.size() - 1;
                                        ArrayList arrayList5 = arrayList2;
                                        int i97 = -1;
                                        while (true) {
                                            if (i97 >= size3) {
                                                mVar3 = null;
                                                break;
                                            }
                                            if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                mVar3 = listF.get(size3);
                                                break;
                                            }
                                            i97 = -1;
                                            size3--;
                                        }
                                        g gVar = (g) kotlin.collections.q.V(lVar113.f());
                                        if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                            arrayList3 = arrayList5;
                                            while (true) {
                                                z19 = z26;
                                                if (arrayList3 != null) {
                                                    int size4 = arrayList3.size();
                                                    int i98 = 0;
                                                    while (true) {
                                                        if (i98 >= size4) {
                                                            obj3 = null;
                                                            break;
                                                        }
                                                        obj3 = arrayList3.get(i98);
                                                        int i99 = size4;
                                                        if (((m) obj3).f10746a == index) {
                                                            break;
                                                        }
                                                        i98++;
                                                        size4 = i99;
                                                    }
                                                    mVar5 = (m) obj3;
                                                } else {
                                                    mVar5 = null;
                                                }
                                                if (mVar5 == null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index));
                                                }
                                                if (index == iMin) {
                                                    break;
                                                }
                                                index++;
                                                z26 = z19;
                                                i84 = i84;
                                            }
                                        } else {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList5;
                                        }
                                        float offset = ((lVar113.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                        if (offset > 0.0f) {
                                            int index2 = gVar.getIndex() + 1;
                                            int i100 = 0;
                                            while (index2 < i62 && i100 < offset) {
                                                if (index2 <= iMin2) {
                                                    int iE6 = iVar2.e();
                                                    int i101 = 0;
                                                    while (true) {
                                                        if (i101 >= iE6) {
                                                            f10 = offset;
                                                            obj2 = null;
                                                            break;
                                                        }
                                                        obj2 = iVar2.get(i101);
                                                        f10 = offset;
                                                        if (((m) obj2).f10746a == index2) {
                                                            break;
                                                        }
                                                        i101++;
                                                        offset = f10;
                                                    }
                                                    mVar4 = (m) obj2;
                                                    i48 = 1;
                                                } else {
                                                    f10 = offset;
                                                    if (arrayList3 != null) {
                                                        int size5 = arrayList3.size();
                                                        int i102 = 0;
                                                        while (true) {
                                                            if (i102 >= size5) {
                                                                i48 = 1;
                                                                obj = null;
                                                                break;
                                                            }
                                                            obj = arrayList3.get(i102);
                                                            int i103 = size5;
                                                            if (((m) obj).f10746a == index2) {
                                                                i48 = 1;
                                                                break;
                                                            }
                                                            i102++;
                                                            size5 = i103;
                                                        }
                                                        mVar4 = (m) obj;
                                                    } else {
                                                        i48 = 1;
                                                        mVar4 = null;
                                                    }
                                                }
                                                if (mVar4 != null) {
                                                    index2 += i48;
                                                    i49 = mVar4.f10763s;
                                                } else {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index2));
                                                    index2++;
                                                    i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                }
                                                i100 += i49;
                                                offset = f10;
                                            }
                                        }
                                    }
                                    if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                        iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                    }
                                    int size6 = list.size();
                                    for (int i104 = 0; i104 < size6; i104++) {
                                        int iIntValue2 = listA.get(i104).intValue();
                                        if (iIntValue2 > iMin2) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(n.c(jVar3, iIntValue2));
                                        }
                                    }
                                    if (arrayList3 == null) {
                                        arrayList3 = EmptyList.f42983b;
                                    }
                                    int size7 = arrayList3.size();
                                    int iMax5 = i94;
                                    for (int i105 = 0; i105 < size7; i105++) {
                                        iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                    }
                                    boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                    int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                    if (z24) {
                                        iMax5 = i84;
                                    }
                                    int iF = p013b0.b.f(iMax5, j13);
                                    int i106 = z24 ? iF : iG4;
                                    int i107 = i84;
                                    boolean z30 = i107 < Math.min(i106, i55);
                                    if (z30 && i43 != 0) {
                                        p245u.c.c("non-zero itemsScrollOffset");
                                    }
                                    m mVar8 = mVar2;
                                    final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                    if (z30) {
                                        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                            p245u.c.a("no extra items");
                                        }
                                        int iE7 = iVar2.e();
                                        int[] iArr2 = new int[iE7];
                                        for (int i108 = 0; i108 < iE7; i108++) {
                                            iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                        }
                                        int[] iArr3 = new int[iE7];
                                        if (z24) {
                                            if (lVar19 == null) {
                                                p245u.c.b("null verticalArrangement when isVertical == true");
                                                throw new KotlinNothingValueException();
                                            }
                                            lVar19.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                            iArr = iArr3;
                                            i45 = i55;
                                            i47 = 0;
                                            jVar2 = jVar3;
                                        } else {
                                            if (interfaceC0129e110 == null) {
                                                p245u.c.b("null horizontalArrangement when isVertical == false");
                                                throw new KotlinNothingValueException();
                                            }
                                            interfaceC0988x3 = interfaceC0988x3;
                                            iArr = iArr3;
                                            i45 = i55;
                                            jVar2 = jVar3;
                                            i47 = 0;
                                            interfaceC0129e110.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                        }
                                        Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                        Na.g gVarH = iVarQ;
                                        if (z25) {
                                            gVarH = Na.l.H(iVarQ);
                                        }
                                        int i109 = gVarH.f4687b;
                                        int i110 = gVarH.f4688c;
                                        int i111 = gVarH.f4689d;
                                        if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                            while (true) {
                                                int i112 = iArr[i109];
                                                m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                if (z25) {
                                                    i112 = (i106 - i112) - mVar9.f10761q;
                                                }
                                                mVar9.k(i112, iG4, iF);
                                                arrayList6.add(mVar9);
                                                if (i109 == i110) {
                                                    break;
                                                }
                                                i109 += i111;
                                            }
                                        }
                                        i46 = i47;
                                    } else {
                                        i45 = i55;
                                        j13 = j13;
                                        i62 = i62;
                                        i42 = i42;
                                        i46 = 0;
                                        jVar2 = jVar3;
                                        i107 = i107;
                                        int size8 = arrayList.size();
                                        int i113 = i43;
                                        for (int i114 = 0; i114 < size8; i114++) {
                                            m mVar10 = (m) arrayList.get(i114);
                                            i113 -= mVar10.f10763s;
                                            mVar10.k(i113, iG4, iF);
                                            arrayList6.add(mVar10);
                                        }
                                        int iE8 = iVar2.e();
                                        int i115 = i43;
                                        for (int i116 = 0; i116 < iE8; i116++) {
                                            m mVar11 = (m) iVar2.get(i116);
                                            mVar11.k(i115, iG4, iF);
                                            arrayList6.add(mVar11);
                                            i115 += mVar11.f10763s;
                                        }
                                        int size9 = arrayList3.size();
                                        for (int i117 = 0; i117 < size9; i117++) {
                                            m mVar12 = (m) arrayList3.get(i117);
                                            mVar12.k(i115, iG4, iF);
                                            arrayList6.add(mVar12);
                                            i115 += mVar12.f10763s;
                                        }
                                    }
                                    h hVar2 = jVar2.f10770a;
                                    lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                    if (!z19) {
                                        long jB2 = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB2, 0L)) {
                                            int i118 = z24 ? iF : iG4;
                                            long j14 = j13;
                                            iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                            iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                            int i119 = z24 ? iF : iG4;
                                            if (i119 != i118) {
                                                int size10 = arrayList6.size();
                                                for (int i120 = i46; i120 < size10; i120++) {
                                                    m mVar13 = (m) arrayList6.get(i120);
                                                    mVar13.f10766v = i119;
                                                    mVar13.f10768x = mVar13.f10754i + i119;
                                                }
                                            }
                                        }
                                    }
                                    final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final m invoke(Integer num) {
                                            return n.c(jVar2, num.intValue());
                                        }
                                    });
                                    if (z29) {
                                        m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                        if (mVar14 != null) {
                                            numValueOf = Integer.valueOf(mVar14.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else {
                                        m mVar15 = (m) iVar2.A();
                                        if (mVar15 != null) {
                                            numValueOf = Integer.valueOf(mVar15.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (z29) {
                                        m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                        if (mVar16 != null) {
                                            numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    } else {
                                        m mVar17 = (m) iVar2.C();
                                        if (mVar17 != null) {
                                            numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    }
                                    boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                    Integer numValueOf3 = Integer.valueOf(iG4);
                                    Integer numValueOf4 = Integer.valueOf(iF);
                                    final X x11 = lazyListState5.f10370u;
                                    final boolean z32 = z19;
                                    F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Y.a aVar2) {
                                            Y.a aVar3 = aVar2;
                                            final List<m> list2 = arrayList6;
                                            final List<m> list3 = listD;
                                            final boolean z33 = z32;
                                            Ia.l<Y.a, p293xa.r> lVar114 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(Y.a aVar4) {
                                                    Y.a aVar5 = aVar4;
                                                    List<m> list4 = list2;
                                                    boolean z34 = z33;
                                                    int size11 = list4.size();
                                                    for (int i121 = 0; i121 < size11; i121++) {
                                                        list4.get(i121).e(aVar5, z34);
                                                    }
                                                    List<m> list5 = list3;
                                                    boolean z35 = z33;
                                                    int size12 = list5.size();
                                                    for (int i122 = 0; i122 < size12; i122++) {
                                                        list5.get(i122).e(aVar5, z35);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            aVar3.f14225a = true;
                                            lVar114.invoke(aVar3);
                                            aVar3.f14225a = false;
                                            x11.getValue();
                                            return p293xa.r.f47939a;
                                        }
                                    });
                                    z110 = i46;
                                    lVar17 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                }
                                lazyListState.g(lVar17, interfaceC0988x3.S0(), z110);
                                return lVar17;
                            } catch (Throwable th) {
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                throw th;
                            }
                        }
                    };
                    c1086g = c1086gP;
                    c1086g.E(objF4);
                }
                Ia.p pVar6 = (Ia.p) objF4;
                if (z11) {
                    orientation = Orientation.f9957b;
                } else {
                    orientation = Orientation.f9958c;
                }
                orientation2 = orientation;
                if (z12) {
                    c1086g.L(-1513147781);
                    i33 = i30 | ((i21 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    lazyListState2 = lazyListState;
                    if (((i33 & 14) ^ 6) <= 4) {
                    }
                    if (((i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                    }
                    z17 = z18 | z13;
                    objF5 = c1086g.f();
                    if (z17) {
                        objF5 = new e(lazyListState2, i32);
                        c1086g.E(objF5);
                    } else {
                        objF5 = new e(lazyListState2, i32);
                        c1086g.E(objF5);
                    }
                    hVarA = C0974i.a((e) objF5, lazyListState2.f10363n, z10, orientation2);
                    c1086g.T(false);
                } else {
                    lazyListState2 = lazyListState;
                    c1086g.L(-1512720880);
                    c1086g.T(false);
                    hVarA = androidx.compose.ui.h.a.f13984b;
                }
                LazyLayoutKt.a(iVar, K.a(N.a(hVar.i(lazyListState2.f10360k).i(lazyListState2.f10361l), iVar, m14, orientation2, z12, z10).i(hVarA).i(lazyListState2.f10362m.f10635k), lazyListState, orientation2, z12, z10, jVar, lazyListState2.f10356f, false, e10, null), lazyListState2.f10364o, pVar6, c1086g, 0, 0);
                lVar3 = lVar5;
                i28 = i32;
                bVar2 = bVar4;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                i28 = i10;
                bVar2 = bVar;
                lVar3 = lVar;
                cVar2 = cVar;
                interfaceC0129e2 = interfaceC0129e;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.d.c cVar110 = cVar2;
                final C0945e.InterfaceC0129e interfaceC0129e19 = interfaceC0129e2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyListKt.a(hVar, lazyListState, l10, z10, z11, jVar, z12, e10, i28, bVar2, lVar3, cVar110, interfaceC0129e19, lVar2, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 12582912;
        i17 = i13 & 256;
        if (i17 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            if (c1086gP.h(i10)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i14 |= i18;
        }
        i19 = i13 & 512;
        if (i19 != 0) {
            i14 |= 805306368;
        } else if ((i11 & 805306368) == 0) {
            if (c1086gP.K(bVar)) {
                i20 = 536870912;
            } else {
                i20 = 268435456;
            }
            i14 |= i20;
        }
        i21 = i14;
        i22 = i13 & 1024;
        if (i22 != 0) {
            i23 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            if (c1086gP.K(lVar)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i23 = i12 | i24;
        } else {
            i23 = i12;
        }
        i25 = i13 & 2048;
        if (i25 != 0) {
            i23 |= 48;
        } else if ((i12 & 48) == 0) {
            i23 |= c1086gP.K(cVar) ? 32 : 16;
        }
        i26 = i23;
        i27 = i13 & 4096;
        if (i27 != 0) {
            if ((i12 & 384) == 0) {
                i26 |= c1086gP.K(interfaceC0129e) ? 256 : 128;
            }
            if ((i13 & 8192) != 0) {
                i26 |= 3072;
            } else if ((i12 & 3072) == 0) {
                i26 |= c1086gP.k(lVar2) ? 2048 : 1024;
            }
            z13 = true;
            if ((i21 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c1086gP.C(i21 & 1, z14)) {
                if (i17 != 0) {
                    i29 = 0;
                } else {
                    i29 = i10;
                }
                if (i19 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i22 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar;
                }
                if (i25 != 0) {
                    cVar3 = null;
                } else {
                    cVar3 = cVar;
                }
                if (i27 != 0) {
                    interfaceC0129e2 = null;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                i30 = (i21 >> 3) & 14;
                int i31114 = i30 | ((i26 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                xI = J0.i(lVar2, c1086gP);
                if (((i31114 & 14) ^ 6) <= 4) {
                }
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (z15) {
                    final c cVar111 = new c();
                    cVar111.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                    cVar111.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                    C1108r0 c1108r11 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE12 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final LazyListIntervalContent invoke() {
                            return new LazyListIntervalContent(xI.getValue());
                        }
                    }, c1108r11);
                    objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final i invoke() {
                            LazyListIntervalContent value = derivedSnapshotStateE12.getValue();
                            return new i(lazyListState, value, cVar111, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                        }
                    }, c1108r11), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF);
                } else {
                    final c cVar112 = new c();
                    cVar112.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                    cVar112.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                    C1108r0 c1108r12 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE13 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final LazyListIntervalContent invoke() {
                            return new LazyListIntervalContent(xI.getValue());
                        }
                    }, c1108r12);
                    objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final i invoke() {
                            LazyListIntervalContent value = derivedSnapshotStateE13.getValue();
                            return new i(lazyListState, value, cVar112, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                        }
                    }, c1108r12), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF);
                }
                iVar = (Oa.i) objF;
                int i31115 = i21 >> 9;
                int i31116 = i30 | (i31115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                i31 = i29;
                if (((i31116 & 14) ^ 6) <= 4) {
                }
                z16 = ((((i31116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.c(z11)) || (i31116 & 48) == 32) | ((((i31116 & 14) ^ 6) <= 4 && c1086gP.K(lazyListState)) || (i31116 & 6) == 4);
                objF2 = c1086gP.f();
                if (z16) {
                    objF2 = new d(lazyListState, z11);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new d(lazyListState, z11);
                    c1086gP.E(objF2);
                }
                M m15 = (M) objF2;
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF3);
                }
                a10 = (A) objF3;
                s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                if (((Boolean) c1086gP.x(CompositionLocalsKt.f14860v)).booleanValue()) {
                    c0130a = androidx.compose.foundation.lazy.layout.X.a.f10698a;
                } else {
                    c0130a = null;
                }
                int i31117 = i26 << 18;
                int i31118 = (i21 & 65520) | (i31115 & 458752) | (i31115 & 3670016) | (i31117 & 29360128) | (i31117 & 234881024) | ((i26 << 27) & 1879048192);
                if (((i31118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32) {
                }
                zK = ((((i31118 & 896) ^ 384) <= 256 && c1086gP.K(l10)) || (i31118 & 384) == 256) | ((((i31118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lazyListState)) || (i31118 & 48) == 32) | ((((i31118 & 7168) ^ 3072) <= 2048 && c1086gP.c(z10)) || (i31118 & 3072) == 2048) | ((((57344 & i31118) ^ 24576) <= 16384 && c1086gP.c(z11)) || (i31118 & 24576) == 16384) | ((((3670016 & i31118) ^ 1572864) <= 1048576 && c1086gP.K(bVar3)) || (i31118 & 1572864) == 1048576) | ((((29360128 & i31118) ^ 12582912) <= 8388608 && c1086gP.K(cVar3)) || (i31118 & 12582912) == 8388608) | ((((234881024 & i31118) ^ 100663296) <= 67108864 && c1086gP.K(interfaceC0129e2)) || (i31118 & 100663296) == 67108864) | ((((1879048192 & i31118) ^ 805306368) <= 536870912 && c1086gP.K(lVar4)) || (i31118 & 805306368) == 536870912) | c1086gP.K(s10) | c1086gP.K(c0130a);
                objF4 = c1086gP.f();
                if (zK) {
                    final C0945e.l lVar17 = lVar4;
                    cVar2 = cVar3;
                    final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a13 = c0130a;
                    bVar4 = bVar3;
                    lVar5 = lVar17;
                    final C0945e.InterfaceC0129e interfaceC0129e110 = interfaceC0129e2;
                    c0153a2 = c0153a;
                    i32 = i31;
                    objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                        /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.p
                        public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                            int i31119;
                            float fMo1getSpacingD9Ej5fM;
                            long j;
                            int i40;
                            m mVar;
                            int i41;
                            m mVar2;
                            int i42;
                            List arrayList;
                            int i43;
                            int i44;
                            ArrayList arrayList2;
                            boolean z19;
                            List arrayList3;
                            int i45;
                            int i46;
                            final j jVar2;
                            Integer numValueOf;
                            Integer numValueOf2;
                            boolean z110;
                            l lVar18;
                            int[] iArr;
                            int i47;
                            m mVar3;
                            float f10;
                            int i48;
                            m mVar4;
                            Object obj;
                            int i49;
                            Object obj2;
                            int index;
                            int iMin;
                            m mVar5;
                            Object obj3;
                            int i50;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            final long j10 = aVar.f20475a;
                            lazyListState.f10367r.getValue();
                            boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                            Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                            int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE3 = interfaceC0988x2.e1(l10.d());
                            int iE4 = interfaceC0988x2.e1(l10.a());
                            final int i51 = iE3 + iE4;
                            final int i52 = iE1 + iE2;
                            boolean z21 = z11;
                            int i53 = z21 ? i51 : i52;
                            if (z21 && !z10) {
                                i31119 = iE3;
                            } else if (z21 && z10) {
                                i31119 = iE4;
                            } else {
                                i31119 = (z21 || z10) ? iE2 : iE1;
                            }
                            int i54 = i53 - i31119;
                            long jI = p013b0.b.i(j10, -i52, -i51);
                            h hVarInvoke = iVar.invoke();
                            c cVarH = hVarInvoke.h();
                            int iH = p013b0.a.h(jI);
                            int iG = p013b0.a.g(jI);
                            cVarH.f10386a.m(iH);
                            cVarH.f10387b.m(iG);
                            if (z11) {
                                C0945e.l lVar19 = lVar17;
                                if (lVar19 == null) {
                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = lVar19.mo1getSpacingD9Ej5fM();
                            } else {
                                C0945e.InterfaceC0129e interfaceC0129e111 = interfaceC0129e110;
                                if (interfaceC0129e111 == null) {
                                    p245u.c.b("null horizontalAlignment when isVertical == false");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = interfaceC0129e111.mo1getSpacingD9Ej5fM();
                            }
                            int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                            int iB = hVarInvoke.b();
                            int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                            boolean z22 = z10;
                            if (!z22 || iG2 > 0) {
                                j = ((long) iE1) << 32;
                            } else {
                                boolean z23 = z11;
                                if (!z23) {
                                    iE1 += iG2;
                                }
                                if (z23) {
                                    iE3 += iG2;
                                }
                                j = ((long) iE1) << 32;
                            }
                            int i55 = iG2;
                            int i56 = i31119;
                            final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                            j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                            LazyListState lazyListState3 = lazyListState;
                            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                            try {
                                int iH2 = lazyListState3.h();
                                q qVar = lazyListState3.f10354d;
                                int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                if (iH2 != iK) {
                                    ((C1081d0) qVar.f10774b).m(iK);
                                    ((D) qVar.f10777e).e(iH2);
                                }
                                int i57 = lazyListState3.i();
                                p293xa.r rVar = p293xa.r.f47939a;
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                LazyListState lazyListState4 = lazyListState;
                                List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                boolean z24 = z11;
                                C0945e.l lVar110 = lVar17;
                                C0945e.InterfaceC0129e interfaceC0129e112 = interfaceC0129e110;
                                boolean z25 = z10;
                                LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                int i58 = i31;
                                boolean zS0 = interfaceC0988x3.S0();
                                LazyListState lazyListState5 = lazyListState;
                                l lVar111 = lazyListState5.f10353c;
                                A a11 = a10;
                                int i59 = i57;
                                S s11 = s10;
                                androidx.compose.foundation.lazy.layout.X x10 = c0130a13;
                                l lVar112 = lVar111;
                                Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // Ia.q
                                    public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar113) {
                                        int iIntValue = num.intValue();
                                        int iIntValue2 = num2.intValue();
                                        return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar113);
                                    }
                                };
                                int i60 = i56;
                                if (i60 < 0) {
                                    p245u.c.a("invalid beforeContentPadding");
                                }
                                if (i54 < 0) {
                                    p245u.c.a("invalid afterContentPadding");
                                }
                                if (iB <= 0) {
                                    int iJ = p013b0.a.j(jI);
                                    int i61 = p013b0.a.i(jI);
                                    lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                    if (!zS0) {
                                        long jB = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB, 0L)) {
                                            int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                            i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                            iJ = iG3;
                                        }
                                    }
                                    lVar18 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                            return p293xa.r.f47939a;
                                        }
                                    }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    z110 = 0;
                                } else {
                                    long j11 = jI;
                                    boolean z26 = zS0;
                                    int i62 = iB;
                                    if (iK >= i62) {
                                        iK = i62 - 1;
                                        i59 = 0;
                                    }
                                    int iRound = Math.round(fFloatValue);
                                    int i63 = i59 - iRound;
                                    if (iK == 0 && i63 < 0) {
                                        iRound += i63;
                                        i63 = 0;
                                    }
                                    kotlin.collections.i iVar2 = new kotlin.collections.i();
                                    int i64 = -i60;
                                    int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                    int i66 = i63 + i65;
                                    int iMax = 0;
                                    int i67 = iK;
                                    while (i66 < 0 && i67 > 0) {
                                        long j12 = j11;
                                        int i68 = i67 - 1;
                                        m mVarC = n.c(jVar3, i68);
                                        iVar2.add(0, mVarC);
                                        iMax = Math.max(iMax, mVarC.f10764t);
                                        i66 += mVarC.f10763s;
                                        i67 = i68;
                                        j11 = j12;
                                    }
                                    long j13 = j11;
                                    if (i66 < i65) {
                                        iRound -= i65 - i66;
                                        i66 = i65;
                                    }
                                    int i69 = i66 - i65;
                                    int i70 = i55 + i54;
                                    int i71 = i70 < 0 ? 0 : i70;
                                    int i72 = -i69;
                                    int i73 = iMax;
                                    int i74 = i67;
                                    int i75 = 0;
                                    boolean z27 = false;
                                    while (i75 < iVar2.f43019d) {
                                        if (i72 >= i71) {
                                            iVar2.k(i75);
                                            z27 = true;
                                        } else {
                                            i74++;
                                            i72 += ((m) iVar2.get(i75)).f10763s;
                                            i75++;
                                        }
                                    }
                                    int i76 = i69;
                                    int iMax2 = i73;
                                    boolean z28 = z27;
                                    int i77 = i74;
                                    while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                        int i78 = i71;
                                        m mVarC2 = n.c(jVar3, i77);
                                        l lVar113 = lVar112;
                                        int i79 = mVarC2.f10763s;
                                        int i80 = i72 + i79;
                                        if (i80 > i65 || i77 == i62 - 1) {
                                            iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                            iVar2.addLast(mVarC2);
                                            i50 = 1;
                                        } else {
                                            i76 -= i79;
                                            i67 = i77 + 1;
                                            i50 = 1;
                                            z28 = true;
                                        }
                                        i77 += i50;
                                        lVar112 = lVar113;
                                        i71 = i78;
                                        i72 = i80;
                                    }
                                    l lVar114 = lVar112;
                                    if (i72 < i55) {
                                        int i81 = i55 - i72;
                                        i76 -= i81;
                                        i72 += i81;
                                        while (i76 < i60 && i67 > 0) {
                                            int i82 = i67 - 1;
                                            m mVarC3 = n.c(jVar3, i82);
                                            i67 = i82;
                                            iVar2.add(0, mVarC3);
                                            iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                            i76 += mVarC3.f10763s;
                                        }
                                        int i83 = i81 + iRound;
                                        if (i76 < 0) {
                                            i72 += i76;
                                            i40 = i83 + i76;
                                            i76 = 0;
                                        } else {
                                            i40 = i83;
                                        }
                                    } else {
                                        i40 = iRound;
                                    }
                                    int i84 = i72;
                                    float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                    float f12 = fFloatValue - f11;
                                    float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                    if (i76 < 0) {
                                        p245u.c.a("negative currentFirstItemScrollOffset");
                                    }
                                    int i85 = -i76;
                                    m mVar6 = (m) iVar2.first();
                                    if (i60 > 0 || iE5 < 0) {
                                        int iE = iVar2.e();
                                        int i86 = i76;
                                        int i87 = 0;
                                        while (true) {
                                            if (i87 >= iE) {
                                                mVar = mVar6;
                                                break;
                                            }
                                            mVar = mVar6;
                                            int i88 = ((m) iVar2.get(i87)).f10763s;
                                            if (i86 == 0 || i88 > i86) {
                                                break;
                                            }
                                            int i89 = iE;
                                            if (i87 == kotlin.collections.l.r(iVar2)) {
                                                break;
                                            }
                                            i86 -= i88;
                                            i87++;
                                            mVar6 = (m) iVar2.get(i87);
                                            iE = i89;
                                        }
                                        m mVar7 = mVar;
                                        i41 = i86;
                                        mVar2 = mVar7;
                                    } else {
                                        mVar2 = mVar6;
                                        i41 = i76;
                                    }
                                    int iMax3 = Math.max(0, i67 - i58);
                                    int i90 = i67 - 1;
                                    if (iMax3 <= i90) {
                                        arrayList = null;
                                        while (true) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            i42 = i60;
                                            arrayList.add(n.c(jVar3, i90));
                                            if (i90 == iMax3) {
                                                break;
                                            }
                                            i90--;
                                            i60 = i42;
                                        }
                                    } else {
                                        i42 = i60;
                                        arrayList = null;
                                    }
                                    List<Integer> list = listA;
                                    int size = list.size() - 1;
                                    float f14 = f13;
                                    if (size >= 0) {
                                        int i91 = size;
                                        while (true) {
                                            int i92 = i91 - 1;
                                            int iIntValue = listA.get(i91).intValue();
                                            if (iIntValue < iMax3) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(n.c(jVar3, iIntValue));
                                            }
                                            if (i92 < 0) {
                                                break;
                                            }
                                            i91 = i92;
                                        }
                                    }
                                    if (arrayList == null) {
                                        arrayList = EmptyList.f42983b;
                                    }
                                    int iMax4 = iMax2;
                                    int i93 = 0;
                                    for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                        iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                        i93++;
                                    }
                                    int i94 = iMax4;
                                    int i95 = i62 - 1;
                                    int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                    int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                    if (i96 <= iMin2) {
                                        ArrayList arrayList4 = null;
                                        while (true) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            i44 = i77;
                                            arrayList2 = arrayList4;
                                            i43 = i85;
                                            arrayList2.add(n.c(jVar3, i96));
                                            if (i96 == iMin2) {
                                                break;
                                            }
                                            i96++;
                                            i85 = i43;
                                            arrayList4 = arrayList2;
                                            i77 = i44;
                                        }
                                    } else {
                                        i43 = i85;
                                        i44 = i77;
                                        arrayList2 = null;
                                    }
                                    if (!z26 || lVar114 == null || lVar114.f().isEmpty()) {
                                        z19 = z26;
                                        i84 = i84;
                                        arrayList3 = arrayList2;
                                    } else {
                                        List<m> listF = lVar114.f();
                                        int size3 = listF.size() - 1;
                                        ArrayList arrayList5 = arrayList2;
                                        int i97 = -1;
                                        while (true) {
                                            if (i97 >= size3) {
                                                mVar3 = null;
                                                break;
                                            }
                                            if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                mVar3 = listF.get(size3);
                                                break;
                                            }
                                            i97 = -1;
                                            size3--;
                                        }
                                        g gVar = (g) kotlin.collections.q.V(lVar114.f());
                                        if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                            arrayList3 = arrayList5;
                                            while (true) {
                                                z19 = z26;
                                                if (arrayList3 != null) {
                                                    int size4 = arrayList3.size();
                                                    int i98 = 0;
                                                    while (true) {
                                                        if (i98 >= size4) {
                                                            obj3 = null;
                                                            break;
                                                        }
                                                        obj3 = arrayList3.get(i98);
                                                        int i99 = size4;
                                                        if (((m) obj3).f10746a == index) {
                                                            break;
                                                        }
                                                        i98++;
                                                        size4 = i99;
                                                    }
                                                    mVar5 = (m) obj3;
                                                } else {
                                                    mVar5 = null;
                                                }
                                                if (mVar5 == null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index));
                                                }
                                                if (index == iMin) {
                                                    break;
                                                }
                                                index++;
                                                z26 = z19;
                                                i84 = i84;
                                            }
                                        } else {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList5;
                                        }
                                        float offset = ((lVar114.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                        if (offset > 0.0f) {
                                            int index2 = gVar.getIndex() + 1;
                                            int i100 = 0;
                                            while (index2 < i62 && i100 < offset) {
                                                if (index2 <= iMin2) {
                                                    int iE6 = iVar2.e();
                                                    int i101 = 0;
                                                    while (true) {
                                                        if (i101 >= iE6) {
                                                            f10 = offset;
                                                            obj2 = null;
                                                            break;
                                                        }
                                                        obj2 = iVar2.get(i101);
                                                        f10 = offset;
                                                        if (((m) obj2).f10746a == index2) {
                                                            break;
                                                        }
                                                        i101++;
                                                        offset = f10;
                                                    }
                                                    mVar4 = (m) obj2;
                                                    i48 = 1;
                                                } else {
                                                    f10 = offset;
                                                    if (arrayList3 != null) {
                                                        int size5 = arrayList3.size();
                                                        int i102 = 0;
                                                        while (true) {
                                                            if (i102 >= size5) {
                                                                i48 = 1;
                                                                obj = null;
                                                                break;
                                                            }
                                                            obj = arrayList3.get(i102);
                                                            int i103 = size5;
                                                            if (((m) obj).f10746a == index2) {
                                                                i48 = 1;
                                                                break;
                                                            }
                                                            i102++;
                                                            size5 = i103;
                                                        }
                                                        mVar4 = (m) obj;
                                                    } else {
                                                        i48 = 1;
                                                        mVar4 = null;
                                                    }
                                                }
                                                if (mVar4 != null) {
                                                    index2 += i48;
                                                    i49 = mVar4.f10763s;
                                                } else {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index2));
                                                    index2++;
                                                    i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                }
                                                i100 += i49;
                                                offset = f10;
                                            }
                                        }
                                    }
                                    if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                        iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                    }
                                    int size6 = list.size();
                                    for (int i104 = 0; i104 < size6; i104++) {
                                        int iIntValue2 = listA.get(i104).intValue();
                                        if (iIntValue2 > iMin2) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(n.c(jVar3, iIntValue2));
                                        }
                                    }
                                    if (arrayList3 == null) {
                                        arrayList3 = EmptyList.f42983b;
                                    }
                                    int size7 = arrayList3.size();
                                    int iMax5 = i94;
                                    for (int i105 = 0; i105 < size7; i105++) {
                                        iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                    }
                                    boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                    int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                    if (z24) {
                                        iMax5 = i84;
                                    }
                                    int iF = p013b0.b.f(iMax5, j13);
                                    int i106 = z24 ? iF : iG4;
                                    int i107 = i84;
                                    boolean z30 = i107 < Math.min(i106, i55);
                                    if (z30 && i43 != 0) {
                                        p245u.c.c("non-zero itemsScrollOffset");
                                    }
                                    m mVar8 = mVar2;
                                    final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                    if (z30) {
                                        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                            p245u.c.a("no extra items");
                                        }
                                        int iE7 = iVar2.e();
                                        int[] iArr2 = new int[iE7];
                                        for (int i108 = 0; i108 < iE7; i108++) {
                                            iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                        }
                                        int[] iArr3 = new int[iE7];
                                        if (z24) {
                                            if (lVar110 == null) {
                                                p245u.c.b("null verticalArrangement when isVertical == true");
                                                throw new KotlinNothingValueException();
                                            }
                                            lVar110.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                            iArr = iArr3;
                                            i45 = i55;
                                            i47 = 0;
                                            jVar2 = jVar3;
                                        } else {
                                            if (interfaceC0129e112 == null) {
                                                p245u.c.b("null horizontalArrangement when isVertical == false");
                                                throw new KotlinNothingValueException();
                                            }
                                            interfaceC0988x3 = interfaceC0988x3;
                                            iArr = iArr3;
                                            i45 = i55;
                                            jVar2 = jVar3;
                                            i47 = 0;
                                            interfaceC0129e112.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                        }
                                        Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                        Na.g gVarH = iVarQ;
                                        if (z25) {
                                            gVarH = Na.l.H(iVarQ);
                                        }
                                        int i109 = gVarH.f4687b;
                                        int i110 = gVarH.f4688c;
                                        int i111 = gVarH.f4689d;
                                        if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                            while (true) {
                                                int i112 = iArr[i109];
                                                m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                if (z25) {
                                                    i112 = (i106 - i112) - mVar9.f10761q;
                                                }
                                                mVar9.k(i112, iG4, iF);
                                                arrayList6.add(mVar9);
                                                if (i109 == i110) {
                                                    break;
                                                }
                                                i109 += i111;
                                            }
                                        }
                                        i46 = i47;
                                    } else {
                                        i45 = i55;
                                        j13 = j13;
                                        i62 = i62;
                                        i42 = i42;
                                        i46 = 0;
                                        jVar2 = jVar3;
                                        i107 = i107;
                                        int size8 = arrayList.size();
                                        int i113 = i43;
                                        for (int i114 = 0; i114 < size8; i114++) {
                                            m mVar10 = (m) arrayList.get(i114);
                                            i113 -= mVar10.f10763s;
                                            mVar10.k(i113, iG4, iF);
                                            arrayList6.add(mVar10);
                                        }
                                        int iE8 = iVar2.e();
                                        int i115 = i43;
                                        for (int i116 = 0; i116 < iE8; i116++) {
                                            m mVar11 = (m) iVar2.get(i116);
                                            mVar11.k(i115, iG4, iF);
                                            arrayList6.add(mVar11);
                                            i115 += mVar11.f10763s;
                                        }
                                        int size9 = arrayList3.size();
                                        for (int i117 = 0; i117 < size9; i117++) {
                                            m mVar12 = (m) arrayList3.get(i117);
                                            mVar12.k(i115, iG4, iF);
                                            arrayList6.add(mVar12);
                                            i115 += mVar12.f10763s;
                                        }
                                    }
                                    h hVar2 = jVar2.f10770a;
                                    lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                    if (!z19) {
                                        long jB2 = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB2, 0L)) {
                                            int i118 = z24 ? iF : iG4;
                                            long j14 = j13;
                                            iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                            iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                            int i119 = z24 ? iF : iG4;
                                            if (i119 != i118) {
                                                int size10 = arrayList6.size();
                                                for (int i120 = i46; i120 < size10; i120++) {
                                                    m mVar13 = (m) arrayList6.get(i120);
                                                    mVar13.f10766v = i119;
                                                    mVar13.f10768x = mVar13.f10754i + i119;
                                                }
                                            }
                                        }
                                    }
                                    final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final m invoke(Integer num) {
                                            return n.c(jVar2, num.intValue());
                                        }
                                    });
                                    if (z29) {
                                        m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                        if (mVar14 != null) {
                                            numValueOf = Integer.valueOf(mVar14.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else {
                                        m mVar15 = (m) iVar2.A();
                                        if (mVar15 != null) {
                                            numValueOf = Integer.valueOf(mVar15.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (z29) {
                                        m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                        if (mVar16 != null) {
                                            numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    } else {
                                        m mVar17 = (m) iVar2.C();
                                        if (mVar17 != null) {
                                            numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    }
                                    boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                    Integer numValueOf3 = Integer.valueOf(iG4);
                                    Integer numValueOf4 = Integer.valueOf(iF);
                                    final X x11 = lazyListState5.f10370u;
                                    final boolean z32 = z19;
                                    F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Y.a aVar2) {
                                            Y.a aVar3 = aVar2;
                                            final List<m> list2 = arrayList6;
                                            final List<m> list3 = listD;
                                            final boolean z33 = z32;
                                            Ia.l<Y.a, p293xa.r> lVar115 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(Y.a aVar4) {
                                                    Y.a aVar5 = aVar4;
                                                    List<m> list4 = list2;
                                                    boolean z34 = z33;
                                                    int size11 = list4.size();
                                                    for (int i121 = 0; i121 < size11; i121++) {
                                                        list4.get(i121).e(aVar5, z34);
                                                    }
                                                    List<m> list5 = list3;
                                                    boolean z35 = z33;
                                                    int size12 = list5.size();
                                                    for (int i122 = 0; i122 < size12; i122++) {
                                                        list5.get(i122).e(aVar5, z35);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            aVar3.f14225a = true;
                                            lVar115.invoke(aVar3);
                                            aVar3.f14225a = false;
                                            x11.getValue();
                                            return p293xa.r.f47939a;
                                        }
                                    });
                                    z110 = i46;
                                    lVar18 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                }
                                lazyListState.g(lVar18, interfaceC0988x3.S0(), z110);
                                return lVar18;
                            } catch (Throwable th) {
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                throw th;
                            }
                        }
                    };
                    c1086g = c1086gP;
                    c1086g.E(objF4);
                } else {
                    final C0945e.l lVar18 = lVar4;
                    cVar2 = cVar3;
                    final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a14 = c0130a;
                    bVar4 = bVar3;
                    lVar5 = lVar18;
                    final C0945e.InterfaceC0129e interfaceC0129e111 = interfaceC0129e2;
                    c0153a2 = c0153a;
                    i32 = i31;
                    objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                        /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.p
                        public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                            int i31119;
                            float fMo1getSpacingD9Ej5fM;
                            long j;
                            int i40;
                            m mVar;
                            int i41;
                            m mVar2;
                            int i42;
                            List arrayList;
                            int i43;
                            int i44;
                            ArrayList arrayList2;
                            boolean z19;
                            List arrayList3;
                            int i45;
                            int i46;
                            final j jVar2;
                            Integer numValueOf;
                            Integer numValueOf2;
                            boolean z110;
                            l lVar19;
                            int[] iArr;
                            int i47;
                            m mVar3;
                            float f10;
                            int i48;
                            m mVar4;
                            Object obj;
                            int i49;
                            Object obj2;
                            int index;
                            int iMin;
                            m mVar5;
                            Object obj3;
                            int i50;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            final long j10 = aVar.f20475a;
                            lazyListState.f10367r.getValue();
                            boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                            Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                            int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                            int iE3 = interfaceC0988x2.e1(l10.d());
                            int iE4 = interfaceC0988x2.e1(l10.a());
                            final int i51 = iE3 + iE4;
                            final int i52 = iE1 + iE2;
                            boolean z21 = z11;
                            int i53 = z21 ? i51 : i52;
                            if (z21 && !z10) {
                                i31119 = iE3;
                            } else if (z21 && z10) {
                                i31119 = iE4;
                            } else {
                                i31119 = (z21 || z10) ? iE2 : iE1;
                            }
                            int i54 = i53 - i31119;
                            long jI = p013b0.b.i(j10, -i52, -i51);
                            h hVarInvoke = iVar.invoke();
                            c cVarH = hVarInvoke.h();
                            int iH = p013b0.a.h(jI);
                            int iG = p013b0.a.g(jI);
                            cVarH.f10386a.m(iH);
                            cVarH.f10387b.m(iG);
                            if (z11) {
                                C0945e.l lVar110 = lVar18;
                                if (lVar110 == null) {
                                    p245u.c.b("null verticalArrangement when isVertical == true");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = lVar110.mo1getSpacingD9Ej5fM();
                            } else {
                                C0945e.InterfaceC0129e interfaceC0129e112 = interfaceC0129e111;
                                if (interfaceC0129e112 == null) {
                                    p245u.c.b("null horizontalAlignment when isVertical == false");
                                    throw new KotlinNothingValueException();
                                }
                                fMo1getSpacingD9Ej5fM = interfaceC0129e112.mo1getSpacingD9Ej5fM();
                            }
                            int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                            int iB = hVarInvoke.b();
                            int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                            boolean z22 = z10;
                            if (!z22 || iG2 > 0) {
                                j = ((long) iE1) << 32;
                            } else {
                                boolean z23 = z11;
                                if (!z23) {
                                    iE1 += iG2;
                                }
                                if (z23) {
                                    iE3 += iG2;
                                }
                                j = ((long) iE1) << 32;
                            }
                            int i55 = iG2;
                            int i56 = i31119;
                            final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                            j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                            LazyListState lazyListState3 = lazyListState;
                            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                            try {
                                int iH2 = lazyListState3.h();
                                q qVar = lazyListState3.f10354d;
                                int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                                if (iH2 != iK) {
                                    ((C1081d0) qVar.f10774b).m(iK);
                                    ((D) qVar.f10777e).e(iH2);
                                }
                                int i57 = lazyListState3.i();
                                p293xa.r rVar = p293xa.r.f47939a;
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                LazyListState lazyListState4 = lazyListState;
                                List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                                float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                                boolean z24 = z11;
                                C0945e.l lVar111 = lVar18;
                                C0945e.InterfaceC0129e interfaceC0129e113 = interfaceC0129e111;
                                boolean z25 = z10;
                                LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                                int i58 = i31;
                                boolean zS0 = interfaceC0988x3.S0();
                                LazyListState lazyListState5 = lazyListState;
                                l lVar112 = lazyListState5.f10353c;
                                A a11 = a10;
                                int i59 = i57;
                                S s11 = s10;
                                androidx.compose.foundation.lazy.layout.X x10 = c0130a14;
                                l lVar113 = lVar112;
                                Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // Ia.q
                                    public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar114) {
                                        int iIntValue = num.intValue();
                                        int iIntValue2 = num2.intValue();
                                        return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar114);
                                    }
                                };
                                int i60 = i56;
                                if (i60 < 0) {
                                    p245u.c.a("invalid beforeContentPadding");
                                }
                                if (i54 < 0) {
                                    p245u.c.a("invalid afterContentPadding");
                                }
                                if (iB <= 0) {
                                    int iJ = p013b0.a.j(jI);
                                    int i61 = p013b0.a.i(jI);
                                    lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                    if (!zS0) {
                                        long jB = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB, 0L)) {
                                            int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                            i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                            iJ = iG3;
                                        }
                                    }
                                    lVar19 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                            return p293xa.r.f47939a;
                                        }
                                    }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                    z110 = 0;
                                } else {
                                    long j11 = jI;
                                    boolean z26 = zS0;
                                    int i62 = iB;
                                    if (iK >= i62) {
                                        iK = i62 - 1;
                                        i59 = 0;
                                    }
                                    int iRound = Math.round(fFloatValue);
                                    int i63 = i59 - iRound;
                                    if (iK == 0 && i63 < 0) {
                                        iRound += i63;
                                        i63 = 0;
                                    }
                                    kotlin.collections.i iVar2 = new kotlin.collections.i();
                                    int i64 = -i60;
                                    int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                    int i66 = i63 + i65;
                                    int iMax = 0;
                                    int i67 = iK;
                                    while (i66 < 0 && i67 > 0) {
                                        long j12 = j11;
                                        int i68 = i67 - 1;
                                        m mVarC = n.c(jVar3, i68);
                                        iVar2.add(0, mVarC);
                                        iMax = Math.max(iMax, mVarC.f10764t);
                                        i66 += mVarC.f10763s;
                                        i67 = i68;
                                        j11 = j12;
                                    }
                                    long j13 = j11;
                                    if (i66 < i65) {
                                        iRound -= i65 - i66;
                                        i66 = i65;
                                    }
                                    int i69 = i66 - i65;
                                    int i70 = i55 + i54;
                                    int i71 = i70 < 0 ? 0 : i70;
                                    int i72 = -i69;
                                    int i73 = iMax;
                                    int i74 = i67;
                                    int i75 = 0;
                                    boolean z27 = false;
                                    while (i75 < iVar2.f43019d) {
                                        if (i72 >= i71) {
                                            iVar2.k(i75);
                                            z27 = true;
                                        } else {
                                            i74++;
                                            i72 += ((m) iVar2.get(i75)).f10763s;
                                            i75++;
                                        }
                                    }
                                    int i76 = i69;
                                    int iMax2 = i73;
                                    boolean z28 = z27;
                                    int i77 = i74;
                                    while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                        int i78 = i71;
                                        m mVarC2 = n.c(jVar3, i77);
                                        l lVar114 = lVar113;
                                        int i79 = mVarC2.f10763s;
                                        int i80 = i72 + i79;
                                        if (i80 > i65 || i77 == i62 - 1) {
                                            iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                            iVar2.addLast(mVarC2);
                                            i50 = 1;
                                        } else {
                                            i76 -= i79;
                                            i67 = i77 + 1;
                                            i50 = 1;
                                            z28 = true;
                                        }
                                        i77 += i50;
                                        lVar113 = lVar114;
                                        i71 = i78;
                                        i72 = i80;
                                    }
                                    l lVar115 = lVar113;
                                    if (i72 < i55) {
                                        int i81 = i55 - i72;
                                        i76 -= i81;
                                        i72 += i81;
                                        while (i76 < i60 && i67 > 0) {
                                            int i82 = i67 - 1;
                                            m mVarC3 = n.c(jVar3, i82);
                                            i67 = i82;
                                            iVar2.add(0, mVarC3);
                                            iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                            i76 += mVarC3.f10763s;
                                        }
                                        int i83 = i81 + iRound;
                                        if (i76 < 0) {
                                            i72 += i76;
                                            i40 = i83 + i76;
                                            i76 = 0;
                                        } else {
                                            i40 = i83;
                                        }
                                    } else {
                                        i40 = iRound;
                                    }
                                    int i84 = i72;
                                    float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                    float f12 = fFloatValue - f11;
                                    float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                    if (i76 < 0) {
                                        p245u.c.a("negative currentFirstItemScrollOffset");
                                    }
                                    int i85 = -i76;
                                    m mVar6 = (m) iVar2.first();
                                    if (i60 > 0 || iE5 < 0) {
                                        int iE = iVar2.e();
                                        int i86 = i76;
                                        int i87 = 0;
                                        while (true) {
                                            if (i87 >= iE) {
                                                mVar = mVar6;
                                                break;
                                            }
                                            mVar = mVar6;
                                            int i88 = ((m) iVar2.get(i87)).f10763s;
                                            if (i86 == 0 || i88 > i86) {
                                                break;
                                            }
                                            int i89 = iE;
                                            if (i87 == kotlin.collections.l.r(iVar2)) {
                                                break;
                                            }
                                            i86 -= i88;
                                            i87++;
                                            mVar6 = (m) iVar2.get(i87);
                                            iE = i89;
                                        }
                                        m mVar7 = mVar;
                                        i41 = i86;
                                        mVar2 = mVar7;
                                    } else {
                                        mVar2 = mVar6;
                                        i41 = i76;
                                    }
                                    int iMax3 = Math.max(0, i67 - i58);
                                    int i90 = i67 - 1;
                                    if (iMax3 <= i90) {
                                        arrayList = null;
                                        while (true) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            i42 = i60;
                                            arrayList.add(n.c(jVar3, i90));
                                            if (i90 == iMax3) {
                                                break;
                                            }
                                            i90--;
                                            i60 = i42;
                                        }
                                    } else {
                                        i42 = i60;
                                        arrayList = null;
                                    }
                                    List<Integer> list = listA;
                                    int size = list.size() - 1;
                                    float f14 = f13;
                                    if (size >= 0) {
                                        int i91 = size;
                                        while (true) {
                                            int i92 = i91 - 1;
                                            int iIntValue = listA.get(i91).intValue();
                                            if (iIntValue < iMax3) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(n.c(jVar3, iIntValue));
                                            }
                                            if (i92 < 0) {
                                                break;
                                            }
                                            i91 = i92;
                                        }
                                    }
                                    if (arrayList == null) {
                                        arrayList = EmptyList.f42983b;
                                    }
                                    int iMax4 = iMax2;
                                    int i93 = 0;
                                    for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                        iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                        i93++;
                                    }
                                    int i94 = iMax4;
                                    int i95 = i62 - 1;
                                    int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                    int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                    if (i96 <= iMin2) {
                                        ArrayList arrayList4 = null;
                                        while (true) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            i44 = i77;
                                            arrayList2 = arrayList4;
                                            i43 = i85;
                                            arrayList2.add(n.c(jVar3, i96));
                                            if (i96 == iMin2) {
                                                break;
                                            }
                                            i96++;
                                            i85 = i43;
                                            arrayList4 = arrayList2;
                                            i77 = i44;
                                        }
                                    } else {
                                        i43 = i85;
                                        i44 = i77;
                                        arrayList2 = null;
                                    }
                                    if (!z26 || lVar115 == null || lVar115.f().isEmpty()) {
                                        z19 = z26;
                                        i84 = i84;
                                        arrayList3 = arrayList2;
                                    } else {
                                        List<m> listF = lVar115.f();
                                        int size3 = listF.size() - 1;
                                        ArrayList arrayList5 = arrayList2;
                                        int i97 = -1;
                                        while (true) {
                                            if (i97 >= size3) {
                                                mVar3 = null;
                                                break;
                                            }
                                            if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                                mVar3 = listF.get(size3);
                                                break;
                                            }
                                            i97 = -1;
                                            size3--;
                                        }
                                        g gVar = (g) kotlin.collections.q.V(lVar115.f());
                                        if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                            arrayList3 = arrayList5;
                                            while (true) {
                                                z19 = z26;
                                                if (arrayList3 != null) {
                                                    int size4 = arrayList3.size();
                                                    int i98 = 0;
                                                    while (true) {
                                                        if (i98 >= size4) {
                                                            obj3 = null;
                                                            break;
                                                        }
                                                        obj3 = arrayList3.get(i98);
                                                        int i99 = size4;
                                                        if (((m) obj3).f10746a == index) {
                                                            break;
                                                        }
                                                        i98++;
                                                        size4 = i99;
                                                    }
                                                    mVar5 = (m) obj3;
                                                } else {
                                                    mVar5 = null;
                                                }
                                                if (mVar5 == null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index));
                                                }
                                                if (index == iMin) {
                                                    break;
                                                }
                                                index++;
                                                z26 = z19;
                                                i84 = i84;
                                            }
                                        } else {
                                            z19 = z26;
                                            i84 = i84;
                                            arrayList3 = arrayList5;
                                        }
                                        float offset = ((lVar115.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                        if (offset > 0.0f) {
                                            int index2 = gVar.getIndex() + 1;
                                            int i100 = 0;
                                            while (index2 < i62 && i100 < offset) {
                                                if (index2 <= iMin2) {
                                                    int iE6 = iVar2.e();
                                                    int i101 = 0;
                                                    while (true) {
                                                        if (i101 >= iE6) {
                                                            f10 = offset;
                                                            obj2 = null;
                                                            break;
                                                        }
                                                        obj2 = iVar2.get(i101);
                                                        f10 = offset;
                                                        if (((m) obj2).f10746a == index2) {
                                                            break;
                                                        }
                                                        i101++;
                                                        offset = f10;
                                                    }
                                                    mVar4 = (m) obj2;
                                                    i48 = 1;
                                                } else {
                                                    f10 = offset;
                                                    if (arrayList3 != null) {
                                                        int size5 = arrayList3.size();
                                                        int i102 = 0;
                                                        while (true) {
                                                            if (i102 >= size5) {
                                                                i48 = 1;
                                                                obj = null;
                                                                break;
                                                            }
                                                            obj = arrayList3.get(i102);
                                                            int i103 = size5;
                                                            if (((m) obj).f10746a == index2) {
                                                                i48 = 1;
                                                                break;
                                                            }
                                                            i102++;
                                                            size5 = i103;
                                                        }
                                                        mVar4 = (m) obj;
                                                    } else {
                                                        i48 = 1;
                                                        mVar4 = null;
                                                    }
                                                }
                                                if (mVar4 != null) {
                                                    index2 += i48;
                                                    i49 = mVar4.f10763s;
                                                } else {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(n.c(jVar3, index2));
                                                    index2++;
                                                    i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                                }
                                                i100 += i49;
                                                offset = f10;
                                            }
                                        }
                                    }
                                    if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                        iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                    }
                                    int size6 = list.size();
                                    for (int i104 = 0; i104 < size6; i104++) {
                                        int iIntValue2 = listA.get(i104).intValue();
                                        if (iIntValue2 > iMin2) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(n.c(jVar3, iIntValue2));
                                        }
                                    }
                                    if (arrayList3 == null) {
                                        arrayList3 = EmptyList.f42983b;
                                    }
                                    int size7 = arrayList3.size();
                                    int iMax5 = i94;
                                    for (int i105 = 0; i105 < size7; i105++) {
                                        iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                    }
                                    boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                    int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                    if (z24) {
                                        iMax5 = i84;
                                    }
                                    int iF = p013b0.b.f(iMax5, j13);
                                    int i106 = z24 ? iF : iG4;
                                    int i107 = i84;
                                    boolean z30 = i107 < Math.min(i106, i55);
                                    if (z30 && i43 != 0) {
                                        p245u.c.c("non-zero itemsScrollOffset");
                                    }
                                    m mVar8 = mVar2;
                                    final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                    if (z30) {
                                        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                            p245u.c.a("no extra items");
                                        }
                                        int iE7 = iVar2.e();
                                        int[] iArr2 = new int[iE7];
                                        for (int i108 = 0; i108 < iE7; i108++) {
                                            iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                        }
                                        int[] iArr3 = new int[iE7];
                                        if (z24) {
                                            if (lVar111 == null) {
                                                p245u.c.b("null verticalArrangement when isVertical == true");
                                                throw new KotlinNothingValueException();
                                            }
                                            lVar111.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                            iArr = iArr3;
                                            i45 = i55;
                                            i47 = 0;
                                            jVar2 = jVar3;
                                        } else {
                                            if (interfaceC0129e113 == null) {
                                                p245u.c.b("null horizontalArrangement when isVertical == false");
                                                throw new KotlinNothingValueException();
                                            }
                                            interfaceC0988x3 = interfaceC0988x3;
                                            iArr = iArr3;
                                            i45 = i55;
                                            jVar2 = jVar3;
                                            i47 = 0;
                                            interfaceC0129e113.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                        }
                                        Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                        Na.g gVarH = iVarQ;
                                        if (z25) {
                                            gVarH = Na.l.H(iVarQ);
                                        }
                                        int i109 = gVarH.f4687b;
                                        int i110 = gVarH.f4688c;
                                        int i111 = gVarH.f4689d;
                                        if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                            while (true) {
                                                int i112 = iArr[i109];
                                                m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                                if (z25) {
                                                    i112 = (i106 - i112) - mVar9.f10761q;
                                                }
                                                mVar9.k(i112, iG4, iF);
                                                arrayList6.add(mVar9);
                                                if (i109 == i110) {
                                                    break;
                                                }
                                                i109 += i111;
                                            }
                                        }
                                        i46 = i47;
                                    } else {
                                        i45 = i55;
                                        j13 = j13;
                                        i62 = i62;
                                        i42 = i42;
                                        i46 = 0;
                                        jVar2 = jVar3;
                                        i107 = i107;
                                        int size8 = arrayList.size();
                                        int i113 = i43;
                                        for (int i114 = 0; i114 < size8; i114++) {
                                            m mVar10 = (m) arrayList.get(i114);
                                            i113 -= mVar10.f10763s;
                                            mVar10.k(i113, iG4, iF);
                                            arrayList6.add(mVar10);
                                        }
                                        int iE8 = iVar2.e();
                                        int i115 = i43;
                                        for (int i116 = 0; i116 < iE8; i116++) {
                                            m mVar11 = (m) iVar2.get(i116);
                                            mVar11.k(i115, iG4, iF);
                                            arrayList6.add(mVar11);
                                            i115 += mVar11.f10763s;
                                        }
                                        int size9 = arrayList3.size();
                                        for (int i117 = 0; i117 < size9; i117++) {
                                            m mVar12 = (m) arrayList3.get(i117);
                                            mVar12.k(i115, iG4, iF);
                                            arrayList6.add(mVar12);
                                            i115 += mVar12.f10763s;
                                        }
                                    }
                                    h hVar2 = jVar2.f10770a;
                                    lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                    if (!z19) {
                                        long jB2 = lazyLayoutItemAnimator.b();
                                        if (!p013b0.l.b(jB2, 0L)) {
                                            int i118 = z24 ? iF : iG4;
                                            long j14 = j13;
                                            iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                            iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                            int i119 = z24 ? iF : iG4;
                                            if (i119 != i118) {
                                                int size10 = arrayList6.size();
                                                for (int i120 = i46; i120 < size10; i120++) {
                                                    m mVar13 = (m) arrayList6.get(i120);
                                                    mVar13.f10766v = i119;
                                                    mVar13.f10768x = mVar13.f10754i + i119;
                                                }
                                            }
                                        }
                                    }
                                    final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final m invoke(Integer num) {
                                            return n.c(jVar2, num.intValue());
                                        }
                                    });
                                    if (z29) {
                                        m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                        if (mVar14 != null) {
                                            numValueOf = Integer.valueOf(mVar14.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else {
                                        m mVar15 = (m) iVar2.A();
                                        if (mVar15 != null) {
                                            numValueOf = Integer.valueOf(mVar15.f10746a);
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (z29) {
                                        m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                        if (mVar16 != null) {
                                            numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    } else {
                                        m mVar17 = (m) iVar2.C();
                                        if (mVar17 != null) {
                                            numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    }
                                    boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                    Integer numValueOf3 = Integer.valueOf(iG4);
                                    Integer numValueOf4 = Integer.valueOf(iF);
                                    final X x11 = lazyListState5.f10370u;
                                    final boolean z32 = z19;
                                    F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Y.a aVar2) {
                                            Y.a aVar3 = aVar2;
                                            final List<m> list2 = arrayList6;
                                            final List<m> list3 = listD;
                                            final boolean z33 = z32;
                                            Ia.l<Y.a, p293xa.r> lVar116 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(Y.a aVar4) {
                                                    Y.a aVar5 = aVar4;
                                                    List<m> list4 = list2;
                                                    boolean z34 = z33;
                                                    int size11 = list4.size();
                                                    for (int i121 = 0; i121 < size11; i121++) {
                                                        list4.get(i121).e(aVar5, z34);
                                                    }
                                                    List<m> list5 = list3;
                                                    boolean z35 = z33;
                                                    int size12 = list5.size();
                                                    for (int i122 = 0; i122 < size12; i122++) {
                                                        list5.get(i122).e(aVar5, z35);
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            aVar3.f14225a = true;
                                            lVar116.invoke(aVar3);
                                            aVar3.f14225a = false;
                                            x11.getValue();
                                            return p293xa.r.f47939a;
                                        }
                                    });
                                    z110 = i46;
                                    lVar19 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                }
                                lazyListState.g(lVar19, interfaceC0988x3.S0(), z110);
                                return lVar19;
                            } catch (Throwable th) {
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                throw th;
                            }
                        }
                    };
                    c1086g = c1086gP;
                    c1086g.E(objF4);
                }
                Ia.p pVar7 = (Ia.p) objF4;
                if (z11) {
                    orientation = Orientation.f9957b;
                } else {
                    orientation = Orientation.f9958c;
                }
                orientation2 = orientation;
                if (z12) {
                    c1086g.L(-1513147781);
                    i33 = i30 | ((i21 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    lazyListState2 = lazyListState;
                    if (((i33 & 14) ^ 6) <= 4) {
                    }
                    if (((i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                    }
                    z17 = z18 | z13;
                    objF5 = c1086g.f();
                    if (z17) {
                        objF5 = new e(lazyListState2, i32);
                        c1086g.E(objF5);
                    } else {
                        objF5 = new e(lazyListState2, i32);
                        c1086g.E(objF5);
                    }
                    hVarA = C0974i.a((e) objF5, lazyListState2.f10363n, z10, orientation2);
                    c1086g.T(false);
                } else {
                    lazyListState2 = lazyListState;
                    c1086g.L(-1512720880);
                    c1086g.T(false);
                    hVarA = androidx.compose.ui.h.a.f13984b;
                }
                LazyLayoutKt.a(iVar, K.a(N.a(hVar.i(lazyListState2.f10360k).i(lazyListState2.f10361l), iVar, m15, orientation2, z12, z10).i(hVarA).i(lazyListState2.f10362m.f10635k), lazyListState, orientation2, z12, z10, jVar, lazyListState2.f10356f, false, e10, null), lazyListState2.f10364o, pVar7, c1086g, 0, 0);
                lVar3 = lVar5;
                i28 = i32;
                bVar2 = bVar4;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                i28 = i10;
                bVar2 = bVar;
                lVar3 = lVar;
                cVar2 = cVar;
                interfaceC0129e2 = interfaceC0129e;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.d.c cVar113 = cVar2;
                final C0945e.InterfaceC0129e interfaceC0129e112 = interfaceC0129e2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyListKt.a(hVar, lazyListState, l10, z10, z11, jVar, z12, e10, i28, bVar2, lVar3, cVar113, interfaceC0129e112, lVar2, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i26 |= 384;
        if ((i13 & 8192) != 0) {
            i26 |= 3072;
        } else if ((i12 & 3072) == 0) {
            i26 |= c1086gP.k(lVar2) ? 2048 : 1024;
        }
        z13 = true;
        if ((i21 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c1086gP.C(i21 & 1, z14)) {
            if (i17 != 0) {
                i29 = 0;
            } else {
                i29 = i10;
            }
            if (i19 != 0) {
                bVar3 = null;
            } else {
                bVar3 = bVar;
            }
            if (i22 != 0) {
                lVar4 = null;
            } else {
                lVar4 = lVar;
            }
            if (i25 != 0) {
                cVar3 = null;
            } else {
                cVar3 = cVar;
            }
            if (i27 != 0) {
                interfaceC0129e2 = null;
            } else {
                interfaceC0129e2 = interfaceC0129e;
            }
            i30 = (i21 >> 3) & 14;
            int i31119 = i30 | ((i26 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            xI = J0.i(lVar2, c1086gP);
            if (((i31119 & 14) ^ 6) <= 4) {
            }
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (z15) {
                final c cVar114 = new c();
                cVar114.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                cVar114.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                C1108r0 c1108r13 = C1108r0.f13116a;
                final DerivedSnapshotState derivedSnapshotStateE14 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final LazyListIntervalContent invoke() {
                        return new LazyListIntervalContent(xI.getValue());
                    }
                }, c1108r13);
                objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final i invoke() {
                        LazyListIntervalContent value = derivedSnapshotStateE14.getValue();
                        return new i(lazyListState, value, cVar114, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                    }
                }, c1108r13), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                c1086gP.E(objF);
            } else {
                final c cVar115 = new c();
                cVar115.f10386a = new C1081d0(BrazeLogger.SUPPRESS);
                cVar115.f10387b = new C1081d0(BrazeLogger.SUPPRESS);
                C1108r0 c1108r14 = C1108r0.f13116a;
                final DerivedSnapshotState derivedSnapshotStateE15 = J0.e(new Ia.a<LazyListIntervalContent>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final LazyListIntervalContent invoke() {
                        return new LazyListIntervalContent(xI.getValue());
                    }
                }, c1108r14);
                objF = new LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1(J0.e(new Ia.a<i>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final i invoke() {
                        LazyListIntervalContent value = derivedSnapshotStateE15.getValue();
                        return new i(lazyListState, value, cVar115, new NearestRangeKeyIndexMap((Na.i) ((D) lazyListState.f10354d.f10777e).getValue(), value));
                    }
                }, c1108r14), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                c1086gP.E(objF);
            }
            iVar = (Oa.i) objF;
            int i311110 = i21 >> 9;
            int i311111 = i30 | (i311110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            i31 = i29;
            if (((i311111 & 14) ^ 6) <= 4) {
            }
            z16 = ((((i311111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.c(z11)) || (i311111 & 48) == 32) | ((((i311111 & 14) ^ 6) <= 4 && c1086gP.K(lazyListState)) || (i311111 & 6) == 4);
            objF2 = c1086gP.f();
            if (z16) {
                objF2 = new d(lazyListState, z11);
                c1086gP.E(objF2);
            } else {
                objF2 = new d(lazyListState, z11);
                c1086gP.E(objF2);
            }
            M m16 = (M) objF2;
            objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF3);
            }
            a10 = (A) objF3;
            s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
            if (((Boolean) c1086gP.x(CompositionLocalsKt.f14860v)).booleanValue()) {
                c0130a = androidx.compose.foundation.lazy.layout.X.a.f10698a;
            } else {
                c0130a = null;
            }
            int i311112 = i26 << 18;
            int i311113 = (i21 & 65520) | (i311110 & 458752) | (i311110 & 3670016) | (i311112 & 29360128) | (i311112 & 234881024) | ((i26 << 27) & 1879048192);
            if (((i311113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32) {
            }
            zK = ((((i311113 & 896) ^ 384) <= 256 && c1086gP.K(l10)) || (i311113 & 384) == 256) | ((((i311113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lazyListState)) || (i311113 & 48) == 32) | ((((i311113 & 7168) ^ 3072) <= 2048 && c1086gP.c(z10)) || (i311113 & 3072) == 2048) | ((((57344 & i311113) ^ 24576) <= 16384 && c1086gP.c(z11)) || (i311113 & 24576) == 16384) | ((((3670016 & i311113) ^ 1572864) <= 1048576 && c1086gP.K(bVar3)) || (i311113 & 1572864) == 1048576) | ((((29360128 & i311113) ^ 12582912) <= 8388608 && c1086gP.K(cVar3)) || (i311113 & 12582912) == 8388608) | ((((234881024 & i311113) ^ 100663296) <= 67108864 && c1086gP.K(interfaceC0129e2)) || (i311113 & 100663296) == 67108864) | ((((1879048192 & i311113) ^ 805306368) <= 536870912 && c1086gP.K(lVar4)) || (i311113 & 805306368) == 536870912) | c1086gP.K(s10) | c1086gP.K(c0130a);
            objF4 = c1086gP.f();
            if (zK) {
                final C0945e.l lVar19 = lVar4;
                cVar2 = cVar3;
                final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a15 = c0130a;
                bVar4 = bVar3;
                lVar5 = lVar19;
                final C0945e.InterfaceC0129e interfaceC0129e113 = interfaceC0129e2;
                c0153a2 = c0153a;
                i32 = i31;
                objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                    /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // Ia.p
                    public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                        int i311114;
                        float fMo1getSpacingD9Ej5fM;
                        long j;
                        int i40;
                        m mVar;
                        int i41;
                        m mVar2;
                        int i42;
                        List arrayList;
                        int i43;
                        int i44;
                        ArrayList arrayList2;
                        boolean z19;
                        List arrayList3;
                        int i45;
                        int i46;
                        final j jVar2;
                        Integer numValueOf;
                        Integer numValueOf2;
                        boolean z110;
                        l lVar110;
                        int[] iArr;
                        int i47;
                        m mVar3;
                        float f10;
                        int i48;
                        m mVar4;
                        Object obj;
                        int i49;
                        Object obj2;
                        int index;
                        int iMin;
                        m mVar5;
                        Object obj3;
                        int i50;
                        InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                        final long j10 = aVar.f20475a;
                        lazyListState.f10367r.getValue();
                        boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                        Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                        int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                        int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                        int iE3 = interfaceC0988x2.e1(l10.d());
                        int iE4 = interfaceC0988x2.e1(l10.a());
                        final int i51 = iE3 + iE4;
                        final int i52 = iE1 + iE2;
                        boolean z21 = z11;
                        int i53 = z21 ? i51 : i52;
                        if (z21 && !z10) {
                            i311114 = iE3;
                        } else if (z21 && z10) {
                            i311114 = iE4;
                        } else {
                            i311114 = (z21 || z10) ? iE2 : iE1;
                        }
                        int i54 = i53 - i311114;
                        long jI = p013b0.b.i(j10, -i52, -i51);
                        h hVarInvoke = iVar.invoke();
                        c cVarH = hVarInvoke.h();
                        int iH = p013b0.a.h(jI);
                        int iG = p013b0.a.g(jI);
                        cVarH.f10386a.m(iH);
                        cVarH.f10387b.m(iG);
                        if (z11) {
                            C0945e.l lVar111 = lVar19;
                            if (lVar111 == null) {
                                p245u.c.b("null verticalArrangement when isVertical == true");
                                throw new KotlinNothingValueException();
                            }
                            fMo1getSpacingD9Ej5fM = lVar111.mo1getSpacingD9Ej5fM();
                        } else {
                            C0945e.InterfaceC0129e interfaceC0129e114 = interfaceC0129e113;
                            if (interfaceC0129e114 == null) {
                                p245u.c.b("null horizontalAlignment when isVertical == false");
                                throw new KotlinNothingValueException();
                            }
                            fMo1getSpacingD9Ej5fM = interfaceC0129e114.mo1getSpacingD9Ej5fM();
                        }
                        int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                        int iB = hVarInvoke.b();
                        int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                        boolean z22 = z10;
                        if (!z22 || iG2 > 0) {
                            j = ((long) iE1) << 32;
                        } else {
                            boolean z23 = z11;
                            if (!z23) {
                                iE1 += iG2;
                            }
                            if (z23) {
                                iE3 += iG2;
                            }
                            j = ((long) iE1) << 32;
                        }
                        int i55 = iG2;
                        int i56 = i311114;
                        final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                        j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                        LazyListState lazyListState3 = lazyListState;
                        androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                        Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                        androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                        try {
                            int iH2 = lazyListState3.h();
                            q qVar = lazyListState3.f10354d;
                            int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                            if (iH2 != iK) {
                                ((C1081d0) qVar.f10774b).m(iK);
                                ((D) qVar.f10777e).e(iH2);
                            }
                            int i57 = lazyListState3.i();
                            p293xa.r rVar = p293xa.r.f47939a;
                            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                            LazyListState lazyListState4 = lazyListState;
                            List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                            float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                            boolean z24 = z11;
                            C0945e.l lVar112 = lVar19;
                            C0945e.InterfaceC0129e interfaceC0129e115 = interfaceC0129e113;
                            boolean z25 = z10;
                            LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                            int i58 = i31;
                            boolean zS0 = interfaceC0988x3.S0();
                            LazyListState lazyListState5 = lazyListState;
                            l lVar113 = lazyListState5.f10353c;
                            A a11 = a10;
                            int i59 = i57;
                            S s11 = s10;
                            androidx.compose.foundation.lazy.layout.X x10 = c0130a15;
                            l lVar114 = lVar113;
                            Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @Override // Ia.q
                                public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar115) {
                                    int iIntValue = num.intValue();
                                    int iIntValue2 = num2.intValue();
                                    return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar115);
                                }
                            };
                            int i60 = i56;
                            if (i60 < 0) {
                                p245u.c.a("invalid beforeContentPadding");
                            }
                            if (i54 < 0) {
                                p245u.c.a("invalid afterContentPadding");
                            }
                            if (iB <= 0) {
                                int iJ = p013b0.a.j(jI);
                                int i61 = p013b0.a.i(jI);
                                lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                if (!zS0) {
                                    long jB = lazyLayoutItemAnimator.b();
                                    if (!p013b0.l.b(jB, 0L)) {
                                        int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                        i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                        iJ = iG3;
                                    }
                                }
                                lVar110 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                        return p293xa.r.f47939a;
                                    }
                                }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                z110 = 0;
                            } else {
                                long j11 = jI;
                                boolean z26 = zS0;
                                int i62 = iB;
                                if (iK >= i62) {
                                    iK = i62 - 1;
                                    i59 = 0;
                                }
                                int iRound = Math.round(fFloatValue);
                                int i63 = i59 - iRound;
                                if (iK == 0 && i63 < 0) {
                                    iRound += i63;
                                    i63 = 0;
                                }
                                kotlin.collections.i iVar2 = new kotlin.collections.i();
                                int i64 = -i60;
                                int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                int i66 = i63 + i65;
                                int iMax = 0;
                                int i67 = iK;
                                while (i66 < 0 && i67 > 0) {
                                    long j12 = j11;
                                    int i68 = i67 - 1;
                                    m mVarC = n.c(jVar3, i68);
                                    iVar2.add(0, mVarC);
                                    iMax = Math.max(iMax, mVarC.f10764t);
                                    i66 += mVarC.f10763s;
                                    i67 = i68;
                                    j11 = j12;
                                }
                                long j13 = j11;
                                if (i66 < i65) {
                                    iRound -= i65 - i66;
                                    i66 = i65;
                                }
                                int i69 = i66 - i65;
                                int i70 = i55 + i54;
                                int i71 = i70 < 0 ? 0 : i70;
                                int i72 = -i69;
                                int i73 = iMax;
                                int i74 = i67;
                                int i75 = 0;
                                boolean z27 = false;
                                while (i75 < iVar2.f43019d) {
                                    if (i72 >= i71) {
                                        iVar2.k(i75);
                                        z27 = true;
                                    } else {
                                        i74++;
                                        i72 += ((m) iVar2.get(i75)).f10763s;
                                        i75++;
                                    }
                                }
                                int i76 = i69;
                                int iMax2 = i73;
                                boolean z28 = z27;
                                int i77 = i74;
                                while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                    int i78 = i71;
                                    m mVarC2 = n.c(jVar3, i77);
                                    l lVar115 = lVar114;
                                    int i79 = mVarC2.f10763s;
                                    int i80 = i72 + i79;
                                    if (i80 > i65 || i77 == i62 - 1) {
                                        iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                        iVar2.addLast(mVarC2);
                                        i50 = 1;
                                    } else {
                                        i76 -= i79;
                                        i67 = i77 + 1;
                                        i50 = 1;
                                        z28 = true;
                                    }
                                    i77 += i50;
                                    lVar114 = lVar115;
                                    i71 = i78;
                                    i72 = i80;
                                }
                                l lVar116 = lVar114;
                                if (i72 < i55) {
                                    int i81 = i55 - i72;
                                    i76 -= i81;
                                    i72 += i81;
                                    while (i76 < i60 && i67 > 0) {
                                        int i82 = i67 - 1;
                                        m mVarC3 = n.c(jVar3, i82);
                                        i67 = i82;
                                        iVar2.add(0, mVarC3);
                                        iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                        i76 += mVarC3.f10763s;
                                    }
                                    int i83 = i81 + iRound;
                                    if (i76 < 0) {
                                        i72 += i76;
                                        i40 = i83 + i76;
                                        i76 = 0;
                                    } else {
                                        i40 = i83;
                                    }
                                } else {
                                    i40 = iRound;
                                }
                                int i84 = i72;
                                float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                float f12 = fFloatValue - f11;
                                float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                if (i76 < 0) {
                                    p245u.c.a("negative currentFirstItemScrollOffset");
                                }
                                int i85 = -i76;
                                m mVar6 = (m) iVar2.first();
                                if (i60 > 0 || iE5 < 0) {
                                    int iE = iVar2.e();
                                    int i86 = i76;
                                    int i87 = 0;
                                    while (true) {
                                        if (i87 >= iE) {
                                            mVar = mVar6;
                                            break;
                                        }
                                        mVar = mVar6;
                                        int i88 = ((m) iVar2.get(i87)).f10763s;
                                        if (i86 == 0 || i88 > i86) {
                                            break;
                                        }
                                        int i89 = iE;
                                        if (i87 == kotlin.collections.l.r(iVar2)) {
                                            break;
                                        }
                                        i86 -= i88;
                                        i87++;
                                        mVar6 = (m) iVar2.get(i87);
                                        iE = i89;
                                    }
                                    m mVar7 = mVar;
                                    i41 = i86;
                                    mVar2 = mVar7;
                                } else {
                                    mVar2 = mVar6;
                                    i41 = i76;
                                }
                                int iMax3 = Math.max(0, i67 - i58);
                                int i90 = i67 - 1;
                                if (iMax3 <= i90) {
                                    arrayList = null;
                                    while (true) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        i42 = i60;
                                        arrayList.add(n.c(jVar3, i90));
                                        if (i90 == iMax3) {
                                            break;
                                        }
                                        i90--;
                                        i60 = i42;
                                    }
                                } else {
                                    i42 = i60;
                                    arrayList = null;
                                }
                                List<Integer> list = listA;
                                int size = list.size() - 1;
                                float f14 = f13;
                                if (size >= 0) {
                                    int i91 = size;
                                    while (true) {
                                        int i92 = i91 - 1;
                                        int iIntValue = listA.get(i91).intValue();
                                        if (iIntValue < iMax3) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(n.c(jVar3, iIntValue));
                                        }
                                        if (i92 < 0) {
                                            break;
                                        }
                                        i91 = i92;
                                    }
                                }
                                if (arrayList == null) {
                                    arrayList = EmptyList.f42983b;
                                }
                                int iMax4 = iMax2;
                                int i93 = 0;
                                for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                    iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                    i93++;
                                }
                                int i94 = iMax4;
                                int i95 = i62 - 1;
                                int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                if (i96 <= iMin2) {
                                    ArrayList arrayList4 = null;
                                    while (true) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        i44 = i77;
                                        arrayList2 = arrayList4;
                                        i43 = i85;
                                        arrayList2.add(n.c(jVar3, i96));
                                        if (i96 == iMin2) {
                                            break;
                                        }
                                        i96++;
                                        i85 = i43;
                                        arrayList4 = arrayList2;
                                        i77 = i44;
                                    }
                                } else {
                                    i43 = i85;
                                    i44 = i77;
                                    arrayList2 = null;
                                }
                                if (!z26 || lVar116 == null || lVar116.f().isEmpty()) {
                                    z19 = z26;
                                    i84 = i84;
                                    arrayList3 = arrayList2;
                                } else {
                                    List<m> listF = lVar116.f();
                                    int size3 = listF.size() - 1;
                                    ArrayList arrayList5 = arrayList2;
                                    int i97 = -1;
                                    while (true) {
                                        if (i97 >= size3) {
                                            mVar3 = null;
                                            break;
                                        }
                                        if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                            mVar3 = listF.get(size3);
                                            break;
                                        }
                                        i97 = -1;
                                        size3--;
                                    }
                                    g gVar = (g) kotlin.collections.q.V(lVar116.f());
                                    if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                        arrayList3 = arrayList5;
                                        while (true) {
                                            z19 = z26;
                                            if (arrayList3 != null) {
                                                int size4 = arrayList3.size();
                                                int i98 = 0;
                                                while (true) {
                                                    if (i98 >= size4) {
                                                        obj3 = null;
                                                        break;
                                                    }
                                                    obj3 = arrayList3.get(i98);
                                                    int i99 = size4;
                                                    if (((m) obj3).f10746a == index) {
                                                        break;
                                                    }
                                                    i98++;
                                                    size4 = i99;
                                                }
                                                mVar5 = (m) obj3;
                                            } else {
                                                mVar5 = null;
                                            }
                                            if (mVar5 == null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, index));
                                            }
                                            if (index == iMin) {
                                                break;
                                            }
                                            index++;
                                            z26 = z19;
                                            i84 = i84;
                                        }
                                    } else {
                                        z19 = z26;
                                        i84 = i84;
                                        arrayList3 = arrayList5;
                                    }
                                    float offset = ((lVar116.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                    if (offset > 0.0f) {
                                        int index2 = gVar.getIndex() + 1;
                                        int i100 = 0;
                                        while (index2 < i62 && i100 < offset) {
                                            if (index2 <= iMin2) {
                                                int iE6 = iVar2.e();
                                                int i101 = 0;
                                                while (true) {
                                                    if (i101 >= iE6) {
                                                        f10 = offset;
                                                        obj2 = null;
                                                        break;
                                                    }
                                                    obj2 = iVar2.get(i101);
                                                    f10 = offset;
                                                    if (((m) obj2).f10746a == index2) {
                                                        break;
                                                    }
                                                    i101++;
                                                    offset = f10;
                                                }
                                                mVar4 = (m) obj2;
                                                i48 = 1;
                                            } else {
                                                f10 = offset;
                                                if (arrayList3 != null) {
                                                    int size5 = arrayList3.size();
                                                    int i102 = 0;
                                                    while (true) {
                                                        if (i102 >= size5) {
                                                            i48 = 1;
                                                            obj = null;
                                                            break;
                                                        }
                                                        obj = arrayList3.get(i102);
                                                        int i103 = size5;
                                                        if (((m) obj).f10746a == index2) {
                                                            i48 = 1;
                                                            break;
                                                        }
                                                        i102++;
                                                        size5 = i103;
                                                    }
                                                    mVar4 = (m) obj;
                                                } else {
                                                    i48 = 1;
                                                    mVar4 = null;
                                                }
                                            }
                                            if (mVar4 != null) {
                                                index2 += i48;
                                                i49 = mVar4.f10763s;
                                            } else {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, index2));
                                                index2++;
                                                i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                            }
                                            i100 += i49;
                                            offset = f10;
                                        }
                                    }
                                }
                                if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                    iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                }
                                int size6 = list.size();
                                for (int i104 = 0; i104 < size6; i104++) {
                                    int iIntValue2 = listA.get(i104).intValue();
                                    if (iIntValue2 > iMin2) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(n.c(jVar3, iIntValue2));
                                    }
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = EmptyList.f42983b;
                                }
                                int size7 = arrayList3.size();
                                int iMax5 = i94;
                                for (int i105 = 0; i105 < size7; i105++) {
                                    iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                }
                                boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                if (z24) {
                                    iMax5 = i84;
                                }
                                int iF = p013b0.b.f(iMax5, j13);
                                int i106 = z24 ? iF : iG4;
                                int i107 = i84;
                                boolean z30 = i107 < Math.min(i106, i55);
                                if (z30 && i43 != 0) {
                                    p245u.c.c("non-zero itemsScrollOffset");
                                }
                                m mVar8 = mVar2;
                                final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                if (z30) {
                                    if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                        p245u.c.a("no extra items");
                                    }
                                    int iE7 = iVar2.e();
                                    int[] iArr2 = new int[iE7];
                                    for (int i108 = 0; i108 < iE7; i108++) {
                                        iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                    }
                                    int[] iArr3 = new int[iE7];
                                    if (z24) {
                                        if (lVar112 == null) {
                                            p245u.c.b("null verticalArrangement when isVertical == true");
                                            throw new KotlinNothingValueException();
                                        }
                                        lVar112.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                        iArr = iArr3;
                                        i45 = i55;
                                        i47 = 0;
                                        jVar2 = jVar3;
                                    } else {
                                        if (interfaceC0129e115 == null) {
                                            p245u.c.b("null horizontalArrangement when isVertical == false");
                                            throw new KotlinNothingValueException();
                                        }
                                        interfaceC0988x3 = interfaceC0988x3;
                                        iArr = iArr3;
                                        i45 = i55;
                                        jVar2 = jVar3;
                                        i47 = 0;
                                        interfaceC0129e115.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                    }
                                    Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                    Na.g gVarH = iVarQ;
                                    if (z25) {
                                        gVarH = Na.l.H(iVarQ);
                                    }
                                    int i109 = gVarH.f4687b;
                                    int i110 = gVarH.f4688c;
                                    int i111 = gVarH.f4689d;
                                    if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                        while (true) {
                                            int i112 = iArr[i109];
                                            m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                            if (z25) {
                                                i112 = (i106 - i112) - mVar9.f10761q;
                                            }
                                            mVar9.k(i112, iG4, iF);
                                            arrayList6.add(mVar9);
                                            if (i109 == i110) {
                                                break;
                                            }
                                            i109 += i111;
                                        }
                                    }
                                    i46 = i47;
                                } else {
                                    i45 = i55;
                                    j13 = j13;
                                    i62 = i62;
                                    i42 = i42;
                                    i46 = 0;
                                    jVar2 = jVar3;
                                    i107 = i107;
                                    int size8 = arrayList.size();
                                    int i113 = i43;
                                    for (int i114 = 0; i114 < size8; i114++) {
                                        m mVar10 = (m) arrayList.get(i114);
                                        i113 -= mVar10.f10763s;
                                        mVar10.k(i113, iG4, iF);
                                        arrayList6.add(mVar10);
                                    }
                                    int iE8 = iVar2.e();
                                    int i115 = i43;
                                    for (int i116 = 0; i116 < iE8; i116++) {
                                        m mVar11 = (m) iVar2.get(i116);
                                        mVar11.k(i115, iG4, iF);
                                        arrayList6.add(mVar11);
                                        i115 += mVar11.f10763s;
                                    }
                                    int size9 = arrayList3.size();
                                    for (int i117 = 0; i117 < size9; i117++) {
                                        m mVar12 = (m) arrayList3.get(i117);
                                        mVar12.k(i115, iG4, iF);
                                        arrayList6.add(mVar12);
                                        i115 += mVar12.f10763s;
                                    }
                                }
                                h hVar2 = jVar2.f10770a;
                                lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                if (!z19) {
                                    long jB2 = lazyLayoutItemAnimator.b();
                                    if (!p013b0.l.b(jB2, 0L)) {
                                        int i118 = z24 ? iF : iG4;
                                        long j14 = j13;
                                        iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                        iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                        int i119 = z24 ? iF : iG4;
                                        if (i119 != i118) {
                                            int size10 = arrayList6.size();
                                            for (int i120 = i46; i120 < size10; i120++) {
                                                m mVar13 = (m) arrayList6.get(i120);
                                                mVar13.f10766v = i119;
                                                mVar13.f10768x = mVar13.f10754i + i119;
                                            }
                                        }
                                    }
                                }
                                final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final m invoke(Integer num) {
                                        return n.c(jVar2, num.intValue());
                                    }
                                });
                                if (z29) {
                                    m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                    if (mVar14 != null) {
                                        numValueOf = Integer.valueOf(mVar14.f10746a);
                                    } else {
                                        numValueOf = null;
                                    }
                                } else {
                                    m mVar15 = (m) iVar2.A();
                                    if (mVar15 != null) {
                                        numValueOf = Integer.valueOf(mVar15.f10746a);
                                    } else {
                                        numValueOf = null;
                                    }
                                }
                                if (z29) {
                                    m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                    if (mVar16 != null) {
                                        numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                } else {
                                    m mVar17 = (m) iVar2.C();
                                    if (mVar17 != null) {
                                        numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                }
                                boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                Integer numValueOf3 = Integer.valueOf(iG4);
                                Integer numValueOf4 = Integer.valueOf(iF);
                                final X x11 = lazyListState5.f10370u;
                                final boolean z32 = z19;
                                F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Y.a aVar2) {
                                        Y.a aVar3 = aVar2;
                                        final List<m> list2 = arrayList6;
                                        final List<m> list3 = listD;
                                        final boolean z33 = z32;
                                        Ia.l<Y.a, p293xa.r> lVar117 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Y.a aVar4) {
                                                Y.a aVar5 = aVar4;
                                                List<m> list4 = list2;
                                                boolean z34 = z33;
                                                int size11 = list4.size();
                                                for (int i121 = 0; i121 < size11; i121++) {
                                                    list4.get(i121).e(aVar5, z34);
                                                }
                                                List<m> list5 = list3;
                                                boolean z35 = z33;
                                                int size12 = list5.size();
                                                for (int i122 = 0; i122 < size12; i122++) {
                                                    list5.get(i122).e(aVar5, z35);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        aVar3.f14225a = true;
                                        lVar117.invoke(aVar3);
                                        aVar3.f14225a = false;
                                        x11.getValue();
                                        return p293xa.r.f47939a;
                                    }
                                });
                                z110 = i46;
                                lVar110 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                            }
                            lazyListState.g(lVar110, interfaceC0988x3.S0(), z110);
                            return lVar110;
                        } catch (Throwable th) {
                            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                            throw th;
                        }
                    }
                };
                c1086g = c1086gP;
                c1086g.E(objF4);
            } else {
                final C0945e.l lVar110 = lVar4;
                cVar2 = cVar3;
                final androidx.compose.foundation.lazy.layout.X.a.C0130a c0130a16 = c0130a;
                bVar4 = bVar3;
                lVar5 = lVar110;
                final C0945e.InterfaceC0129e interfaceC0129e114 = interfaceC0129e2;
                c0153a2 = c0153a;
                i32 = i31;
                objF4 = new Ia.p<InterfaceC0988x, p013b0.a, l>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Code duplicated, block: B:411:0x08ef  */
                    /* JADX WARN: Code duplicated, block: B:420:0x0914  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // Ia.p
                    public final l invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar) {
                        int i311114;
                        float fMo1getSpacingD9Ej5fM;
                        long j;
                        int i40;
                        m mVar;
                        int i41;
                        m mVar2;
                        int i42;
                        List arrayList;
                        int i43;
                        int i44;
                        ArrayList arrayList2;
                        boolean z19;
                        List arrayList3;
                        int i45;
                        int i46;
                        final j jVar2;
                        Integer numValueOf;
                        Integer numValueOf2;
                        boolean z110;
                        l lVar111;
                        int[] iArr;
                        int i47;
                        m mVar3;
                        float f10;
                        int i48;
                        m mVar4;
                        Object obj;
                        int i49;
                        Object obj2;
                        int index;
                        int iMin;
                        m mVar5;
                        Object obj3;
                        int i50;
                        InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                        final long j10 = aVar.f20475a;
                        lazyListState.f10367r.getValue();
                        boolean z20 = lazyListState.f10352b || interfaceC0988x2.S0();
                        Lb.a.b(j10, z11 ? Orientation.f9957b : Orientation.f9958c);
                        int iE1 = z11 ? interfaceC0988x2.e1(l10.b(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.d(l10, interfaceC0988x2.getLayoutDirection()));
                        int iE2 = z11 ? interfaceC0988x2.e1(l10.c(interfaceC0988x2.getLayoutDirection())) : interfaceC0988x2.e1(PaddingKt.c(l10, interfaceC0988x2.getLayoutDirection()));
                        int iE3 = interfaceC0988x2.e1(l10.d());
                        int iE4 = interfaceC0988x2.e1(l10.a());
                        final int i51 = iE3 + iE4;
                        final int i52 = iE1 + iE2;
                        boolean z21 = z11;
                        int i53 = z21 ? i51 : i52;
                        if (z21 && !z10) {
                            i311114 = iE3;
                        } else if (z21 && z10) {
                            i311114 = iE4;
                        } else {
                            i311114 = (z21 || z10) ? iE2 : iE1;
                        }
                        int i54 = i53 - i311114;
                        long jI = p013b0.b.i(j10, -i52, -i51);
                        h hVarInvoke = iVar.invoke();
                        c cVarH = hVarInvoke.h();
                        int iH = p013b0.a.h(jI);
                        int iG = p013b0.a.g(jI);
                        cVarH.f10386a.m(iH);
                        cVarH.f10387b.m(iG);
                        if (z11) {
                            C0945e.l lVar112 = lVar110;
                            if (lVar112 == null) {
                                p245u.c.b("null verticalArrangement when isVertical == true");
                                throw new KotlinNothingValueException();
                            }
                            fMo1getSpacingD9Ej5fM = lVar112.mo1getSpacingD9Ej5fM();
                        } else {
                            C0945e.InterfaceC0129e interfaceC0129e115 = interfaceC0129e114;
                            if (interfaceC0129e115 == null) {
                                p245u.c.b("null horizontalAlignment when isVertical == false");
                                throw new KotlinNothingValueException();
                            }
                            fMo1getSpacingD9Ej5fM = interfaceC0129e115.mo1getSpacingD9Ej5fM();
                        }
                        int iE5 = interfaceC0988x2.e1(fMo1getSpacingD9Ej5fM);
                        int iB = hVarInvoke.b();
                        int iG2 = z11 ? p013b0.a.g(j10) - i51 : p013b0.a.h(j10) - i52;
                        boolean z22 = z10;
                        if (!z22 || iG2 > 0) {
                            j = ((long) iE1) << 32;
                        } else {
                            boolean z23 = z11;
                            if (!z23) {
                                iE1 += iG2;
                            }
                            if (z23) {
                                iE3 += iG2;
                            }
                            j = ((long) iE1) << 32;
                        }
                        int i55 = iG2;
                        int i56 = i311114;
                        final InterfaceC0988x interfaceC0988x3 = interfaceC0988x2;
                        j jVar3 = new j(jI, z11, hVarInvoke, interfaceC0988x2, iB, iE5, bVar4, cVar2, z22, i56, i54, j | (((long) iE3) & 4294967295L), lazyListState);
                        LazyListState lazyListState3 = lazyListState;
                        androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                        Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                        androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                        try {
                            int iH2 = lazyListState3.h();
                            q qVar = lazyListState3.f10354d;
                            int iK = C.k(iH2, hVarInvoke, qVar.f10776d);
                            if (iH2 != iK) {
                                ((C1081d0) qVar.f10774b).m(iK);
                                ((D) qVar.f10777e).e(iH2);
                            }
                            int i57 = lazyListState3.i();
                            p293xa.r rVar = p293xa.r.f47939a;
                            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                            LazyListState lazyListState4 = lazyListState;
                            List<Integer> listA = C0977l.a(hVarInvoke, lazyListState4.f10366q, lazyListState4.f10363n);
                            float fFloatValue = (interfaceC0988x3.S0() || !z20) ? lazyListState.f10357g : ((Number) lazyListState.f10371v.f10646a.f9544c.getValue()).floatValue();
                            boolean z24 = z11;
                            C0945e.l lVar113 = lVar110;
                            C0945e.InterfaceC0129e interfaceC0129e116 = interfaceC0129e114;
                            boolean z25 = z10;
                            LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = lazyListState.f10362m;
                            int i58 = i31;
                            boolean zS0 = interfaceC0988x3.S0();
                            LazyListState lazyListState5 = lazyListState;
                            l lVar114 = lazyListState5.f10353c;
                            A a11 = a10;
                            int i59 = i57;
                            S s11 = s10;
                            androidx.compose.foundation.lazy.layout.X x10 = c0130a16;
                            l lVar115 = lVar114;
                            Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F> qVar2 = new Ia.q<Integer, Integer, Ia.l<? super Y.a, ? extends p293xa.r>, F>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @Override // Ia.q
                                public final F invoke(Integer num, Integer num2, Ia.l<? super Y.a, ? extends p293xa.r> lVar116) {
                                    int iIntValue = num.intValue();
                                    int iIntValue2 = num2.intValue();
                                    return interfaceC0988x3.y1(p013b0.b.g(iIntValue + i52, j10), p013b0.b.f(iIntValue2 + i51, j10), y.p(), lVar116);
                                }
                            };
                            int i60 = i56;
                            if (i60 < 0) {
                                p245u.c.a("invalid beforeContentPadding");
                            }
                            if (i54 < 0) {
                                p245u.c.a("invalid afterContentPadding");
                            }
                            if (iB <= 0) {
                                int iJ = p013b0.a.j(jI);
                                int i61 = p013b0.a.i(jI);
                                lazyLayoutItemAnimator.d(0, iJ, i61, new ArrayList(), hVarInvoke.a(), jVar3, z24, zS0, 1, z20, 0, 0, a11, s11);
                                if (!zS0) {
                                    long jB = lazyLayoutItemAnimator.b();
                                    if (!p013b0.l.b(jB, 0L)) {
                                        int iG3 = p013b0.b.g((int) (jB >> 32), jI);
                                        i61 = p013b0.b.f((int) (jB & 4294967295L), jI);
                                        iJ = iG3;
                                    }
                                }
                                lVar111 = new l(null, 0, false, 0.0f, (F) qVar2.invoke(Integer.valueOf(iJ), Integer.valueOf(i61), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ p293xa.r invoke(Y.a aVar2) {
                                        return p293xa.r.f47939a;
                                    }
                                }), 0.0f, false, a11, interfaceC0988x3, jVar3.f10772c, EmptyList.f42983b, -i60, i55 + i54, 0, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                                z110 = 0;
                            } else {
                                long j11 = jI;
                                boolean z26 = zS0;
                                int i62 = iB;
                                if (iK >= i62) {
                                    iK = i62 - 1;
                                    i59 = 0;
                                }
                                int iRound = Math.round(fFloatValue);
                                int i63 = i59 - iRound;
                                if (iK == 0 && i63 < 0) {
                                    iRound += i63;
                                    i63 = 0;
                                }
                                kotlin.collections.i iVar2 = new kotlin.collections.i();
                                int i64 = -i60;
                                int i65 = i64 + (iE5 < 0 ? iE5 : 0);
                                int i66 = i63 + i65;
                                int iMax = 0;
                                int i67 = iK;
                                while (i66 < 0 && i67 > 0) {
                                    long j12 = j11;
                                    int i68 = i67 - 1;
                                    m mVarC = n.c(jVar3, i68);
                                    iVar2.add(0, mVarC);
                                    iMax = Math.max(iMax, mVarC.f10764t);
                                    i66 += mVarC.f10763s;
                                    i67 = i68;
                                    j11 = j12;
                                }
                                long j13 = j11;
                                if (i66 < i65) {
                                    iRound -= i65 - i66;
                                    i66 = i65;
                                }
                                int i69 = i66 - i65;
                                int i70 = i55 + i54;
                                int i71 = i70 < 0 ? 0 : i70;
                                int i72 = -i69;
                                int i73 = iMax;
                                int i74 = i67;
                                int i75 = 0;
                                boolean z27 = false;
                                while (i75 < iVar2.f43019d) {
                                    if (i72 >= i71) {
                                        iVar2.k(i75);
                                        z27 = true;
                                    } else {
                                        i74++;
                                        i72 += ((m) iVar2.get(i75)).f10763s;
                                        i75++;
                                    }
                                }
                                int i76 = i69;
                                int iMax2 = i73;
                                boolean z28 = z27;
                                int i77 = i74;
                                while (i77 < i62 && (i72 < i71 || i72 <= 0 || iVar2.isEmpty())) {
                                    int i78 = i71;
                                    m mVarC2 = n.c(jVar3, i77);
                                    l lVar116 = lVar115;
                                    int i79 = mVarC2.f10763s;
                                    int i80 = i72 + i79;
                                    if (i80 > i65 || i77 == i62 - 1) {
                                        iMax2 = Math.max(iMax2, mVarC2.f10764t);
                                        iVar2.addLast(mVarC2);
                                        i50 = 1;
                                    } else {
                                        i76 -= i79;
                                        i67 = i77 + 1;
                                        i50 = 1;
                                        z28 = true;
                                    }
                                    i77 += i50;
                                    lVar115 = lVar116;
                                    i71 = i78;
                                    i72 = i80;
                                }
                                l lVar117 = lVar115;
                                if (i72 < i55) {
                                    int i81 = i55 - i72;
                                    i76 -= i81;
                                    i72 += i81;
                                    while (i76 < i60 && i67 > 0) {
                                        int i82 = i67 - 1;
                                        m mVarC3 = n.c(jVar3, i82);
                                        i67 = i82;
                                        iVar2.add(0, mVarC3);
                                        iMax2 = Math.max(iMax2, mVarC3.f10764t);
                                        i76 += mVarC3.f10763s;
                                    }
                                    int i83 = i81 + iRound;
                                    if (i76 < 0) {
                                        i72 += i76;
                                        i40 = i83 + i76;
                                        i76 = 0;
                                    } else {
                                        i40 = i83;
                                    }
                                } else {
                                    i40 = iRound;
                                }
                                int i84 = i72;
                                float f11 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i40) || Math.abs(Math.round(fFloatValue)) < Math.abs(i40)) ? fFloatValue : i40;
                                float f12 = fFloatValue - f11;
                                float f13 = (!z26 || i40 <= iRound || f12 > 0.0f) ? 0.0f : (i40 - iRound) + f12;
                                if (i76 < 0) {
                                    p245u.c.a("negative currentFirstItemScrollOffset");
                                }
                                int i85 = -i76;
                                m mVar6 = (m) iVar2.first();
                                if (i60 > 0 || iE5 < 0) {
                                    int iE = iVar2.e();
                                    int i86 = i76;
                                    int i87 = 0;
                                    while (true) {
                                        if (i87 >= iE) {
                                            mVar = mVar6;
                                            break;
                                        }
                                        mVar = mVar6;
                                        int i88 = ((m) iVar2.get(i87)).f10763s;
                                        if (i86 == 0 || i88 > i86) {
                                            break;
                                        }
                                        int i89 = iE;
                                        if (i87 == kotlin.collections.l.r(iVar2)) {
                                            break;
                                        }
                                        i86 -= i88;
                                        i87++;
                                        mVar6 = (m) iVar2.get(i87);
                                        iE = i89;
                                    }
                                    m mVar7 = mVar;
                                    i41 = i86;
                                    mVar2 = mVar7;
                                } else {
                                    mVar2 = mVar6;
                                    i41 = i76;
                                }
                                int iMax3 = Math.max(0, i67 - i58);
                                int i90 = i67 - 1;
                                if (iMax3 <= i90) {
                                    arrayList = null;
                                    while (true) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        i42 = i60;
                                        arrayList.add(n.c(jVar3, i90));
                                        if (i90 == iMax3) {
                                            break;
                                        }
                                        i90--;
                                        i60 = i42;
                                    }
                                } else {
                                    i42 = i60;
                                    arrayList = null;
                                }
                                List<Integer> list = listA;
                                int size = list.size() - 1;
                                float f14 = f13;
                                if (size >= 0) {
                                    int i91 = size;
                                    while (true) {
                                        int i92 = i91 - 1;
                                        int iIntValue = listA.get(i91).intValue();
                                        if (iIntValue < iMax3) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(n.c(jVar3, iIntValue));
                                        }
                                        if (i92 < 0) {
                                            break;
                                        }
                                        i91 = i92;
                                    }
                                }
                                if (arrayList == null) {
                                    arrayList = EmptyList.f42983b;
                                }
                                int iMax4 = iMax2;
                                int i93 = 0;
                                for (int size2 = arrayList.size(); i93 < size2; size2 = size2) {
                                    iMax4 = Math.max(iMax4, ((m) arrayList.get(i93)).f10764t);
                                    i93++;
                                }
                                int i94 = iMax4;
                                int i95 = i62 - 1;
                                int iMin2 = Math.min(((m) kotlin.collections.q.V(iVar2)).f10746a + i58, i95);
                                int i96 = ((m) kotlin.collections.q.V(iVar2)).f10746a + 1;
                                if (i96 <= iMin2) {
                                    ArrayList arrayList4 = null;
                                    while (true) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        i44 = i77;
                                        arrayList2 = arrayList4;
                                        i43 = i85;
                                        arrayList2.add(n.c(jVar3, i96));
                                        if (i96 == iMin2) {
                                            break;
                                        }
                                        i96++;
                                        i85 = i43;
                                        arrayList4 = arrayList2;
                                        i77 = i44;
                                    }
                                } else {
                                    i43 = i85;
                                    i44 = i77;
                                    arrayList2 = null;
                                }
                                if (!z26 || lVar117 == null || lVar117.f().isEmpty()) {
                                    z19 = z26;
                                    i84 = i84;
                                    arrayList3 = arrayList2;
                                } else {
                                    List<m> listF = lVar117.f();
                                    int size3 = listF.size() - 1;
                                    ArrayList arrayList5 = arrayList2;
                                    int i97 = -1;
                                    while (true) {
                                        if (i97 >= size3) {
                                            mVar3 = null;
                                            break;
                                        }
                                        if (listF.get(size3).getIndex() > iMin2 && (size3 == 0 || listF.get(size3 - 1).getIndex() <= iMin2)) {
                                            mVar3 = listF.get(size3);
                                            break;
                                        }
                                        i97 = -1;
                                        size3--;
                                    }
                                    g gVar = (g) kotlin.collections.q.V(lVar117.f());
                                    if (mVar3 != null && (index = mVar3.getIndex()) <= (iMin = Math.min(gVar.getIndex(), i95))) {
                                        arrayList3 = arrayList5;
                                        while (true) {
                                            z19 = z26;
                                            if (arrayList3 != null) {
                                                int size4 = arrayList3.size();
                                                int i98 = 0;
                                                while (true) {
                                                    if (i98 >= size4) {
                                                        obj3 = null;
                                                        break;
                                                    }
                                                    obj3 = arrayList3.get(i98);
                                                    int i99 = size4;
                                                    if (((m) obj3).f10746a == index) {
                                                        break;
                                                    }
                                                    i98++;
                                                    size4 = i99;
                                                }
                                                mVar5 = (m) obj3;
                                            } else {
                                                mVar5 = null;
                                            }
                                            if (mVar5 == null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, index));
                                            }
                                            if (index == iMin) {
                                                break;
                                            }
                                            index++;
                                            z26 = z19;
                                            i84 = i84;
                                        }
                                    } else {
                                        z19 = z26;
                                        i84 = i84;
                                        arrayList3 = arrayList5;
                                    }
                                    float offset = ((lVar117.f10563m - gVar.getOffset()) - gVar.getSize()) - f11;
                                    if (offset > 0.0f) {
                                        int index2 = gVar.getIndex() + 1;
                                        int i100 = 0;
                                        while (index2 < i62 && i100 < offset) {
                                            if (index2 <= iMin2) {
                                                int iE6 = iVar2.e();
                                                int i101 = 0;
                                                while (true) {
                                                    if (i101 >= iE6) {
                                                        f10 = offset;
                                                        obj2 = null;
                                                        break;
                                                    }
                                                    obj2 = iVar2.get(i101);
                                                    f10 = offset;
                                                    if (((m) obj2).f10746a == index2) {
                                                        break;
                                                    }
                                                    i101++;
                                                    offset = f10;
                                                }
                                                mVar4 = (m) obj2;
                                                i48 = 1;
                                            } else {
                                                f10 = offset;
                                                if (arrayList3 != null) {
                                                    int size5 = arrayList3.size();
                                                    int i102 = 0;
                                                    while (true) {
                                                        if (i102 >= size5) {
                                                            i48 = 1;
                                                            obj = null;
                                                            break;
                                                        }
                                                        obj = arrayList3.get(i102);
                                                        int i103 = size5;
                                                        if (((m) obj).f10746a == index2) {
                                                            i48 = 1;
                                                            break;
                                                        }
                                                        i102++;
                                                        size5 = i103;
                                                    }
                                                    mVar4 = (m) obj;
                                                } else {
                                                    i48 = 1;
                                                    mVar4 = null;
                                                }
                                            }
                                            if (mVar4 != null) {
                                                index2 += i48;
                                                i49 = mVar4.f10763s;
                                            } else {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(n.c(jVar3, index2));
                                                index2++;
                                                i49 = ((m) kotlin.collections.q.V(arrayList3)).f10763s;
                                            }
                                            i100 += i49;
                                            offset = f10;
                                        }
                                    }
                                }
                                if (arrayList3 != null && ((m) kotlin.collections.q.V(arrayList3)).f10746a > iMin2) {
                                    iMin2 = ((m) kotlin.collections.q.V(arrayList3)).f10746a;
                                }
                                int size6 = list.size();
                                for (int i104 = 0; i104 < size6; i104++) {
                                    int iIntValue2 = listA.get(i104).intValue();
                                    if (iIntValue2 > iMin2) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(n.c(jVar3, iIntValue2));
                                    }
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = EmptyList.f42983b;
                                }
                                int size7 = arrayList3.size();
                                int iMax5 = i94;
                                for (int i105 = 0; i105 < size7; i105++) {
                                    iMax5 = Math.max(iMax5, ((m) arrayList3.get(i105)).f10764t);
                                }
                                boolean z29 = kotlin.jvm.internal.i.a(mVar2, iVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                                int iG4 = p013b0.b.g(z24 ? iMax5 : i84, j13);
                                if (z24) {
                                    iMax5 = i84;
                                }
                                int iF = p013b0.b.f(iMax5, j13);
                                int i106 = z24 ? iF : iG4;
                                int i107 = i84;
                                boolean z30 = i107 < Math.min(i106, i55);
                                if (z30 && i43 != 0) {
                                    p245u.c.c("non-zero itemsScrollOffset");
                                }
                                m mVar8 = mVar2;
                                final ArrayList arrayList6 = new ArrayList(arrayList3.size() + arrayList.size() + iVar2.e());
                                if (z30) {
                                    if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                                        p245u.c.a("no extra items");
                                    }
                                    int iE7 = iVar2.e();
                                    int[] iArr2 = new int[iE7];
                                    for (int i108 = 0; i108 < iE7; i108++) {
                                        iArr2[i108] = ((m) iVar2.get(!z25 ? i108 : (iE7 - i108) - 1)).f10761q;
                                    }
                                    int[] iArr3 = new int[iE7];
                                    if (z24) {
                                        if (lVar113 == null) {
                                            p245u.c.b("null verticalArrangement when isVertical == true");
                                            throw new KotlinNothingValueException();
                                        }
                                        lVar113.arrange(interfaceC0988x3, i106, iArr2, iArr3);
                                        iArr = iArr3;
                                        i45 = i55;
                                        i47 = 0;
                                        jVar2 = jVar3;
                                    } else {
                                        if (interfaceC0129e116 == null) {
                                            p245u.c.b("null horizontalArrangement when isVertical == false");
                                            throw new KotlinNothingValueException();
                                        }
                                        interfaceC0988x3 = interfaceC0988x3;
                                        iArr = iArr3;
                                        i45 = i55;
                                        jVar2 = jVar3;
                                        i47 = 0;
                                        interfaceC0129e116.a(interfaceC0988x3, i106, iArr2, LayoutDirection.f15717b, iArr);
                                    }
                                    Na.i iVarQ = kotlin.collections.k.Q(iArr);
                                    Na.g gVarH = iVarQ;
                                    if (z25) {
                                        gVarH = Na.l.H(iVarQ);
                                    }
                                    int i109 = gVarH.f4687b;
                                    int i110 = gVarH.f4688c;
                                    int i111 = gVarH.f4689d;
                                    if ((i111 > 0 && i109 <= i110) || (i111 < 0 && i110 <= i109)) {
                                        while (true) {
                                            int i112 = iArr[i109];
                                            m mVar9 = (m) iVar2.get(!z25 ? i109 : (iE7 - i109) - 1);
                                            if (z25) {
                                                i112 = (i106 - i112) - mVar9.f10761q;
                                            }
                                            mVar9.k(i112, iG4, iF);
                                            arrayList6.add(mVar9);
                                            if (i109 == i110) {
                                                break;
                                            }
                                            i109 += i111;
                                        }
                                    }
                                    i46 = i47;
                                } else {
                                    i45 = i55;
                                    j13 = j13;
                                    i62 = i62;
                                    i42 = i42;
                                    i46 = 0;
                                    jVar2 = jVar3;
                                    i107 = i107;
                                    int size8 = arrayList.size();
                                    int i113 = i43;
                                    for (int i114 = 0; i114 < size8; i114++) {
                                        m mVar10 = (m) arrayList.get(i114);
                                        i113 -= mVar10.f10763s;
                                        mVar10.k(i113, iG4, iF);
                                        arrayList6.add(mVar10);
                                    }
                                    int iE8 = iVar2.e();
                                    int i115 = i43;
                                    for (int i116 = 0; i116 < iE8; i116++) {
                                        m mVar11 = (m) iVar2.get(i116);
                                        mVar11.k(i115, iG4, iF);
                                        arrayList6.add(mVar11);
                                        i115 += mVar11.f10763s;
                                    }
                                    int size9 = arrayList3.size();
                                    for (int i117 = 0; i117 < size9; i117++) {
                                        m mVar12 = (m) arrayList3.get(i117);
                                        mVar12.k(i115, iG4, iF);
                                        arrayList6.add(mVar12);
                                        i115 += mVar12.f10763s;
                                    }
                                }
                                h hVar2 = jVar2.f10770a;
                                lazyLayoutItemAnimator.d((int) f11, iG4, iF, arrayList6, hVar2.a(), jVar2, z24, z19, 1, z20, i41, i107, a11, s11);
                                if (!z19) {
                                    long jB2 = lazyLayoutItemAnimator.b();
                                    if (!p013b0.l.b(jB2, 0L)) {
                                        int i118 = z24 ? iF : iG4;
                                        long j14 = j13;
                                        iG4 = p013b0.b.g(Math.max(iG4, (int) (jB2 >> 32)), j14);
                                        iF = p013b0.b.f(Math.max(iF, (int) (jB2 & 4294967295L)), j14);
                                        int i119 = z24 ? iF : iG4;
                                        if (i119 != i118) {
                                            int size10 = arrayList6.size();
                                            for (int i120 = i46; i120 < size10; i120++) {
                                                m mVar13 = (m) arrayList6.get(i120);
                                                mVar13.f10766v = i119;
                                                mVar13.f10768x = mVar13.f10754i + i119;
                                            }
                                        }
                                    }
                                }
                                final List listD = P3.d.d(x10, arrayList6, hVar2.d(), i42, i54, iG4, iF, new Ia.l<Integer, m>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$stickingItems$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final m invoke(Integer num) {
                                        return n.c(jVar2, num.intValue());
                                    }
                                });
                                if (z29) {
                                    m mVar14 = (m) kotlin.collections.q.P(arrayList6);
                                    if (mVar14 != null) {
                                        numValueOf = Integer.valueOf(mVar14.f10746a);
                                    } else {
                                        numValueOf = null;
                                    }
                                } else {
                                    m mVar15 = (m) iVar2.A();
                                    if (mVar15 != null) {
                                        numValueOf = Integer.valueOf(mVar15.f10746a);
                                    } else {
                                        numValueOf = null;
                                    }
                                }
                                if (z29) {
                                    m mVar16 = (m) kotlin.collections.q.W(arrayList6);
                                    if (mVar16 != null) {
                                        numValueOf2 = Integer.valueOf(mVar16.f10746a);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                } else {
                                    m mVar17 = (m) iVar2.C();
                                    if (mVar17 != null) {
                                        numValueOf2 = Integer.valueOf(mVar17.f10746a);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                }
                                boolean z31 = (i44 < i62 || i107 > i45) ? 1 : i46;
                                Integer numValueOf3 = Integer.valueOf(iG4);
                                Integer numValueOf4 = Integer.valueOf(iF);
                                final X x11 = lazyListState5.f10370u;
                                final boolean z32 = z19;
                                F f15 = (F) qVar2.invoke(numValueOf3, numValueOf4, new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Y.a aVar2) {
                                        Y.a aVar3 = aVar2;
                                        final List<m> list2 = arrayList6;
                                        final List<m> list3 = listD;
                                        final boolean z33 = z32;
                                        Ia.l<Y.a, p293xa.r> lVar118 = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Y.a aVar4) {
                                                Y.a aVar5 = aVar4;
                                                List<m> list4 = list2;
                                                boolean z34 = z33;
                                                int size11 = list4.size();
                                                for (int i121 = 0; i121 < size11; i121++) {
                                                    list4.get(i121).e(aVar5, z34);
                                                }
                                                List<m> list5 = list3;
                                                boolean z35 = z33;
                                                int size12 = list5.size();
                                                for (int i122 = 0; i122 < size12; i122++) {
                                                    list5.get(i122).e(aVar5, z35);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        aVar3.f14225a = true;
                                        lVar118.invoke(aVar3);
                                        aVar3.f14225a = false;
                                        x11.getValue();
                                        return p293xa.r.f47939a;
                                    }
                                });
                                z110 = i46;
                                lVar111 = new l(mVar8, i41, z31, f11, f15, f14, z28, a11, interfaceC0988x3, jVar2.f10772c, B.a(numValueOf != null ? numValueOf.intValue() : i46, numValueOf2 != null ? numValueOf2.intValue() : i46, arrayList6, listD), i64, i70, i62, z25, z24 ? Orientation.f9957b : Orientation.f9958c, i54, iE5);
                            }
                            lazyListState.g(lVar111, interfaceC0988x3.S0(), z110);
                            return lVar111;
                        } catch (Throwable th) {
                            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                            throw th;
                        }
                    }
                };
                c1086g = c1086gP;
                c1086g.E(objF4);
            }
            Ia.p pVar8 = (Ia.p) objF4;
            if (z11) {
                orientation = Orientation.f9957b;
            } else {
                orientation = Orientation.f9958c;
            }
            orientation2 = orientation;
            if (z12) {
                c1086g.L(-1513147781);
                i33 = i30 | ((i21 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                lazyListState2 = lazyListState;
                if (((i33 & 14) ^ 6) <= 4) {
                }
                if (((i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                }
                z17 = z18 | z13;
                objF5 = c1086g.f();
                if (z17) {
                    objF5 = new e(lazyListState2, i32);
                    c1086g.E(objF5);
                } else {
                    objF5 = new e(lazyListState2, i32);
                    c1086g.E(objF5);
                }
                hVarA = C0974i.a((e) objF5, lazyListState2.f10363n, z10, orientation2);
                c1086g.T(false);
            } else {
                lazyListState2 = lazyListState;
                c1086g.L(-1512720880);
                c1086g.T(false);
                hVarA = androidx.compose.ui.h.a.f13984b;
            }
            LazyLayoutKt.a(iVar, K.a(N.a(hVar.i(lazyListState2.f10360k).i(lazyListState2.f10361l), iVar, m16, orientation2, z12, z10).i(hVarA).i(lazyListState2.f10362m.f10635k), lazyListState, orientation2, z12, z10, jVar, lazyListState2.f10356f, false, e10, null), lazyListState2.f10364o, pVar8, c1086g, 0, 0);
            lVar3 = lVar5;
            i28 = i32;
            bVar2 = bVar4;
        } else {
            c1086g = c1086gP;
            c1086g.w();
            i28 = i10;
            bVar2 = bVar;
            lVar3 = lVar;
            cVar2 = cVar;
            interfaceC0129e2 = interfaceC0129e;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.d.c cVar116 = cVar2;
            final C0945e.InterfaceC0129e interfaceC0129e115 = interfaceC0129e2;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyListKt.a(hVar, lazyListState, l10, z10, z11, jVar, z12, e10, i28, bVar2, lVar3, cVar116, interfaceC0129e115, lVar2, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
