package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AdapterHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1436a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f19810d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0.d f19807a = new A0.d(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<C0200a> f19808b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<C0200a> f19809c = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19812f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f19811e = new C(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdapterHelper.java */
    public static final class C0200a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f19815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19816d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0200a)) {
                return false;
            }
            C0200a c0200a = (C0200a) obj;
            int i10 = this.f19813a;
            if (i10 != c0200a.f19813a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f19816d - this.f19814b) == 1 && this.f19816d == c0200a.f19814b && this.f19814b == c0200a.f19816d) {
                return true;
            }
            if (this.f19816d != c0200a.f19816d || this.f19814b != c0200a.f19814b) {
                return false;
            }
            Object obj2 = this.f19815c;
            if (obj2 != null) {
                if (!obj2.equals(c0200a.f19815c)) {
                    return false;
                }
            } else if (c0200a.f19815c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f19813a * 31) + this.f19814b) * 31) + this.f19816d;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f19813a;
            if (i10 == 1) {
                str = "add";
            } else if (i10 == 2) {
                str = "rm";
            } else if (i10 != 4) {
                str = i10 != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f19814b);
            sb2.append("c:");
            sb2.append(this.f19816d);
            sb2.append(",p:");
            sb2.append(this.f19815c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public C1436a(J j) {
        this.f19810d = j;
    }

    public final boolean a(int i10) {
        ArrayList<C0200a> arrayList = this.f19809c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0200a c0200a = arrayList.get(i11);
            int i12 = c0200a.f19813a;
            if (i12 == 8) {
                if (f(c0200a.f19816d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = c0200a.f19814b;
                int i14 = c0200a.f19816d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0200a> arrayList = this.f19809c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19810d.a(arrayList.get(i10));
        }
        k(arrayList);
        this.f19812f = 0;
    }

    public final void c() {
        b();
        ArrayList<C0200a> arrayList = this.f19808b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0200a c0200a = arrayList.get(i10);
            int i11 = c0200a.f19813a;
            J j = this.f19810d;
            if (i11 == 1) {
                j.a(c0200a);
                j.d(c0200a.f19814b, c0200a.f19816d);
            } else if (i11 == 2) {
                j.a(c0200a);
                int i12 = c0200a.f19814b;
                int i13 = c0200a.f19816d;
                RecyclerView recyclerView = j.f19512a;
                recyclerView.U(i12, i13, true);
                recyclerView.f19587B0 = true;
                recyclerView.f19655y0.f19738c += i13;
            } else if (i11 == 4) {
                j.a(c0200a);
                j.c(c0200a.f19814b, c0200a.f19816d, c0200a.f19815c);
            } else if (i11 == 8) {
                j.a(c0200a);
                j.e(c0200a.f19814b, c0200a.f19816d);
            }
        }
        k(arrayList);
        this.f19812f = 0;
    }

    public final void d(C0200a c0200a) {
        int i10;
        int i11 = c0200a.f19813a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(c0200a.f19814b, i11);
        int i12 = c0200a.f19814b;
        int i13 = c0200a.f19813a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0200a);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < c0200a.f19816d; i15++) {
            int iL2 = l((i10 * i15) + c0200a.f19814b, c0200a.f19813a);
            int i16 = c0200a.f19813a;
            if (i16 == 2 ? iL2 != iL : !(i16 == 4 && iL2 == iL + 1)) {
                C0200a c0200aH = h(c0200a.f19815c, i16, iL, i14);
                e(c0200aH, i12);
                c0200aH.f19815c = null;
                this.f19807a.b(c0200aH);
                if (c0200a.f19813a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iL = iL2;
            } else {
                i14++;
            }
        }
        Object obj = c0200a.f19815c;
        c0200a.f19815c = null;
        this.f19807a.b(c0200a);
        if (i14 > 0) {
            C0200a c0200aH2 = h(obj, c0200a.f19813a, iL, i14);
            e(c0200aH2, i12);
            c0200aH2.f19815c = null;
            this.f19807a.b(c0200aH2);
        }
    }

    public final void e(C0200a c0200a, int i10) {
        J j = this.f19810d;
        j.a(c0200a);
        int i11 = c0200a.f19813a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            j.c(i10, c0200a.f19816d, c0200a.f19815c);
        } else {
            int i12 = c0200a.f19816d;
            RecyclerView recyclerView = j.f19512a;
            recyclerView.U(i10, i12, true);
            recyclerView.f19587B0 = true;
            recyclerView.f19655y0.f19738c += i12;
        }
    }

    public final int f(int i10, int i11) {
        ArrayList<C0200a> arrayList = this.f19809c;
        int size = arrayList.size();
        while (i11 < size) {
            C0200a c0200a = arrayList.get(i11);
            int i12 = c0200a.f19813a;
            if (i12 == 8) {
                int i13 = c0200a.f19814b;
                if (i13 == i10) {
                    i10 = c0200a.f19816d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (c0200a.f19816d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = c0200a.f19814b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = c0200a.f19816d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += c0200a.f19816d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f19808b.size() > 0;
    }

    public final C0200a h(Object obj, int i10, int i11, int i12) {
        C0200a c0200a = (C0200a) this.f19807a.a();
        if (c0200a != null) {
            c0200a.f19813a = i10;
            c0200a.f19814b = i11;
            c0200a.f19816d = i12;
            c0200a.f19815c = obj;
            return c0200a;
        }
        C0200a c0200a2 = new C0200a();
        c0200a2.f19813a = i10;
        c0200a2.f19814b = i11;
        c0200a2.f19816d = i12;
        c0200a2.f19815c = obj;
        return c0200a2;
    }

    public final void i(C0200a c0200a) {
        this.f19809c.add(c0200a);
        int i10 = c0200a.f19813a;
        J j = this.f19810d;
        if (i10 == 1) {
            j.d(c0200a.f19814b, c0200a.f19816d);
            return;
        }
        if (i10 == 2) {
            int i11 = c0200a.f19814b;
            int i12 = c0200a.f19816d;
            RecyclerView recyclerView = j.f19512a;
            recyclerView.U(i11, i12, false);
            recyclerView.f19587B0 = true;
            return;
        }
        if (i10 == 4) {
            j.c(c0200a.f19814b, c0200a.f19816d, c0200a.f19815c);
        } else if (i10 == 8) {
            j.e(c0200a.f19814b, c0200a.f19816d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0200a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0188  */
    /* JADX WARN: Code duplicated, block: B:105:0x018c  */
    /* JADX WARN: Code duplicated, block: B:184:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x0140  */
    /* JADX WARN: Code duplicated, block: B:88:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x0159  */
    /* JADX WARN: Code duplicated, block: B:95:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x016f  */
    public final void j() {
        byte b10;
        boolean z10;
        byte b11;
        C0200a c0200aH;
        int i10;
        int i11;
        int i12;
        C0200a c0200aH2;
        boolean z11;
        boolean z12;
        C0200a c0200aH3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ArrayList<C0200a> arrayList = this.f19808b;
        C c10 = this.f19811e;
        c10.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                b10 = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f19813a != 8) {
                    z13 = true;
                } else if (z13) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i21 = size + 1;
            C0200a c0200a = arrayList.get(size);
            C0200a c0200a2 = arrayList.get(i21);
            int i22 = c0200a2.f19813a;
            if (i22 != 1) {
                C1436a c1436a = c10.f19492a;
                if (i22 == 2) {
                    int i23 = c0200a.f19814b;
                    int i24 = c0200a.f19816d;
                    if (i23 < i24) {
                        z12 = c0200a2.f19814b == i23 && c0200a2.f19816d == i24 - i23;
                        z11 = false;
                    } else if (c0200a2.f19814b == i24 + 1 && c0200a2.f19816d == i23 - i24) {
                        z12 = true;
                        z11 = true;
                    } else {
                        z11 = true;
                        z12 = false;
                    }
                    int i25 = c0200a2.f19814b;
                    if (i24 < i25) {
                        c0200a2.f19814b = i25 - 1;
                    } else {
                        int i26 = c0200a2.f19816d;
                        if (i24 < i25 + i26) {
                            c0200a2.f19816d = i26 - 1;
                            c0200a.f19813a = 2;
                            c0200a.f19816d = 1;
                            if (c0200a2.f19816d == 0) {
                                arrayList.remove(i21);
                                c0200a2.f19815c = null;
                                c1436a.f19807a.b(c0200a2);
                            }
                        }
                    }
                    int i27 = c0200a.f19814b;
                    int i28 = c0200a2.f19814b;
                    if (i27 <= i28) {
                        c0200a2.f19814b = i28 + 1;
                    } else {
                        int i29 = i28 + c0200a2.f19816d;
                        if (i27 < i29) {
                            c0200aH3 = c1436a.h(null, 2, i27 + 1, i29 - i27);
                            c0200a2.f19816d = c0200a.f19814b - c0200a2.f19814b;
                        }
                        if (z12) {
                            arrayList.set(size, c0200a2);
                            arrayList.remove(i21);
                            c0200a.f19815c = null;
                            c1436a.f19807a.b(c0200a);
                        } else {
                            if (z11) {
                                if (c0200aH3 != null) {
                                    i19 = c0200a.f19814b;
                                    if (i19 > c0200aH3.f19814b) {
                                        c0200a.f19814b = i19 - c0200aH3.f19816d;
                                    }
                                    i20 = c0200a.f19816d;
                                    if (i20 > c0200aH3.f19814b) {
                                        c0200a.f19816d = i20 - c0200aH3.f19816d;
                                    }
                                }
                                i17 = c0200a.f19814b;
                                if (i17 > c0200a2.f19814b) {
                                    c0200a.f19814b = i17 - c0200a2.f19816d;
                                }
                                i18 = c0200a.f19816d;
                                if (i18 > c0200a2.f19814b) {
                                    c0200a.f19816d = i18 - c0200a2.f19816d;
                                }
                            } else {
                                if (c0200aH3 != null) {
                                    i15 = c0200a.f19814b;
                                    if (i15 >= c0200aH3.f19814b) {
                                        c0200a.f19814b = i15 - c0200aH3.f19816d;
                                    }
                                    i16 = c0200a.f19816d;
                                    if (i16 >= c0200aH3.f19814b) {
                                        c0200a.f19816d = i16 - c0200aH3.f19816d;
                                    }
                                }
                                i13 = c0200a.f19814b;
                                if (i13 >= c0200a2.f19814b) {
                                    c0200a.f19814b = i13 - c0200a2.f19816d;
                                }
                                i14 = c0200a.f19816d;
                                if (i14 >= c0200a2.f19814b) {
                                    c0200a.f19816d = i14 - c0200a2.f19816d;
                                }
                            }
                            arrayList.set(size, c0200a2);
                            if (c0200a.f19814b != c0200a.f19816d) {
                                arrayList.set(i21, c0200a);
                            } else {
                                arrayList.remove(i21);
                            }
                            if (c0200aH3 != null) {
                                arrayList.add(size, c0200aH3);
                            }
                        }
                    }
                    c0200aH3 = null;
                    if (z12) {
                        arrayList.set(size, c0200a2);
                        arrayList.remove(i21);
                        c0200a.f19815c = null;
                        c1436a.f19807a.b(c0200a);
                    } else {
                        if (z11) {
                            if (c0200aH3 != null) {
                                i19 = c0200a.f19814b;
                                if (i19 > c0200aH3.f19814b) {
                                    c0200a.f19814b = i19 - c0200aH3.f19816d;
                                }
                                i20 = c0200a.f19816d;
                                if (i20 > c0200aH3.f19814b) {
                                    c0200a.f19816d = i20 - c0200aH3.f19816d;
                                }
                            }
                            i17 = c0200a.f19814b;
                            if (i17 > c0200a2.f19814b) {
                                c0200a.f19814b = i17 - c0200a2.f19816d;
                            }
                            i18 = c0200a.f19816d;
                            if (i18 > c0200a2.f19814b) {
                                c0200a.f19816d = i18 - c0200a2.f19816d;
                            }
                        } else {
                            if (c0200aH3 != null) {
                                i15 = c0200a.f19814b;
                                if (i15 >= c0200aH3.f19814b) {
                                    c0200a.f19814b = i15 - c0200aH3.f19816d;
                                }
                                i16 = c0200a.f19816d;
                                if (i16 >= c0200aH3.f19814b) {
                                    c0200a.f19816d = i16 - c0200aH3.f19816d;
                                }
                            }
                            i13 = c0200a.f19814b;
                            if (i13 >= c0200a2.f19814b) {
                                c0200a.f19814b = i13 - c0200a2.f19816d;
                            }
                            i14 = c0200a.f19816d;
                            if (i14 >= c0200a2.f19814b) {
                                c0200a.f19816d = i14 - c0200a2.f19816d;
                            }
                        }
                        arrayList.set(size, c0200a2);
                        if (c0200a.f19814b != c0200a.f19816d) {
                            arrayList.set(i21, c0200a);
                        } else {
                            arrayList.remove(i21);
                        }
                        if (c0200aH3 != null) {
                            arrayList.add(size, c0200aH3);
                        }
                    }
                } else if (i22 == 4) {
                    int i30 = c0200a.f19816d;
                    int i31 = c0200a2.f19814b;
                    if (i30 < i31) {
                        c0200a2.f19814b = i31 - 1;
                    } else {
                        int i32 = c0200a2.f19816d;
                        if (i30 < i31 + i32) {
                            c0200a2.f19816d = i32 - 1;
                            c0200aH = c1436a.h(c0200a2.f19815c, 4, c0200a.f19814b, 1);
                        }
                        i10 = c0200a.f19814b;
                        i11 = c0200a2.f19814b;
                        if (i10 <= i11) {
                            c0200a2.f19814b = i11 + 1;
                        } else {
                            i12 = i11 + c0200a2.f19816d;
                            if (i10 < i12) {
                                int i33 = i12 - i10;
                                c0200aH2 = c1436a.h(c0200a2.f19815c, 4, i10 + 1, i33);
                                c0200a2.f19816d -= i33;
                            }
                            arrayList.set(i21, c0200a);
                            if (c0200a2.f19816d > 0) {
                                arrayList.set(size, c0200a2);
                            } else {
                                arrayList.remove(size);
                                c0200a2.f19815c = null;
                                c1436a.f19807a.b(c0200a2);
                            }
                            if (c0200aH != null) {
                                arrayList.add(size, c0200aH);
                            }
                            if (c0200aH2 != null) {
                                arrayList.add(size, c0200aH2);
                            }
                        }
                        c0200aH2 = null;
                        arrayList.set(i21, c0200a);
                        if (c0200a2.f19816d > 0) {
                            arrayList.set(size, c0200a2);
                        } else {
                            arrayList.remove(size);
                            c0200a2.f19815c = null;
                            c1436a.f19807a.b(c0200a2);
                        }
                        if (c0200aH != null) {
                            arrayList.add(size, c0200aH);
                        }
                        if (c0200aH2 != null) {
                            arrayList.add(size, c0200aH2);
                        }
                    }
                    c0200aH = null;
                    i10 = c0200a.f19814b;
                    i11 = c0200a2.f19814b;
                    if (i10 <= i11) {
                        c0200a2.f19814b = i11 + 1;
                    } else {
                        i12 = i11 + c0200a2.f19816d;
                        if (i10 < i12) {
                            int i34 = i12 - i10;
                            c0200aH2 = c1436a.h(c0200a2.f19815c, 4, i10 + 1, i34);
                            c0200a2.f19816d -= i34;
                        }
                        arrayList.set(i21, c0200a);
                        if (c0200a2.f19816d > 0) {
                            arrayList.set(size, c0200a2);
                        } else {
                            arrayList.remove(size);
                            c0200a2.f19815c = null;
                            c1436a.f19807a.b(c0200a2);
                        }
                        if (c0200aH != null) {
                            arrayList.add(size, c0200aH);
                        }
                        if (c0200aH2 != null) {
                            arrayList.add(size, c0200aH2);
                        }
                    }
                    c0200aH2 = null;
                    arrayList.set(i21, c0200a);
                    if (c0200a2.f19816d > 0) {
                        arrayList.set(size, c0200a2);
                    } else {
                        arrayList.remove(size);
                        c0200a2.f19815c = null;
                        c1436a.f19807a.b(c0200a2);
                    }
                    if (c0200aH != null) {
                        arrayList.add(size, c0200aH);
                    }
                    if (c0200aH2 != null) {
                        arrayList.add(size, c0200aH2);
                    }
                }
            } else {
                int i35 = c0200a.f19816d;
                int i36 = c0200a2.f19814b;
                int i37 = i35 < i36 ? -1 : 0;
                int i38 = c0200a.f19814b;
                if (i38 < i36) {
                    i37++;
                }
                if (i36 <= i38) {
                    c0200a.f19814b = i38 + c0200a2.f19816d;
                }
                int i39 = c0200a2.f19814b;
                if (i39 <= i35) {
                    c0200a.f19816d = i35 + c0200a2.f19816d;
                }
                c0200a2.f19814b = i39 + i37;
                arrayList.set(size, c0200a2);
                arrayList.set(i21, c0200a);
            }
        }
        int size2 = arrayList.size();
        int i40 = 0;
        while (i40 < size2) {
            C0200a c0200aH4 = arrayList.get(i40);
            int i41 = c0200aH4.f19813a;
            if (i41 != 1) {
                J j = this.f19810d;
                if (i41 == 2) {
                    int i42 = c0200aH4.f19814b;
                    int i43 = c0200aH4.f19816d + i42;
                    int i44 = i42;
                    int i45 = 0;
                    byte b12 = -1;
                    while (i44 < i43) {
                        if (j.b(i44) != null || a(i44)) {
                            if (b12 == 0) {
                                d(h(null, 2, i42, i45));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b11 = 1;
                        } else {
                            if (b12 == 1) {
                                i(h(null, 2, i42, i45));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b11 = 0;
                        }
                        if (z10) {
                            i44 -= i45;
                            i43 -= i45;
                            i45 = 1;
                        } else {
                            i45++;
                        }
                        i44++;
                        b12 = b11;
                    }
                    if (i45 != c0200aH4.f19816d) {
                        c0200aH4.f19815c = null;
                        this.f19807a.b(c0200aH4);
                        c0200aH4 = h(null, 2, i42, i45);
                    }
                    if (b12 == 0) {
                        d(c0200aH4);
                    } else {
                        i(c0200aH4);
                    }
                } else if (i41 == 4) {
                    int i46 = c0200aH4.f19814b;
                    int i47 = c0200aH4.f19816d + i46;
                    int i48 = i46;
                    int i49 = 0;
                    while (i46 < i47) {
                        if (j.b(i46) != null || a(i46)) {
                            if (b10 == 0) {
                                d(h(c0200aH4.f19815c, 4, i48, i49));
                                i48 = i46;
                                i49 = 0;
                            }
                            b10 = 1;
                        } else {
                            if (b10 == 1) {
                                i(h(c0200aH4.f19815c, 4, i48, i49));
                                i48 = i46;
                                i49 = 0;
                            }
                            b10 = 0;
                        }
                        i49++;
                        i46++;
                    }
                    if (i49 != c0200aH4.f19816d) {
                        Object obj = c0200aH4.f19815c;
                        c0200aH4.f19815c = null;
                        this.f19807a.b(c0200aH4);
                        c0200aH4 = h(obj, 4, i48, i49);
                    }
                    if (b10 == 0) {
                        d(c0200aH4);
                    } else {
                        i(c0200aH4);
                    }
                } else if (i41 == 8) {
                    i(c0200aH4);
                }
            } else {
                i(c0200aH4);
            }
            i40++;
            b10 = -1;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0200a c0200a = (C0200a) arrayList.get(i10);
            c0200a.f19815c = null;
            this.f19807a.b(c0200a);
        }
        arrayList.clear();
    }

    public final int l(int i10, int i11) {
        int i12;
        int i13;
        ArrayList<C0200a> arrayList = this.f19809c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0200a c0200a = arrayList.get(size);
            int i14 = c0200a.f19813a;
            if (i14 == 8) {
                int i15 = c0200a.f19814b;
                int i16 = c0200a.f19816d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            c0200a.f19814b = i15 + 1;
                            c0200a.f19816d = i16 + 1;
                        } else if (i11 == 2) {
                            c0200a.f19814b = i15 - 1;
                            c0200a.f19816d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        c0200a.f19816d = i16 + 1;
                    } else if (i11 == 2) {
                        c0200a.f19816d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        c0200a.f19814b = i15 + 1;
                    } else if (i11 == 2) {
                        c0200a.f19814b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = c0200a.f19814b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= c0200a.f19816d;
                    } else if (i14 == 2) {
                        i10 += c0200a.f19816d;
                    }
                } else if (i11 == 1) {
                    c0200a.f19814b = i17 + 1;
                } else if (i11 == 2) {
                    c0200a.f19814b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0200a c0200a2 = arrayList.get(size2);
            if (c0200a2.f19813a == 8) {
                int i18 = c0200a2.f19816d;
                if (i18 == c0200a2.f19814b || i18 < 0) {
                    arrayList.remove(size2);
                    c0200a2.f19815c = null;
                    this.f19807a.b(c0200a2);
                }
            } else if (c0200a2.f19816d <= 0) {
                arrayList.remove(size2);
                c0200a2.f19815c = null;
                this.f19807a.b(c0200a2);
            }
        }
        return i10;
    }
}
