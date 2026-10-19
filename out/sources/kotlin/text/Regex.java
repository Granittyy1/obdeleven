package kotlin.text;

import com.google.android.gms.internal.measurement.M1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Regex implements Serializable {
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    /* JADX INFO: compiled from: Regex.kt */
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        public Serialized(String str, int i10) {
            this.pattern = str;
            this.flags = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            kotlin.jvm.internal.i.d(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }
    }

    public Regex(Pattern pattern) {
        this.nativePattern = pattern;
    }

    public static g b(Regex regex, String input) {
        regex.getClass();
        kotlin.jvm.internal.i.e(input, "input");
        Matcher matcher = regex.nativePattern.matcher(input);
        kotlin.jvm.internal.i.d(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new g(matcher, input);
        }
        return null;
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        kotlin.jvm.internal.i.d(strPattern, "pattern(...)");
        return new Serialized(strPattern, this.nativePattern.flags());
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.i.e(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    public final String c() {
        String strPattern = this.nativePattern.pattern();
        kotlin.jvm.internal.i.d(strPattern, "pattern(...)");
        return strPattern;
    }

    public final g d(String input) {
        kotlin.jvm.internal.i.e(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.i.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new g(matcher, input);
        }
        return null;
    }

    public final boolean e(CharSequence input) {
        kotlin.jvm.internal.i.e(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public final String f(String str, CharSequence input) {
        kotlin.jvm.internal.i.e(input, "input");
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(str);
        kotlin.jvm.internal.i.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String g(String input) {
        kotlin.jvm.internal.i.e(input, "input");
        String strReplaceFirst = this.nativePattern.matcher(input).replaceFirst("");
        kotlin.jvm.internal.i.d(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List<String> h(CharSequence input, int i10) {
        kotlin.jvm.internal.i.e(input, "input");
        n.c0(i10);
        Matcher matcher = this.nativePattern.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return M1.k(input.toString());
        }
        int i11 = 10;
        if (i10 > 0 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i12 >= 0 && arrayList.size() == i12) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.nativePattern.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public Regex(String pattern) {
        kotlin.jvm.internal.i.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.i.d(patternCompile, "compile(...)");
        this.nativePattern = patternCompile;
    }

    public Regex(String pattern, int i10) {
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        kotlin.jvm.internal.i.e(pattern, "pattern");
        int iA = regexOption.a();
        Pattern patternCompile = Pattern.compile(pattern, (iA & 2) != 0 ? iA | 64 : iA);
        kotlin.jvm.internal.i.d(patternCompile, "compile(...)");
        this.nativePattern = patternCompile;
    }
}
