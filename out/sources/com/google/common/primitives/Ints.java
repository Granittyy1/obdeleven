package com.google.common.primitives;

import A8.p;
import C.g;
import com.braze.support.BrazeLogger;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class Ints extends g {

    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        public IntArrayAsList(int i10, int i11, int[] iArr) {
            this.array = iArr;
            this.start = i10;
            this.end = i11;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN, SYNTHETIC] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int iIntValue = ((Integer) obj).intValue();
                int i10 = this.start;
                int i11 = this.end;
                while (i10 < i11) {
                    if (iArr[i10] != iIntValue) {
                        i10++;
                    } else if (i10 != -1) {
                        return true;
                    }
                }
                i10 = -1;
                if (i10 != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.array[this.start + i10] != intArrayAsList.array[intArrayAsList.start + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i10) {
            p.h(i10, size());
            return Integer.valueOf(this.array[this.start + i10]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i10 = 1;
            for (int i11 = this.start; i11 < this.end; i11++) {
                i10 = (i10 * 31) + this.array[i11];
            }
            return i10;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001e  */
        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int iIntValue = ((Integer) obj).intValue();
                int i10 = this.start;
                int i11 = this.end;
                while (i10 < i11) {
                    if (iArr[i10] != iIntValue) {
                        i10++;
                    } else if (i10 >= 0) {
                        return i10 - this.start;
                    }
                }
                i10 = -1;
                if (i10 >= 0) {
                    return i10 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0020  */
        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int iIntValue = ((Integer) obj).intValue();
                int i10 = this.start;
                int i11 = this.end - 1;
                while (i11 >= i10) {
                    if (iArr[i11] != iIntValue) {
                        i11--;
                    } else if (i11 >= 0) {
                        return i11 - this.start;
                    }
                }
                i11 = -1;
                if (i11 >= 0) {
                    return i11 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i10, Object obj) {
            Integer num = (Integer) obj;
            p.h(i10, size());
            int[] iArr = this.array;
            int i11 = this.start + i10;
            int i12 = iArr[i11];
            num.getClass();
            iArr[i11] = num.intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i10, int i11) {
            p.m(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.array;
            int i12 = this.start;
            return new IntArrayAsList(i10 + i12, i12 + i11, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.array[this.start]);
            int i10 = this.start;
            while (true) {
                i10++;
                if (i10 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.array[i10]);
            }
        }
    }

    public static List<Integer> i0(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new IntArrayAsList(0, iArr.length, iArr);
    }

    public static int j0(long j) {
        int i10 = (int) j;
        p.d(j, "Out of range: %s", ((long) i10) == j);
        return i10;
    }

    public static int k0(long j) {
        if (j > 2147483647L) {
            return BrazeLogger.SUPPRESS;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] l0(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            IntArrayAsList intArrayAsList = (IntArrayAsList) collection;
            return Arrays.copyOfRange(intArrayAsList.array, intArrayAsList.start, intArrayAsList.end);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public static Integer m0(String str) {
        byte b10;
        Long lValueOf;
        byte b11;
        str.getClass();
        if (!str.isEmpty()) {
            int i10 = str.charAt(0) == '-' ? 1 : 0;
            if (i10 != str.length()) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt < 128) {
                    b10 = a.C0280a.f28012a[cCharAt];
                } else {
                    byte[] bArr = a.C0280a.f28012a;
                    b10 = -1;
                }
                if (b10 >= 0 && b10 < 10) {
                    long j = -b10;
                    long j10 = 10;
                    long j11 = Long.MIN_VALUE / j10;
                    while (true) {
                        if (i11 >= str.length()) {
                            if (i10 == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i12 = i11 + 1;
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 < 128) {
                            b11 = a.C0280a.f28012a[cCharAt2];
                        } else {
                            byte[] bArr2 = a.C0280a.f28012a;
                            b11 = -1;
                        }
                        if (b11 >= 0 && b11 < 10 && j >= j11) {
                            long j12 = j * j10;
                            long j13 = b11;
                            if (j12 >= j13 - Long.MIN_VALUE) {
                                j = j12 - j13;
                                i11 = i12;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }
}
