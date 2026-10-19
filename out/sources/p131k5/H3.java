package p131k5;

import C4.b;
import androidx.collection.C0873a;
import com.google.android.gms.internal.measurement.C1774a1;
import com.google.android.gms.internal.measurement.C1906t1;
import com.google.android.gms.internal.measurement.C1920v1;
import com.google.android.gms.internal.measurement.D4;
import com.google.android.gms.internal.measurement.Z0;
import com.google.android.gms.internal.measurement.zzfh$zzd;
import com.google.android.gms.measurement.internal.i;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class H3 extends AbstractC2491c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z0 f41817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C3 f41818h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3(C3 c10, String str, int i10, Z0 z10) {
        super(str, i10);
        this.f41818h = c10;
        this.f41817g = z10;
    }

    @Override // p131k5.AbstractC2491c
    public final int a() {
        return this.f41817g.z();
    }

    @Override // p131k5.AbstractC2491c
    public final boolean f() {
        return this.f41817g.I();
    }

    @Override // p131k5.AbstractC2491c
    public final boolean g() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0294  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:127:0x0304  */
    /* JADX WARN: Code duplicated, block: B:128:0x0313  */
    /* JADX WARN: Code duplicated, block: B:130:0x0319  */
    /* JADX WARN: Code duplicated, block: B:132:0x0321  */
    /* JADX WARN: Code duplicated, block: B:134:0x032b  */
    /* JADX WARN: Code duplicated, block: B:138:0x033c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0345  */
    /* JADX WARN: Code duplicated, block: B:145:0x037c A[EDGE_INSN: B:145:0x037c->B:148:0x03b1 BREAK  A[LOOP:1: B:57:0x016f->B:62:0x0197]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0396  */
    /* JADX WARN: Code duplicated, block: B:185:0x032d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x03af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x037a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:62:0x0197 A[LOOP:1: B:57:0x016f->B:62:0x0197, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01db  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0204  */
    /* JADX WARN: Code duplicated, block: B:89:0x023b  */
    /* JADX WARN: Code duplicated, block: B:94:0x024f  */
    /* JADX WARN: Code duplicated, block: B:98:0x026d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(Long l10, Long l11, C1906t1 c1906t1, long j, C2572v c2572v, boolean z10) {
        HashSet hashSet;
        Iterator<E> it;
        C0873a c0873a;
        Iterator<E> it2;
        Iterator<E> it3;
        Boolean bool;
        C1774a1 c1774a1;
        boolean z11;
        String strA;
        V v10;
        Boolean boolB;
        Boolean boolE;
        String str;
        zzfh$zzd zzfh_zzdY;
        Boolean boolE2;
        C1920v1 c1920v1;
        Long lValueOf;
        Double dValueOf;
        C1774a1 c1774a2;
        D4.a();
        String str2 = this.f42099a;
        C3 c10 = this.f41818h;
        boolean zB = ((C2523i1) c10.f3968a).f42218g.B(str2, B.f41676i0);
        Z0 z12 = this.f41817g;
        long j10 = z12.H() ? c2572v.f42487e : j;
        boolean zY = c10.d().y(2);
        int i10 = this.f42100b;
        boolean z13 = false;
        C2523i1 c2523i1 = (C2523i1) c10.f3968a;
        if (zY) {
            B0 b0D = c10.d();
            b0D.f41719n.d("Evaluating filter. audience, filter, event", Integer.valueOf(i10), z12.J() ? Integer.valueOf(z12.z()) : null, c2523i1.f42223m.b(z12.D()));
            B0 b0D2 = c10.d();
            i iVarQ = c10.q();
            StringBuilder sbE = b.e("\nevent_filter {\n");
            if (z12.J()) {
                i.W(sbE, 0, "filter_id", Integer.valueOf(z12.z()));
            }
            i.W(sbE, 0, "event_name", ((C2523i1) iVarQ.f3968a).f42223m.b(z12.D()));
            String strF = i.F(z12.F(), z12.G(), z12.H());
            if (!strF.isEmpty()) {
                i.W(sbE, 0, "filter_type", strF);
            }
            if (z12.I()) {
                i.V(sbE, 1, "event_count_filter", z12.C());
            }
            if (z12.v() > 0) {
                sbE.append("  filters {\n");
                Iterator<E> it4 = z12.E().iterator();
                while (it4.hasNext()) {
                    iVarQ.T(sbE, 2, (C1774a1) it4.next());
                }
            }
            i.M(1, sbE);
            sbE.append("}\n}\n");
            b0D2.f41719n.b(sbE.toString(), "Filter definition");
        }
        if (!z12.J() || z12.z() > 256) {
            B0 b0D3 = c10.d();
            b0D3.f41715i.a(B0.v(str2), String.valueOf(z12.J() ? Integer.valueOf(z12.z()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z14 = z12.F() || z12.G() || z12.H();
        if (z10 && !z14) {
            c10.d().f41719n.a(Integer.valueOf(i10), z12.J() ? Integer.valueOf(z12.z()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strK = c1906t1.K();
        if (!z12.I()) {
            hashSet = new HashSet();
            it = z12.E().iterator();
            while (true) {
                if (it.hasNext()) {
                    c0873a = new C0873a();
                    it2 = c1906t1.L().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = z12.E().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c1774a1 = (C1774a1) it3.next();
                                if (c1774a1.C() || !c1774a1.B()) {
                                    z11 = z13;
                                } else {
                                    z11 = true;
                                }
                                strA = c1774a1.A();
                                if (strA.isEmpty()) {
                                    c10.d().f41715i.b(c2523i1.f42223m.b(strK), "Event has empty param name. event");
                                } else {
                                    v10 = c0873a.get(strA);
                                    if (v10 instanceof Long) {
                                        if (c1774a1.D()) {
                                            boolB = AbstractC2491c.b(((Long) v10).longValue(), c1774a1.y());
                                            if (boolB == null) {
                                                if (boolB.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        } else {
                                            c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "No number filter for long param. event, param");
                                        }
                                    } else if (v10 instanceof Double) {
                                        if (c1774a1.D()) {
                                            double dDoubleValue = ((Double) v10).doubleValue();
                                            try {
                                                boolE = AbstractC2491c.e(new BigDecimal(dDoubleValue), c1774a1.y(), Math.ulp(dDoubleValue));
                                            } catch (NumberFormatException unused) {
                                                boolE = null;
                                            }
                                            if (boolE == null) {
                                                if (boolE.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        } else {
                                            c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "No number filter for double param. event, param");
                                        }
                                    } else if (v10 instanceof String) {
                                        if (c1774a1.F()) {
                                            boolE2 = AbstractC2491c.d((String) v10, c1774a1.z(), c10.d());
                                        } else if (c1774a1.D()) {
                                            str = (String) v10;
                                            if (i.c0(str)) {
                                                zzfh_zzdY = c1774a1.y();
                                                if (i.c0(str)) {
                                                    try {
                                                        boolE2 = AbstractC2491c.e(new BigDecimal(str), zzfh_zzdY, 0.0d);
                                                    } catch (NumberFormatException unused2) {
                                                        boolE2 = null;
                                                    }
                                                } else {
                                                    boolE2 = null;
                                                }
                                            } else {
                                                c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "Invalid param value for number filter. event, param");
                                            }
                                        } else {
                                            c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "No filter for String param. event, param");
                                        }
                                        if (boolE2 == null) {
                                            if (boolE2.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            z13 = false;
                                        }
                                    } else {
                                        if (v10 == 0) {
                                            c10.d().f41719n.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "Missing param for filter. event, param");
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "Unknown param type. event, param");
                                    }
                                }
                            }
                        } else {
                            c1920v1 = (C1920v1) it2.next();
                            if (!hashSet.contains(c1920v1.L())) {
                                if (c1920v1.Q()) {
                                    String strL = c1920v1.L();
                                    if (c1920v1.Q()) {
                                        lValueOf = Long.valueOf(c1920v1.H());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c0873a.put(strL, lValueOf);
                                } else if (c1920v1.O()) {
                                    String strL2 = c1920v1.L();
                                    if (c1920v1.O()) {
                                        dValueOf = Double.valueOf(c1920v1.v());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c0873a.put(strL2, dValueOf);
                                } else if (c1920v1.S()) {
                                    c0873a.put(c1920v1.L(), c1920v1.M());
                                } else {
                                    c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(c1920v1.L()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    c1774a2 = (C1774a1) it.next();
                    if (c1774a2.A().isEmpty()) {
                        c10.d().f41715i.b(c2523i1.f42223m.b(strK), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(c1774a2.A());
                    }
                }
                bool = null;
                break;
            }
        }
        Boolean boolB2 = AbstractC2491c.b(j10, z12.C());
        if (boolB2 == null) {
            bool = null;
            break;
        }
        if (boolB2.booleanValue()) {
            hashSet = new HashSet();
            it = z12.E().iterator();
            while (true) {
                if (it.hasNext()) {
                    c0873a = new C0873a();
                    it2 = c1906t1.L().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = z12.E().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c1774a1 = (C1774a1) it3.next();
                                if (c1774a1.C()) {
                                    z11 = z13;
                                } else {
                                    z11 = z13;
                                }
                                strA = c1774a1.A();
                                if (strA.isEmpty()) {
                                    c10.d().f41715i.b(c2523i1.f42223m.b(strK), "Event has empty param name. event");
                                } else {
                                    v10 = c0873a.get(strA);
                                    if (v10 instanceof Long) {
                                        if (c1774a1.D()) {
                                            c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "No number filter for long param. event, param");
                                        } else {
                                            boolB = AbstractC2491c.b(((Long) v10).longValue(), c1774a1.y());
                                            if (boolB == null) {
                                                if (boolB.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (v10 instanceof Double) {
                                        if (c1774a1.D()) {
                                            c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "No number filter for double param. event, param");
                                        } else {
                                            double dDoubleValue2 = ((Double) v10).doubleValue();
                                            boolE = AbstractC2491c.e(new BigDecimal(dDoubleValue2), c1774a1.y(), Math.ulp(dDoubleValue2));
                                            if (boolE == null) {
                                                if (boolE.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (v10 instanceof String) {
                                        if (c1774a1.F()) {
                                            boolE2 = AbstractC2491c.d((String) v10, c1774a1.z(), c10.d());
                                        } else if (c1774a1.D()) {
                                            str = (String) v10;
                                            if (i.c0(str)) {
                                                zzfh_zzdY = c1774a1.y();
                                                if (i.c0(str)) {
                                                    boolE2 = null;
                                                } else {
                                                    boolE2 = AbstractC2491c.e(new BigDecimal(str), zzfh_zzdY, 0.0d);
                                                }
                                            } else {
                                                c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "Invalid param value for number filter. event, param");
                                            }
                                        } else {
                                            c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "No filter for String param. event, param");
                                        }
                                        if (boolE2 == null) {
                                            if (boolE2.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            z13 = false;
                                        }
                                    } else {
                                        if (v10 == 0) {
                                            c10.d().f41719n.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "Missing param for filter. event, param");
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(strA), "Unknown param type. event, param");
                                    }
                                }
                            }
                        } else {
                            c1920v1 = (C1920v1) it2.next();
                            if (!hashSet.contains(c1920v1.L())) {
                                if (c1920v1.Q()) {
                                    String strL3 = c1920v1.L();
                                    if (c1920v1.Q()) {
                                        lValueOf = Long.valueOf(c1920v1.H());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c0873a.put(strL3, lValueOf);
                                } else if (c1920v1.O()) {
                                    String strL4 = c1920v1.L();
                                    if (c1920v1.O()) {
                                        dValueOf = Double.valueOf(c1920v1.v());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c0873a.put(strL4, dValueOf);
                                } else if (c1920v1.S()) {
                                    c0873a.put(c1920v1.L(), c1920v1.M());
                                } else {
                                    c10.d().f41715i.a(c2523i1.f42223m.b(strK), c2523i1.f42223m.f(c1920v1.L()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    c1774a2 = (C1774a1) it.next();
                    if (c1774a2.A().isEmpty()) {
                        c10.d().f41715i.b(c2523i1.f42223m.b(strK), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(c1774a2.A());
                    }
                }
                bool = null;
                break;
            }
        }
        bool = Boolean.FALSE;
        c10.d().f41719n.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f42101c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f42102d = bool2;
        if (!z14 || !c1906t1.O()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(c1906t1.H());
        if (z12.G()) {
            if (zB && z12.I()) {
                lValueOf2 = l10;
            }
            this.f42104f = lValueOf2;
            return true;
        }
        if (zB && z12.I()) {
            lValueOf2 = l11;
        }
        this.f42103e = lValueOf2;
        return true;
    }
}
