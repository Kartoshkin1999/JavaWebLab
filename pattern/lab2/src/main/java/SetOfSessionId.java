import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.HashSet;
import java.util.Set;

@WebServlet(name = "SetOfSessionId")
public class SetOfSessionId extends HttpServlet {
    private final Set<String> sessionIdSet;

    private SetOfSessionId() {
        sessionIdSet = new HashSet<>();
    }

    private static class SetOfSessionIdHolder {
        private final static SetOfSessionId instance = new SetOfSessionId();
    }

    public static SetOfSessionId getInstance() {
        return SetOfSessionIdHolder.instance;
    }

    void putSessionId(String sessionId) {
        sessionIdSet.add(sessionId);
    }

    boolean containsSessionId(String sessionId) {
        return sessionIdSet.contains(sessionId);
    }
}
