package com.google.common.base;

/* JADX INFO: compiled from: CharMatcher.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements com.google.common.base.e<Character> {

    /* JADX INFO: renamed from: com.google.common.base.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class AbstractC0276a extends a {
        @Override // com.google.common.base.e
        @Deprecated
        public final boolean apply(Character ch) {
            return a(ch.charValue());
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class b extends AbstractC0276a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char f27785b;

        public b(char c10) {
            this.f27785b = c10;
        }

        @Override // com.google.common.base.a
        public final boolean a(char c10) {
            return c10 == this.f27785b;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
            char[] cArr = new char[6];
            cArr[0] = '\\';
            cArr[1] = 'u';
            cArr[2] = 0;
            cArr[3] = 0;
            cArr[4] = 0;
            cArr[5] = 0;
            char c10 = this.f27785b;
            for (int i10 = 0; i10 < 4; i10++) {
                cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            sb2.append(String.copyValueOf(cArr));
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class c extends AbstractC0276a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f27786b;

        public c(String str) {
            this.f27786b = str;
        }

        public final String toString() {
            return this.f27786b;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class d extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f27787c = new d("CharMatcher.none()");

        @Override // com.google.common.base.a
        public final boolean a(char c10) {
            return false;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class e extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f27788c = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f27789d = new e("CharMatcher.whitespace()");

        @Override // com.google.common.base.a
        public final boolean a(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f27788c) == c10;
        }
    }

    public abstract boolean a(char c10);
}
