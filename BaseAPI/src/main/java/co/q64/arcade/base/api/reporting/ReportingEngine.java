package co.q64.arcade.base.api.reporting;

import java.util.List;
import java.util.Optional;

public interface ReportingEngine {
	public Optional<String> postDocument(List<String> lines);
}
