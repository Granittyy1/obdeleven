package com.parse;

import J8.p;
import com.braze.Constants;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.m;
import org.koin.java.KoinJavaComponent;
import p293xa.g;

/* JADX INFO: compiled from: ControlUnitParseUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ControlUnitParseUtils {
    public static final ControlUnitParseUtils INSTANCE = new ControlUnitParseUtils();
    private static final g logger$delegate = KoinJavaComponent.b(p.class, null, null);

    private ControlUnitParseUtils() {
    }

    public static final ParseObject getLabelRelation(String hwOrSwNumber, String klineId) throws ParseException {
        i.e(hwOrSwNumber, "hwOrSwNumber");
        i.e(klineId, "klineId");
        INSTANCE.getLogger().e("ControlUnitParseUtils", "getLabelRelation(" + hwOrSwNumber + ")");
        ParseQuery query = ParseQuery.getQuery("ControlUnitRelation");
        String strSubstring = hwOrSwNumber.substring(0, 2);
        i.d(strSubstring, "substring(...)");
        query.whereEqualTo("cuId", String.format("%s-%s", Arrays.copyOf(new Object[]{klineId, strSubstring}, 2)));
        query.orderByAscending("createdAt");
        query.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        for (ParseObject parseObject : query.find()) {
            List<String> list = parseObject.getList("relation");
            i.b(list);
            for (String str : list) {
                ControlUnitParseUtils controlUnitParseUtils = INSTANCE;
                i.b(str);
                if (controlUnitParseUtils.isRelationMatched(hwOrSwNumber, str)) {
                    return parseObject;
                }
            }
        }
        return null;
    }

    private final p getLogger() {
        return (p) logger$delegate.getValue();
    }

    private final boolean isRelationMatched(String str, String str2) {
        try {
            return new Regex(m.G(str2, "?", "[A-Z0-9]?")).e(str);
        } catch (Exception e10) {
            p logger = getLogger();
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            logger.c("ControlUnitParseUtils", message);
            return false;
        }
    }
}
