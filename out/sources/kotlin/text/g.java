package kotlin.text;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f43151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MatcherMatchResult$groups$1 f43153c;

    public g(Matcher matcher, String input) {
        kotlin.jvm.internal.i.e(input, "input");
        this.f43151a = matcher;
        this.f43152b = input;
        this.f43153c = new MatcherMatchResult$groups$1(this);
    }

    @Override // kotlin.text.f
    public final Na.i a() {
        Matcher matcher = this.f43151a;
        return Na.l.J(matcher.start(), matcher.end());
    }

    public final g b() {
        Matcher matcher = this.f43151a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = this.f43152b;
        if (iEnd > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        kotlin.jvm.internal.i.d(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new g(matcher2, str);
        }
        return null;
    }
}
