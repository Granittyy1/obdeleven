package androidx.compose.ui.autofill;

import Ia.r;
import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.I;
import androidx.collection.K;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.v;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import java.util.List;
import kotlin.collections.q;

/* JADX INFO: compiled from: PopulateViewStructure.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PopulateViewStructure_androidKt {
    /* JADX WARN: Code duplicated, block: B:114:0x0279  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:160:0x032a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0332  */
    /* JADX WARN: Code duplicated, block: B:167:0x0335  */
    /* JADX WARN: Code duplicated, block: B:171:0x0340  */
    /* JADX WARN: Code duplicated, block: B:174:0x0346  */
    /* JADX WARN: Code duplicated, block: B:176:0x0352 A[LOOP:5: B:175:0x0350->B:176:0x0352, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0388  */
    /* JADX WARN: Code duplicated, block: B:190:0x039e  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:? A[RETURN, SYNTHETIC] */
    public static final void a(final ViewStructure viewStructure, androidx.compose.ui.semantics.m mVar, AutofillId autofillId, String str, androidx.compose.ui.spatial.b bVar) {
        ToggleableState toggleableState;
        androidx.compose.ui.semantics.i iVar;
        C1260a c1260a;
        l lVar;
        boolean z10;
        m mVar2;
        Boolean bool;
        boolean z11;
        Integer num;
        List list;
        Integer num2;
        boolean zA;
        boolean z12;
        boolean z13;
        String strH;
        int size;
        String strG;
        int i10;
        String[] strArrQ;
        boolean z14;
        String[] strArrQ2;
        K<v<?>, Object> k10;
        long[] jArr;
        int i11;
        int i12;
        int i13;
        K<v<?>, Object> k11;
        ToggleableState toggleableState2;
        androidx.compose.ui.semantics.i iVar2;
        C1260a c1260a2;
        int i14;
        v<List<String>> vVar = SemanticsProperties.f15148a;
        v<androidx.compose.ui.semantics.a<Ia.l<List<B>, Boolean>>> vVar2 = androidx.compose.ui.semantics.k.f15209a;
        androidx.compose.ui.semantics.l lVarF = mVar.f();
        long j = 255;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i15 = 8;
        if (lVarF == null || (k11 = lVarF.f15234b) == null) {
            toggleableState = null;
            iVar = null;
            c1260a = null;
            lVar = null;
            z10 = false;
            mVar2 = null;
            bool = null;
            z11 = false;
            num = null;
        } else {
            Object[] objArr = k11.f9128b;
            Object[] objArr2 = k11.f9129c;
            long[] jArr2 = k11.f9127a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i16 = 0;
                lVar = null;
                z10 = false;
                toggleableState2 = null;
                mVar2 = null;
                bool = null;
                iVar2 = null;
                z11 = false;
                num = null;
                c1260a2 = null;
                while (true) {
                    long j11 = jArr2[i16];
                    if ((((~j11) << 7) & j11 & j10) != j10) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j11 & j) < 128) {
                                int i19 = (i16 << 3) + i18;
                                Object obj = objArr[i19];
                                Object obj2 = objArr2[i19];
                                v vVar3 = (v) obj;
                                if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15163q)) {
                                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    lVar = (l) obj2;
                                } else if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15148a)) {
                                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) q.P((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15162p)) {
                                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    mVar2 = (m) obj2;
                                } else if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15138D)) {
                                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    c1260a2 = (C1260a) obj2;
                                } else if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15157k)) {
                                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15147M)) {
                                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15143I)) {
                                    z11 = true;
                                } else if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15169w)) {
                                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    iVar2 = (androidx.compose.ui.semantics.i) obj2;
                                } else if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15141G)) {
                                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (kotlin.jvm.internal.i.a(vVar3, SemanticsProperties.f15142H)) {
                                    kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    toggleableState2 = (ToggleableState) obj2;
                                } else if (kotlin.jvm.internal.i.a(vVar3, androidx.compose.ui.semantics.k.f15210b)) {
                                    viewStructure.setClickable(true);
                                } else if (kotlin.jvm.internal.i.a(vVar3, androidx.compose.ui.semantics.k.f15211c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (kotlin.jvm.internal.i.a(vVar3, androidx.compose.ui.semantics.k.f15229v)) {
                                    viewStructure.setFocusable(true);
                                } else if (kotlin.jvm.internal.i.a(vVar3, androidx.compose.ui.semantics.k.j)) {
                                    z10 = true;
                                }
                            }
                            j11 >>= 8;
                            i18++;
                            j = 255;
                        }
                        i14 = 1;
                        if (i17 != 8) {
                            break;
                        }
                    } else {
                        i14 = 1;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i16 += i14;
                    j = 255;
                    j10 = -9187201950435737472L;
                }
            } else {
                lVar = null;
                z10 = false;
                toggleableState2 = null;
                mVar2 = null;
                bool = null;
                iVar2 = null;
                z11 = false;
                num = null;
                c1260a2 = null;
            }
            toggleableState = toggleableState2;
            iVar = iVar2;
            c1260a = c1260a2;
        }
        androidx.compose.ui.semantics.l lVarF2 = mVar.f();
        if (lVarF2 != null && lVarF2.f15236d && !lVarF2.f15237e) {
            lVarF2 = lVarF2.k();
            I i20 = new I(mVar.i().size());
            i20.h(mVar.i());
            while (i20.e()) {
                androidx.compose.ui.semantics.m mVar3 = (androidx.compose.ui.semantics.m) i20.k(i20.f9109b - 1);
                androidx.compose.ui.semantics.l lVarF3 = mVar3.f();
                if (lVarF3 != null && !lVarF3.f15236d) {
                    lVarF2.A(lVarF3);
                    if (!lVarF3.f15237e) {
                        i20.h(mVar3.i());
                    }
                }
            }
        }
        if (lVarF2 == null || (k10 = lVarF2.f15234b) == null) {
            list = null;
        } else {
            Object[] objArr3 = k10.f9128b;
            Object[] objArr4 = k10.f9129c;
            long[] jArr3 = k10.f9127a;
            int length2 = jArr3.length - 2;
            if (length2 >= 0) {
                int i21 = 0;
                list = null;
                while (true) {
                    long j12 = jArr3[i21];
                    if ((((~j12) << c10) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j12 & 255) < 128) {
                                int i24 = (i21 << 3) + i23;
                                Object obj3 = objArr3[i24];
                                Object obj4 = objArr4[i24];
                                v vVar4 = (v) obj3;
                                if (kotlin.jvm.internal.i.a(vVar4, SemanticsProperties.f15156i)) {
                                    viewStructure.setEnabled(false);
                                } else if (kotlin.jvm.internal.i.a(vVar4, SemanticsProperties.f15172z)) {
                                    kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                                i13 = 8;
                            } else {
                                i13 = i15;
                            }
                            j12 >>= i13;
                            i23++;
                            i15 = i13;
                            jArr3 = jArr3;
                        }
                        jArr = jArr3;
                        i11 = i15;
                        i12 = 1;
                        if (i22 != i11) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i11 = i15;
                        i12 = 1;
                    }
                    if (i21 == length2) {
                        break;
                    }
                    i21 += i12;
                    i15 = i11;
                    jArr3 = jArr;
                    c10 = 7;
                }
            } else {
                list = null;
            }
        }
        Integer numValueOf = Integer.valueOf(mVar.s());
        if (mVar.g() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (lVar == null) {
            if (!z10) {
                num2 = toggleableState != null ? 2 : null;
            }
            if (num2 != null) {
                viewStructure.setAutofillType(num2.intValue());
            }
            if (mVar2 != null && (strArrQ2 = O3.d.q(mVar2)) != null) {
                viewStructure.setAutofillHints(strArrQ2);
            }
            bVar.f15259a.b(mVar.s(), new r<Integer, Integer, Integer, Integer, p293xa.r>() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$5
                final /* synthetic */ f $autofillApi = f.f13296a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // Ia.r
                public final p293xa.r invoke(Integer num3, Integer num4, Integer num5, Integer num6) {
                    int iIntValue2 = num3.intValue();
                    int iIntValue3 = num4.intValue();
                    int iIntValue4 = num5.intValue();
                    int iIntValue5 = num6.intValue();
                    this.$autofillApi.getClass();
                    viewStructure.setDimens(iIntValue2, iIntValue3, 0, 0, iIntValue4 - iIntValue2, iIntValue5 - iIntValue3);
                    return p293xa.r.f47939a;
                }
            });
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (toggleableState != null) {
                viewStructure.setCheckable(true);
                if (toggleableState == ToggleableState.f15273b) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                viewStructure.setChecked(z14);
            } else if (bool != null) {
                if (iVar == null) {
                    zA = false;
                } else {
                    zA = androidx.compose.ui.semantics.i.a(iVar.f15203a, 4);
                }
                if (!zA) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
            }
            m.f13300a.getClass();
            String str2 = (String) kotlin.collections.k.P(O3.d.q(m.a.f13302b));
            if (mVar2 == null && (strArrQ = O3.d.q(mVar2)) != null && kotlin.collections.k.M(str2, strArrQ)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 || z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                viewStructure.setDataIsSensitive(true);
            }
            viewStructure.setVisibility(mVar.k() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strG = "";
                for (i10 = 0; i10 < size; i10++) {
                    strG = B7.b.g(C4.b.e(strG), ((C1260a) list.get(i10)).f15408c, '\n');
                }
                viewStructure.setText(strG);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (mVar.i().isEmpty() && iVar != null && (strH = K0.h(iVar.f15203a)) != null) {
                viewStructure.setClassName(strH);
            }
            if (z10) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (c1260a != null) {
                    viewStructure.setAutofillValue(AutofillValue.forText(c1260a.f15408c));
                }
                if (z13) {
                    viewStructure.setInputType(129);
                }
            }
        }
        num2 = 1;
        if (num2 != null) {
            viewStructure.setAutofillType(num2.intValue());
        }
        if (mVar2 != null) {
            viewStructure.setAutofillHints(strArrQ2);
        }
        bVar.f15259a.b(mVar.s(), new r<Integer, Integer, Integer, Integer, p293xa.r>() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$5
            final /* synthetic */ f $autofillApi = f.f13296a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // Ia.r
            public final p293xa.r invoke(Integer num3, Integer num4, Integer num5, Integer num6) {
                int iIntValue2 = num3.intValue();
                int iIntValue3 = num4.intValue();
                int iIntValue4 = num5.intValue();
                int iIntValue5 = num6.intValue();
                this.$autofillApi.getClass();
                viewStructure.setDimens(iIntValue2, iIntValue3, 0, 0, iIntValue4 - iIntValue2, iIntValue5 - iIntValue3);
                return p293xa.r.f47939a;
            }
        });
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (toggleableState != null) {
            viewStructure.setCheckable(true);
            if (toggleableState == ToggleableState.f15273b) {
                z14 = true;
            } else {
                z14 = false;
            }
            viewStructure.setChecked(z14);
        } else if (bool != null) {
            if (iVar == null) {
                zA = false;
            } else {
                zA = androidx.compose.ui.semantics.i.a(iVar.f15203a, 4);
            }
            if (!zA) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
        }
        m.f13300a.getClass();
        String str3 = (String) kotlin.collections.k.P(O3.d.q(m.a.f13302b));
        if (mVar2 == null) {
            z12 = false;
        } else {
            z12 = false;
        }
        if (z11) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (z13) {
            viewStructure.setDataIsSensitive(true);
        }
        viewStructure.setVisibility(mVar.k() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strG = "";
            while (i10 < size) {
                strG = B7.b.g(C4.b.e(strG), ((C1260a) list.get(i10)).f15408c, '\n');
            }
            viewStructure.setText(strG);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (mVar.i().isEmpty()) {
            viewStructure.setClassName(strH);
        }
        if (z10) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (c1260a != null) {
                viewStructure.setAutofillValue(AutofillValue.forText(c1260a.f15408c));
            }
            if (z13) {
                viewStructure.setInputType(129);
            }
        }
    }
}
