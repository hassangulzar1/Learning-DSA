class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        uniqu = set()

        for email in emails:
            local,domain = email.split("@")
            local = local.split("+")[0]
            local = local.replace(".","")
            uniqu.add((local,domain))
        return len(uniqu)