package uk.gov.hmrc.test.ui

import com.typesafe.config.{Config, ConfigFactory}
import org.scalatest.wordspec.AnyWordSpec
import uk.gov.hmrc.zap.ZapTest
import uk.gov.hmrc.zap.config.ZapConfiguration

class ZapSpec extends AnyWordSpec with ZapTest {
  val zapConfig: Config = ConfigFactory.load().getConfig("zap-automation-config")

  override val zapConfiguration: ZapConfiguration = new ZapConfiguration(zapConfig)

  "Kicking off the zap scan" should {
    "should complete successfully" in {
      triggerZapScan()
    }
  }
}
